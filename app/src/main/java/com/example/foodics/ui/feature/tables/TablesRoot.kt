package com.example.foodics.ui.feature.tables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.foodics.R
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
    val cartUpdatedText = stringResource(R.string.cart_updated)

    ObserveAsEffect(viewModel.effect) { effect ->
        when (effect) {
            is TablesScreenEffect.ShowError -> {
                errorAlertState.show(effect.message.asString(context))
            }

            TablesScreenEffect.ShowCartUpdatedSuccess -> {
                successAlertState.show(cartUpdatedText)
            }
        }
    }

    TablesScreen(
        screenState = screenState,
        interactionListener = viewModel
    )
}