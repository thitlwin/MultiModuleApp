package com.thit.auth.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.thit.auth.AuthenticationScreen
import com.thit.util.Screen

fun NavGraphBuilder.authenticationScreen(navController: NavController) {
    composable(route = Screen.AuthenticationScreen.route) {
       AuthenticationScreen(
            onNavigateSignInClick = { navController.navigate(Screen.SignInScreen.route) },
        )
    }
}