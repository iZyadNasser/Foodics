package com.example.foodics.data.repository.category

import com.example.foodics.data.remote.dto.CategoryDto

interface CategoryRemoteDataSource {
    fun getCategories(): List<CategoryDto>
}