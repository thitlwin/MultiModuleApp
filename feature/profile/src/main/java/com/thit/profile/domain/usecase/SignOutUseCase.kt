package com.thit.profile.domain.usecase

import com.thit.profile.domain.repository.ProfileAuthenticationRepository
import com.thit.util.Response
import kotlinx.coroutines.flow.flow

class SignOutUseCase(
    private val authenticationRepository: ProfileAuthenticationRepository
) {
    suspend operator fun invoke() = flow{
        try {
            emit(Response.Loading)
            val result = authenticationRepository.signOut()
            emit(Response.Success(result))
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "Unexpected Error!"))
        }
    }
}