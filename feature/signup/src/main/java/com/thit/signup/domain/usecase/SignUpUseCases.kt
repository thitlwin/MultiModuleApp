package com.thit.signup.domain.usecase

import com.thit.signup.domain.usecase.authentication.SignUpWithEmailAndPasswordUseCase
import com.thit.signup.domain.usecase.user.SaveUserUseCase

data class SignUpUseCases(
    val signUpWithEmailAndPasswordUseCase: SignUpWithEmailAndPasswordUseCase,
    val saveUserUseCase: SaveUserUseCase
)
