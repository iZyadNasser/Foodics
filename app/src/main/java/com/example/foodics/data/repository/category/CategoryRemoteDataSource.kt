package com.example.foodics.data.repository.category

import com.example.foodics.data.remote.dto.CategoryDto

interface CategoryRemoteDataSource {
    suspend fun getCategories(): List<CategoryDto>
}