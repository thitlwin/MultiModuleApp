package com.thit.profile.repository

import com.google.firebase.auth.FirebaseAuth
import com.thit.profile.domain.repository.ProfileAuthenticationRepository

class ProfileAuthenticationRepositoryImpl(
    private val firebaseAuth: FirebaseAuth
) : ProfileAuthenticationRepository {

    override suspend fun signOut() {
        firebaseAuth.signOut()
    }

}