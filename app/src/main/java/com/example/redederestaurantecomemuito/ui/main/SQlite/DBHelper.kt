package com.example.redederestaurantecomemuito.ui.main.SQlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_ANUNCIO_1
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_ANUNCIO_2
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_ANUNCIO_3
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_AREA_CONSTRUCAO_1
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_AREA_CONSTRUCAO_2
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_AREA_CONSTRUCAO_3
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_ATENDENTE_1
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_ATENDENTE_2
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_CLIENTE_1
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_CLIENTE_2
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_CLIENTE_3
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_1
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_10
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_2
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_3
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_4
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_5
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_6
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_7
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_8
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_FUNCIONARIO_9
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_MESA_1
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_MESA_2
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_MESA_3
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_RESERVA_1
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_RESERVA_2
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_RESERVA_3
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_RESTAURANTE_1
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_RESTAURANTE_2
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBInsert.INSERT_RESTAURANTE_3
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_ALIMENTOS
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_ANUNCIOS
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_AREAS_CONSTRUCAO
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_ATENDENTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_BEBIDAS
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_CHEFE_COZINHA
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_CLIENTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_DEPENDENTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_EMPRESAS_ALIMENTICIAS
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_FAZ_CONTATO
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_FUNCIONARIOS
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_GARCOM
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_MESA
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_POSSUI_RESERVA_MESA
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_RECEPCIONISTA
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_RESERVA
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_RESTAURANTE
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_TEM_PARCERIA
import com.example.redederestaurantecomemuito.ui.main.SQlite.sqlitecode.DBTables.TABLE_ZELADOR
import com.example.redederestaurantecomemuito.ui.main.models.FuncionarioModel

