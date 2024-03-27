package abhishek.pathak.dailyjournal.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun BottomNavBar(navController: NavController) {
    NavigationBar(modifier= Modifier.fillMaxWidth(),
        contentColor= Color.Blue) {
        NavigationBarItem(label={ Text(text="Journey") },
            selected = false ,
            onClick = { navController.navigate(BottomRoutes.Screen1.route) },
            icon = { Icon(imageVector= Icons.Default.List, contentDescription=null) })
        NavigationBarItem(label={ Text(text="Calendar") },
            selected = false ,
            onClick = { navController.navigate(BottomRoutes.Screen2.route) },
            icon = { Icon(imageVector= Icons.Default.DateRange, contentDescription=null) })
        NavigationBarItem(label={ Text(text="Media") },
            selected = false ,
            onClick = { navController.navigate(BottomRoutes.Screen3.route) },
            icon = { Icon(imageVector= Icons.Default.LocationOn, contentDescription=null) })
        NavigationBarItem(label={ Text(text="Atlas") },
            selected = false ,
            onClick = { navController.navigate(BottomRoutes.Screen4.route) },
            icon = { Icon(imageVector= Icons.Default.Email, contentDescription=null) })
        NavigationBarItem(label={ Text(text="Coach") },
            selected = false ,
            onClick = { navController.navigate(BottomRoutes.Screen5.route) },
            icon = { Icon(imageVector= Icons.Default.Favorite, contentDescription=null) })


    }
}

sealed class BottomRoutes(val route: String)
{
    object Screen1:BottomRoutes("Journey")
    object Screen2:BottomRoutes("Calendar")
    object Screen3:BottomRoutes("Media")
    object Screen4:BottomRoutes("Atlas")
    object Screen5:BottomRoutes("Coach")
}