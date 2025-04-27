package com.sample.counterapp.ui.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * ViewModel that handles business logic and exposes state.
 */
class MainViewModel : ViewModel() {

    // Mutable state for internal updates
    private val _uiState = MutableStateFlow(MainState())

    // Public immutable state for observing
    val uiState: StateFlow<MainState> = _uiState.asStateFlow()

    /**
     * Handles user Intents and updates state accordingly.
     */
    fun processIntent(intent: MainIntent) {
        when (intent) {
            is MainIntent.IncrementCounter -> incrementCounter()
        }
    }

    /**
     * Increments the counter value by one.
     */
    private fun incrementCounter() {
        val updatedCounter = _uiState.value.counter + 1
        _uiState.value = MainState(counter = updatedCounter)
    }
}