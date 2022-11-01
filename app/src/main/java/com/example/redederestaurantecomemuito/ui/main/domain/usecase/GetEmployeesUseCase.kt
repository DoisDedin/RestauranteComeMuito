package com.example.redederestaurantecomemuito.ui.main.domain.usecase

import com.example.redederestaurantecomemuito.ui.main.domain.EmployeeDomain
import kotlinx.coroutines.flow.Flow

interface GetEmployeesUseCase {
   suspend fun getEmployees(
        code: String? = "",
        name: String? = "",
        salario: String? = ""
    ): Flow<MutableList<EmployeeDomain>>
}