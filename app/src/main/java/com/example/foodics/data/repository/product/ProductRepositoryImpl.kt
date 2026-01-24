package com.example.foodics.data.repository.product

import com.example.foodics.data.local.dao.CartDao
import com.example.foodics.data.local.dao.CategoryDao
import com.example.foodics.data.local.dao.ProductDao
import com.example.foodics.data.local.entity.CartItemEntity
import com.example.foodics.data.local.entity.ProductEntity
import com.example.foodics.data.repository.mapper.toDomain
import com.example.foodics.data.repository.mapper.toProductEntity
import com.example.foodics.data.util.safeHandleCall
import com.example.foodics.domain.entity.Product
import com.example.foodics.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import java.util.UUID

class ProductRepositoryImpl(
    private val productDao: ProductDao,
    private val categoryDao: CategoryDao,
    private val cartDao: CartDao,
    private val productRemoteDataSource: ProductRemoteDataSource
) : ProductRepository {

    override suspend fun getProducts(
        searchQuery: String?,
        categoryId: UUID,
        isFirstFetch: Boolean
    ): List<Product> {
        if (isFirstFetch) {
            fetchRemoteProductsAsEntities()
        }

        return productDao.getProductsByCategoryAndSearch(
            categoryId = categoryId.toString(),
            searchQuery = searchQuery.orEmpty()
        ).map { product -> product.toDomainWithExtraInfo() }

    }

    private suspend fun fetchRemoteProductsAsEntities(): List<ProductEntity> {
        return safeHandleCall {
            productRemoteDataSource.getProducts()
                .map { it.toProductEntity() }
                .also { productDao.insertProducts(it) }
        }
    }

    private suspend fun ProductEntity.toDomainWithExtraInfo(): Product {
        val category = categoryDao.getCategoryByProductId(this.id)
        val inCart = cartDao.getCartItem(productId = this.id) != null
        return this.toDomain(category!!.toDomain(), inCart)
    }

    override suspend fun toggleProductInCart(product: Product): Boolean {
        val productId = product.id.toString()
        val existingCartItem = cartDao.getCartItem(productId)

        return if (existingCartItem != null) {
            cartDao.deleteCartItem(productId)
            false
        } else {
            cartDao.insertCartItem(CartItemEntity(productId = productId))
            true
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
}