class DBHelper(context: Context) :
    SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {
        createAllTables(db = db)
        insertAllFuncionarios(db = db)
        insertAllAnuncios(db = db)
        Log.d("onCreateBD", "rolou")
        insertAllAreasConstrucao(db = db)
        insertAllAtendentes(db = db)
        Log.d("onCreateBD", "rolou")
        insertAllClientes(db = db)
        insertAllMesas(db = db)
        insertAllReservas(db = db)
        insertAllRestaurentes(db = db)
        Log.d("onCreateBD", "rolou")
        Log.d("onCreateBD", "rolou")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}

    fun insertFuncionariosInDb(funcionarioModel: FuncionarioModel) {
        val db = this.writableDatabase
        val result = db.execSQL(
            "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) " +
                    "VALUES (${funcionarioModel.idFuncionario}," +
                    "'${funcionarioModel.nome}'," +
                    " '${funcionarioModel.telefone}'," +
                    " '${funcionarioModel.endereco}'," +
                    " ${funcionarioModel.salario}," +
                    " ${funcionarioModel.idRestaurante}," +
                    " '${funcionarioModel.dataAdm}'," +
                    " '${funcionarioModel.dataSaida}');"
        )
        db.close()
    }

    private fun createAllTables(db: SQLiteDatabase?) {
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
    }

    private fun insertAllFuncionarios(db: SQLiteDatabase?) {
        db?.execSQL(INSERT_FUNCIONARIO_1)
        db?.execSQL(INSERT_FUNCIONARIO_2)
        db?.execSQL(INSERT_FUNCIONARIO_3)
        db?.execSQL(INSERT_FUNCIONARIO_4)
        db?.execSQL(INSERT_FUNCIONARIO_5)
        db?.execSQL(INSERT_FUNCIONARIO_6)
        db?.execSQL(INSERT_FUNCIONARIO_7)
        db?.execSQL(INSERT_FUNCIONARIO_8)
        db?.execSQL(INSERT_FUNCIONARIO_9)
        db?.execSQL(INSERT_FUNCIONARIO_10)
    }

    private fun insertAllAnuncios(db: SQLiteDatabase?) {
        db?.execSQL(INSERT_ANUNCIO_1)
        db?.execSQL(INSERT_ANUNCIO_2)
        db?.execSQL(INSERT_ANUNCIO_3)
    }

    private fun insertAllAreasConstrucao(db: SQLiteDatabase?) {
        db?.execSQL(INSERT_AREA_CONSTRUCAO_1)
        db?.execSQL(INSERT_AREA_CONSTRUCAO_2)
        db?.execSQL(INSERT_AREA_CONSTRUCAO_3)
    }

    private fun insertAllAtendentes(db: SQLiteDatabase?) {
        db?.execSQL(INSERT_ATENDENTE_1)
        db?.execSQL(INSERT_ATENDENTE_2)
    }

    private fun insertAllClientes(db: SQLiteDatabase?) {
        db?.execSQL(INSERT_CLIENTE_1)
        db?.execSQL(INSERT_CLIENTE_2)
        db?.execSQL(INSERT_CLIENTE_3)
    }

    private fun insertAllMesas(db: SQLiteDatabase?) {
        db?.execSQL(INSERT_MESA_1)
        db?.execSQL(INSERT_MESA_2)
        db?.execSQL(INSERT_MESA_3)
    }

    private fun insertAllReservas(db: SQLiteDatabase?) {
        db?.execSQL(INSERT_RESERVA_1)
        db?.execSQL(INSERT_RESERVA_2)
        db?.execSQL(INSERT_RESERVA_3)
    }

    private fun insertAllRestaurentes(db: SQLiteDatabase?) {
        db?.execSQL(INSERT_RESTAURANTE_1)
        db?.execSQL(INSERT_RESTAURANTE_2)
        db?.execSQL(INSERT_RESTAURANTE_3)
    }


    fun getFuncionarios(
        code: String? = "",
        name: String? = "",
        salarioo: String? = ""
    ): MutableList<FuncionarioModel> {
        val db = this.readableDatabase
        val listFuncionarios: MutableList<FuncionarioModel> = arrayListOf()
        if (code.isNullOrEmpty() and name.isNullOrEmpty() and salarioo.isNullOrEmpty()) {
            val infoRaw = db?.rawQuery("SELECT * FROM Funcionarios", null)
            if (infoRaw?.moveToFirst() == true) {
                do {
                    listFuncionarios.add(
                        FuncionarioModel(
                            idFuncionario = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_funcionario")),
                            nome = infoRaw.getString(infoRaw.getColumnIndexOrThrow("nome")),
                            telefone = infoRaw.getString(infoRaw.getColumnIndexOrThrow("telefone")),
                            endereco = infoRaw.getString(infoRaw.getColumnIndexOrThrow("endereco")),
                            salario = infoRaw.getDouble(infoRaw.getColumnIndexOrThrow("salario")),
                            idRestaurante = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_restaurante")),
                            dataAdm = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_adm")),
                            dataSaida = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_saida")),
                        )
                    )
                } while (infoRaw.moveToNext())
            }
        } else if (!code.isNullOrEmpty()) {
            val infoRaw =
                db?.rawQuery("SELECT * FROM Funcionarios WHERE id_funcionario = $code", null)
            if (infoRaw?.moveToFirst() == true) {
                do {
                    listFuncionarios.add(
                        FuncionarioModel(
                            idFuncionario = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_funcionario")),
                            nome = infoRaw.getString(infoRaw.getColumnIndexOrThrow("nome")),
                            telefone = infoRaw.getString(infoRaw.getColumnIndexOrThrow("telefone")),
                            endereco = infoRaw.getString(infoRaw.getColumnIndexOrThrow("endereco")),
                            salario = infoRaw.getDouble(infoRaw.getColumnIndexOrThrow("salario")),
                            idRestaurante = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_restaurante")),
                            dataAdm = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_adm")),
                            dataSaida = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_saida")),
                        )
                    )
                } while (infoRaw.moveToNext())
            }
        } else if (!name.isNullOrEmpty()) {
            val infoRaw =
                db?.rawQuery("SELECT * FROM Funcionarios WHERE nome LIKE '$name%'", null)
            if (infoRaw?.moveToFirst() == true) {
                do {
                    listFuncionarios.add(
                        FuncionarioModel(
                            idFuncionario = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_funcionario")),
                            nome = infoRaw.getString(infoRaw.getColumnIndexOrThrow("nome")),
                            telefone = infoRaw.getString(infoRaw.getColumnIndexOrThrow("telefone")),
                            endereco = infoRaw.getString(infoRaw.getColumnIndexOrThrow("endereco")),
                            salario = infoRaw.getDouble(infoRaw.getColumnIndexOrThrow("salario")),
                            idRestaurante = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_restaurante")),
                            dataAdm = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_adm")),
                            dataSaida = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_saida")),
                        )
                    )
                } while (infoRaw.moveToNext())
            }
        } else if (!salarioo.isNullOrEmpty()) {
            val sal = salarioo.toDouble()
            val infoRaw =
                db?.rawQuery("SELECT * FROM Funcionarios WHERE salario <= $sal", null)
            if (infoRaw?.moveToFirst() == true) {
                do {
                    listFuncionarios.add(
                        FuncionarioModel(
                            idFuncionario = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_funcionario")),
                            nome = infoRaw.getString(infoRaw.getColumnIndexOrThrow("nome")),
                            telefone = infoRaw.getString(infoRaw.getColumnIndexOrThrow("telefone")),
                            endereco = infoRaw.getString(infoRaw.getColumnIndexOrThrow("endereco")),
                            salario = infoRaw.getDouble(infoRaw.getColumnIndexOrThrow("salario")),
                            idRestaurante = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_restaurante")),
                            dataAdm = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_adm")),
                            dataSaida = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_saida")),
                        )
                    )
                } while (infoRaw.moveToNext())
            }
        } else {
            val infoRaw = db?.rawQuery("SELECT * FROM Funcionarios", null)
            if (infoRaw?.moveToFirst() == true) {
                do {
                    listFuncionarios.add(
                        FuncionarioModel(
                            idFuncionario = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_funcionario")),
                            nome = infoRaw.getString(infoRaw.getColumnIndexOrThrow("nome")),
                            telefone = infoRaw.getString(infoRaw.getColumnIndexOrThrow("telefone")),
                            endereco = infoRaw.getString(infoRaw.getColumnIndexOrThrow("endereco")),
                            salario = infoRaw.getDouble(infoRaw.getColumnIndexOrThrow("salario")),
                            idRestaurante = infoRaw.getInt(infoRaw.getColumnIndexOrThrow("id_restaurante")),
                            dataAdm = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_adm")),
                            dataSaida = infoRaw.getString(infoRaw.getColumnIndexOrThrow("data_saida")),
                        )
                    )
                } while (infoRaw.moveToNext())
            }
        }
        db.close()
        return listFuncionarios
    }

    fun deleteFuncionario(id: String) {
        val db = this.writableDatabase
        db.execSQL("DELETE  FROM Funcionarios WHERE id_funcionario = $id")
        db.close()
    }

    fun gerenteFicouMaluco() {
        val db = this.writableDatabase
        db.execSQL("UPDATE Funcionarios SET salario = salario * 1.2 WHERE salario <= 2500")
        db.close()
    }

    companion object {
        const val DB_NAME = "ComeMuito"
        const val DB_VERSION = 1
    }
}