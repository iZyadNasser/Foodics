package com.example.foodics.domain.repository

import com.example.foodics.domain.entity.Category

interface CategoryRepository {
    suspend fun getCategories(): List<Category>
}