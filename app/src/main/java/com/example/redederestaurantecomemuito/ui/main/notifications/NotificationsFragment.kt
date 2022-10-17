package com.example.redederestaurantecomemuito.ui.main.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.redederestaurantecomemuito.databinding.FragmentNotificationsBinding
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBHelper

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

        setUpAdapter()

        getAndSetFuncionariosInLayout()
        return root
    }


    private fun setUpAdapter() {
        adapter = FuncionariosAdapter()
        binding.recyclerViewDaysEvents.adapter = adapter
        adapter.setOnClick {
            //criar aqui o dialog para selecionar se vai deletar o funcionario
        }
    }

    private fun getAndSetFuncionariosInLayout() {
        val db = DBHelper(requireContext())
        adapter.setData(db.getFuncionarios(null, null, null))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}