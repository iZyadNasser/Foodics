package com.example.foodics.di

import com.example.foodics.data.repository.category.CategoryRepositoryImpl
import com.example.foodics.data.repository.product.ProductRepositoryImpl
import com.example.foodics.domain.repository.CategoryRepository
import com.example.foodics.domain.repository.ProductRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::CategoryRepositoryImpl) bind CategoryRepository::class
    singleOf(::ProductRepositoryImpl) bind ProductRepository::class
}