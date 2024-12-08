package com.thit.profile.domain.usecase

import com.thit.profile.domain.repository.ImageRepository
import com.thit.util.Response
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await

class SaveUserProfileImageUseCase(
    private val imageRepository: ImageRepository
) {
    operator fun invoke(imageUrl: String) = flow {
        try {
            emit(Response.Loading)
            val result = imageRepository.saveProfileImage(imageUrl = imageUrl).await()
            emit(Response.Success(result))
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "Photo could not be saved!"))
        }
    }
}