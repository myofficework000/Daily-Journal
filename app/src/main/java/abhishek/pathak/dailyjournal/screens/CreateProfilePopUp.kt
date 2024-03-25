package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.navigation.NavigationItem
import abhishek.pathak.dailyjournal.ui.theme.GrayBG
import abhishek.pathak.dailyjournal.ui.theme.JournalTextBlue
import abhishek.pathak.dailyjournal.ui.theme.dp_0
import abhishek.pathak.dailyjournal.ui.theme.dp_10
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_20
import abhishek.pathak.dailyjournal.ui.theme.dp_30
import abhishek.pathak.dailyjournal.ui.theme.dp_360
import abhishek.pathak.dailyjournal.ui.theme.dp_40
import abhishek.pathak.dailyjournal.ui.theme.dp_420
import abhishek.pathak.dailyjournal.ui.theme.dp_50
import abhishek.pathak.dailyjournal.ui.theme.dp_6
import abhishek.pathak.dailyjournal.ui.theme.sp_16
import abhishek.pathak.dailyjournal.ui.theme.sp_24
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
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
internal fun CreateProfile(navController: NavController) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(GrayBG)
    ) {
        val (box) = createRefs()
        Surface(
            shape = RoundedCornerShape(dp_40),
            modifier = Modifier
                .constrainAs(box) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(dp_360, dp_420)
        ){
            Box(
            ){
                ConstraintLayout {

                    val (imgTitle, textTitle, textSubtitle) = createRefs()
                    val (divider1, divider2, divider3) = createRefs()
                    val (google, apple) = createRefs()
                    val (btnGoogle, btnApple, btnClose) = createRefs()

                    Image(painter = painterResource(id = R.drawable.baseline_devices_other_24),
                        contentDescription = stringResource(id = R.string.devices),
                        modifier = Modifier
                            .constrainAs(imgTitle) {
                                top.linkTo(parent.top)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            }
                            .padding(dp_0, dp_30, dp_0, dp_0)
                            .size(dp_30))


                    Text(text = stringResource(id = R.string.create_profile_title),
                        fontSize = sp_24,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .constrainAs(textTitle) {
                                top.linkTo(imgTitle.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            }
                            .padding(dp_0, dp_20, dp_0, dp_0)
                    )

                    Text(text = stringResource(id = R.string.create_profile_subtitle),
                        fontSize = sp_16,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .constrainAs(textSubtitle) {
                                top.linkTo(textTitle.bottom)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            }
                            .padding(dp_40, dp_6, dp_40, dp_0))

                    Divider(modifier = Modifier
                        .constrainAs(divider1) {
                            top.linkTo(textSubtitle.bottom)
                        }
                        .padding(dp_20, dp_20, dp_20, dp_0),
                        color = Color.Gray)

                    Image(painter = painterResource(id = R.drawable.baseline_android_24),
                        contentDescription = stringResource(id = R.string.sign_in_with_google),
                        modifier = Modifier
                            .constrainAs(google) {
                                start.linkTo(parent.start)
                                top.linkTo(divider1.bottom)
                            }
                            .padding(dp_30, dp_20, dp_0, dp_20)
                            .size(dp_30))


                    TextButton(onClick = { navController.navigate(NavigationItem.START_JOURNEY.route) },
                        modifier = Modifier
                            .constrainAs(btnGoogle) {
                                bottom.linkTo(google.bottom)
                                top.linkTo(google.top)
                                start.linkTo(google.end)
                                end.linkTo(parent.end)
                            }
                            .padding(dp_0, dp_0, dp_50, dp_0)) {
                        Text(text = stringResource(id = R.string.sign_in_with_google),
                            fontSize = sp_16,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Divider(modifier = Modifier
                        .constrainAs(divider2) {
                            top.linkTo(google.bottom)
                        }
                        .padding(dp_20, dp_0),
                        color = Color.Gray)

                    Image(painter = painterResource(id = R.drawable.baseline_hdr_auto_24),
                        contentDescription = stringResource(id = R.string.sign_in_with_apple),
                        modifier = Modifier
                            .constrainAs(apple) {
                                top.linkTo(divider2.bottom)
                                start.linkTo(parent.start)
                            }
                            .padding(dp_30, dp_20, dp_0, dp_20)
                            .size(dp_30))

                    TextButton(onClick = { navController.navigate(NavigationItem.START_JOURNEY.route) },
                        modifier = Modifier
                            .constrainAs(btnApple) {
                                bottom.linkTo(apple.bottom)
                                top.linkTo(apple.top)
                                start.linkTo(apple.end)
                                end.linkTo(parent.end)
                            }
                            .padding(dp_0, dp_0, dp_50, dp_0)) {
                        Text(text = stringResource(id = R.string.sign_in_with_apple),
                            fontSize = sp_16,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                    )
                }

                    Divider(modifier = Modifier
                        .constrainAs(divider3) {
                            top.linkTo(apple.bottom)
                        }
                        .padding(dp_20, dp_0),
                        color = Color.Gray)


                    TextButton(onClick = { navController.navigate(NavigationItem.START_JOURNEY.route) },
                        modifier = Modifier
                            .constrainAs(btnClose) {
                                end.linkTo(parent.end)
                                top.linkTo(divider3.bottom)
                            }
                            .padding(dp_16, dp_10)
                    ) {    Text(text = stringResource(id = R.string.close),
                            fontSize = sp_16,
                            fontWeight = FontWeight.SemiBold,
                            color = JournalTextBlue
                    )
                }
            }
        }
}
    }

}

@Preview
@Composable
private fun CreateProfilePreview() {
    CreateProfile(rememberNavController())
}