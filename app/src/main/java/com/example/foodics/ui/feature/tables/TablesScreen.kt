package com.example.foodics.ui.feature.tables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import com.example.foodics.ui.component.TopUserBar
import com.example.foodics.ui.component.ViewOrderButton
import com.example.foodics.ui.component.modifier.noRippleClickable
import java.util.UUID

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TablesScreen(
    screenState: TablesScreenState,
    interactionListener: TablesInteractionListener,
) {
    Scaffold(
        bottomBar = {
            ViewOrderButton(
                numberOfProducts = screenState.numberOfProductsInCart,
                totalPrice = screenState.totalPriceOfCart,
                onClick = interactionListener::onViewOrderClick,
                modifier = Modifier.padding(bottom = 12.dp)
            )
        },
        modifier = Modifier
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                TopUserBar(
                    userName = "Ikram Merah",
                    number = "991253",
                    modifier = Modifier.padding(horizontal = 16.dp)
                )

                TablesTopBar(
                    onBackClick = { },
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }

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

@Composable
private fun TablesTopBar(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = stringResource(R.string.back),
                modifier = Modifier.noRippleClickable(onBackClick)
            )

            Text(
                text = stringResource(R.string.tables),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        }

        HeaderInfo()
    }

}

@Composable
private fun HeaderInfo() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
    ) {
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
        )
    }
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