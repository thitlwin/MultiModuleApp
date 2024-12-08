package com.thit.profile.domain.repository

interface ProfileAuthenticationRepository {
    suspend fun signOut()
}