package com.example.quizapp.data

import com.example.quizapp.R

enum class Category {
    MATH, ENGLISH, SCIENCE, COMPUTER;

    fun toDisplayCategory(): DisplayCategory {
        return when (this) {
            MATH -> DisplayCategory(
                id = 1,
                name = "Math",
                description = "Test your mathematical skills",
                icon = R.drawable.ic_math
            )
            ENGLISH -> DisplayCategory(
                id = 2,
                name = "English",
                description = "Improve your language skills",
                icon = R.drawable.ic_english
            )
            SCIENCE -> DisplayCategory(
                id = 3,
                name = "Science",
                description = "Explore scientific concepts",
                icon = R.drawable.ic_science
            )
            COMPUTER -> DisplayCategory(
                id = 4,
                name = "Computer",
                description = "Learn about computers",
                icon = R.drawable.ic_computer
            )
        }
    }
}

data class DisplayCategory(
    val id: Int,
    val name: String,
    val description: String,
    val icon: Int
) 