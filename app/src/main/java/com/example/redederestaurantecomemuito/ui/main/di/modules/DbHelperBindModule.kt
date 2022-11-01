package com.example.redederestaurantecomemuito.ui.main.di.modules

import com.example.redederestaurantecomemuito.ui.main.data.repository.RestaurantRepositoryImp
import com.example.redederestaurantecomemuito.ui.main.domain.repository.RestaurantRepository
import com.example.redederestaurantecomemuito.ui.main.domain.usecase.GetEmployeesUseCase
import com.example.redederestaurantecomemuito.ui.main.domain.usecase.GetEmployeesUseCaseImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


//is so ideal to create a interface injections
@Module
@InstallIn(SingletonComponent::class)
abstract class DbHelperBindModule {

    @Binds
    @Singleton
    abstract fun bindRestaurantRepository(restaurantRepositoryImp: RestaurantRepositoryImp)
            : RestaurantRepository

    @Binds
    @Singleton
    abstract fun bindGetEmployeesUseCase(getEmployeesUseCaseImp: GetEmployeesUseCaseImp): GetEmployeesUseCase
}