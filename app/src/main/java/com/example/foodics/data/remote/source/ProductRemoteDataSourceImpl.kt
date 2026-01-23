package com.example.foodics.data.remote.source

import com.example.foodics.data.remote.dto.ProductDto
import com.example.foodics.data.repository.product.ProductRemoteDataSource

class ProductRemoteDataSourceImpl : ProductRemoteDataSource {
    override suspend fun getProducts(): List<ProductDto> {
        TODO("Not yet implemented")
    }
}