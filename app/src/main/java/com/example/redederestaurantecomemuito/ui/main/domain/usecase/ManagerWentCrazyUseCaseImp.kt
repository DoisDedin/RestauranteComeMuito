package com.example.redederestaurantecomemuito.ui.main.domain.usecase

import com.example.redederestaurantecomemuito.ui.main.domain.repository.RestaurantRepository
import javax.inject.Inject

class ManagerWentCrazyUseCaseImp @Inject constructor(
    private val repository: RestaurantRepository
) : ManagerWentCrazyUseCase {
    override suspend fun managerWentCrazy() {
        repository.managerWentCrazy()
    }
}