package com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.redederestaurantecomemuito.databinding.FragmentNotificationsBinding
import com.example.redederestaurantecomemuito.ui.main.data.SQlite.DBHelper

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    private lateinit var adapter: FuncionariosAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        listeners()
        setUpAdapter()
        getAndSetFuncionariosInLayout()
        return root
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
                adapter.setData(
                    DBHelper(requireContext()).getFuncionarios(
                        editTextCode.text.toString(),
                        edittextName.text.toString(),
                        editTextSalario.text.toString()
                    )
                )
            }
            buttonGerenteFicouLouco.setOnClickListener {
                DBHelper(requireContext()).gerenteFicouMaluco()
                adapter.setData(DBHelper(requireContext()).getFuncionarios())
            }
        }
    }

    private fun getAndSetFuncionariosInLayout() {
        adapter.setData(DBHelper(requireContext()).getFuncionarios())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}