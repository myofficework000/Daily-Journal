package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.ui.theme.TextColor
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StartYourJourneyScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        //horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center

    ) {
        Image(
            painter = painterResource(id = R.drawable.outline_cancel_24),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .padding(top = 20.dp, end = 5.dp)
                .align(Alignment.End)
        )
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(id = R.drawable.baseline_library_books_24),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(top = 20.dp, end = 5.dp)
            )
            Text(
                text = "JOURNEY",
                color = TextColor,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top=20.dp)
            )
        }
        Text(
            text = "Start Your Journey Towards a Better You",
            color = Color.Black,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(15.dp)
        )
        Checkboxes(txt = "Exclusive access to journey on mobile, desktop and web")
        Checkboxes(txt = "10GB of storage size 3000 entries and backups in Journey Cloud Sync Drive")
        Checkboxes(txt = "Shared journal end to end encryption (Journal Sync Cloud)")
        Checkboxes(txt = "Brand new inspiration quotes everyday")
        Checkboxes(txt = "Compose journey entry in email where ever you go")
        Divider(
            modifier = Modifier.padding(top=20.dp),
            thickness = 1.dp
        )
        Text(
            text = "TRY 3 DAYS FOR FREE",
            color = Color.Black,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top=25.dp).align(Alignment.CenterHorizontally)
        )
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.wrapContentHeight().padding(top=10.dp).align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(TextColor)
        ) {
            Text(text = "Continue",
                fontSize = 25.sp)
        }
        Text(
            text = "CHF 45.00/YEAR BILLED ANNUALY.",
            color = Color.Black,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top=25.dp).align(Alignment.CenterHorizontally)
        )
        Text(
            text = "CANCEL ANYTIME.",
            color = Color.Black,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top=5.dp).align(Alignment.CenterHorizontally)
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
                .size(50.dp)
                .padding(top = 20.dp, end = 5.dp)
        )
        Text(
            text = txt,
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top=20.dp)
        )
    }


}
@Preview
@Composable
fun ShowCheckBoxes(){
    StartYourJourneyScreen()
}
