package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OnboardingScreen() {
    val progress = 0.6f

    Column(modifier = Modifier.fillMaxSize()) {

        TopBar()

//        OnboardingProgressBar(progress)

        OnboardingImage()

        OnboardingText()

        ActionButtons()
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val logo: Painter = painterResource(id = R.drawable.splash_brand_logo)
        Image(
            painter = logo,
            contentDescription = "Brand Logo",
            modifier = Modifier.size(48.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        BasicText(
            text = "JOURNEY",
            style = androidx.compose.ui.text.TextStyle(
                fontFamily = FontFamily.Cursive,
                fontSize = 24.sp,
                color = Color.Black
            )
        )
    }
}

//@Composable
//fun OnboardingProgressBar(progress: Float) {
//    LinearProgressIndicator(
//        progress = progress,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp),
//        color = Color.Blue,
//        backgroundColor = Color.LightGray
//    )
//}

@Composable
fun OnboardingImage() {
    val bellImage: Painter = painterResource(id = R.drawable.onboard_screen6_bell)
    Image(
        painter = bellImage,
        contentDescription = "Bell Image",
        modifier = Modifier
//            .weight(1f)
            .fillMaxWidth()
            .wrapContentHeight(Alignment.CenterVertically)
    )
}

@Composable
fun OnboardingText() {
    Text(
        text = "Get Notified!\nBuild journaling habits by turning on notifications for reminders, coach prompts, and many more.",
        fontFamily = FontFamily.Cursive,
        fontSize = 18.sp,
        color = Color.Black,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun ActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(onClick = { /* Implement Notification  */ }) {
            Text("Enable Notification")
        }
        Button(onClick = { /* Implement Skip */ }) {
            Text("Skip")
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun OnboardingScreenPreview() {
    OnboardingScreen()
}
