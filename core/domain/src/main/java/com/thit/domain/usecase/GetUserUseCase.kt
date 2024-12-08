package com.thit.domain.usecase

import com.thit.domain.repository.UserRepository
import com.thit.util.Response
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await

class GetUserUseCase(
    private val userRepository: UserRepository
) {
    operator fun invoke() = flow {
        try {
            emit(Response.Loading)
            val querySnapshot = userRepository.getUser().await()
            emit(Response.Success(querySnapshot))
        } catch (e: Exception) {
            emit(
                Response.Error(
                    e.localizedMessage ?: "User Information could not be get from server!"
                )
            )
        }
    }
}