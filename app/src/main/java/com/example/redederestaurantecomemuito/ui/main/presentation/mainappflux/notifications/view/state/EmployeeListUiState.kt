package com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.view.state

import com.example.redederestaurantecomemuito.ui.main.domain.EmployeeDomain

data class EmployeeListUiState(
    val employee: List<EmployeeDomain> = emptyList(),
    val isQuerying: Boolean = false,
    val error: String = ""
)