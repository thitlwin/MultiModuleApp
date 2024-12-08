package com.thit.signup.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.thit.domain.model.User
import com.thit.signup.domain.repository.FirebaseStorageRepository

const val USER_COLLECTION = "users"

class FirebaseStorageRepositoryImpl(
    private val firebaseFirestore: FirebaseFirestore,
) : FirebaseStorageRepository {
    override suspend fun saveUser(
        userUid: String,
        user: User
    ): Task<DocumentReference?> {
        return firebaseFirestore.collection(USER_COLLECTION).document(userUid).collection("info").add(user)
    }
}