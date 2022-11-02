package com.example.redederestaurantecomemuito.ui.main.domain.repository

import com.example.redederestaurantecomemuito.ui.main.domain.EmployeeDomain

interface RestaurantRepository {

    suspend fun startDefaultBDRestaurant()

    suspend fun getEmployees(
        code: String? = "",
        name: String? = "",
        salario: String? = ""
    ): MutableList<EmployeeDomain>

    suspend fun managerWentCrazy()

    suspend fun deleteEmployee(code: String)
}