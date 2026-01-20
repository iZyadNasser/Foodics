package com.example.foodics.domain.exception

sealed class AppException(val errorMessage: String = "") : RuntimeException(errorMessage)

class DataNotFoundException(errorMessage: String = "") : AppException(errorMessage)
class NoInternetException(errorMessage: String = "") : AppException(errorMessage)
class UnknownException(errorMessage: String = "") : AppException(errorMessage)