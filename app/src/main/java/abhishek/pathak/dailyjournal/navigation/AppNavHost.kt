package abhishek.pathak.dailyjournal.navigation

import abhishek.pathak.dailyjournal.screens.CreateProfile
import abhishek.pathak.dailyjournal.screens.DashboardScreen
import abhishek.pathak.dailyjournal.screens.GetNotifiedScreen
import abhishek.pathak.dailyjournal.screens.JourneyCompanionScreen
import abhishek.pathak.dailyjournal.screens.KeepMemoryForever
import abhishek.pathak.dailyjournal.screens.ListofJournalsPage
import abhishek.pathak.dailyjournal.screens.SafePrivateScreen
import abhishek.pathak.dailyjournal.screens.SetPassCodeScreen
import abhishek.pathak.dailyjournal.screens.StartJourney
import abhishek.pathak.dailyjournal.screens.StartYourJourneyScreen
import abhishek.pathak.dailyjournal.screens.SyncWifiUI
import abhishek.pathak.dailyjournal.screens.UserBottomSheetWithLazyList
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
        composable("${NavigationItem.JOURNEY_LIFE.route}/{journeyId}") { backStackEntry ->
            JourneyCompanionScreen(
                navHostController,
                backStackEntry.arguments?.getString("journeyId")
            )
        }
        composable(NavigationItem.DASHBOARD.route) {
            DashboardScreen()
        }
        composable(NavigationItem.START_JOURNEY.route) {
            StartJourney(navHostController)
        }
        composable(NavigationItem.GET_NOTIFIED.route) {
            GetNotifiedScreen(navHostController)
        }
        composable(NavigationItem.SYNC_WITH_WIFI.route) {
            SyncWifiUI(navHostController)
        }
        composable(NavigationItem.KEEP_MEMORY.route) {
            KeepMemoryForever(navHostController)
        }
        composable(NavigationItem.CREATE_PROFILE.route) {
            CreateProfile(navHostController)
        }
        composable(NavigationItem.PASSCODE.route) {
            SetPassCodeScreen(navHostController)
        }
        composable(NavigationItem.START_YOUR_JOURNEY.route) {
            StartYourJourneyScreen(navHostController)
        }
        composable(NavigationItem.JOURNALS_LIST.route) {
            ListofJournalsPage(navHostController)
        }
        composable(NavigationItem.SAFE_PRIVATE.route) {
            SafePrivateScreen(navHostController)
        }
        composable(NavigationItem.USER_BOTTOM_SHEET.route) {
            UserBottomSheetWithLazyList(navHostController)
        }
        composable(NavigationItem.CANCEL_ANYTIME.route) {
            SafePrivateScreen(navHostController)
        }
    }
}