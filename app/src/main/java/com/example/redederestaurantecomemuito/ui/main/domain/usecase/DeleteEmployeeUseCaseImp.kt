package com.example.redederestaurantecomemuito.ui.main.domain.usecase

import com.example.redederestaurantecomemuito.ui.main.domain.repository.RestaurantRepository
import javax.inject.Inject

class DeleteEmployeeUseCaseImp @Inject constructor(
    private val repository: RestaurantRepository
) : DeleteEmployeeUseCase {
    override suspend fun deleteEmployee(code: String) {
        repository.deleteEmployee(code = code)
    }
}