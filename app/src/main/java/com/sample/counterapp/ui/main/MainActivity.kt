package com.sample.counterapp.ui.main

import android.os.Bundle
import com.sample.counterapp.R
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * Displays the Counter UI and handles user interaction.
 */
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var textCounter: TextView
    private lateinit var btnIncrement: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
        observeViewModel()
        setupListeners()
    }

    /**
     * Initializes views from the layout.
     */
    private fun setupViews() {
        textCounter = findViewById(R.id.textCounter)
        btnIncrement = findViewById(R.id.btnIncrement)
    }

    /**
     * Observes UI state from ViewModel and updates UI.
     */
    private fun observeViewModel() {
        lifecycleScope.launch {
            viewModel.uiState.collectLatest { state ->
                render(state)
            }
        }
    }

    /**
     * Sets up click listeners for user actions.
     */
    private fun setupListeners() {
        btnIncrement.setOnClickListener {
            viewModel.processIntent(MainIntent.IncrementCounter)
        }
    }

    /**
     * Updates the UI based on the current state.
     */
    private fun render(state: MainState) {
        textCounter.text = state.counter.toString()
    }
}
