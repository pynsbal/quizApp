package com.example.quizapp.sound

import android.content.Context
import android.content.res.Resources
import android.media.AudioAttributes
import android.media.SoundPool
import android.util.Log
import androidx.compose.runtime.staticCompositionLocalOf
import com.example.quizapp.R

enum class SoundType {
    CLICK,
    CORRECT,
    WRONG
}

class SoundEffects(context: Context) {
    private val soundPool: SoundPool
    private val soundMap = mutableMapOf<SoundType, Int>()

    init {
        val attributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()

        soundPool = SoundPool.Builder()
            .setMaxStreams(3)
            .setAudioAttributes(attributes)
            .build()

        try {
            // Load sound resources with error handling
            soundMap[SoundType.CLICK] = soundPool.load(context, R.raw.click, 1)
            soundMap[SoundType.CORRECT] = soundPool.load(context, R.raw.correct, 1)
            soundMap[SoundType.WRONG] = soundPool.load(context, R.raw.wrong, 1)
        } catch (e: Resources.NotFoundException) {
            Log.e("SoundEffects", "Failed to load sound resources", e)
        }
    }

    fun playSound(type: SoundType) {
        soundMap[type]?.let { soundId ->
            soundPool.play(soundId, 1f, 1f, 1, 0, 1f)
        }
    }

    fun release() {
        soundPool.release()
    }
}

val LocalSoundEffects = staticCompositionLocalOf<SoundEffects> { error("No SoundEffects provided") } 