package com.thit.util

sealed class Screen(val route: String) {
    data object SplashScreen : Screen(route = "splash_screen")
    data object AuthenticationScreen : Screen(route = "authentication_screen")
    data object OnBoardingScreen : Screen(route = "onboarding_screen")
    data object SignInScreen : Screen(route = "sign_in_screen")
    data object AudioListScreen : Screen(route = "audio_list_screen")
    data object FavoriteListScreen : Screen(route = "favorite_list_screen")
    data object HomeScreen : Screen(route = "home_screen")
    data object SettingScreen : Screen(route = "setting_screen")
    data object PlayerScreen : Screen(route = "player_screen")
}