package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.navigation.NavigationItem
import abhishek.pathak.dailyjournal.ui.theme.ColumnBackground
import abhishek.pathak.dailyjournal.ui.theme.TextColor
import abhishek.pathak.dailyjournal.ui.theme.dp_10
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_20
import abhishek.pathak.dailyjournal.ui.theme.dp_40
import abhishek.pathak.dailyjournal.ui.theme.dp_400
import abhishek.pathak.dailyjournal.ui.theme.dp_50
import abhishek.pathak.dailyjournal.ui.theme.dp_6
import abhishek.pathak.dailyjournal.ui.theme.sp_16
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_40
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun GetNotifiedScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ColumnBackground),
       //horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center

    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(id = R.drawable.baseline_library_books_24),
                contentDescription = null,
                modifier = Modifier
                    .size(dp_50)
                    .padding(top = dp_20, end = dp_6)
            )
            Text(
                text = "JOURNEY",
                color = TextColor,
                fontSize = sp_20,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top= dp_20)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.baseline_notifications_active_24),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(350.dp)
                .padding(dp_20)
        )



        Text(
            text = stringResource(id = R.string.Get_Notified),
            color = TextColor,
            fontSize = sp_40,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(dp_16)

        )
        Text(
            text = stringResource(id = R.string.Journaling_Habits),
            color = TextColor,
            fontSize = sp_20,
            modifier = Modifier.padding(start=dp_16, end=dp_16 )

            )
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .wrapContentHeight()
                .padding(top = dp_40)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(TextColor)
        ) {
            Text(text = stringResource(id = R.string.Enable_Notifications),
                fontSize = sp_20)
        }
        OutlinedButton(onClick = { navController.navigate(NavigationItem.SYNC_WITH_WIFI.route) },
            modifier = Modifier
                .wrapContentHeight()
                .padding(top = dp_10)
                .align(Alignment.CenterHorizontally),
        ) {
            Text(text = stringResource(id = R.string.Skip),
                color = TextColor,
                fontWeight = FontWeight.Bold,
                fontSize = sp_16)
        }


    }
}

@Preview
@Composable
fun ShowNotifiedScreen() {
    Box {
        GetNotifiedScreen(rememberNavController())
    }
}