package com.example.foodics.data

import com.example.foodics.domain.entity.Category
import com.example.foodics.domain.entity.Product
import java.util.UUID

object FakeProductData {

    private val categoryBreakfast = Category(
        id = UUID.randomUUID(),
        name = "Breakfast"
    )

    private val categoryLunch = Category(
        id = UUID.randomUUID(),
        name = "Lunch"
    )

    private val categoryDinner = Category(
        id = UUID.randomUUID(),
        name = "Dinner"
    )

    private val categorySweets = Category(
        id = UUID.randomUUID(),
        name = "Sweets"
    )

    private val categoryIce = Category(
        id = UUID.randomUUID(),
        name = "Ice"
    )

    private val categoryDrinks = Category(
        id = UUID.randomUUID(),
        name = "Drinks"
    )

    val categories = listOf(
        categoryBreakfast,
        categoryLunch,
        categoryDinner,
        categorySweets,
        categoryIce,
        categoryDrinks
    )

    val products = listOf(
        // Breakfast Items
        Product(
            id = UUID.randomUUID(),
            name = "Bacon & Cheese Burger",
            category = categoryBreakfast,
            description = "Juicy beef patty with crispy bacon and melted cheddar cheese",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&h=300&fit=crop",
            price = 45.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pancake Stack",
            category = categoryBreakfast,
            description = "Fluffy pancakes with maple syrup and fresh berries",
            imageUrl = "https://images.unsplash.com/photo-1528207776546-365bb710ee93?w=400&h=300&fit=crop",
            price = 32.50
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Avocado Toast",
            category = categoryBreakfast,
            description = "Whole grain toast topped with fresh avocado and poached eggs",
            imageUrl = "https://images.unsplash.com/photo-1541519227354-08fa5d50c44d?w=400&h=300&fit=crop",
            price = 38.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "French Toast",
            category = categoryBreakfast,
            description = "Classic French toast with powdered sugar and strawberries",
            imageUrl = "https://images.unsplash.com/photo-1484723091739-30a097e8f929?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Bacon & Cheese Burger",
            category = categoryBreakfast,
            description = "Juicy beef patty with crispy bacon and melted cheddar cheese",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&h=300&fit=crop",
            price = 45.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pancake Stack",
            category = categoryBreakfast,
            description = "Fluffy pancakes with maple syrup and fresh berries",
            imageUrl = "https://images.unsplash.com/photo-1528207776546-365bb710ee93?w=400&h=300&fit=crop",
            price = 32.50
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Avocado Toast",
            category = categoryBreakfast,
            description = "Whole grain toast topped with fresh avocado and poached eggs",
            imageUrl = "https://images.unsplash.com/photo-1541519227354-08fa5d50c44d?w=400&h=300&fit=crop",
            price = 38.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "French Toast",
            category = categoryBreakfast,
            description = "Classic French toast with powdered sugar and strawberries",
            imageUrl = "https://images.unsplash.com/photo-1484723091739-30a097e8f929?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Bacon & Cheese Burger",
            category = categoryBreakfast,
            description = "Juicy beef patty with crispy bacon and melted cheddar cheese",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&h=300&fit=crop",
            price = 45.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pancake Stack",
            category = categoryBreakfast,
            description = "Fluffy pancakes with maple syrup and fresh berries",
            imageUrl = "https://images.unsplash.com/photo-1528207776546-365bb710ee93?w=400&h=300&fit=crop",
            price = 32.50
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Avocado Toast",
            category = categoryBreakfast,
            description = "Whole grain toast topped with fresh avocado and poached eggs",
            imageUrl = "https://images.unsplash.com/photo-1541519227354-08fa5d50c44d?w=400&h=300&fit=crop",
            price = 38.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "French Toast",
            category = categoryBreakfast,
            description = "Classic French toast with powdered sugar and strawberries",
            imageUrl = "https://images.unsplash.com/photo-1484723091739-30a097e8f929?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Bacon & Cheese Burger",
            category = categoryBreakfast,
            description = "Juicy beef patty with crispy bacon and melted cheddar cheese",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&h=300&fit=crop",
            price = 45.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pancake Stack",
            category = categoryBreakfast,
            description = "Fluffy pancakes with maple syrup and fresh berries",
            imageUrl = "https://images.unsplash.com/photo-1528207776546-365bb710ee93?w=400&h=300&fit=crop",
            price = 32.50
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Avocado Toast",
            category = categoryBreakfast,
            description = "Whole grain toast topped with fresh avocado and poached eggs",
            imageUrl = "https://images.unsplash.com/photo-1541519227354-08fa5d50c44d?w=400&h=300&fit=crop",
            price = 38.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "French Toast",
            category = categoryBreakfast,
            description = "Classic French toast with powdered sugar and strawberries",
            imageUrl = "https://images.unsplash.com/photo-1484723091739-30a097e8f929?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Bacon & Cheese Burger",
            category = categoryBreakfast,
            description = "Juicy beef patty with crispy bacon and melted cheddar cheese",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&h=300&fit=crop",
            price = 45.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pancake Stack",
            category = categoryBreakfast,
            description = "Fluffy pancakes with maple syrup and fresh berries",
            imageUrl = "https://images.unsplash.com/photo-1528207776546-365bb710ee93?w=400&h=300&fit=crop",
            price = 32.50
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Avocado Toast",
            category = categoryBreakfast,
            description = "Whole grain toast topped with fresh avocado and poached eggs",
            imageUrl = "https://images.unsplash.com/photo-1541519227354-08fa5d50c44d?w=400&h=300&fit=crop",
            price = 38.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "French Toast",
            category = categoryBreakfast,
            description = "Classic French toast with powdered sugar and strawberries",
            imageUrl = "https://images.unsplash.com/photo-1484723091739-30a097e8f929?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Bacon & Cheese Burger",
            category = categoryBreakfast,
            description = "Juicy beef patty with crispy bacon and melted cheddar cheese",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&h=300&fit=crop",
            price = 45.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pancake Stack",
            category = categoryBreakfast,
            description = "Fluffy pancakes with maple syrup and fresh berries",
            imageUrl = "https://images.unsplash.com/photo-1528207776546-365bb710ee93?w=400&h=300&fit=crop",
            price = 32.50
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Avocado Toast",
            category = categoryBreakfast,
            description = "Whole grain toast topped with fresh avocado and poached eggs",
            imageUrl = "https://images.unsplash.com/photo-1541519227354-08fa5d50c44d?w=400&h=300&fit=crop",
            price = 38.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "French Toast",
            category = categoryBreakfast,
            description = "Classic French toast with powdered sugar and strawberries",
            imageUrl = "https://images.unsplash.com/photo-1484723091739-30a097e8f929?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Bacon & Cheese Burger",
            category = categoryBreakfast,
            description = "Juicy beef patty with crispy bacon and melted cheddar cheese",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&h=300&fit=crop",
            price = 45.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pancake Stack",
            category = categoryBreakfast,
            description = "Fluffy pancakes with maple syrup and fresh berries",
            imageUrl = "https://images.unsplash.com/photo-1528207776546-365bb710ee93?w=400&h=300&fit=crop",
            price = 32.50
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Avocado Toast",
            category = categoryBreakfast,
            description = "Whole grain toast topped with fresh avocado and poached eggs",
            imageUrl = "https://images.unsplash.com/photo-1541519227354-08fa5d50c44d?w=400&h=300&fit=crop",
            price = 38.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "French Toast",
            category = categoryBreakfast,
            description = "Classic French toast with powdered sugar and strawberries",
            imageUrl = "https://images.unsplash.com/photo-1484723091739-30a097e8f929?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Bacon & Cheese Burger",
            category = categoryBreakfast,
            description = "Juicy beef patty with crispy bacon and melted cheddar cheese",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&h=300&fit=crop",
            price = 45.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pancake Stack",
            category = categoryBreakfast,
            description = "Fluffy pancakes with maple syrup and fresh berries",
            imageUrl = "https://images.unsplash.com/photo-1528207776546-365bb710ee93?w=400&h=300&fit=crop",
            price = 32.50
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Avocado Toast",
            category = categoryBreakfast,
            description = "Whole grain toast topped with fresh avocado and poached eggs",
            imageUrl = "https://images.unsplash.com/photo-1541519227354-08fa5d50c44d?w=400&h=300&fit=crop",
            price = 38.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "French Toast",
            category = categoryBreakfast,
            description = "Classic French toast with powdered sugar and strawberries",
            imageUrl = "https://images.unsplash.com/photo-1484723091739-30a097e8f929?w=400&h=300&fit=crop",
            price = 35.00
        ),

        // Lunch Items
        Product(
            id = UUID.randomUUID(),
            name = "Caesar Salad",
            category = categoryLunch,
            description = "Fresh romaine lettuce with Caesar dressing and croutons",
            imageUrl = "https://images.unsplash.com/photo-1546793665-c74683f339c1?w=400&h=300&fit=crop",
            price = 42.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Chicken",
            category = categoryLunch,
            description = "Tender grilled chicken breast with herbs and spices",
            imageUrl = "https://images.unsplash.com/photo-1532550907401-a500c9a57435?w=400&h=300&fit=crop",
            price = 55.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Club Sandwich",
            category = categoryLunch,
            description = "Triple-decker sandwich with turkey, bacon, and fresh vegetables",
            imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400&h=300&fit=crop",
            price = 48.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fish & Chips",
            category = categoryLunch,
            description = "Crispy battered fish with golden french fries",
            imageUrl = "https://images.unsplash.com/photo-1579208570378-8c970854bc23?w=400&h=300&fit=crop",
            price = 52.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Caesar Salad",
            category = categoryLunch,
            description = "Fresh romaine lettuce with Caesar dressing and croutons",
            imageUrl = "https://images.unsplash.com/photo-1546793665-c74683f339c1?w=400&h=300&fit=crop",
            price = 42.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Chicken",
            category = categoryLunch,
            description = "Tender grilled chicken breast with herbs and spices",
            imageUrl = "https://images.unsplash.com/photo-1532550907401-a500c9a57435?w=400&h=300&fit=crop",
            price = 55.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Club Sandwich",
            category = categoryLunch,
            description = "Triple-decker sandwich with turkey, bacon, and fresh vegetables",
            imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400&h=300&fit=crop",
            price = 48.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fish & Chips",
            category = categoryLunch,
            description = "Crispy battered fish with golden french fries",
            imageUrl = "https://images.unsplash.com/photo-1579208570378-8c970854bc23?w=400&h=300&fit=crop",
            price = 52.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Caesar Salad",
            category = categoryLunch,
            description = "Fresh romaine lettuce with Caesar dressing and croutons",
            imageUrl = "https://images.unsplash.com/photo-1546793665-c74683f339c1?w=400&h=300&fit=crop",
            price = 42.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Chicken",
            category = categoryLunch,
            description = "Tender grilled chicken breast with herbs and spices",
            imageUrl = "https://images.unsplash.com/photo-1532550907401-a500c9a57435?w=400&h=300&fit=crop",
            price = 55.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Club Sandwich",
            category = categoryLunch,
            description = "Triple-decker sandwich with turkey, bacon, and fresh vegetables",
            imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400&h=300&fit=crop",
            price = 48.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fish & Chips",
            category = categoryLunch,
            description = "Crispy battered fish with golden french fries",
            imageUrl = "https://images.unsplash.com/photo-1579208570378-8c970854bc23?w=400&h=300&fit=crop",
            price = 52.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Caesar Salad",
            category = categoryLunch,
            description = "Fresh romaine lettuce with Caesar dressing and croutons",
            imageUrl = "https://images.unsplash.com/photo-1546793665-c74683f339c1?w=400&h=300&fit=crop",
            price = 42.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Chicken",
            category = categoryLunch,
            description = "Tender grilled chicken breast with herbs and spices",
            imageUrl = "https://images.unsplash.com/photo-1532550907401-a500c9a57435?w=400&h=300&fit=crop",
            price = 55.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Club Sandwich",
            category = categoryLunch,
            description = "Triple-decker sandwich with turkey, bacon, and fresh vegetables",
            imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400&h=300&fit=crop",
            price = 48.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fish & Chips",
            category = categoryLunch,
            description = "Crispy battered fish with golden french fries",
            imageUrl = "https://images.unsplash.com/photo-1579208570378-8c970854bc23?w=400&h=300&fit=crop",
            price = 52.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Caesar Salad",
            category = categoryLunch,
            description = "Fresh romaine lettuce with Caesar dressing and croutons",
            imageUrl = "https://images.unsplash.com/photo-1546793665-c74683f339c1?w=400&h=300&fit=crop",
            price = 42.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Chicken",
            category = categoryLunch,
            description = "Tender grilled chicken breast with herbs and spices",
            imageUrl = "https://images.unsplash.com/photo-1532550907401-a500c9a57435?w=400&h=300&fit=crop",
            price = 55.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Club Sandwich",
            category = categoryLunch,
            description = "Triple-decker sandwich with turkey, bacon, and fresh vegetables",
            imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400&h=300&fit=crop",
            price = 48.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fish & Chips",
            category = categoryLunch,
            description = "Crispy battered fish with golden french fries",
            imageUrl = "https://images.unsplash.com/photo-1579208570378-8c970854bc23?w=400&h=300&fit=crop",
            price = 52.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Caesar Salad",
            category = categoryLunch,
            description = "Fresh romaine lettuce with Caesar dressing and croutons",
            imageUrl = "https://images.unsplash.com/photo-1546793665-c74683f339c1?w=400&h=300&fit=crop",
            price = 42.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Chicken",
            category = categoryLunch,
            description = "Tender grilled chicken breast with herbs and spices",
            imageUrl = "https://images.unsplash.com/photo-1532550907401-a500c9a57435?w=400&h=300&fit=crop",
            price = 55.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Club Sandwich",
            category = categoryLunch,
            description = "Triple-decker sandwich with turkey, bacon, and fresh vegetables",
            imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400&h=300&fit=crop",
            price = 48.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fish & Chips",
            category = categoryLunch,
            description = "Crispy battered fish with golden french fries",
            imageUrl = "https://images.unsplash.com/photo-1579208570378-8c970854bc23?w=400&h=300&fit=crop",
            price = 52.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Caesar Salad",
            category = categoryLunch,
            description = "Fresh romaine lettuce with Caesar dressing and croutons",
            imageUrl = "https://images.unsplash.com/photo-1546793665-c74683f339c1?w=400&h=300&fit=crop",
            price = 42.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Chicken",
            category = categoryLunch,
            description = "Tender grilled chicken breast with herbs and spices",
            imageUrl = "https://images.unsplash.com/photo-1532550907401-a500c9a57435?w=400&h=300&fit=crop",
            price = 55.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Club Sandwich",
            category = categoryLunch,
            description = "Triple-decker sandwich with turkey, bacon, and fresh vegetables",
            imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400&h=300&fit=crop",
            price = 48.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fish & Chips",
            category = categoryLunch,
            description = "Crispy battered fish with golden french fries",
            imageUrl = "https://images.unsplash.com/photo-1579208570378-8c970854bc23?w=400&h=300&fit=crop",
            price = 52.00
        ),

        // Dinner Items
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Steak",
            category = categoryDinner,
            description = "Premium ribeye steak grilled to perfection",
            imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092?w=400&h=300&fit=crop",
            price = 85.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Salmon Fillet",
            category = categoryDinner,
            description = "Pan-seared salmon with lemon butter sauce",
            imageUrl = "https://images.unsplash.com/photo-1485921325833-c519f76c4927?w=400&h=300&fit=crop",
            price = 78.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pasta Carbonara",
            category = categoryDinner,
            description = "Creamy pasta with bacon and parmesan cheese",
            imageUrl = "https://images.unsplash.com/photo-1612874742237-6526221588e3?w=400&h=300&fit=crop",
            price = 62.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "BBQ Ribs",
            category = categoryDinner,
            description = "Tender pork ribs with smoky BBQ sauce",
            imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=400&h=300&fit=crop",
            price = 72.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Steak",
            category = categoryDinner,
            description = "Premium ribeye steak grilled to perfection",
            imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092?w=400&h=300&fit=crop",
            price = 85.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Salmon Fillet",
            category = categoryDinner,
            description = "Pan-seared salmon with lemon butter sauce",
            imageUrl = "https://images.unsplash.com/photo-1485921325833-c519f76c4927?w=400&h=300&fit=crop",
            price = 78.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pasta Carbonara",
            category = categoryDinner,
            description = "Creamy pasta with bacon and parmesan cheese",
            imageUrl = "https://images.unsplash.com/photo-1612874742237-6526221588e3?w=400&h=300&fit=crop",
            price = 62.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "BBQ Ribs",
            category = categoryDinner,
            description = "Tender pork ribs with smoky BBQ sauce",
            imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=400&h=300&fit=crop",
            price = 72.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Steak",
            category = categoryDinner,
            description = "Premium ribeye steak grilled to perfection",
            imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092?w=400&h=300&fit=crop",
            price = 85.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Salmon Fillet",
            category = categoryDinner,
            description = "Pan-seared salmon with lemon butter sauce",
            imageUrl = "https://images.unsplash.com/photo-1485921325833-c519f76c4927?w=400&h=300&fit=crop",
            price = 78.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pasta Carbonara",
            category = categoryDinner,
            description = "Creamy pasta with bacon and parmesan cheese",
            imageUrl = "https://images.unsplash.com/photo-1612874742237-6526221588e3?w=400&h=300&fit=crop",
            price = 62.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "BBQ Ribs",
            category = categoryDinner,
            description = "Tender pork ribs with smoky BBQ sauce",
            imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=400&h=300&fit=crop",
            price = 72.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Steak",
            category = categoryDinner,
            description = "Premium ribeye steak grilled to perfection",
            imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092?w=400&h=300&fit=crop",
            price = 85.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Salmon Fillet",
            category = categoryDinner,
            description = "Pan-seared salmon with lemon butter sauce",
            imageUrl = "https://images.unsplash.com/photo-1485921325833-c519f76c4927?w=400&h=300&fit=crop",
            price = 78.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pasta Carbonara",
            category = categoryDinner,
            description = "Creamy pasta with bacon and parmesan cheese",
            imageUrl = "https://images.unsplash.com/photo-1612874742237-6526221588e3?w=400&h=300&fit=crop",
            price = 62.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "BBQ Ribs",
            category = categoryDinner,
            description = "Tender pork ribs with smoky BBQ sauce",
            imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=400&h=300&fit=crop",
            price = 72.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Steak",
            category = categoryDinner,
            description = "Premium ribeye steak grilled to perfection",
            imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092?w=400&h=300&fit=crop",
            price = 85.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Salmon Fillet",
            category = categoryDinner,
            description = "Pan-seared salmon with lemon butter sauce",
            imageUrl = "https://images.unsplash.com/photo-1485921325833-c519f76c4927?w=400&h=300&fit=crop",
            price = 78.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pasta Carbonara",
            category = categoryDinner,
            description = "Creamy pasta with bacon and parmesan cheese",
            imageUrl = "https://images.unsplash.com/photo-1612874742237-6526221588e3?w=400&h=300&fit=crop",
            price = 62.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "BBQ Ribs",
            category = categoryDinner,
            description = "Tender pork ribs with smoky BBQ sauce",
            imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=400&h=300&fit=crop",
            price = 72.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Grilled Steak",
            category = categoryDinner,
            description = "Premium ribeye steak grilled to perfection",
            imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092?w=400&h=300&fit=crop",
            price = 85.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Salmon Fillet",
            category = categoryDinner,
            description = "Pan-seared salmon with lemon butter sauce",
            imageUrl = "https://images.unsplash.com/photo-1485921325833-c519f76c4927?w=400&h=300&fit=crop",
            price = 78.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Pasta Carbonara",
            category = categoryDinner,
            description = "Creamy pasta with bacon and parmesan cheese",
            imageUrl = "https://images.unsplash.com/photo-1612874742237-6526221588e3?w=400&h=300&fit=crop",
            price = 62.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "BBQ Ribs",
            category = categoryDinner,
            description = "Tender pork ribs with smoky BBQ sauce",
            imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=400&h=300&fit=crop",
            price = 72.00
        ),

