package com.thit.yawki.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.thit.auth.navigation.authenticationScreen
import com.thit.onboarding.presentation.navigation.onBoardingScreen
import com.thit.signin.presentation.navigation.signInScreen
import com.thit.signup.presentation.navigation.signUpScreen
import com.thit.splash.presentation.navigation.splashScreen
import com.thit.util.Screen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        splashScreen(navController = navController)
        onBoardingScreen(navController = navController)
        authenticationScreen(navController = navController)
        signInScreen(navController = navController)
        signUpScreen(navController = navController)
    }
}