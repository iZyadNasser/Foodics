package com.example.foodics.ui.feature.tables

import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.entity.Product
import com.example.foodics.domain.use_case.GetCategoriesUseCase
import com.example.foodics.domain.use_case.ProductUseCaseManager
import com.example.foodics.ui.base.BaseViewModel
import java.util.UUID

class TablesViewModel(
    val getCategoriesUseCase: GetCategoriesUseCase,
    val productUseCaseManager: ProductUseCaseManager,
) : BaseViewModel<TablesScreenState, TablesScreenEffect>(TablesScreenState()),
    TablesInteractionListener {

    init {
        loadInitialData()
        // TODO: Add listeners for (search, order count, order total price)
    }

    private fun loadInitialData() {
        getCategories(
            callback = ::getProducts
        )
    }

    private fun getCategories(callback: () -> Unit) {
        tryToCall(
            block = { getCategoriesUseCase() },
            onSuccess = { categories ->
                handleGetCategoriesSuccess(categories)
                callback()
            },
            onError = ::handleError,
        )
    }

    private fun handleGetCategoriesSuccess(categories: List<Category>) {
        updateState {
            it.copy(
                categories = categories,
                chosenCategoryId = categories.firstOrNull()?.id
            )
        }
    }

    private fun getProducts() {
        tryToCall(
            block = {
                screenState.value.chosenCategoryId?.let { categoryId ->
                    productUseCaseManager.getProducts(
                        searchQuery = screenState.value.searchQuery,
                        categoryId = categoryId
                    )
                } ?: emptyList()
            },
            onSuccess = ::handleGetProductsSuccess,
            onError = ::handleError,
            onEnd = ::stopLoading
        )
    }

    private fun handleGetProductsSuccess(products: List<Product>) {
        updateState {
            it.copy(
                products = products
            )
        }
    }

    override fun onSearchQueryChange(text: String) {
        updateState {
            it.copy(
                searchQuery = text,
            )
        }
    }

    override fun onSwitchCategoryTab(categoryId: UUID) {
        updateState {
            it.copy(
                chosenCategoryId = categoryId
            )
        }
    }

    override fun onProductClick(productId: UUID) {
        TODO("Not yet implemented")
    }

    override fun onViewOrderClick() {
        TODO("Not yet implemented")
    }

    private fun handleError(throwable: Throwable) {
        // TODO: Map throwable to error messages
        stopLoading()
    }

    private fun stopLoading() {
        updateState {
            it.copy(
                isLoading = false
            )
        }
    }
}