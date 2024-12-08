package com.thit.signup.domain.usecase.authentication

import com.thit.signup.domain.repository.SignUpAuthenticationRepository
import com.thit.util.Response
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await

class SignUpWithEmailAndPasswordUseCase (
    private val authRepository: SignUpAuthenticationRepository
) {
    operator fun invoke(email: String, password: String) = flow {
        try {
            emit(Response.Loading)
            emit(Response.Success(authRepository.signUpWithEmailAndPassword(email, password).await()))
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "Unexpected Error!"))
        }
    }
}