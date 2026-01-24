package com.example.foodics.data.repository.mapper

import com.example.foodics.data.local.entity.ProductEntity
import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.entity.Product
import java.util.UUID

fun ProductEntity.toDomain(
    category: Category
): Product {
    return Product(
        id = UUID.fromString(this.id),
        name = this.name,
        category = category,
        description = this.description,
        imageUrl = this.imageUrl,
        price = this.price
    )
}