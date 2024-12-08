package com.thit.data.util

import androidx.datastore.preferences.core.booleanPreferencesKey

object Constants {
    val DATASTORE_PREFERENCES_KEY = booleanPreferencesKey("DATASTORE_PREFERENCES_KEY")
    const val DATASTORE_PREFERENCES_NAME: String = "DATASTORE_PREFERENCES_NAME"
    const val USER_COLLECTION = "Users"
    const val IMAGE_COLLECTION = "Images"
}