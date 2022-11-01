package com.example.redederestaurantecomemuito.ui.main.domain.usecase

import com.example.redederestaurantecomemuito.ui.main.domain.EmployeeDomain
import com.example.redederestaurantecomemuito.ui.main.domain.repository.RestaurantRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetEmployeesUseCaseImp @Inject constructor(
    private val repository: RestaurantRepository
) : GetEmployeesUseCase {

    override suspend fun getEmployees(
        code: String?,
        name: String?,
        salario: String?
    ): Flow<MutableList<EmployeeDomain>> {
        return flow {
            emit(repository.getEmployees(code = code, name = name, salario = salario))
        }
    }
}