        // Sweets
        Product(
            id = UUID.randomUUID(),
            name = "Chocolate Cake",
            category = categorySweets,
            description = "Rich chocolate cake with creamy frosting",
            imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400&h=300&fit=crop",
            price = 28.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cheesecake",
            category = categorySweets,
            description = "New York style cheesecake with berry compote",
            imageUrl = "https://images.unsplash.com/photo-1533134486753-c833f0ed4866?w=400&h=300&fit=crop",
            price = 32.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Tiramisu",
            category = categorySweets,
            description = "Classic Italian dessert with coffee and mascarpone",
            imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Brownie Sundae",
            category = categorySweets,
            description = "Warm chocolate brownie with vanilla ice cream",
            imageUrl = "https://images.unsplash.com/photo-1624353365286-3f8d62daad51?w=400&h=300&fit=crop",
            price = 30.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Chocolate Cake",
            category = categorySweets,
            description = "Rich chocolate cake with creamy frosting",
            imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400&h=300&fit=crop",
            price = 28.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cheesecake",
            category = categorySweets,
            description = "New York style cheesecake with berry compote",
            imageUrl = "https://images.unsplash.com/photo-1533134486753-c833f0ed4866?w=400&h=300&fit=crop",
            price = 32.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Tiramisu",
            category = categorySweets,
            description = "Classic Italian dessert with coffee and mascarpone",
            imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Brownie Sundae",
            category = categorySweets,
            description = "Warm chocolate brownie with vanilla ice cream",
            imageUrl = "https://images.unsplash.com/photo-1624353365286-3f8d62daad51?w=400&h=300&fit=crop",
            price = 30.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Chocolate Cake",
            category = categorySweets,
            description = "Rich chocolate cake with creamy frosting",
            imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400&h=300&fit=crop",
            price = 28.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cheesecake",
            category = categorySweets,
            description = "New York style cheesecake with berry compote",
            imageUrl = "https://images.unsplash.com/photo-1533134486753-c833f0ed4866?w=400&h=300&fit=crop",
            price = 32.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Tiramisu",
            category = categorySweets,
            description = "Classic Italian dessert with coffee and mascarpone",
            imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Brownie Sundae",
            category = categorySweets,
            description = "Warm chocolate brownie with vanilla ice cream",
            imageUrl = "https://images.unsplash.com/photo-1624353365286-3f8d62daad51?w=400&h=300&fit=crop",
            price = 30.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Chocolate Cake",
            category = categorySweets,
            description = "Rich chocolate cake with creamy frosting",
            imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400&h=300&fit=crop",
            price = 28.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cheesecake",
            category = categorySweets,
            description = "New York style cheesecake with berry compote",
            imageUrl = "https://images.unsplash.com/photo-1533134486753-c833f0ed4866?w=400&h=300&fit=crop",
            price = 32.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Tiramisu",
            category = categorySweets,
            description = "Classic Italian dessert with coffee and mascarpone",
            imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Brownie Sundae",
            category = categorySweets,
            description = "Warm chocolate brownie with vanilla ice cream",
            imageUrl = "https://images.unsplash.com/photo-1624353365286-3f8d62daad51?w=400&h=300&fit=crop",
            price = 30.00
        ), Product(
            id = UUID.randomUUID(),
            name = "Chocolate Cake",
            category = categorySweets,
            description = "Rich chocolate cake with creamy frosting",
            imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400&h=300&fit=crop",
            price = 28.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cheesecake",
            category = categorySweets,
            description = "New York style cheesecake with berry compote",
            imageUrl = "https://images.unsplash.com/photo-1533134486753-c833f0ed4866?w=400&h=300&fit=crop",
            price = 32.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Tiramisu",
            category = categorySweets,
            description = "Classic Italian dessert with coffee and mascarpone",
            imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Brownie Sundae",
            category = categorySweets,
            description = "Warm chocolate brownie with vanilla ice cream",
            imageUrl = "https://images.unsplash.com/photo-1624353365286-3f8d62daad51?w=400&h=300&fit=crop",
            price = 30.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Chocolate Cake",
            category = categorySweets,
            description = "Rich chocolate cake with creamy frosting",
            imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400&h=300&fit=crop",
            price = 28.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cheesecake",
            category = categorySweets,
            description = "New York style cheesecake with berry compote",
            imageUrl = "https://images.unsplash.com/photo-1533134486753-c833f0ed4866?w=400&h=300&fit=crop",
            price = 32.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Tiramisu",
            category = categorySweets,
            description = "Classic Italian dessert with coffee and mascarpone",
            imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Brownie Sundae",
            category = categorySweets,
            description = "Warm chocolate brownie with vanilla ice cream",
            imageUrl = "https://images.unsplash.com/photo-1624353365286-3f8d62daad51?w=400&h=300&fit=crop",
            price = 30.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Chocolate Cake",
            category = categorySweets,
            description = "Rich chocolate cake with creamy frosting",
            imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400&h=300&fit=crop",
            price = 28.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cheesecake",
            category = categorySweets,
            description = "New York style cheesecake with berry compote",
            imageUrl = "https://images.unsplash.com/photo-1533134486753-c833f0ed4866?w=400&h=300&fit=crop",
            price = 32.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Tiramisu",
            category = categorySweets,
            description = "Classic Italian dessert with coffee and mascarpone",
            imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Brownie Sundae",
            category = categorySweets,
            description = "Warm chocolate brownie with vanilla ice cream",
            imageUrl = "https://images.unsplash.com/photo-1624353365286-3f8d62daad51?w=400&h=300&fit=crop",
            price = 30.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Chocolate Cake",
            category = categorySweets,
            description = "Rich chocolate cake with creamy frosting",
            imageUrl = "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400&h=300&fit=crop",
            price = 28.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cheesecake",
            category = categorySweets,
            description = "New York style cheesecake with berry compote",
            imageUrl = "https://images.unsplash.com/photo-1533134486753-c833f0ed4866?w=400&h=300&fit=crop",
            price = 32.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Tiramisu",
            category = categorySweets,
            description = "Classic Italian dessert with coffee and mascarpone",
            imageUrl = "https://images.unsplash.com/photo-1571877227200-a0d98ea607e9?w=400&h=300&fit=crop",
            price = 35.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Brownie Sundae",
            category = categorySweets,
            description = "Warm chocolate brownie with vanilla ice cream",
            imageUrl = "https://images.unsplash.com/photo-1624353365286-3f8d62daad51?w=400&h=300&fit=crop",
            price = 30.00
        ),

