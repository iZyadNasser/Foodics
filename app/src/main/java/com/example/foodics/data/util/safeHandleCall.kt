package com.example.foodics.data.util

import com.example.foodics.data.remote.exception.DataSourceException
import com.example.foodics.data.remote.exception.handleDataSourceException

suspend fun <T> safeHandleCall(
    execute: suspend () -> T,
): T {
    return try {
        execute()
    } catch (exception: DataSourceException) {
        throw handleDataSourceException(exception)
    }
}