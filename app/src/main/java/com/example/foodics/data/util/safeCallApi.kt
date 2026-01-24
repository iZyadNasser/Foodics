package com.example.foodics.data.util

import android.util.Log
import com.example.foodics.data.remote.dto.BaseNetworkError
import com.example.foodics.data.remote.exception.BadRequestException
import com.example.foodics.data.remote.exception.DataSerializationException
import com.example.foodics.data.remote.exception.ForbiddenException
import com.example.foodics.data.remote.exception.IOConnectionException
import com.example.foodics.data.remote.exception.NotFoundException
import com.example.foodics.data.remote.exception.ServerException
import com.example.foodics.data.remote.exception.UnauthorizedApiException
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import kotlinx.serialization.SerializationException
import java.nio.channels.UnresolvedAddressException

internal suspend inline fun <reified T> tryToCallApi(
    noinline call: suspend () -> HttpResponse
): T {
    val response = try {
        call()
    } catch (e: UnresolvedAddressException) {
        throw IOConnectionException(e.message ?: "")
    } catch (e: SerializationException) {
        throw DataSerializationException(e.message ?: "")
    } catch (e: Exception) {
        currentCoroutineContext().ensureActive()
        throw e
    }

    try {
        return responseToException<T>(response)
    } catch (e: Exception) {
        Log.e("tryToCall", "$e")
        throw e
    }
}

private suspend inline fun <reified T> responseToException(
    response: HttpResponse
): T {
    return if (response.status.value in 200..299) {
        try {
            response.body<T>()
        } catch (e: NoTransformationFoundException) {
            throw DataSerializationException(e.message)
        }
    } else {
        val result = response.body<BaseNetworkError>()

        when (response.status.value) {
            400 -> throw BadRequestException(result.message ?: "")
            401 -> throw UnauthorizedApiException(result.message ?: "")
            403 -> throw ForbiddenException(result.message ?: "")
            404 -> throw NotFoundException(result.message ?: "")
            in 500..599 -> throw ServerException(result.message ?: "")
            else -> throw Exception(result.message ?: "")
        }
    }
}