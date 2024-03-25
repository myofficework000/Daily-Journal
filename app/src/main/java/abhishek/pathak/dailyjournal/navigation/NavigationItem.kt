package abhishek.pathak.dailyjournal.navigation

sealed class NavigationItem(val route: String) {
    data object WELCOME : NavigationItem(Screen.WELCOME.name)
    data object SYNC_WITH_WIFI : NavigationItem(Screen.SYNC_WITH_WIFI.name)
    data object PASSCODE : NavigationItem(Screen.PASSCODE.name)
    data object GET_NOTIFIED : NavigationItem(Screen.GET_NOTIFIED.name)
    data object JOURNEY_LIFE : NavigationItem(Screen.JOURNEY_LIFE.name)
    data object START_YOUR_JOURNEY : NavigationItem(Screen.START_YOUR_JOURNEY.name)
    data object LOGIN : NavigationItem(Screen.LOGIN.name)
    data object DASHBOARD : NavigationItem(Screen.DASHBOARD.name)
    data object KEEP_MEMORY : NavigationItem(Screen.KEEP_MEMORY.name)
    data object CREATE_PROFILE : NavigationItem(Screen.CREATE_PROFILE.name)
    data object START_JOURNEY : NavigationItem(Screen.START_JOURNEY.name)
}