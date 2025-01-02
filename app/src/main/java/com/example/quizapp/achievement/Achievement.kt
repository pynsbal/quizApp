package com.example.quizapp.achievement

import android.content.Context
import android.content.SharedPreferences
import com.example.quizapp.data.Category

private const val PREFS_NAME = "achievements"

enum class Achievement(val title: String, val description: String) {
    FIRST_PERFECT_SCORE("Perfect Score!", "Get all questions correct in a quiz"),
    COMPLETE_CATEGORY("Category Master", "Complete all levels in a category"),
    MASTER_ALL_CATEGORIES("Quiz Champion", "Complete all levels in all categories"),
    SPEED_DEMON("Speed Demon", "Complete a quiz in under 30 seconds"),
    STREAK_MASTER("Streak Master", "Get 5 correct answers in a row");
}

object AchievementManager {
    private fun getPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    private fun isAchievementUnlocked(context: Context, achievement: Achievement): Boolean {
        return getPreferences(context).getBoolean(achievement.name, false)
    }

    private fun unlockAchievement(context: Context, achievement: Achievement) {
        if (!isAchievementUnlocked(context, achievement)) {
            getPreferences(context).edit().putBoolean(achievement.name, true).apply()
            // TODO: Show achievement notification
        }
    }

    fun checkAchievements(context: Context, score: Int, timeSpent: Long, correctStreak: Int = 0) {
        // Check for perfect score
        if (score == 100) {
            unlockAchievement(context, Achievement.FIRST_PERFECT_SCORE)
        }

        // Check for speed demon
        if (timeSpent < 30) {
            unlockAchievement(context, Achievement.SPEED_DEMON)
        }

        // Check for streak master
        if (correctStreak >= 5) {
            unlockAchievement(context, Achievement.STREAK_MASTER)
        }

        // Check for category completion
        if (isCategoryCompleted()) {
            unlockAchievement(context, Achievement.COMPLETE_CATEGORY)
            
            // Check for all categories completion
            if (areAllCategoriesCompleted()) {
                unlockAchievement(context, Achievement.MASTER_ALL_CATEGORIES)
            }
        }
    }

    private fun isCategoryCompleted(): Boolean {
        // TODO: Implement category completion check
        return false
    }

    private fun areAllCategoriesCompleted(): Boolean {
        return Category.entries.all { isCategoryCompleted() }
    }

    fun getAllAchievements(context: Context): List<Pair<Achievement, Boolean>> {
        return Achievement.entries.map { 
            it to isAchievementUnlocked(context, it)
        }
    }
} 