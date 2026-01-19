package com.example.foodics.data.repository

import com.example.foodics.domain.entity.Product
import com.example.foodics.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import java.util.UUID

class ProductRepositoryImpl : ProductRepository {
    override suspend fun getProducts(searchQuery: String?, categoryId: UUID): List<Product> {
        TODO("Not yet implemented")
    }

    override suspend fun addProductToCart(productId: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun clearCartProducts(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getProductsCountInCart(): Flow<Int> {
        TODO("Not yet implemented")
    }

    override fun getTotalProductsPriceInCart(): Flow<Double> {
        TODO("Not yet implemented")
    }
}