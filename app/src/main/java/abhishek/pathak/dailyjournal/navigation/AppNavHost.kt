package abhishek.pathak.dailyjournal.navigation

import abhishek.pathak.dailyjournal.screens.DashboardScreen
import abhishek.pathak.dailyjournal.screens.GetNotifiedScreen
import abhishek.pathak.dailyjournal.screens.SyncWifiUI
import abhishek.pathak.dailyjournal.screens.WelcomeScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    startDestination: String = NavigationItem.WELCOME.route
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.WELCOME.route) {
            WelcomeScreen(navHostController)
        }
        composable(NavigationItem.DASHBOARD.route) {
            DashboardScreen()
        }
        composable(NavigationItem.GET_NOTIFIED.route) {
            GetNotifiedScreen()
        }
        composable(NavigationItem.SYNC_WITH_WIFI.route) {
            SyncWifiUI()
        }
    }
}