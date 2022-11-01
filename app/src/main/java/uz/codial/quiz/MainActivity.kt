package uz.codial.quiz

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var level = 0
    var score = 0
    var correctAnswerIndex = 0
    var questionSRC = ArrayList<Question>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        var INDEX = intent.getIntExtra("TAG", 6)



        questionSRC = Constants.getQuestions(INDEX)
        questionSRC.shuffle()
        loadQuestions()


        // radio buttons text colors
        radioGroup.setOnCheckedChangeListener { _, _ ->
            when (radioGroup.checkedRadioButtonId) {
                variant1.id -> {
                    variant1.setTextColor(Color.parseColor("#12677F"))
                }
                variant2.id -> {
                    variant2.setTextColor(Color.parseColor("#12677F"))
                }
                variant3.id -> {
                    variant3.setTextColor(Color.parseColor("#12677F"))
                }
                variant4.id -> {
                    variant4.setTextColor(Color.parseColor("#12677F"))
                }
            }

            if (!variant1.isChecked) {
                variant1.setTextColor(Color.parseColor("#636773"))
            }
            if (!variant2.isChecked) {
                variant2.setTextColor(Color.parseColor("#636773"))
            }
            if (!variant3.isChecked) {
                variant3.setTextColor(Color.parseColor("#636773"))
            }
            if (!variant4.isChecked) {
                variant4.setTextColor(Color.parseColor("#636773"))
            }

        }
    }


    fun loadQuestions() {

        txt_question.text = questionSRC[level].question
        variant1.text = questionSRC[level].variant1
        variant2.text = questionSRC[level].variant2
        variant3.text = questionSRC[level].variant3
        variant4.text = questionSRC[level].variant4
        correctAnswerIndex = questionSRC[level].correctAnswer


    }


    fun btn_back(btn: RadioButton) {

        if (btn.tag.toString().toInt() == correctAnswerIndex) {
            btn.background = ContextCompat.getDrawable(this, R.drawable.radio_correct_back)
            btn.setTextColor(Color.parseColor("#000000"))
            tru()
        } else {
            btn.background = ContextCompat.getDrawable(this, R.drawable.radio_wrong_back)
            fals()
            txt_back(btn)
            when (correctAnswerIndex) {
                0 -> {
                    variant1.background =
                        ContextCompat.getDrawable(this, R.drawable.radio_correct_back)
                    txt_back(variant1)
                }
                1 -> {
                    variant2.background =
                        ContextCompat.getDrawable(this, R.drawable.radio_correct_back)
                    txt_back(variant2)
                }
                2 -> {
                    variant3.background =
                        ContextCompat.getDrawable(this, R.drawable.radio_correct_back)
                    txt_back(variant3)
                }
                3 -> {
                    variant4.background =
                        ContextCompat.getDrawable(this, R.drawable.radio_correct_back)
                    txt_back(variant4)
                }
            }


        }
    }

    fun txt_back(btn: RadioButton) {
        btn.setTextColor(Color.parseColor("#000000"))
    }


    fun submit(view: View) {

        var boolean = true
        when (radioGroup.checkedRadioButtonId) {
            variant1.id -> btn_back(variant1)
            variant2.id -> btn_back(variant2)
            variant3.id -> btn_back(variant3)
            variant4.id -> btn_back(variant4)
            else -> {
                boolean = false
                Toast.makeText(this, "Please choose your answer", Toast.LENGTH_SHORT).show()
            }
        }
        if (boolean) {
            disable()
            btn_next.visibility = (View.VISIBLE)
            btn_submit.visibility = (View.INVISIBLE)
        }


    }

    private fun restart() {

        level = 0
        score = 0
        questionSRC.shuffle()
        loadQuestions()
        txt_score.text = "$score/$level"
        txt_level.text = "Level ${level + 1}"
        defBtnBack()
        btn_submit.visibility = (View.VISIBLE)
        btn_next.visibility = (View.INVISIBLE)
        enable()

    }


    fun next(view: View) {
        if (level == questionSRC.size - 1) {

            val alertDialog = AlertDialog.Builder(this,R.style.MyDialogTheme)

            alertDialog.apply {
                //setIcon(R.drawable.ic_hello)
                setTitle("Done")
                setMessage("Total questions: ${questionSRC.size}\nCorrect Answers: $score" +
                        "\nWrong Answers: ${questionSRC.size-score}")
                setPositiveButton("restart"){_,_,->
                    restart()
                }
                setNegativeButton("quit") { _, _ ->
                    finish()
                }

            }.create().show()
            radioGroup.clearCheck()

        } else {
            level++
            txt_score.text = "$score/$level"
            txt_level.text = "level ${level + 1}"
            radioGroup.clearCheck()

            defBtnBack()
            enable()

            loadQuestions()
            btn_submit.visibility = (View.VISIBLE)
            btn_next.visibility = (View.INVISIBLE)


        }
    }

    fun tru() {
        score++
        txt_score.text = "$score/${level+1}"
        txt_result.text = "Correct"
        txt_result.setTextColor(Color.parseColor("#00FF00"))
        txtTimer()

    }

    fun fals() {
        txt_result.text = "Wrong"
        txt_result.setTextColor(Color.parseColor("#FF0000"))
        txtTimer()
    }

    fun txtTimer() {
        val t = Timer(false)
        t.schedule(object : TimerTask() {
            override fun run() {
                runOnUiThread { txt_result.text = "" }
            }
        }, 1500)
    }

    @SuppressLint("ResourceType")
    fun defBtnBack() {
        variant1.background = ContextCompat.getDrawable(this, R.drawable.radio_btn_back)
        variant2.background = ContextCompat.getDrawable(this, R.drawable.radio_btn_back)
        variant3.background = ContextCompat.getDrawable(this, R.drawable.radio_btn_back)
        variant4.background = ContextCompat.getDrawable(this, R.drawable.radio_btn_back)
        variant1.setTextColor(Color.parseColor("#636773"))
        variant2.setTextColor(Color.parseColor("#636773"))
        variant3.setTextColor(Color.parseColor("#636773"))
        variant4.setTextColor(Color.parseColor("#636773"))

    }

    fun disable() {
        variant1.isEnabled = false
        variant2.isEnabled = false
        variant3.isEnabled = false
        variant4.isEnabled = false
    }

    fun enable() {
        variant1.isEnabled = true
        variant2.isEnabled = true
        variant3.isEnabled = true
        variant4.isEnabled = true
    }



    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)
    }

}

