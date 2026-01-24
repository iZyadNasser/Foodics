package com.example.foodics.data.util

import org.koin.core.qualifier.named
import org.koin.java.KoinJavaComponent.inject

fun constructUrl(
    path: String
): String {
    val newPath = if (path.startsWith("/")) path else "/$path"

    val baseUrl: String by inject(String::class.java, qualifier = named("apiBaseUrl"))
    val apiNumber: String by inject(String::class.java, qualifier = named("apiNumber"))
    val apiKey: String by inject(String::class.java, qualifier = named("apiKey"))

    return "$baseUrl/api$newPath/$apiNumber?key=$apiKey"
}