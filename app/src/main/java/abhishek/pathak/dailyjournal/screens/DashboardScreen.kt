package abhishek.pathak.dailyjournal.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun DashboardScreen() {
    val navController= rememberNavController()
    Scaffold(topBar={}, bottomBar ={ BottomNavBar(navController=navController) }) {
        NavHost(navController = navController, startDestination = BottomRoutes.Screen1.route,modifier= Modifier.padding(it)) {
            composable(BottomRoutes.Screen1.route){
                ListofJournalsPage(rememberNavController())
            }
            composable(BottomRoutes.Screen2.route){

            }
            composable(BottomRoutes.Screen3.route){

            }
            composable(BottomRoutes.Screen4.route){

            }
            composable(BottomRoutes.Screen5.route){

            }
        }
    }
}
@Preview
@Composable
fun DashboardScreenPrev(){
    DashboardScreen()
}