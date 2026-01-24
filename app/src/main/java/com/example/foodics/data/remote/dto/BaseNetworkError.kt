package com.example.foodics.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BaseNetworkError(
    @SerialName("message")
    val message: String? = null,
)
