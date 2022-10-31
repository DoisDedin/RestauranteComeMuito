package com.example.redederestaurantecomemuito.ui.main.data.repository

import com.example.redederestaurantecomemuito.ui.main.data.local.sqlite.DBHelper
import com.example.redederestaurantecomemuito.ui.main.domain.repository.RestaurantRepository
import javax.inject.Inject

class RestaurantRepositoryImp @Inject constructor(dbHelper: DBHelper) : RestaurantRepository {
    override suspend fun startDefaultBDRestaurant() {
        TODO("Not yet implemented")
    }
}