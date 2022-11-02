package com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.redederestaurantecomemuito.ui.main.domain.usecase.GetEmployeesUseCase
import com.example.redederestaurantecomemuito.ui.main.domain.usecase.ManagerWentCrazyUseCase
import com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.view.action.EmployeeListUiAction
import com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.view.event.EmployeeListEvents
import com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.view.state.EmployeeListUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotificationsViewModel @Inject constructor(
    private val getEmployeesUseCase: GetEmployeesUseCase,
    private val managerWhenCrazyUseCase: ManagerWentCrazyUseCase
) :
    ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text

    private var _state = MutableLiveData<EmployeeListUiState>(EmployeeListUiState())
    var state: LiveData<EmployeeListUiState> = _state

    private var _action = MutableLiveData<EmployeeListUiAction>()
    var action: LiveData<EmployeeListUiAction> = _action


    fun toggleEvent(events: EmployeeListEvents) {
        when (events) {
            is EmployeeListEvents.QueryEmployee -> {
                queryEmployees(code = events.code, name = events.name, salario = events.salario)
            }
            is EmployeeListEvents.LongClickDeleteEmployeePokemon -> {
                deleteEmployee(employeeId = events.employeeId)
            }
            is EmployeeListEvents.ClickManagerWentCrazy -> {
                managerWentCrazy()
            }
        }
    }

    private fun deleteEmployee(employeeId: String) {
        viewModelScope.launch(Dispatchers.IO) {
            setQueryingState(employeeId.isNotEmpty())
        }
    }

    private fun queryEmployees(
        code: String? = "",
        name: String? = "",
        salario: String? = ""
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            setQueryingState(querying = true)
            getEmployeesUseCase.getEmployees(code = code, name = name, salario = salario).onStart {
                _action.postValue(EmployeeListUiAction.ResetAdapter)
            }.catch {
                _state.postValue(_state.value?.copy(error = it.message.toString()))
            }.collect { listEmployees ->
                _state.postValue(_state.value?.copy(employee = listEmployees))
            }
        }
    }

    private fun managerWentCrazy() {
        viewModelScope.launch(Dispatchers.IO) {
            setQueryingState(querying = true)
            managerWhenCrazyUseCase.managerWentCrazy()
        }
    }

    private fun setQueryingState(querying: Boolean) {
        _state.postValue(
            _state.value?.copy(
                isQuerying = querying
            )
        )
    }
}