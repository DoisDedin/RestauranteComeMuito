package com.example.redederestaurantecomemuito.ui.main.domain.usecase

interface DeleteEmployeeUseCase {
    suspend fun deleteEmployee(code: String)
}