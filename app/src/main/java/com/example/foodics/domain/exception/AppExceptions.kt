package com.example.foodics.domain.exception

sealed class AppException(val errorMessage: String = "") : RuntimeException(errorMessage)

class DataNotFoundException(errorMessage: String = "") : AppException(errorMessage)
class ServerSideException(errorMessage: String = "") : AppException(errorMessage)
class UnauthorizedException(errorMessage: String = "") : AppException(errorMessage)
class NoInternetException(errorMessage: String = "") : AppException(errorMessage)
class ImplementationException(errorMessage: String = "") : AppException(errorMessage)
