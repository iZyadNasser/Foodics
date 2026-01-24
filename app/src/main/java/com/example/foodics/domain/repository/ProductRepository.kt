package com.example.foodics.domain.repository

import com.example.foodics.domain.entity.Product
import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface ProductRepository {
    suspend fun getProducts(
        searchQuery: String?,
        categoryId: UUID,
        isFirstFetch: Boolean = false
    ): List<Product>

    /**
     * @return true if the product is now in cart (after the operation succeeded), false otherwise
     */
    suspend fun toggleProductInCart(product: Product): Boolean
    suspend fun clearCartProducts()
    fun getProductsCountInCart(): Flow<Int>
    fun getTotalProductsPriceInCart(): Flow<Double>
}