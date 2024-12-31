package com.example.quizapp.data

data class User(
    val username: String,
    val password: String
)

object UserData {
    val users = mutableListOf(
        User("student", "password123")
    )
} 