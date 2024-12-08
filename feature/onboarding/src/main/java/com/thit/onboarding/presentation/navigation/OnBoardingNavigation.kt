package com.thit.onboarding.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.thit.onboarding.presentation.OnBoardingScreen
import com.thit.util.Screen

fun NavGraphBuilder.onBoardingScreen(navController: NavController) {
    composable(route = Screen.OnBoardingScreen.route) {
        OnBoardingScreen(
            onNavigateAuthenticationScreen = { navController.navigate(Screen.AuthenticationScreen.route) }
        )
    }
}