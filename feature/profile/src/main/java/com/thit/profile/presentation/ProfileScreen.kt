package com.thit.profile.presentation


import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.thit.data.util.Constants.EMPTY_IMAGE
import kotlinx.coroutines.delay

@Composable
fun ProfileScreen(onNavigateAuthentication: () -> Unit) {
    val context = LocalContext.current
    val viewModel: ProfileViewModel = hiltViewModel()
    val state = viewModel.state.value
    val image = viewModel.imageState.value
    val isUploading = viewModel.uploadState.value

    var signedOutState by remember {
        mutableStateOf(false)
    }
    if (signedOutState) {
        LaunchedEffect(key1 = Unit) {
            delay(600)
            onNavigateAuthentication()
        }
    }
    ProfileContent(
        user = state.user,
        profileImage = image ?: EMPTY_IMAGE,
        isPhotoUploading = isUploading,
        onSaveProfileImage = { uri ->
            if (uri != null) {
                viewModel.uploadProfileImage(image = uri,
                    onSuccess = {
                        Toast.makeText(context, "Profile Photo Successfully Uploaded!", Toast.LENGTH_SHORT).show()
                    },
                    onError = { msg ->
                        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
                    })
            }
        },
        onSignOutClick = {
            viewModel.signOut(
                onSuccess = {
                    Toast.makeText(context, "Successfully Signed Out!", Toast.LENGTH_SHORT).show()
                },
                onError = { msg ->
                    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
                }
            )
            signedOutState = true
        }
    )
}


