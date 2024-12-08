package com.thit.signin.presentation

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SignInScreen(
    onNavigateSignUp: () -> Unit,
    onNavigateHome: () -> Unit
) {
    val viewModel: SignInViewModel = hiltViewModel()

    val state = viewModel.state
    val context = LocalContext.current

    SignInContent(
        isLoading = state.isLoading,
        isAuthenticated = state.isAuthenticated,
        onNavigateSignUp = onNavigateSignUp,
        onNavigateHome = onNavigateHome,
        onSignInClick = { mail, password ->
            viewModel.signInWithEmailAndPassword(
                email = mail,
                password = password,
                onError = { msg ->
                    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
                },
                onSuccess = {
                    Toast.makeText(context, "Successfully Signed In!", Toast.LENGTH_SHORT).show()
                }
            )
        })
}

