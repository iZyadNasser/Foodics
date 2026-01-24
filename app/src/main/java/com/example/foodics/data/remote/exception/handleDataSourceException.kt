package com.example.foodics.data.remote.exception

import com.example.foodics.domain.exception.AppException
import com.example.foodics.domain.exception.DataNotFoundException
import com.example.foodics.domain.exception.ImplementationException
import com.example.foodics.domain.exception.NoInternetException
import com.example.foodics.domain.exception.ServerSideException
import com.example.foodics.domain.exception.UnknownException

fun handleDataSourceException(
    exception: DataSourceException,
): AppException {
    return when (exception) {
        is ApiErrorException -> handleApiErrorException(exception)
        is DataSerializationException -> ImplementationException(exception.errorMessage)
        is IOConnectionException -> NoInternetException(exception.errorMessage)
        is UnknownErrorException -> UnknownException(exception.errorMessage)
    }
}

private fun handleApiErrorException(
    exception: ApiErrorException,
): AppException {
    return when (exception) {
        is BadRequestException -> UnknownException(exception.errorMessage)
        is ForbiddenException -> UnknownException(exception.errorMessage)
        is NotFoundException -> DataNotFoundException(exception.errorMessage)
        is ServerException -> ServerSideException(exception.errorMessage)
        is UnknownApiErrorException -> UnknownException(exception.errorMessage)
    }
}