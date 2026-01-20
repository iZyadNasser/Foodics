package com.example.foodics.ui.feature.tables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.foodics.ui.LocalErrorAlert
import com.example.foodics.ui.LocalSuccessAlert
import com.example.foodics.ui.util.ObserveAsEffect
import org.koin.androidx.compose.koinViewModel

@Composable
fun TablesRoot(
    viewModel: TablesViewModel = koinViewModel()
) {
    val screenState by viewModel.screenState.collectAsStateWithLifecycle()

    val errorAlertState = LocalErrorAlert.current
    val successAlertState = LocalSuccessAlert.current

    val context = LocalContext.current

    ObserveAsEffect(viewModel.effect) { effect ->
        when (effect) {
            is TablesScreenEffect.ShowError -> {
                errorAlertState.show(effect.message.asString(context))
            }
        }
    }

    TablesScreen(
        screenState = screenState,
        interactionListener = viewModel
    )
}