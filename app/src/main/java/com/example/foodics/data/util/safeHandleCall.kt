package com.example.foodics.data.util

import com.example.foodics.data.remote.exception.DataSourceException
import com.example.foodics.data.remote.exception.handleDataSourceException
import com.example.foodics.domain.exception.UnknownException

suspend fun <T> safeHandleCall(
    execute: suspend () -> T,
): T {
    return try {
        execute()
    } catch (exception: DataSourceException) {
        throw handleDataSourceException(exception)
    } catch (exception: Exception) {
        throw UnknownException(exception.message ?: "")
    }
}