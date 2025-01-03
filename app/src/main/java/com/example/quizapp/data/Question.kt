package com.example.quizapp.data

data class Question(
    val question: String,
    val options: List<String>,
    val correctAnswer: Int,
    val difficulty: Difficulty,
    val category: Category,
    val level: Int
)

enum class Difficulty {
    EASY, MEDIUM, HARD
} 