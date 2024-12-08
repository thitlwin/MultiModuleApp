package com.thit.splash.repository

import com.google.firebase.auth.FirebaseAuth

class SplashAuthRepositoryImpl (private val firebaseAuth: FirebaseAuth) : SplashAuthRepository {
    override suspend fun isSignedIn(): Boolean {
        return firebaseAuth.currentUser != null
    }
}