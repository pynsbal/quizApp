package com.example.quizapp.data

import android.content.Context
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import com.example.quizapp.achievement.AchievementManager

@Serializable
data class LevelScore(
    val category: Category,
    val level: Int,
    val score: Int = 0,
    val timeSpent: Long = 0,
    val completed: Boolean = false
)

@Serializable
data class UserProgress(
    val scores: MutableMap<Category, MutableMap<Int, LevelScore>> = mutableMapOf()
) {
    companion object {
        private const val PREFS_NAME = "quiz_progress"
        private const val KEY_LEVEL_SCORES = "level_scores"
        
        // Create a singleton instance
        private var instance: UserProgress? = null
        
        fun getInstance(): UserProgress {
            if (instance == null) {
                instance = UserProgress()
            }
            return instance!!
        }
    }
    
    private val levelScores = mutableMapOf<Pair<Category, Int>, Int>()

    fun saveScore(context: Context, category: Category, level: Int, score: Int) {
        levelScores[Pair(category, level)] = score
        saveProgress(context)
        AchievementManager.checkAchievements(context, score, 0L)
    }

    fun getScore(category: Category, level: Int): Int {
        return levelScores[Pair(category, level)] ?: 0
    }

    fun isLevelUnlocked(category: Category, level: Int): Boolean {
        if (level == 1) return true
        return getScore(category, level - 1) > 0
    }

    fun calculateScore(totalQuestions: Int, correctAnswers: Int): Int {
        return when {
            correctAnswers >= totalQuestions * 0.9 -> 3 // 90%+ = 3 stars
            correctAnswers >= totalQuestions * 0.75 -> 2 // 75%+ = 2 stars
            correctAnswers >= totalQuestions * 0.6 -> 1 // 60%+ = 1 star
            else -> 0
        }
    }

    private fun saveProgress(context: Context) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val scores = levelScores.map { (key, value) -> 
            LevelScore(
                category = key.first,
                level = key.second,
                score = value
            )
        }
        val scoresJson = Json.encodeToString(scores)
        prefs.edit()
            .putString(KEY_LEVEL_SCORES, scoresJson)
            .apply()
    }

    fun loadProgress(context: Context) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val scoresJson = prefs.getString(KEY_LEVEL_SCORES, null)
        if (scoresJson != null) {
            val scores = Json.decodeFromString<List<LevelScore>>(scoresJson)
            levelScores.clear()
            scores.forEach { score ->
                levelScores[Pair(score.category, score.level)] = score.score
            }
        }
    }
} 