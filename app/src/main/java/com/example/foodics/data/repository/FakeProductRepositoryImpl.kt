package com.example.foodics.data.repository

import com.example.foodics.data.FakeProductData
import com.example.foodics.domain.entity.Product
import com.example.foodics.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import java.util.UUID

class FakeProductRepositoryImpl : ProductRepository {
    private val dummyCart: MutableList<Product> = emptyList<Product>().toMutableList()
    private var count: Int = 0
    private var total: Double = 0.0
    private val _countFlow = MutableSharedFlow<Int>()
    private val _totalFlow = MutableSharedFlow<Double>()

    override suspend fun getProducts(searchQuery: String?, categoryId: UUID): List<Product> {
        return FakeProductData.products.filter { it.category.id == categoryId }
            .filter { it.name.contains(searchQuery ?: "") }
    }

    override suspend fun toggleProductInCart(product: Product) {
        if (dummyCart.map { it.id }.contains(product.id)) {
            dummyCart.removeIf { it.id == product.id }
            count--
            _countFlow.emit(count)

            total -= product.price
            _totalFlow.emit(total)
        } else {
            dummyCart.add(product)
            count++
            _countFlow.emit(count)

            total += product.price
            _totalFlow.emit(total)
        }
    }

    override suspend fun clearCartProducts() {
        dummyCart.clear()
        count = 0
        total = 0.0
        _countFlow.emit(count)
        _totalFlow.emit(total)
    }

    override fun getProductsCountInCart(): Flow<Int> {
        return _countFlow
    }

    override fun getTotalProductsPriceInCart(): Flow<Double> {
        return _totalFlow
    }
}