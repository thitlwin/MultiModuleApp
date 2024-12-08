package com.thit.signup.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.thit.signup.presentation.SignUpScreen
import com.thit.util.Screen

fun NavGraphBuilder.signUpScreen(navController: NavController) {
    composable(Screen.SignUpScreen.route) {
        SignUpScreen(
            onNavigateSignIn = { navController.navigate(Screen.SignInScreen.route) }
        )
    }
}