package com.example.redederestaurantecomemuito.ui.main.SQlite

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.INSERT_ANUNCIOS
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.INSERT_AREA_CONSTRUCAO
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.INSERT_ATENDENTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.INSERT_CLIENTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.INSERT_FUNCIONARIO
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.INSERT_FUNCIONARIO_2
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.INSERT_MESA
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.INSERT_RESERVA
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.INSERT_RESTAURANTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_ALIMENTOS
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_ANUNCIOS
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_AREAS_CONSTRUCAO
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_ATENDENTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_BEBIDAS
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_CHEFE_COZINHA
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_CLIENTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_DEPENDENTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_EMPRESAS_ALIMENTICIAS
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_FAZ_CONTATO
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_FUNCIONARIOS
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_GARCOM
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_MESA
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_POSSUI_RESERVA_MESA
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_RECEPCIONISTA
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_RESERVA
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_RESTAURANTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_TEM_PARCERIA
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBTables.TABLE_ZELADOR
import com.example.redederestaurantecomemuito.ui.main.models.FuncionarioModel
import java.util.*

class DBHelper(context: Context) :
    SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(TABLE_ANUNCIOS)
        db?.execSQL(TABLE_AREAS_CONSTRUCAO)
        db?.execSQL(TABLE_ATENDENTE)
        db?.execSQL(TABLE_BEBIDAS)
        db?.execSQL(TABLE_CHEFE_COZINHA)
        db?.execSQL(TABLE_CLIENTE)
        db?.execSQL(TABLE_DEPENDENTE)
        db?.execSQL(TABLE_EMPRESAS_ALIMENTICIAS)
        db?.execSQL(TABLE_FAZ_CONTATO)
        db?.execSQL(TABLE_FUNCIONARIOS)
        db?.execSQL(TABLE_GARCOM)
        db?.execSQL(TABLE_MESA)
        db?.execSQL(TABLE_POSSUI_RESERVA_MESA)
        db?.execSQL(TABLE_RECEPCIONISTA)
        db?.execSQL(TABLE_RESERVA)
        db?.execSQL(TABLE_RESTAURANTE)
        db?.execSQL(TABLE_TEM_PARCERIA)
        db?.execSQL(TABLE_ZELADOR)
        db?.execSQL(TABLE_ALIMENTOS)
        db?.execSQL(INSERT_RESTAURANTE)
        db?.execSQL(INSERT_RESERVA)
        db?.execSQL(INSERT_MESA)
        db?.execSQL(INSERT_FUNCIONARIO)
        db?.execSQL(INSERT_FUNCIONARIO_2)
        db?.execSQL(INSERT_CLIENTE)
        db?.execSQL(INSERT_ATENDENTE)
        db?.execSQL(INSERT_AREA_CONSTRUCAO)
        db?.execSQL(INSERT_ANUNCIOS)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}


    fun insertFuncionariosInDb(funcionarioModel: FuncionarioModel): Long {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("nome", funcionarioModel.nome)
        contentValues.put("telefone", funcionarioModel.telefone)
        contentValues.put("endereco", funcionarioModel.endereco)
        contentValues.put("salario", funcionarioModel.salario)
        contentValues.put("id_restaurante", funcionarioModel.idRestaurante)
        contentValues.put("data_adm", funcionarioModel.dataAdm)
        contentValues.put("data_saida", funcionarioModel.dataSaida)
        val result = db.insert(TABLE_FUNCIONARIOS, null, contentValues)
        db.close()
        return result
    }


    companion object {
        const val DB_NAME = "ComeMuito"
        const val DB_VERSION = 1
    }
}