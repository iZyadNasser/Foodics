package com.example.foodics.di

import org.koin.dsl.module

val appModule = module {
    includes(
        useCaseModule,
        viewModelModule,
        repositoryModule,
        localDataSourceModule,
        remoteDataSourceModule
    )
}