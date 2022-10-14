package com.example.redederestaurantecomemuito.ui.main

import android.app.Application
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBHelper
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBHelper.Companion.DB_NAME
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBHelper.Companion.DB_VERSION

class ComeMuitoApplication : Application() {

    private lateinit var dbSqlite: DBHelper
    override fun onCreate() {
        super.onCreate()
        dbSqlite = DBHelper(this, DB_NAME, null, DB_VERSION)
    }
}