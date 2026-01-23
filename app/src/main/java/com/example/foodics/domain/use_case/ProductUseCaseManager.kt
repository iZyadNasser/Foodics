package com.example.foodics.domain.use_case

import com.example.foodics.domain.entity.Product
import com.example.foodics.domain.repository.ProductRepository
import java.util.UUID

class ProductUseCaseManager(
    private val productRepository: ProductRepository
) {
    suspend fun getProducts(
        searchQuery: String?,
        categoryId: UUID,
        isFirstFetch: Boolean = false
    ): List<Product> {
        return productRepository.getProducts(searchQuery = searchQuery, categoryId = categoryId)
    }

    suspend fun toggleProductInCart(product: Product) =
        productRepository.toggleProductInCart(product)

    suspend fun clearCartProducts() = productRepository.clearCartProducts()

    fun getProductsCountInCart() = productRepository.getProductsCountInCart()

    fun getTotalProductsPriceInCart() = productRepository.getTotalProductsPriceInCart()
}