package com.example.redederestaurantecomemuito.ui.main.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.redederestaurantecomemuito.databinding.FragmentDashboardBinding
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBHelper
import com.example.redederestaurantecomemuito.ui.main.models.FuncionarioModel
import java.util.*

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private var dbSqlite: DBHelper? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        dbSqlite = DBHelper(requireContext())
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        setListeners()
        return root
    }

    private fun setListeners() {
        binding.apply {
            buttonSalvar.setOnClickListener {
                addFuncionarioInBD(
                    FuncionarioModel(
                        idFuncionario = Calendar.getInstance().timeInMillis.toInt(),
                        nome = edittextNome.text.toString().orEmpty(),
                        telefone = edittextTelefone.text.toString().orEmpty(),
                        endereco = edittextEndereco.text.toString().orEmpty(),
                        salario = edittextSalario.text.toString().toDouble() ?: 0.0,
                        idRestaurante = edittextIdRestaurante.text.toString().toInt() ?: 1,
                        dataAdm = edittextDataAdm.text.toString(),
                        dataSaida = edittextDataSaida.text.toString()
                    )
                )
            }

            buttonEditar.setOnClickListener {
                editarFuncionarioInBD(
                    FuncionarioModel(
                        idFuncionario = edittextIdFuncionario.text.toString().toInt()
                            ?: Calendar.getInstance().timeInMillis.toInt(),
                        nome = edittextNome.text.toString().orEmpty(),
                        telefone = edittextTelefone.text.toString().orEmpty(),
                        endereco = edittextEndereco.text.toString().orEmpty(),
                        salario = edittextSalario.text.toString().toDouble() ?: 0.0,
                        idRestaurante = edittextIdRestaurante.text.toString().toInt() ?: 1,
                        dataAdm = edittextDataAdm.text.toString(),
                        dataSaida = edittextDataSaida.text.toString()
                    )
                )
            }
        }
    }


    fun addFuncionarioInBD(funcionarioModel: FuncionarioModel) {
        dbSqlite?.insertFuncionariosInDb(funcionarioModel)
    }

    fun editarFuncionarioInBD(funcionarioModel: FuncionarioModel) {
        dbSqlite?.editFuncionarioInDb(funcionarioModel = funcionarioModel)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}