package com.thit.data.util

import androidx.datastore.preferences.core.booleanPreferencesKey

object Constants {
    val DATASTORE_PREFERENCES_KEY = booleanPreferencesKey("DATASTORE_PREFERENCES_KEY")
    const val DATASTORE_PREFERENCES_NAME: String = "DATASTORE_PREFERENCES_NAME"
    const val USER_COLLECTION = "Users"
    const val IMAGE_COLLECTION = "Images"
    const val LANGUAGE = "english"
    const val API_KEY = ""
    const val EMPTY_IMAGE = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png"
}