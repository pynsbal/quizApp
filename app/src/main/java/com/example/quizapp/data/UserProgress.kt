package com.example.quizapp.data

import android.content.Context
import android.content.SharedPreferences

object UserProgress {
    private lateinit var prefs: SharedPreferences
    
    fun init(context: Context) {
        prefs = context.getSharedPreferences("user_progress", Context.MODE_PRIVATE)
    }

    fun getScore(category: Category, level: Int): Int {
        return prefs.getInt("${category.name}_$level", 0)
    }

    fun saveScore(category: Category, level: Int, score: Int) {
        prefs.edit().putInt("${category.name}_$level", score).apply()
    }

    fun isLevelUnlocked(category: Category, level: Int): Boolean {
        if (level == 1) return true
        val previousLevelScore = getScore(category, level - 1)
        return previousLevelScore >= 80 // Unlock next level if score is 80% or higher
    }

    fun completeLevel(category: Category, level: Int, score: Int) {
        // Save the score
        saveScore(category, level, score)
        
        // Mark level as completed if score is high enough
        if (score >= 80) {
            prefs.edit().putBoolean("${category.name}_${level}_completed", true).apply()
        }
    }

    fun isLevelCompleted(category: Category, level: Int): Boolean {
        return prefs.getBoolean("${category.name}_${level}_completed", false)
    }
} 