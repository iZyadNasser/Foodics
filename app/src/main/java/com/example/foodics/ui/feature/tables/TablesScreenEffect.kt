package com.example.foodics.ui.feature.tables

import com.example.foodics.ui.util.UiText

sealed interface TablesScreenEffect {
    data class ShowError(val message: UiText) : TablesScreenEffect
    data object ShowCartUpdatedSuccess : TablesScreenEffect
}