package com.thit.splash.repository

interface SplashAuthRepository {
    suspend fun isSignedIn(): Boolean
}