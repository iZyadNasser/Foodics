package com.example.foodics.data.remote.exception

import com.example.foodics.domain.exception.DataNotFoundException
import com.example.foodics.domain.exception.ImplementationException
import com.example.foodics.domain.exception.NoInternetException
import com.example.foodics.domain.exception.ServerSideException
import com.example.foodics.domain.exception.UnauthorizedException

fun handleDataSourceException(
    exception: DataSourceException,
): Exception {
    return when (exception) {
        is ApiErrorException -> handleApiErrorException(exception)
        is DataSerializationException -> ImplementationException(exception.errorMessage)
        is IOConnectionException -> NoInternetException(exception.errorMessage)
    }
}

private fun handleApiErrorException(
    exception: ApiErrorException,
): Exception {
    return when (exception) {
        is BadRequestException -> Exception(exception.errorMessage)
        is UnauthorizedApiException -> UnauthorizedException(exception.errorMessage)
        is ForbiddenException -> Exception(exception.errorMessage)
        is NotFoundException -> DataNotFoundException(exception.errorMessage)
        is ServerException -> ServerSideException(exception.errorMessage)
    }
}