package com.example.foodics.data.repository.mapper

import com.example.foodics.data.local.entity.ProductEntity
import com.example.foodics.data.remote.dto.ProductDto

fun ProductDto.toProductEntity(): ProductEntity {
    return ProductEntity(
        id = this.id,
        name = "",
        description = "",
        price = 0.0,
        imageUrl = "",
        categoryId = "" // TODO
    )
}