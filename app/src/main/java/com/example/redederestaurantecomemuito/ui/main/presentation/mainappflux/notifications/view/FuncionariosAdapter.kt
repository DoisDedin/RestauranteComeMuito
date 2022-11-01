package com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.redederestaurantecomemuito.databinding.ItemFuncionarioBinding
import com.example.redederestaurantecomemuito.ui.main.domain.EmployeeDomain

class FuncionariosAdapter : RecyclerView.Adapter<FuncionariosAdapter.FuncionariosHolder>() {

    private var funcionariosList: MutableList<EmployeeDomain> = arrayListOf()
    private lateinit var executeOnClick: (funcionarioModel: EmployeeDomain) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuncionariosHolder {
        val itemBinding =
            ItemFuncionarioBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FuncionariosHolder(itemBinding, executeOnClick, parent.context)
    }

    override fun onBindViewHolder(holder: FuncionariosHolder, position: Int) {
        holder.bind(funcionariosList[position])
    }

    override fun getItemCount(): Int = funcionariosList.size

    fun setData(list: List<EmployeeDomain>) {
        funcionariosList.clear()
        funcionariosList.addAll(list)
        notifyDataSetChanged()
    }

    fun setOnClick(executeOnClick: (funcionarioModel: EmployeeDomain) -> Unit) {
        this.executeOnClick = executeOnClick
    }

    class FuncionariosHolder(
        private val itemBinding: ItemFuncionarioBinding,
        private val executeOnClick: (funcionarioModel: EmployeeDomain) -> Unit,
        private val context: Context
    ) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(funcionarioModel: EmployeeDomain) {
            setInfolayout(funcionarioModel = funcionarioModel)
            setClickLayout(funcionarioModel = funcionarioModel)
        }

        private fun setInfolayout(funcionarioModel: EmployeeDomain) {
            itemBinding.apply {
                textviewName.text = funcionarioModel.nome
                textviewCode.text = funcionarioModel.idFuncionario.toString()
                textviewSalario.text = funcionarioModel.salario.toString()
            }
        }

        private fun setClickLayout(funcionarioModel: EmployeeDomain) {
            itemBinding.apply {
                contraintlayoutGeral.setOnLongClickListener {
                    executeOnClick.invoke(funcionarioModel)
                    return@setOnLongClickListener false
                }
            }
        }
    }
}