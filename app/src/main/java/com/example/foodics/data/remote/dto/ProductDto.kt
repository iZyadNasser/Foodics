package com.example.foodics.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductDto(
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("image")
    val image: String? = null,
    @SerialName("price")
    val price: Double? = null,
    @SerialName("category")
    val category: CategoryDto? = null
)
