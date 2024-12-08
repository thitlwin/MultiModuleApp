package com.thit.splash.domain.usecase

import com.thit.splash.repository.SplashAuthRepository
import kotlinx.coroutines.flow.flow

class IsSignedInUseCase(
    private val splashAuthRepository: SplashAuthRepository
) {
    operator fun invoke() = flow {
        emit(splashAuthRepository.isSignedIn())
    }
}