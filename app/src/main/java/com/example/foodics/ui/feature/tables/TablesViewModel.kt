package com.example.foodics.ui.feature.tables

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.entity.Product
import com.example.foodics.domain.use_case.GetCategoriesUseCase
import com.example.foodics.domain.use_case.ProductUseCaseManager
import com.example.foodics.ui.base.BaseViewModel
import com.example.foodics.ui.util.toUiText
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import java.util.UUID

class TablesViewModel(
    val getCategoriesUseCase: GetCategoriesUseCase,
    val productUseCaseManager: ProductUseCaseManager,
) : BaseViewModel<TablesScreenState, TablesScreenEffect>(TablesScreenState()),
    TablesInteractionListener {

    init {
        loadInitialData()
        listenToCount()
        listenToTotal()
    }

    private fun loadInitialData() {
        getCategories(
            callback = ::listenToSearch
        )
    }

    private fun getCategories(callback: () -> Unit) {
        tryToCall(
            block = {
                getCategoriesUseCase(
                    isFirstFetch = screenState.value.isFirstFetch,
                )
            },
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

    @OptIn(FlowPreview::class)
    private fun listenToSearch() {
        viewModelScope.launch {
            screenState
                .map { it.searchQuery.trim() }
                .debounce(DEBOUNCE_MS)
                .distinctUntilChanged()
                .collectLatest {
                    getProducts()
                }
        }
    }

    private fun getProducts() {
        tryToCall(
            block = {
                screenState.value.chosenCategoryId?.let { categoryId ->
                    productUseCaseManager.getProducts(
                        searchQuery = screenState.value.searchQuery,
                        categoryId = categoryId,
                        isFirstFetch = screenState.value.isFirstFetch
                    )
                } ?: emptyList()
            },
            onSuccess = ::handleGetProductsSuccess,
            onError = ::handleError,
            onStart = ::startLoading,
            onEnd = ::stopLoading
        )
    }

    private fun handleGetProductsSuccess(products: List<Product>) {
        updateState {
            it.copy(
                products = products,
                isFirstFetch = false
            )
        }
    }

    private fun listenToCount() {
        viewModelScope.launch {
            productUseCaseManager.getProductsCountInCart().collectLatest { count ->
                updateState {
                    it.copy(
                        numberOfProductsInCart = count
                    )
                }
            }
        }
    }

    private fun listenToTotal() {
        viewModelScope.launch {
            productUseCaseManager.getTotalProductsPriceInCart().collectLatest { total ->
                updateState {
                    it.copy(
                        totalPriceOfCart = total
                    )
                }
            }
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

        getProducts()
    }

    override fun onProductClick(productId: UUID) {
        tryToCall(
            block = {
                screenState.value.products.find { it.id == productId }
                    ?.let { productUseCaseManager.toggleProductInCart(it) } ?: false
            },
            onSuccess = { handleProductToggleSuccess(productId = productId, isAdded = it) },
            onError = ::handleError
        )
    }

    private fun handleProductToggleSuccess(productId: UUID, isAdded: Boolean) {
        sendEffect(TablesScreenEffect.ShowCartUpdatedSuccess)
        updateState {
            it.copy(
                products = it.products.map { product ->
                    if (product.id == productId) product.copy(inCart = isAdded) else product
                }
            )
        }
    }

    override fun onViewOrderClick() {
        tryToCall(
            block = { productUseCaseManager.clearCartProducts() },
            onSuccess = { clearProductSelections() },
            onError = ::handleError
        )
    }

    private fun clearProductSelections() {
        updateState {
            it.copy(
                products = it.products.map { product ->
                    product.copy(inCart = false)
                }
            )
        }
    }

    private fun handleError(throwable: Throwable) {
        Log.e(LOG_TAG, "catchError: $throwable")
        sendEffect(TablesScreenEffect.ShowError(throwable.toUiText()))
        stopLoading()
    }

    private fun startLoading() {
        updateState {
            it.copy(
                isLoading = true
            )
        }
    }

    private fun stopLoading() {
        updateState {
            it.copy(
                isLoading = false
            )
        }
    }

    companion object {
        private const val LOG_TAG = "TablesViewModel"
        private const val DEBOUNCE_MS = 300L
    }
}