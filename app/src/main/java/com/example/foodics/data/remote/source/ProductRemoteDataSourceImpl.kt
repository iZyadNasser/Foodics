package com.example.foodics.data.remote.source

import com.example.foodics.data.remote.dto.ProductDto
import com.example.foodics.data.repository.product.ProductRemoteDataSource
import com.example.foodics.data.util.constructUrl
import com.example.foodics.data.util.tryToCallApi
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class ProductRemoteDataSourceImpl(
    private val httpClient: HttpClient
) : ProductRemoteDataSource {
    override suspend fun getProducts(): List<ProductDto> {
        return tryToCallApi {
            httpClient.get(
                constructUrl("7f2d9600")
            )
        }
    }
}