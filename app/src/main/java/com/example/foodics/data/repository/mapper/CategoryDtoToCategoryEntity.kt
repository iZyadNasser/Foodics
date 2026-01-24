package com.example.foodics.data.repository.mapper

import com.example.foodics.data.local.entity.CategoryEntity
import com.example.foodics.data.remote.dto.CategoryDto

fun CategoryDto.toCategoryEntity(): CategoryEntity {
    return CategoryEntity(
        id = this.id,
        name = this.name ?: "",
    )
}