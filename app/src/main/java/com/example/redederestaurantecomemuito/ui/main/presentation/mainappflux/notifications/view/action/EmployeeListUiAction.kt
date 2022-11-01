package com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.view.action

sealed class EmployeeListUiAction {
    object ShowProgress : EmployeeListUiAction()
    object ShowRecyclerViewProgress : EmployeeListUiAction()
    object ResetAdapter : EmployeeListUiAction()
}