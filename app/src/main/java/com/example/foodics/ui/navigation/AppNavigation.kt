package com.example.foodics.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodics.ui.feature.menu.MenuScreen
import com.example.foodics.ui.feature.orders.OrdersScreen
import com.example.foodics.ui.feature.settings.SettingsScreen
import com.example.foodics.ui.feature.tables.TablesRoot

@Composable
fun AppNavigation(
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavigationDestination.Tables.route,
            modifier = Modifier.padding(bottom = innerPadding.calculateBottomPadding())
        ) {
            composable(NavigationDestination.Tables.route) {
                TablesRoot()
            }

            composable(NavigationDestination.Orders.route) {
                OrdersScreen()
            }

            composable(NavigationDestination.Menu.route) {
                MenuScreen()
            }

            composable(NavigationDestination.Settings.route) {
                SettingsScreen()
            }
        }
    }
}