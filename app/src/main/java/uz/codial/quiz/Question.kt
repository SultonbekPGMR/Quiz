package uz.codial.quiz

data class Question (
    val question: String,
    val variant1: String,
    val variant2: String,
    val variant3: String,
    val variant4: String,
    val correctAnswer: Int,
)
