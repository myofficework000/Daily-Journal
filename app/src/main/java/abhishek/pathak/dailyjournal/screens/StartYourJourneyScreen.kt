package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.navigation.NavigationItem
import abhishek.pathak.dailyjournal.ui.theme.TextColor
import abhishek.pathak.dailyjournal.ui.theme.dp_1
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_20
import abhishek.pathak.dailyjournal.ui.theme.dp_26
import abhishek.pathak.dailyjournal.ui.theme.dp_50
import abhishek.pathak.dailyjournal.ui.theme.dp_6
import abhishek.pathak.dailyjournal.ui.theme.sp_16
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_26
import abhishek.pathak.dailyjournal.ui.theme.sp_30
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun StartYourJourneyScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ) {
        Image(
            painter = painterResource(id = R.drawable.outline_cancel_24),
            contentDescription = null,
            modifier = Modifier
                .size(dp_50)
                .padding(top = dp_20, end = dp_6)
                .align(Alignment.End)
        )
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(id = R.drawable.baseline_library_books_24),
                contentDescription = null,
                modifier = Modifier
                    .size(dp_50)
                    .padding(top = dp_20, end = dp_6)
            )
            Text(
                text = stringResource(id = R.string.Journey),
                color = TextColor,
                fontSize = sp_20,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top= dp_20)
            )
        }
        Text(
            text = stringResource(id = R.string.Better_You),
            color = Color.Black,
            fontSize = sp_30,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(dp_16)
        )
        Checkboxes(txt = stringResource(id = R.string.Checkbox_1))
        Checkboxes(txt = stringResource(id = R.string.Checkbox_2))
        Checkboxes(txt = stringResource(id = R.string.Checkbox_3))
        Checkboxes(txt = stringResource(id = R.string.Checkbox_4))
        Checkboxes(txt = stringResource(id = R.string.Checkbox_5))
        Divider(
            modifier = Modifier.padding(top= dp_20),
            thickness = dp_1
        )
        Text(
            text = stringResource(id = R.string.Days_Free),
            color = Color.Black,
            fontSize = sp_16,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = dp_26)
                .align(Alignment.CenterHorizontally)
        )
        Button(onClick = { navController.navigate(NavigationItem.JOURNALS_LIST.route)},
            modifier = Modifier
                .wrapContentHeight()
                .padding(top = 10.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(TextColor)
        ) {
            Text(text = stringResource(id = R.string.Continue),
                fontSize = sp_26)
        }
        Text(
            text = stringResource(id = R.string.CHF_45),
            color = Color.Black,
            fontSize = sp_16,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = dp_26)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(id = R.string.Cancel_Anytime),
            color = Color.Black,
            fontSize = sp_16,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = dp_6)
                .align(Alignment.CenterHorizontally)
        )




    }
}

@Composable
fun Checkboxes(img: Int=R.drawable.baseline_check_circle_24,txt: String){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically) {

        Image(
            painter = painterResource(id = img),
            contentDescription = null,
            modifier = Modifier
                .size(dp_50)
                .padding(top = dp_20, end = dp_6)
        )
        Text(
            text = txt,
            color = Color.Black,
            fontSize = sp_20,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top= dp_20)
        )
    }


}
@Preview
@Composable
fun ShowCheckBoxes(){
    StartYourJourneyScreen(rememberNavController())
}
