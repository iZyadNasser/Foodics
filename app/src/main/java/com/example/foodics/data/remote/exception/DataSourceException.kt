package com.example.foodics.data.remote.exception

sealed class DataSourceException(val errorMessage: String = "") : RuntimeException(errorMessage)

// API-Specific
sealed class ApiErrorException(errorMessage: String = "") : DataSourceException(errorMessage)
class BadRequestException(errorMessage: String = "") : ApiErrorException(errorMessage)
class ForbiddenException(errorMessage: String = "") : ApiErrorException(errorMessage)
class NotFoundException(errorMessage: String = "") : ApiErrorException(errorMessage)
class ServerException(errorMessage: String = "") : ApiErrorException(errorMessage)
class UnknownApiErrorException(errorMessage: String = "") : ApiErrorException(errorMessage)

// General
class DataSerializationException(errorMessage: String = "") : DataSourceException(errorMessage)
class IOConnectionException(errorMessage: String = "") : DataSourceException(errorMessage)
class UnknownErrorException(errorMessage: String = "") : DataSourceException(errorMessage)
