package com.sample.counterapp.ui.main

/**
 * Represents user actions (Intents) in the Counter screen.
 */
sealed class MainIntent {
    object IncrementCounter : MainIntent()
}