        // Ice/Frozen Items
        Product(
            id = UUID.randomUUID(),
            name = "Vanilla Ice Cream",
            category = categoryIce,
            description = "Premium vanilla ice cream made with real vanilla beans",
            imageUrl = "https://images.unsplash.com/photo-1563805042-7684c019e1cb?w=400&h=300&fit=crop",
            price = 18.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Strawberry Sorbet",
            category = categoryIce,
            description = "Refreshing strawberry sorbet made with fresh fruit",
            imageUrl = "https://images.unsplash.com/photo-1488477181946-6428a0291777?w=400&h=300&fit=crop",
            price = 20.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Chocolate Gelato",
            category = categoryIce,
            description = "Authentic Italian chocolate gelato",
            imageUrl = "https://images.unsplash.com/photo-1570197788417-0e82375c9371?w=400&h=300&fit=crop",
            price = 22.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Mint Chip",
            category = categoryIce,
            description = "Cool mint ice cream with chocolate chips",
            imageUrl = "https://images.unsplash.com/photo-1497034825429-c343d7c6a68f?w=400&h=300&fit=crop",
            price = 19.00
        ),

        // Drinks
        Product(
            id = UUID.randomUUID(),
            name = "Fresh Orange Juice",
            category = categoryDrinks,
            description = "Freshly squeezed orange juice",
            imageUrl = "https://images.unsplash.com/photo-1600271886742-f049cd451bba?w=400&h=300&fit=crop",
            price = 15.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cappuccino",
            category = categoryDrinks,
            description = "Classic Italian cappuccino with perfect foam",
            imageUrl = "https://images.unsplash.com/photo-1572442388796-11668a67e53d?w=400&h=300&fit=crop",
            price = 18.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Smoothie Bowl",
            category = categoryDrinks,
            description = "Blended fruit smoothie topped with granola and berries",
            imageUrl = "https://images.unsplash.com/photo-1590301157890-4810ed352733?w=400&h=300&fit=crop",
            price = 25.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Iced Latte",
            category = categoryDrinks,
            description = "Cold espresso with milk and ice",
            imageUrl = "https://images.unsplash.com/photo-1517487881594-2787fef5ebf7?w=400&h=300&fit=crop",
            price = 20.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fresh Orange Juice",
            category = categoryDrinks,
            description = "Freshly squeezed orange juice",
            imageUrl = "https://images.unsplash.com/photo-1600271886742-f049cd451bba?w=400&h=300&fit=crop",
            price = 15.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cappuccino",
            category = categoryDrinks,
            description = "Classic Italian cappuccino with perfect foam",
            imageUrl = "https://images.unsplash.com/photo-1572442388796-11668a67e53d?w=400&h=300&fit=crop",
            price = 18.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Smoothie Bowl",
            category = categoryDrinks,
            description = "Blended fruit smoothie topped with granola and berries",
            imageUrl = "https://images.unsplash.com/photo-1590301157890-4810ed352733?w=400&h=300&fit=crop",
            price = 25.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Iced Latte",
            category = categoryDrinks,
            description = "Cold espresso with milk and ice",
            imageUrl = "https://images.unsplash.com/photo-1517487881594-2787fef5ebf7?w=400&h=300&fit=crop",
            price = 20.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fresh Orange Juice",
            category = categoryDrinks,
            description = "Freshly squeezed orange juice",
            imageUrl = "https://images.unsplash.com/photo-1600271886742-f049cd451bba?w=400&h=300&fit=crop",
            price = 15.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cappuccino",
            category = categoryDrinks,
            description = "Classic Italian cappuccino with perfect foam",
            imageUrl = "https://images.unsplash.com/photo-1572442388796-11668a67e53d?w=400&h=300&fit=crop",
            price = 18.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Smoothie Bowl",
            category = categoryDrinks,
            description = "Blended fruit smoothie topped with granola and berries",
            imageUrl = "https://images.unsplash.com/photo-1590301157890-4810ed352733?w=400&h=300&fit=crop",
            price = 25.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Iced Latte",
            category = categoryDrinks,
            description = "Cold espresso with milk and ice",
            imageUrl = "https://images.unsplash.com/photo-1517487881594-2787fef5ebf7?w=400&h=300&fit=crop",
            price = 20.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fresh Orange Juice",
            category = categoryDrinks,
            description = "Freshly squeezed orange juice",
            imageUrl = "https://images.unsplash.com/photo-1600271886742-f049cd451bba?w=400&h=300&fit=crop",
            price = 15.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cappuccino",
            category = categoryDrinks,
            description = "Classic Italian cappuccino with perfect foam",
            imageUrl = "https://images.unsplash.com/photo-1572442388796-11668a67e53d?w=400&h=300&fit=crop",
            price = 18.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Smoothie Bowl",
            category = categoryDrinks,
            description = "Blended fruit smoothie topped with granola and berries",
            imageUrl = "https://images.unsplash.com/photo-1590301157890-4810ed352733?w=400&h=300&fit=crop",
            price = 25.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Iced Latte",
            category = categoryDrinks,
            description = "Cold espresso with milk and ice",
            imageUrl = "https://images.unsplash.com/photo-1517487881594-2787fef5ebf7?w=400&h=300&fit=crop",
            price = 20.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Fresh Orange Juice",
            category = categoryDrinks,
            description = "Freshly squeezed orange juice",
            imageUrl = "https://images.unsplash.com/photo-1600271886742-f049cd451bba?w=400&h=300&fit=crop",
            price = 15.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Cappuccino",
            category = categoryDrinks,
            description = "Classic Italian cappuccino with perfect foam",
            imageUrl = "https://images.unsplash.com/photo-1572442388796-11668a67e53d?w=400&h=300&fit=crop",
            price = 18.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Smoothie Bowl",
            category = categoryDrinks,
            description = "Blended fruit smoothie topped with granola and berries",
            imageUrl = "https://images.unsplash.com/photo-1590301157890-4810ed352733?w=400&h=300&fit=crop",
            price = 25.00
        ),
        Product(
            id = UUID.randomUUID(),
            name = "Iced Latte",
            category = categoryDrinks,
            description = "Cold espresso with milk and ice",
            imageUrl = "https://images.unsplash.com/photo-1517487881594-2787fef5ebf7?w=400&h=300&fit=crop",
            price = 20.00
        )
    )
}