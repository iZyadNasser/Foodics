package com.example.foodics.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "products",
    foreignKeys = [
        ForeignKey(
            entity = CategoryEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("categoryId"),
            onDelete = ForeignKey.CASCADE
        )
    ],
)
data class ProductEntity(
    @PrimaryKey val id: String,
    val name: String,
    val categoryId: String,
    val description: String?,
    val imageUrl: String,
    val price: Double,
)