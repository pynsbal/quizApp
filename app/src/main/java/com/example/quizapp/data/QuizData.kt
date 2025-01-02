package com.example.quizapp.data

import com.example.quizapp.data.questionbanks.*

object QuizData {
    fun getCategories(): List<DisplayCategory> = 
        Category.entries.map { it.toDisplayCategory() }

    private val allQuestions: List<Question> = listOf(
        MathQuestions.questions,
        ComputerQuestions.questions,
        ScienceQuestions.questions,
        EnglishQuestions.questions
    ).flatten()

    fun getQuestionsForLevel(category: Category, level: Int, count: Int = 5): List<Question> {
        val difficulty = getDifficultyForLevel(level)
        val levelQuestions = allQuestions.filter { q -> 
            q.category == category && 
            q.level == level &&
            q.difficulty == difficulty
        }

        if (levelQuestions.isEmpty()) {
            throw IllegalStateException("No questions available for level $level in category $category")
        }

        if (levelQuestions.size < count) {
            throw IllegalStateException("Not enough questions for level $level in category $category. Required: $count, Found: ${levelQuestions.size}")
        }

        return levelQuestions.shuffled().take(count)
    }

    fun getDifficultyForLevel(level: Int): Difficulty {
        return when {
            level <= 5 -> Difficulty.EASY
            level <= 10 -> Difficulty.MEDIUM
            else -> Difficulty.HARD
        }
    }

    fun verifyQuestionCounts() {
        val questionsByCategory = allQuestions.groupBy { it.category }
        
        questionsByCategory.forEach { (category, questions) ->
            println("\n=== $category Questions ===")
            val questionsByLevel = questions.groupBy { it.level }
            
            for (level in 1..15) {
                val count = questionsByLevel[level]?.size ?: 0
                val status = when {
                    count == 0 -> "❌ MISSING"
                    count < 5 -> "⚠️ INSUFFICIENT ($count)"
                    count == 5 -> "✅ OK"
                    count > 5 -> "⚠️ TOO MANY ($count)"
                    else -> "⚠️ UNKNOWN"
                }
                println("Level $level: $status")
            }
        }
    }
} 