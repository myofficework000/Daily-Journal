package abhishek.pathak.dailyjournal

import abhishek.pathak.dailyjournal.navigation.AppNavHost
import abhishek.pathak.dailyjournal.screens.StartJourney
import abhishek.pathak.dailyjournal.ui.theme.DailyJournalTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DailyJournalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    KeepMemoryForever()
//                    CreateProfile()
                  //  StartJourney()
                    AppNavHost(navHostController = rememberNavController())
                }
            }
        }
    }
}