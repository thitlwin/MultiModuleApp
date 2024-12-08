package com.thit.signup.domain.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface SignUpAuthenticationRepository {
    suspend fun getUserUid(): String
    suspend fun signUpWithEmailAndPassword(
        email: String,
        password: String
    ): Task<AuthResult>
}