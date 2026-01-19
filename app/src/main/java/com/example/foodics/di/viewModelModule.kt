package com.example.foodics.di

import com.example.foodics.ui.feature.tables.TablesViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::TablesViewModel)
}