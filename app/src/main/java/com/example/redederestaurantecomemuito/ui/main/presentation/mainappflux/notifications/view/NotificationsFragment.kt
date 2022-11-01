package com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.example.redederestaurantecomemuito.databinding.FragmentNotificationsBinding
import com.example.redederestaurantecomemuito.ui.main.common.observe
import com.example.redederestaurantecomemuito.ui.main.data.local.sqlite.DBHelper
import com.example.redederestaurantecomemuito.ui.main.presentation.base.BaseFragment
import com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.view.event.EmployeeListEvents
import com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.viewmodel.NotificationsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationsFragment : BaseFragment<FragmentNotificationsBinding>() {

    private lateinit var adapter: FuncionariosAdapter

    private val viewModel: NotificationsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listeners()
        setUpObservers()
        setUpAdapter()
        getInitEmployees()
    }

    private fun setUpAdapter() {
        adapter = FuncionariosAdapter()
        binding.recyclerViewDaysEvents.adapter = adapter
        adapter.setOnClick { funcionarioModel ->
            val db = DBHelper(requireContext())
            db.deleteFuncionario(funcionarioModel.idFuncionario.toString())
            adapter.setData(db.getFuncionarios())
        }
    }

    private fun listeners() {
        binding.apply {
            buttonFiltrar.setOnClickListener {
                viewModel.toggleEvent(
                    EmployeeListEvents.QueryEmployee(
                        editTextCode.text.toString(),
                        edittextName.text.toString(),
                        editTextSalario.text.toString()
                    )
                )
//                adapter.setData(
//                    DBHelper(requireContext()).getFuncionarios(
//                        editTextCode.text.toString(),
//                        edittextName.text.toString(),
//                        editTextSalario.text.toString()
//                    )
//                )
            }
            buttonGerenteFicouLouco.setOnClickListener {
                DBHelper(requireContext()).gerenteFicouMaluco()
                adapter.setData(DBHelper(requireContext()).getFuncionarios())
            }
        }
    }

    private fun setUpObservers() {
        viewModel.apply {
            observe(state) { state ->
                adapter.setData(state.employee)
                // fazer alguma coisa caso não for vazio state.error.isEmpty()
                // mostar um load caso essa variavel seja verdaeira state.isQuerying
            }
        }
    }

    private fun getInitEmployees() {
        viewModel.toggleEvent(
            EmployeeListEvents.QueryEmployee(
                "", "", ""
            )
        )
    }
}