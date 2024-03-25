package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.ui.theme.Blue40
import abhishek.pathak.dailyjournal.ui.theme.DarkBlue
import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun WelcomePrev() {
    Welcome()
}

@Composable
fun Welcome() {

    ConstraintLayout(
        modifier= Modifier.fillMaxSize().background(Blue40).padding(20.dp)
    ){
        val (text1,image1,text2,button1) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.baseline_book_24),
            contentDescription = "Welcome Image",
            modifier = Modifier
                .size(250.dp,250.dp)
                .constrainAs(image1) {
                    top.linkTo(parent.top,200.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )


        Text(
            "Welcome to \nJourney!",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = DarkBlue ,
            modifier = Modifier.constrainAs(text1) {
                top.linkTo(image1.bottom, margin = 16.dp)
                start.linkTo(parent.start)
            }
        )

        Text(
            "Your diary, your companion. Press \nnext to get started.",
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = DarkBlue,
                    modifier = Modifier.constrainAs(text2) {
                top.linkTo(text1.bottom, margin = 8.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
        Button(
            onClick = { /* Handle click */ },
            modifier = Modifier.constrainAs(button1) {
                top.linkTo(text2.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom, margin = 16.dp)
            }
        ) {
            Text("Get Started")
        }

    }
}
