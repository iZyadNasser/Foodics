package com.example.foodics.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.foodics.data.local.entity.ProductEntity

@Dao
interface ProductDao {
    @Query("SELECT * FROM products WHERE categoryId = :categoryId AND name LIKE '%' || :searchQuery || '%'")
    suspend fun getProductsByCategoryAndSearch(
        categoryId: String,
        searchQuery: String
    ): List<ProductEntity>

    @Query("SELECT * FROM products WHERE id = :productId")
    suspend fun getProductById(productId: String): ProductEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(product: ProductEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProducts(products: List<ProductEntity>)

    @Query("DELETE FROM products")
    suspend fun deleteAllProducts()
}