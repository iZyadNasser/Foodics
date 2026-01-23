package com.example.foodics.domain.use_case

import com.example.foodics.domain.repository.CategoryRepository

class GetCategoriesUseCase(
    private val categoryRepository: CategoryRepository
) {
    suspend operator fun invoke(isFirstFetch: Boolean = false) =
        categoryRepository.getCategories(isFirstFetch)
}