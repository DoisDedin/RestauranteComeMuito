package com.example.redederestaurantecomemuito.ui.main

import android.app.Application
import android.util.Log
import com.example.redederestaurantecomemuito.ui.main.SQlite.DBHelper

class ComeMuitoApplication : Application() {

    private var dbSqlite: DBHelper? = null

    override fun onCreate() {
        super.onCreate()
//        dbSqlite = DBHelper(this)
    }
}