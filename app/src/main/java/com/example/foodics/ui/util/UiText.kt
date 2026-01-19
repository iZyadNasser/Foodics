package com.example.foodics.ui.util

import android.content.Context
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.res.stringResource

@Stable
sealed interface UiText {
    data class DynamicText(val value: String) : UiText

    data class StringResource(@StringRes val resId: Int) : UiText

    fun asString(context: Context): String = when (this) {
        is DynamicText -> value
        is StringResource -> context.getString(resId)
    }

    @Composable
    fun asString(): String = when (this) {
        is DynamicText -> value
        is StringResource -> stringResource(id = resId)
    }
}
