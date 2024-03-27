package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.navigation.NavigationItem
import abhishek.pathak.dailyjournal.ui.theme.ColumnBackground
import abhishek.pathak.dailyjournal.ui.theme.InsideAppBackground
import abhishek.pathak.dailyjournal.ui.theme.JournalTextBlue
import abhishek.pathak.dailyjournal.ui.theme.Journal_list_Color
import abhishek.pathak.dailyjournal.ui.theme.TextColor
import abhishek.pathak.dailyjournal.ui.theme.dp_10
import abhishek.pathak.dailyjournal.ui.theme.dp_12
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_20
import abhishek.pathak.dailyjournal.ui.theme.dp_40
import abhishek.pathak.dailyjournal.ui.theme.sp_10
import abhishek.pathak.dailyjournal.ui.theme.sp_16
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_26
import abhishek.pathak.dailyjournal.ui.theme.sp_30
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun CancelPopupScreen(navController: NavController){
    Card (
        colors = CardDefaults.cardColors(InsideAppBackground),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(dp_16),
            elevation = CardDefaults.cardElevation(dp_16),
            shape = RoundedCornerShape(dp_12)
        ){
        Box() {
            Image(
                painter = painterResource(id = R.drawable.garden_scenery_svgrepo_com),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(350.dp)
            )
            Text(text = stringResource(id = R.string.Spring_into),
                color = Color.White,
                fontSize = sp_26,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(dp_10)
            )
        }
        Text(text = stringResource(id = R.string.description),
            fontSize = sp_20,
            color = Color.White,
            modifier=Modifier.padding(dp_16)
        )
        Button(onClick = {  },
            modifier = Modifier
                .wrapContentHeight()
                .padding(top = dp_40)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(ColumnBackground)
        ) {
            Text(text = stringResource(id = R.string.get_offer),
                fontSize = sp_20,
                color = InsideAppBackground,
                fontWeight = FontWeight.Bold)
        }
        Button(onClick = { navController.navigate(NavigationItem.DASHBOARD.route) },
            modifier = Modifier
                .wrapContentHeight()
                .padding(top = dp_20)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(Color.Transparent)
        ) {
            Text(text = stringResource(id = R.string.no_thanks),
                fontSize = sp_10)
        }
    }
}

@Preview
@Composable
fun CancelPopupScreenPrev(){
    CancelPopupScreen(rememberNavController())
}