package com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.view.event

sealed class EmployeeListEvents {
    data class QueryEmployee(
        val code: String,
        val name: String,
        val salario: String
    ) : EmployeeListEvents()

    data class LongClickDeleteEmployeePokemon(val employeeId: String) : EmployeeListEvents()
}