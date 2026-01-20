package com.example.foodics.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.foodics.ui.design_system.FoodicsTheme
import com.example.foodics.ui.feature.tables.TablesRoot

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodicsTheme {
                TablesRoot()
            }
        }
    }
}