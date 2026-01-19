package com.example.foodics.data.repository

import com.example.foodics.data.FakeProductData
import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.repository.CategoryRepository

class CategoryRepositoryImpl : CategoryRepository {
    override suspend fun getCategories(): List<Category> {
//        TODO("Not yet implemented")
        return FakeProductData.categories
    }
}