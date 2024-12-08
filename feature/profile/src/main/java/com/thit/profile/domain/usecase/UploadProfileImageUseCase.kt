package com.thit.profile.domain.usecase

import android.net.Uri
import com.thit.profile.domain.repository.ImageRepository
import com.thit.util.Response
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await

class UploadProfileImageUseCase(
    private val imageRepository: ImageRepository
) {
    operator fun invoke(image : Uri) = flow {
        try {
            emit(Response.Loading)
            val result = imageRepository.uploadProfileImage(image).await()
            emit(Response.Success(result))
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "Image could not be uploaded!"))
        }
    }
}