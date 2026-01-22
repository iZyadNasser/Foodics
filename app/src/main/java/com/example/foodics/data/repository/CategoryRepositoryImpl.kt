package com.example.foodics.data.repository

import com.example.foodics.data.local.dao.CategoryDao
import com.example.foodics.data.local.entity.CategoryEntity
import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.repository.CategoryRepository
import java.util.UUID

class CategoryRepositoryImpl(
    private val categoryDao: CategoryDao
) : CategoryRepository {

    override suspend fun getCategories(): List<Category> {
        return categoryDao.getAllCategories().map { it.toDomainModel() }
    }

    private fun CategoryEntity.toDomainModel(): Category {
        return Category(
            id = UUID.fromString(this.id),
            name = this.name
        )
    }
}