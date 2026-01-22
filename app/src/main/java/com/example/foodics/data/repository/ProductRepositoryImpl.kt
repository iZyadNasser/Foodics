package com.example.foodics.data.repository

import com.example.foodics.data.local.dao.CartDao
import com.example.foodics.data.local.dao.CategoryDao
import com.example.foodics.data.local.dao.ProductDao
import com.example.foodics.data.local.entity.CartItemEntity
import com.example.foodics.data.local.entity.CategoryEntity
import com.example.foodics.data.local.entity.ProductEntity
import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.entity.Product
import com.example.foodics.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import java.util.UUID

class ProductRepositoryImpl(
    private val productDao: ProductDao,
    private val categoryDao: CategoryDao,
    private val cartDao: CartDao
) : ProductRepository {

    override suspend fun getProducts(searchQuery: String?, categoryId: UUID): List<Product> {
        val products = productDao.getProductsByCategoryAndSearch(
            categoryId = categoryId.toString(),
            searchQuery = searchQuery ?: ""
        )

        return products.map { product ->
            val category = categoryDao.getAllCategories()
                .first { it.id == product.categoryId }
            product.toDomainModel(category.toDomainModel())
        }
    }

    override suspend fun toggleProductInCart(product: Product) {
        val productId = product.id.toString()
        val existingCartItem = cartDao.getCartItem(productId)

        if (existingCartItem != null) {
            cartDao.deleteCartItem(productId)
        } else {
            cartDao.insertCartItem(CartItemEntity(productId = productId))
        }
    }

    override suspend fun clearCartProducts() {
        cartDao.clearCart()
    }

    override fun getProductsCountInCart(): Flow<Int> {
        return cartDao.getCartItemsCount()
    }

    override fun getTotalProductsPriceInCart(): Flow<Double> {
        return cartDao.getTotalPrice()
    }

    private fun ProductEntity.toDomainModel(
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

    private fun CategoryEntity.toDomainModel(): Category {
        return Category(
            id = UUID.fromString(this.id),
            name = this.name
        )
    }
}