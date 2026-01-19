package com.example.foodics.ui.feature.tables

import java.util.UUID

interface TablesInteractionListener {
    fun onSearchQueryChange(text: String)
    fun onSwitchCategoryTab(categoryId: UUID)
    fun onProductClick(productId: UUID)
    fun onViewOrderClick()
}