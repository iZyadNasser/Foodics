package com.example.foodics.ui.util

import com.example.foodics.R
import com.example.foodics.domain.exception.AppException
import com.example.foodics.domain.exception.DataNotFoundException
import com.example.foodics.domain.exception.ImplementationException
import com.example.foodics.domain.exception.NoInternetException
import com.example.foodics.domain.exception.ServerSideException
import com.example.foodics.domain.exception.UnauthorizedException

fun Throwable.toUiText(): UiText {
    return if (this is AppException) {
        when (this) {
            is DataNotFoundException -> UiText.StringResource(R.string.error_not_found)
            is NoInternetException -> UiText.StringResource(R.string.error_no_internet)
            is ImplementationException -> UiText.StringResource(R.string.error_not_your_fault)
            is ServerSideException -> UiText.StringResource(R.string.error_server_side)
            is UnauthorizedException -> UiText.StringResource(R.string.error_unauthorized)
        }
    } else {
        UiText.StringResource(R.string.error_unknown)
    }
}