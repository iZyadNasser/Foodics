package com.example.foodics.di

import com.example.foodics.data.repository.FakeCategoryRepositoryImpl
import com.example.foodics.data.repository.FakeProductRepositoryImpl
import com.example.foodics.domain.repository.CategoryRepository
import com.example.foodics.domain.repository.ProductRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::FakeCategoryRepositoryImpl) bind CategoryRepository::class
    singleOf(::FakeProductRepositoryImpl) bind ProductRepository::class
}