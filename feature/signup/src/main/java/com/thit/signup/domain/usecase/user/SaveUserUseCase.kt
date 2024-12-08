package com.thit.signup.domain.usecase.user

import com.thit.domain.model.User
import com.thit.signup.domain.repository.SignUpAuthenticationRepository
import com.thit.signup.domain.repository.FirebaseStorageRepository
import com.thit.util.Response
import kotlinx.coroutines.flow.flow

class SaveUserUseCase(
    val firebaseStorageRepository: FirebaseStorageRepository,
    val signUpAuthenticationRepository: SignUpAuthenticationRepository
) {
        operator fun invoke(user: User) = flow {
        try {
            emit(Response.Loading)
            val userUid = signUpAuthenticationRepository.getUserUid()
            val result =
                firebaseStorageRepository.saveUser(userUid = userUid, user = user)
            emit(Response.Success(result))
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "User could not be saved!"))
        }
    }
}