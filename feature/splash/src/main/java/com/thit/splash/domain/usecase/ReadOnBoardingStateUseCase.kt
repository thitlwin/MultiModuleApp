package com.thit.splash.domain.usecase

import com.thit.domain.repository.DataStoreRepository

class ReadOnBoardingStateUseCase(
    private val dataStoreRepository: DataStoreRepository
) {

    operator fun invoke() = dataStoreRepository.readOnBoardingState()
}