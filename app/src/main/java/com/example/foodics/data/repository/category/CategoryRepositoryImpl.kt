package com.example.foodics.data.repository.category

import com.example.foodics.data.local.dao.CategoryDao
import com.example.foodics.data.repository.mapper.toCategoryEntity
import com.example.foodics.data.repository.mapper.toDomain
import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.repository.CategoryRepository

class CategoryRepositoryImpl(
    private val categoryDao: CategoryDao,
    private val categoryRemoteDataSource: CategoryRemoteDataSource
) : CategoryRepository {

    override suspend fun getCategories(isFirstFetch: Boolean): List<Category> {
        return if (isFirstFetch) {
            categoryRemoteDataSource.getCategories().map { it.toCategoryEntity() }.also {
                categoryDao.insertCategories(it)
            }
        } else {
            categoryDao.getAllCategories()
        }.map { it.toDomain() }
    }
}