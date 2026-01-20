package com.example.foodics.ui.util.alert

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.foodics.R
import com.example.foodics.ui.util.alert.AlertState.Companion.ANIMATION_DURATION
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class AlertState(
    val alertType: AlertType,
    private val coroutineScope: CoroutineScope,
) {
    private val _isVisible = MutableStateFlow(false)
    val isVisible: StateFlow<Boolean> = _isVisible.asStateFlow()

    private val _text = MutableStateFlow("")
    val text: StateFlow<String> = _text.asStateFlow()

    fun show(text: String) {
        coroutineScope.launch {
            _text.update { text }
            _isVisible.update { true }
            delay(ALERT_DURATION)
            _isVisible.update { false }
        }
    }

    enum class AlertType {
        ERROR,
        SUCCESS
    }

    companion object {
        private const val ALERT_DURATION = 3000L
        const val ANIMATION_DURATION = 300
    }
}

@Composable
fun AppAlert(
    alertState: AlertState,
    modifier: Modifier = Modifier
) {
    val isVisible by alertState.isVisible.collectAsState()
    val text by alertState.text.collectAsState()

    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically(
            initialOffsetY = { -it },
            animationSpec = tween(ANIMATION_DURATION)
        ) + fadeIn(initialAlpha = 0.3f),
        exit = slideOutVertically(
            targetOffsetY = { -it },
            animationSpec = tween(ANIMATION_DURATION)
        ) + fadeOut()
    ) {
        if (alertState.alertType == AlertState.AlertType.ERROR) {
            ErrorAlert(
                text = text,
                modifier = modifier
            )
        } else {
            SuccessAlert(
                text = text,
                modifier = modifier
            )
        }
    }
}

@Composable
private fun ErrorAlert(
    text: String,
    modifier: Modifier = Modifier
) {
    Alert(
        type = stringResource(R.string.error),
        text = text,
        textColor = Color(0xFF7F1D1D),
        tintColor = Color(0xFFDC2626),
        backgroundColor = Color(0xFFFEE2E2),
        shadowColor = Color(0xFF7F1D1D),
        modifier = modifier
    )
}

@Composable
private fun SuccessAlert(
    text: String,
    modifier: Modifier = Modifier
) {
    Alert(
        type = stringResource(R.string.success),
        text = text,
        textColor = Color(0xFF14532D),
        tintColor = Color(0xFF16A34A),
        backgroundColor = Color(0xFFDCFCE7),
        shadowColor = Color(0xFF14532D),
        modifier = modifier
    )
}

@Composable
private fun Alert(
    type: String,
    text: String,
    textColor: Color,
    tintColor: Color,
    backgroundColor: Color,
    shadowColor: Color,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .dropShadow(
                shape = RoundedCornerShape(8.dp),
                shadow = Shadow(
                    radius = 6.dp,
                    color = shadowColor,
                    spread = 0.dp,
                    offset = DpOffset(
                        x = 0.dp,
                        y = 2.dp
                    )
                )
            )
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(8.dp)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.ic_error),
            contentDescription = stringResource(R.string.alert),
            tint = tintColor,
            modifier = Modifier
                .padding(end = 8.dp)
                .size(20.dp)
        )

        Text(
            text = "$type - $text",
            color = textColor,
            style = MaterialTheme.typography.labelSmall,
            modifier = Modifier
                .padding(vertical = 2.dp)
                .weight(1f)
        )
    }
}

@Preview
@Composable
private fun PreviewErrorAlert() {
    MaterialTheme {
        ErrorAlert(text = "Something went wrong")
    }
}

@Preview
@Composable
private fun PreviewSuccessAlert() {
    MaterialTheme {
        SuccessAlert(text = "Everything went smoothly!")
    }
}