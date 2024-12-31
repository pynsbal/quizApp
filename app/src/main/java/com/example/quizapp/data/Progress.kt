package com.example.quizapp.data

import android.content.Context
import kotlinx.serialization.encodeToString
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.Serializable

@Serializable
data class ProgressData(
    val category: Category,
    val level: Int,
    val score: Int
)

object UserProgress {
    private val completedLevels = mutableMapOf<Category, MutableSet<Int>>()
    private val levelScores = mutableMapOf<Pair<Category, Int>, Int>() // Store scores for each level
    private const val PREFS_NAME = "quiz_progress"
    private const val KEY_COMPLETED_LEVELS = "completed_levels"
    private const val KEY_LEVEL_SCORES = "level_scores"

    fun completeLevel(category: Category, level: Int, totalQuestions: Int, correctAnswers: Int) {
        if (!completedLevels.containsKey(category)) {
            completedLevels[category] = mutableSetOf()
        }
        completedLevels[category]?.add(level)
        
        // Store the score
        levelScores[Pair(category, level)] = getLevelScore(category, level, totalQuestions, correctAnswers)
    }

    fun getLevelScore(category: Category, level: Int): Int {
        return levelScores[Pair(category, level)] ?: 0
    }

    fun getLevelScore(category: Category, level: Int, totalQuestions: Int, correctAnswers: Int): Int {
        return when {
            correctAnswers >= totalQuestions * 0.9 -> 3 // 90%+ = 3 stars
            correctAnswers >= totalQuestions * 0.75 -> 2 // 75%+ = 2 stars
            correctAnswers >= totalQuestions * 0.6 -> 1 // 60%+ = 1 star
            else -> 0
        }
    }

    // Update save/load to include scores
    fun saveProgress(context: Context) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val progressJson = Json.encodeToString(completedLevels)
        val scoresJson = Json.encodeToString(levelScores)
        prefs.edit()
            .putString(KEY_COMPLETED_LEVELS, progressJson)
            .putString(KEY_LEVEL_SCORES, scoresJson)
            .apply()
    }

    fun loadProgress(context: Context) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val progressJson = prefs.getString(KEY_COMPLETED_LEVELS, null)
        val scoresJson = prefs.getString(KEY_LEVEL_SCORES, null)
        
        if (progressJson != null) {
            completedLevels.clear()
            completedLevels.putAll(Json.decodeFromString(progressJson))
        }
        
        if (scoresJson != null) {
            levelScores.clear()
            levelScores.putAll(Json.decodeFromString(scoresJson))
        }
    }

    fun isLevelUnlocked(category: Category, level: Int): Boolean {
        if (level == 1) return true // First level always unlocked
        val completedLevelsForCategory = completedLevels.getOrDefault(category, mutableSetOf())
        return completedLevelsForCategory.contains(level - 1) // Previous level must be completed
    }
} 