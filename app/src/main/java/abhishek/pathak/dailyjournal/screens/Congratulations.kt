package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.navigation.NavigationItem

import abhishek.pathak.dailyjournal.ui.theme.JournalBackground_Congrats
import abhishek.pathak.dailyjournal.ui.theme.JournalTextBlue
import abhishek.pathak.dailyjournal.ui.theme.JournalText_Congrats
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_24
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_24
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun CongratulationsScreen(navController: NavController) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(JournalBackground_Congrats)
    ) {
        val (imgConfetti, imgGirl, textCongrats, textAvailability, btnDone) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.onboard_screen5_confetti_background),
            contentDescription = null,
            modifier = Modifier.constrainAs(imgConfetti) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Image(
            painter = painterResource(id = R.drawable.onboard_screen5_girl_with_journal),
            contentDescription = null,
            modifier = Modifier.constrainAs(imgGirl) {
                top.linkTo(imgConfetti.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Text(
            text = stringResource(id = R.string.congratulations),
            fontSize = sp_24,
            fontWeight = FontWeight.Bold,
            color = JournalText_Congrats,
            textAlign = TextAlign.Center,
            modifier = Modifier.constrainAs(textCongrats) {
                top.linkTo(imgGirl.bottom, margin = dp_16)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Text(
            text = stringResource(id = R.string.journey_availability),
            fontSize = sp_20,
            color = JournalText_Congrats,
            textAlign = TextAlign.Center,
            modifier = Modifier.constrainAs(textAvailability) {
                top.linkTo(textCongrats.bottom, margin = dp_16)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Button(
            onClick = {navController.navigate(NavigationItem.CREATE_PROFILE.route) },
            colors = ButtonDefaults.buttonColors(JournalTextBlue),
            modifier = Modifier
                .constrainAs(btnDone) {
                    top.linkTo(textAvailability.bottom, margin = dp_24)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .padding(horizontal = dp_24)
        ) {
            Text(
                text = stringResource(id = R.string.done),
                fontSize = sp_20,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview
@Composable
private fun CongratulationsScreenPreview() {
    CongratulationsScreen(rememberNavController())
}