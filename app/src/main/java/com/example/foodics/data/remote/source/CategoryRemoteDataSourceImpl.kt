package com.example.foodics.data.remote.source

import com.example.foodics.data.remote.dto.CategoryDto
import com.example.foodics.data.repository.category.CategoryRemoteDataSource
import com.example.foodics.data.util.constructUrl
import com.example.foodics.data.util.tryToCallApi
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class CategoryRemoteDataSourceImpl(
    private val httpClient: HttpClient
) : CategoryRemoteDataSource {
    override suspend fun getCategories(): List<CategoryDto> {
        return tryToCallApi {
            httpClient.get(
                constructUrl("e4042350")
            )
        }
    }
}