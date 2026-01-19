package com.example.foodics.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.foodics.ui.feature.tables.TablesScreen
import com.example.foodics.ui.feature.tables.TablesViewModel
import com.example.foodics.ui.theme.FoodicsTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: TablesViewModel = koinViewModel()
            val screenState by viewModel.screenState.collectAsStateWithLifecycle()

            FoodicsTheme {
                TablesScreen(
                    screenState = screenState,
                    interactionListener = viewModel

                )
            }
        }
    }
}