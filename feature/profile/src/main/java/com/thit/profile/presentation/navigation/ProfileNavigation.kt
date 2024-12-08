package com.thit.profile.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.thit.profile.presentation.ProfileScreen
import com.thit.util.Screen

fun NavGraphBuilder.profileScreen(navController: NavController) {
    composable(Screen.ProfileScreen.route) {
        ProfileScreen(
            onNavigateAuthentication = {
                navController.popBackStack()
                navController.navigate(Screen.AuthenticationScreen.route)
            })
    }
}