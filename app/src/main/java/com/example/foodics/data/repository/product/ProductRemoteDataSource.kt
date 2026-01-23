package com.example.foodics.data.repository.product

import com.example.foodics.data.remote.dto.ProductDto

interface ProductRemoteDataSource {
    suspend fun getProducts(): List<ProductDto>
}