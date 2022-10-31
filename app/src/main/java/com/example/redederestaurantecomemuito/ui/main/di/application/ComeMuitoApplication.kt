package com.example.redederestaurantecomemuito.ui.main.di.application

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import com.example.redederestaurantecomemuito.ui.main.data.SQlite.DBHelper

class ComeMuitoApplication : Application() {

    private var dbSqlite: DBHelper? = null

    override fun onCreate() {
        super.onCreate()
//        dbSqlite = DBHelper(this)
        createChanelPostNotification()
    }

    private fun createChanelPostNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "channel_id",
                "channel_name",
                NotificationManager.IMPORTANCE_HIGH
            )
            val notificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}