package com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.notifications

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.redederestaurantecomemuito.databinding.ItemFuncionarioBinding
import com.example.redederestaurantecomemuito.ui.main.domain.FuncionarioModel

class FuncionariosAdapter : RecyclerView.Adapter<FuncionariosAdapter.FuncionariosHolder>() {

    private var funcionariosList: MutableList<FuncionarioModel> = arrayListOf()
    private lateinit var executeOnClick: (funcionarioModel: FuncionarioModel) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuncionariosHolder {
        val itemBinding =
            ItemFuncionarioBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FuncionariosHolder(itemBinding, executeOnClick, parent.context)
    }

    override fun onBindViewHolder(holder: FuncionariosHolder, position: Int) {
        holder.bind(funcionariosList[position])
    }

    override fun getItemCount(): Int = funcionariosList.size

    fun setData(list: List<FuncionarioModel>) {
        funcionariosList.clear()
        funcionariosList.addAll(list)
        notifyDataSetChanged()
    }

    fun setOnClick(executeOnClick: (funcionarioModel: FuncionarioModel) -> Unit) {
        this.executeOnClick = executeOnClick
    }

    class FuncionariosHolder(
        private val itemBinding: ItemFuncionarioBinding,
        private val executeOnClick: (funcionarioModel: FuncionarioModel) -> Unit,
        private val context: Context
    ) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(funcionarioModel: FuncionarioModel) {
            setInfolayout(funcionarioModel = funcionarioModel)
            setClickLayout(funcionarioModel = funcionarioModel)
        }

        private fun setInfolayout(funcionarioModel: FuncionarioModel) {
            itemBinding.apply {
                textviewName.text = funcionarioModel.nome
                textviewCode.text = funcionarioModel.idFuncionario.toString()
                textviewSalario.text = funcionarioModel.salario.toString()
            }
        }

        private fun setClickLayout(funcionarioModel: FuncionarioModel) {
            itemBinding.apply {
                contraintlayoutGeral.setOnLongClickListener {
                    executeOnClick.invoke(funcionarioModel)
                    return@setOnLongClickListener false
                }
            }
        }
    }
}