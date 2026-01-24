package com.example.foodics.domain.entity

import java.util.UUID

data class Product(
    val id: UUID,
    val name: String,
    val category: Category,
    val description: String?,
    val imageUrl: String,
    val price: Double,
    val inCart: Boolean,
)
