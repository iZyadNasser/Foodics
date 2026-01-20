package com.example.foodics.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodics.ui.design_system.FoodicsTheme
import com.example.foodics.ui.navigation.AppNavigation
import com.example.foodics.ui.util.alert.AlertState
import com.example.foodics.ui.util.alert.AppAlert

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val coroutineScope = rememberCoroutineScope()

            val errorAlertState by remember {
                mutableStateOf(
                    AlertState(
                        alertType = AlertState.AlertType.ERROR,
                        coroutineScope = coroutineScope
                    )
                )
            }

            val successAlertState by remember {
                mutableStateOf(
                    AlertState(
                        alertType = AlertState.AlertType.SUCCESS,
                        coroutineScope = coroutineScope
                    )
                )
            }

            FoodicsTheme {
                CompositionLocalProvider(
                    LocalSuccessAlert provides successAlertState,
                    LocalErrorAlert provides errorAlertState
                ) {
                    AppNavigation()
                    Alerts()
                }
            }
        }
    }
}

@Composable
private fun Alerts() {
    val errorAlertState = LocalErrorAlert.current
    val successAlertState = LocalSuccessAlert.current

    AppAlert(
        alertState = errorAlertState,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .statusBarsPadding()
            .padding(top = 52.dp)
    )

    AppAlert(
        alertState = successAlertState,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .statusBarsPadding()
            .padding(top = 52.dp)
    )
}

val LocalSuccessAlert = compositionLocalOf<AlertState> {
    error("Alert not provided")
}

val LocalErrorAlert = compositionLocalOf<AlertState> {
    error("Alert not provided")
}