package com.thit.domain.usecase

import com.thit.domain.repository.UserRepository
import com.thit.util.Response
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await


class GetUserProfileImageUseCase(
    private val userRepository: UserRepository
) {
    operator fun invoke() = flow {
        try {
            emit(Response.Loading)
            val result = userRepository.getProfileImage().await()
            emit(Response.Success(result))
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "Profile Image could not be loaded!"))
        }
    }
}