package com.thit.home.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.thit.home.presentation.HomeScreen
import com.thit.util.Screen

fun NavGraphBuilder.homeScreen(navController: NavController) {
    composable(Screen.HomeScreen.route) {
        HomeScreen(
            onNavigateDetailScreen = { id ->
                navController.navigate(Screen.DetailScreen.route + "/${id}")
            }
        )
    }
}