package com.example.foodics.di

import com.example.foodics.domain.use_case.GetCategoriesUseCase
import com.example.foodics.domain.use_case.ProductUseCaseManager
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val useCaseModule = module {
    singleOf(::GetCategoriesUseCase)
    singleOf(::ProductUseCaseManager)
}