package com.example.foodics.data.repository.mapper

import com.example.foodics.data.local.entity.CategoryEntity
import com.example.foodics.domain.entity.Category
import java.util.UUID

fun CategoryEntity.toDomain(): Category {
    return Category(
        id = UUID.fromString(this.id),
        name = this.name
    )
}