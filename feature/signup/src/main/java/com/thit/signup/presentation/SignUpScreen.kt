package com.thit.signup.presentation

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SignUpScreen(
    onNavigateSignIn: () -> Unit
) {
    val viewModel: SignUpViewModel = hiltViewModel()

    var isSignUp by remember { mutableStateOf(false) }
    var isUserSaved by remember { mutableStateOf(false) }

    val loadingState = viewModel.loadingState

    val context = LocalContext.current

    if (isSignUp && isUserSaved)
        LaunchedEffect(key1 = Unit) {
            onNavigateSignIn()
        }
    SignUpContent(
        isLoading = loadingState,
        isAuthenticated = false,
        onNavigateSignIn = onNavigateSignIn,
        onSignUpClick = { mail, password, name ->
            viewModel.signUpWithEmailAndPassword(
                email = mail,
                password = password,
                onSuccess = { isSignUp = true },
                onError = { msg ->
                    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
                }
            )
            viewModel.saveUser(
                name = name,
                email = mail,
                onSuccess = { isUserSaved = true },
                onError = { msg ->
                    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
                })
        })
}