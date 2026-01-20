package com.example.foodics.ui.feature.tables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.foodics.ui.util.ObserveAsEffect
import org.koin.androidx.compose.koinViewModel

@Composable
fun TablesRoot(
    viewModel: TablesViewModel = koinViewModel()
) {
    val screenState by viewModel.screenState.collectAsStateWithLifecycle()

    ObserveAsEffect(viewModel.effect) { effect ->
        when (effect) {
            is TablesScreenEffect.ShowError -> {
                TODO()
            }
        }
    }

    TablesScreen(
        screenState = screenState,
        interactionListener = viewModel
    )
}