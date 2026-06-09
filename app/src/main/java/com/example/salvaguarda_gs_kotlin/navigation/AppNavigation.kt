package com.example.salvaguarda_gs_kotlin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.salvaguarda_gs_kotlin.screens.HomeScreen
import com.example.salvaguarda_gs_kotlin.screens.AlertsScreen
import com.example.salvaguarda_gs_kotlin.screens.ChatbotScreen
import com.example.salvaguarda_gs_kotlin.screens.AuthorityScreen
import com.example.salvaguarda_gs_kotlin.screens.AuthorityDashboardScreen

@Composable
fun AppNavigation() {

    val navController =
        rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppRoutes.HOME

    ) {

        composable(
            AppRoutes.HOME
        ) {
            HomeScreen(navController)
        }
        composable(
            AppRoutes.ALERTS
        ) {
            AlertsScreen(navController)
        }
        composable(
            AppRoutes.CHATBOT
        ) {
            ChatbotScreen(navController)
        }
        composable(
            AppRoutes.AUTHORITY
        ) {
            AuthorityScreen(navController)
        }

        composable(
            AppRoutes.AUTHORITY_DASHBOARD
        ) {
            AuthorityDashboardScreen(navController)
        }
    }
}