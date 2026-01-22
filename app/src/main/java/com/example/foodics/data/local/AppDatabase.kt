package com.example.foodics.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.foodics.data.local.dao.CartDao
import com.example.foodics.data.local.dao.CategoryDao
import com.example.foodics.data.local.dao.ProductDao
import com.example.foodics.data.local.entity.CartItemEntity
import com.example.foodics.data.local.entity.CategoryEntity
import com.example.foodics.data.local.entity.ProductEntity

@Database(
    entities = [
        CategoryEntity::class,
        ProductEntity::class,
        CartItemEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
    abstract fun productDao(): ProductDao
    abstract fun cartDao(): CartDao
}