package com.example.foodics.ui.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PrimaryScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.foodics.domain.entity.Category
import com.example.foodics.ui.design_system.PrimaryPurple
import java.util.UUID

@Composable
fun CategoryTabs(
    categories: List<Category>,
    onCategoryClick: (UUID) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedCategoryIndex by remember { mutableIntStateOf(0) }

    PrimaryScrollableTabRow(
        selectedTabIndex = selectedCategoryIndex,
        modifier = modifier,
        edgePadding = 16.dp,
        divider = { },
        indicator = {
            TabRowDefaults.PrimaryIndicator(
                Modifier.tabIndicatorOffset(selectedCategoryIndex, matchContentSize = true),
                width = Dp.Unspecified,
                color = PrimaryPurple
            )
        }
    ) {
        categories.forEachIndexed { index, category ->
            Tab(
                selected = selectedCategoryIndex == index,
                onClick = {
                    selectedCategoryIndex = index
                    onCategoryClick(category.id)
                },
                text = {
                    Text(
                        text = category.name,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontWeight = if (selectedCategoryIndex == index) {
                            FontWeight.Bold
                        } else {
                            FontWeight.Normal
                        }
                    )
                }
            )
        }
    }
}