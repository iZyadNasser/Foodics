package com.example.foodics.ui.feature.tables

import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.entity.Product
import java.util.UUID

data class TablesScreenState(
    val isLoading: Boolean = true,
    val searchQuery: String = "",
    val categories: List<Category> = emptyList(),
    val chosenCategoryId: UUID? = null,
    val products: List<Product> = emptyList(),
    val numberOfProductsInCart: Int = 0,
    val totalPriceOfCart: Double = 0.0,
    val isFirstFetch: Boolean = true,
)