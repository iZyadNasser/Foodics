package com.example.foodics.ui.feature.tables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.foodics.R
import com.example.foodics.domain.entity.Product
import com.example.foodics.ui.component.CategoryTabs
import com.example.foodics.ui.component.ProductCard
import com.example.foodics.ui.component.SearchBar
import com.example.foodics.ui.component.ViewOrderButton
import java.util.UUID

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TablesScreen(
    screenState: TablesScreenState,
    interactionListener: TablesInteractionListener,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TablesTopBar(
                onBackClick = { }
            )
        },
        bottomBar = {
            ViewOrderButton(
                numberOfProducts = screenState.numberOfProductsInCart,
                totalPrice = screenState.totalPriceOfCart,
                onClick = interactionListener::onViewOrderClick,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        },
        modifier = modifier
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            SearchBar(
                query = screenState.searchQuery,
                onQueryChange = interactionListener::onSearchQueryChange,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            AnimatedVisibility(screenState.categories.isNotEmpty()) {
                CategoryTabs(
                    categories = screenState.categories,
                    onCategoryClick = interactionListener::onSwitchCategoryTab,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }

            if (screenState.isLoading) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            } else {
                ProductGrid(
                    products = screenState.products,
                    onProductClick = interactionListener::onProductClick,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TablesTopBar(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.tables),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = stringResource(R.string.back)
                )
            }
        },
        actions = {
            HeaderInfo()
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        modifier = modifier
    )
}

@Composable
private fun RowScope.HeaderInfo() {
    Icon(
        imageVector = Icons.Default.Restaurant,
        contentDescription = null,
        modifier = Modifier
            .align(Alignment.CenterVertically)
            .padding(end = 8.dp)
            .size(16.dp)
    )

    Text(
        text = "03",
        style = MaterialTheme.typography.bodySmall,
        modifier = Modifier
            .align(Alignment.CenterVertically)
    )

    Spacer(modifier = Modifier.width(20.dp))

    Icon(
        imageVector = Icons.Default.Group,
        contentDescription = stringResource(R.string.users),
        modifier = Modifier
            .align(Alignment.CenterVertically)
            .padding(end = 8.dp)
            .size(16.dp)
    )

    Text(
        text = "02",
        style = MaterialTheme.typography.bodySmall,
        modifier = Modifier
            .align(Alignment.CenterVertically)
            .padding(end = 16.dp)
    )
}

@Composable
private fun ProductGrid(
    products: List<Product>,
    onProductClick: (UUID) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
    ) {
        items(products, key = { it.id }) { product ->
            ProductCard(
                product = product,
                onClick = { onProductClick(product.id) }
            )
        }
    }
}