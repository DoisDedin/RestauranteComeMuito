package com.example.redederestaurantecomemuito.ui.main.SQlite

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
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

class DBHelper(context: Context) :
    SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(
            TABLE_ANUNCIOS +
                    TABLE_AREAS_CONSTRUCAO +
                    TABLE_ATENDENTE +
                    TABLE_BEBIDAS +
                    TABLE_CHEFE_COZINHA +
                    TABLE_CLIENTE +
                    TABLE_DEPENDENTE +
                    TABLE_EMPRESAS_ALIMENTICIAS +
                    TABLE_FAZ_CONTATO +
                    TABLE_FUNCIONARIOS +
                    TABLE_GARCOM +
                    TABLE_MESA +
                    TABLE_POSSUI_RESERVA_MESA +
                    TABLE_RECEPCIONISTA +
                    TABLE_RESERVA +
                    TABLE_TEM_PARCERIA +
                    TABLE_RESTAURANTE +
                    TABLE_ZELADOR
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}


    fun insertValueInDb(content: ContentValues, tableName: String) : Long {
        val db = this.writableDatabase
        val result = db.insert(tableName, null, content)
        db.close()
        return result
    }


    companion object {
        const val DB_NAME = "ComeMuito"
        const val DB_VERSION = 1
    }
}