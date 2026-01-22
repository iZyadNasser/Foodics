package com.example.foodics.data.repository.fake

import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.repository.CategoryRepository

class FakeCategoryRepositoryImpl : CategoryRepository {
    override suspend fun getCategories(): List<Category> {
        return FakeProductData.categories
    }
}