package com.example.redederestaurantecomemuito.ui.main.di.modules

import android.content.Context
import com.example.redederestaurantecomemuito.ui.main.data.local.sqlite.DBHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//ideal for creating both interface , repository and database
@Module
@InstallIn(SingletonComponent::class)
object DBHelperProviderModule {
    @Provides
    @Singleton
    fun provideDBHelper(@ApplicationContext appContext: Context): DBHelper {
        return DBHelper(context = appContext)
    }
}