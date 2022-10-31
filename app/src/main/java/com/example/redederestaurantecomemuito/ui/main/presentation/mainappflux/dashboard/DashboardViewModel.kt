package com.example.redederestaurantecomemuito.ui.main.presentation.mainappflux.dashboard

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.redederestaurantecomemuito.ui.main.data.local.sqlite.DBHelper
import com.example.redederestaurantecomemuito.ui.main.domain.FuncionarioModel

class DashboardViewModel : ViewModel() {
    private var dbSqlite: DBHelper? = null
    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }


    fun addFuncionarioInBD(funcionarioModel: FuncionarioModel, context: Context) {
        dbSqlite = DBHelper(context)
        dbSqlite?.writableDatabase
    }


    val text: LiveData<String> = _text
}