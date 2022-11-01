package uz.codial.quiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class EntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)
    }

    fun nextActivity(view: View) {

        Intent(this, MainActivity::class.java).also {
            it.putExtra("TAG", view.tag.toString().toInt())
            startActivity(it)
        }

    }
}