package com.example.foodics.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.RestaurantMenu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.foodics.R

sealed class NavigationDestination(
    val route: Route,
    @StringRes val title: Int,
    val icon: ImageVector,
) {
    data object Tables : NavigationDestination(
        route = Route.Tables,
        title = R.string.tables,
        icon = Icons.Default.Restaurant,
    )

    data object Orders : NavigationDestination(
        route = Route.Orders,
        title = R.string.orders,
        icon = Icons.AutoMirrored.Filled.MenuBook,
    )

    data object Menu : NavigationDestination(
        route = Route.Menu,
        title = R.string.menu,
        icon = Icons.Default.RestaurantMenu
    )

    data object Settings : NavigationDestination(
        route = Route.Settings,
        title = R.string.settings,
        icon = Icons.Default.Settings
    )

    companion object {
        val items = listOf(Tables, Orders, Menu, Settings)
    }
}