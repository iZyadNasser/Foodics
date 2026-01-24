package com.example.foodics.ui.navigation

import kotlinx.serialization.Serializable

interface Route {
    @Serializable
    data object Tables : Route

    @Serializable
    data object Orders : Route

    @Serializable
    data object Menu : Route

    @Serializable
    data object Settings : Route
}