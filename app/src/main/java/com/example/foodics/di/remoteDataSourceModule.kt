package com.example.foodics.di

import com.example.foodics.data.remote.source.CategoryRemoteDataSourceImpl
import com.example.foodics.data.remote.source.ProductRemoteDataSourceImpl
import com.example.foodics.data.repository.category.CategoryRemoteDataSource
import com.example.foodics.data.repository.product.ProductRemoteDataSource
import com.example.foodics.data.util.KtorClientProvider
import org.koin.core.module.dsl.singleOf
import org.koin.core.qualifier.named
import org.koin.dsl.bind
import org.koin.dsl.module

val remoteDataSourceModule = module {
    single { KtorClientProvider.createHttpClient() }
    single(named("apiBaseUrl")) { "https://api.mockaroo.com" }
    single(named("apiKey")) { "b418af70" }
    singleOf(::CategoryRemoteDataSourceImpl) bind CategoryRemoteDataSource::class
    singleOf(::ProductRemoteDataSourceImpl) bind ProductRemoteDataSource::class
}