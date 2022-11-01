package com.example.redederestaurantecomemuito.ui.main.data.repository

import com.example.redederestaurantecomemuito.ui.main.data.local.sqlite.DBHelper
import com.example.redederestaurantecomemuito.ui.main.domain.EmployeeDomain
import com.example.redederestaurantecomemuito.ui.main.domain.repository.RestaurantRepository
import javax.inject.Inject

class RestaurantRepositoryImp @Inject constructor(val dbHelper: DBHelper) : RestaurantRepository {
    override suspend fun startDefaultBDRestaurant() {
        TODO("Not yet implemented")
    }

    override suspend fun getEmployees(
        code: String?,
        name: String?,
        salario: String?
    ): MutableList<EmployeeDomain> {
        return dbHelper.getFuncionarios(code = code, name = name, salario = salario)
    }
}