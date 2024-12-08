package com.thit.data.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import com.thit.data.util.Constants.USER_COLLECTION
import com.thit.data.util.Constants.IMAGE_COLLECTION
import com.thit.domain.repository.UserRepository

class UserRepositoryImpl(
    private val firebaseAuth: FirebaseAuth,
    private val firebaseFirestore: FirebaseFirestore
) : UserRepository {
    override suspend fun getUserUid(): String {
        var uid = ""
        firebaseAuth.currentUser?.uid?.let {
            uid = it
        }
        return uid
    }


    override suspend fun getUser(): Task<QuerySnapshot?> {
        return firebaseFirestore.collection(USER_COLLECTION).document(getUserUid()).collection("info")
            .get()
    }

    override suspend fun getProfileImage(): Task<DocumentSnapshot?> {
        return firebaseFirestore.collection(IMAGE_COLLECTION).document(getUserUid()).get()
    }
}