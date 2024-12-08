package com.thit.splash.usecase

import com.thit.domain.repository.DataStoreRepository

class ReadOnBoardingStateUseCase(
    private val dataStoreRepository: DataStoreRepository
) {

    operator fun invoke() = dataStoreRepository.readOnBoardingState()
}