package com.example.foodics.data.repository.mapper

import com.example.foodics.data.local.entity.ProductEntity
import com.example.foodics.data.remote.dto.ProductDto

fun ProductDto.toProductEntity(): ProductEntity {
    return ProductEntity(
        id = this.id,
        name = this.name ?: "",
        description = this.description ?: "",
        price = this.price ?: 0.0,
        imageUrl = this.image ?: "",
        categoryId = this.category?.id ?: ""
    )
}