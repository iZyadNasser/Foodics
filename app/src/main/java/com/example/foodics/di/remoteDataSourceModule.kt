package com.example.foodics.di

import com.example.foodics.data.remote.source.CategoryRemoteDataSourceImpl
import com.example.foodics.data.remote.source.ProductRemoteDataSourceImpl
import com.example.foodics.data.repository.category.CategoryRemoteDataSource
import com.example.foodics.data.repository.product.ProductRemoteDataSource
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val remoteDataSourceModule = module {
    singleOf(::CategoryRemoteDataSourceImpl) bind CategoryRemoteDataSource::class
    singleOf(::ProductRemoteDataSourceImpl) bind ProductRemoteDataSource::class
}