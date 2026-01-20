package com.example.foodics.ui.util

import com.example.foodics.R
import com.example.foodics.domain.exception.AppException
import com.example.foodics.domain.exception.DataNotFoundException
import com.example.foodics.domain.exception.NoInternetException
import com.example.foodics.domain.exception.UnknownException

fun Throwable.toUiText(): UiText {
    return if (this is AppException) {
        when (this) {
            is DataNotFoundException -> UiText.StringResource(R.string.error_not_found)
            is NoInternetException -> UiText.StringResource(R.string.error_no_internet)
            is UnknownException -> UiText.StringResource(R.string.error_unknown)
        }
    } else {
        UiText.StringResource(R.string.error_unknown)
    }
}