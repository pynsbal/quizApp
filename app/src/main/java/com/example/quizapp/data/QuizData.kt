package com.example.quizapp.data

import com.example.quizapp.data.questionbanks.*

object QuizData {
    val questions: List<Question> = listOf(
        MathQuestions.questions,
        ComputerQuestions.questions,
        ScienceQuestions.questions,
        EnglishQuestions.questions
    ).flatten()

    fun getCategories(): List<DisplayCategory> = 
        Category.entries.map { it.toDisplayCategory() }

    fun getQuestionsForLevel(category: Category, level: Int, difficulty: Difficulty): List<Question> {
        return questions.filter { q -> 
            q.category == category && 
            q.level == level &&
            q.difficulty == difficulty
        }
    }

    fun getDifficultyForLevel(level: Int): Difficulty {
        return when {
            level <= 5 -> Difficulty.EASY
            level <= 10 -> Difficulty.MEDIUM
            else -> Difficulty.HARD
        }
    }

    fun validateQuestions(): Map<Category, List<Int>> {
        val missingQuestions = mutableMapOf<Category, MutableList<Int>>()
        
        // Check each category
        Category.entries.forEach { category ->
            val missingLevels = mutableListOf<Int>()
            
            // Check levels 1-15 for each category
            (1..15).forEach { level ->
                val difficulty = getDifficultyForLevel(level)
                val hasQuestions = questions.any { question ->
                    question.category == category &&
                    question.level == level &&
                    question.difficulty == difficulty
                }
                
                if (!hasQuestions) {
                    missingLevels.add(level)
                }
            }
            
            if (missingLevels.isNotEmpty()) {
                missingQuestions[category] = missingLevels
            }
        }
        
        return missingQuestions
    }

    fun printQuestionValidation() {
        val missingQuestions = validateQuestions()
        
        if (missingQuestions.isEmpty()) {
            println("✅ All categories have questions for all levels")
            return
        }

        println("❌ Missing questions found:")
        missingQuestions.forEach { (category, levels) ->
            println("${category.name}:")
            println("  Missing levels: ${levels.joinToString(", ")}")
            levels.forEach { level ->
                println("  - Level $level (${getDifficultyForLevel(level)})")
            }
        }
    }

    fun getQuestionsForCategoryAndLevel(category: Category, level: Int): List<Question> {
        val difficulty = getDifficultyForLevel(level)
        println("DEBUG: Searching for questions - Category: ${category.name}, Level: $level, Difficulty: $difficulty")
        println("DEBUG: Total questions in database: ${questions.size}")
        
        val filteredQuestions = questions.filter { 
            it.category == category && 
            it.level == level &&
            it.difficulty == difficulty
        }
        
        println("DEBUG: Found ${filteredQuestions.size} questions for this level")
        
        if (filteredQuestions.isEmpty()) {
            println("DEBUG: No questions found!")
            throw IllegalStateException("No questions found for ${category.name} level $level")
        }
        
        if (filteredQuestions.size < 5) {
            println("DEBUG: Not enough questions! Only found ${filteredQuestions.size}")
            throw IllegalStateException("Not enough questions for ${category.name} level $level (found ${filteredQuestions.size}, need 5)")
        }
        
        return filteredQuestions
    }
} 