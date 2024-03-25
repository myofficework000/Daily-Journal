package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.ui.theme.JournalTextBlue
import abhishek.pathak.dailyjournal.ui.theme.dp_0
import abhishek.pathak.dailyjournal.ui.theme.dp_10
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_20
import abhishek.pathak.dailyjournal.ui.theme.dp_24
import abhishek.pathak.dailyjournal.ui.theme.dp_30
import abhishek.pathak.dailyjournal.ui.theme.dp_40
import abhishek.pathak.dailyjournal.ui.theme.dp_46
import abhishek.pathak.dailyjournal.ui.theme.dp_50
import abhishek.pathak.dailyjournal.ui.theme.dp_60
import abhishek.pathak.dailyjournal.ui.theme.dp_70
import abhishek.pathak.dailyjournal.ui.theme.sp_18
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_22
import abhishek.pathak.dailyjournal.ui.theme.sp_30
import abhishek.pathak.dailyjournal.ui.theme.sp_32
import abhishek.pathak.dailyjournal.ui.theme.sp_40
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun StartJourney() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val (img_ribbon, img_header, text_header, title) = createRefs()
        val (check1, check2, check3, check4, check5) = createRefs()
        val (detail1, detail2, detail3, detail4, detail5) = createRefs()
        val (divider) = createRefs()
        val (text_free, btn_continue, text_fee_detail) = createRefs()

        Image(painter = painterResource(id = R.drawable.ribbon_svg),
            contentDescription = "ribbon",
            modifier = Modifier.constrainAs(img_ribbon) {
                top.linkTo(parent.top)
            })

        Image(painter = painterResource(id = R.drawable.baseline_folder_24),
            contentDescription = stringResource(id = R.string.journey_all_cap),
            modifier = Modifier
                .constrainAs(img_header) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
                .padding(dp_20, dp_60, dp_0, dp_0)
                .size(dp_30))

        Text(text = stringResource(id = R.string.journey_all_cap),
            fontSize = sp_20,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .constrainAs(text_header) {
                    start.linkTo(img_header.end)
                    top.linkTo(img_header.top)
                    bottom.linkTo(img_header.bottom)
                }
                .padding(dp_10, dp_60, dp_0, dp_0)
        )

        Text(text = stringResource(id = R.string.start_journey_title),
            fontSize = sp_32,
            lineHeight = sp_40,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .constrainAs(title) {
                    top.linkTo(img_header.bottom)
                    start.linkTo(parent.start)
                }
                .padding(dp_20, dp_24, dp_0, dp_0)
        )

        Image(painter = painterResource(id = R.drawable.baseline_check_circle_24),
            contentDescription = stringResource(id = R.string.check),
            modifier = Modifier
                .constrainAs(check1) {
                    top.linkTo(title.bottom)
                    start.linkTo(parent.start)
                }
                .padding(dp_20, dp_46, dp_0, dp_0)
                .size(dp_30))

        Text(text = stringResource(id = R.string.detail1),
            fontSize = sp_22,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .constrainAs(detail1) {
                    top.linkTo(check1.top)
                    start.linkTo(check1.end)
                    end.linkTo(parent.end)
                }
                .padding(dp_30, dp_46))

        Image(painter = painterResource(id = R.drawable.baseline_check_circle_24),
            contentDescription = stringResource(id = R.string.check),
            modifier = Modifier
                .constrainAs(check2) {
                    top.linkTo(check1.bottom)
                    start.linkTo(parent.start)
                }
                .padding(dp_20, dp_50, dp_0, dp_0)
                .size(dp_30))

        Text(text = stringResource(id = R.string.detail2),
            fontSize = sp_22,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .constrainAs(detail2) {
                    top.linkTo(check2.top)
                    start.linkTo(check2.end)
                    end.linkTo(parent.end)
                }
                .padding(dp_30, dp_50, dp_40, dp_0))

        Image(painter = painterResource(id = R.drawable.baseline_check_circle_24),
            contentDescription = stringResource(id = R.string.check),
            modifier = Modifier
                .constrainAs(check3) {
                    top.linkTo(check2.bottom)
                    start.linkTo(parent.start)
                }
                .padding(dp_20, dp_70, dp_0, dp_0)
                .size(dp_30))

        Text(text = stringResource(id = R.string.detail3),
            fontSize = sp_22,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .constrainAs(detail3) {
                    top.linkTo(check3.top)
                    start.linkTo(check3.end)
                }
                .padding(dp_10, dp_70, dp_60, dp_0))

        Image(painter = painterResource(id = R.drawable.baseline_check_circle_24),
            contentDescription = stringResource(id = R.string.check),
            modifier = Modifier
                .constrainAs(check4) {
                    top.linkTo(check3.bottom)
                    start.linkTo(parent.start)
                }
                .padding(dp_20, dp_50, dp_0, dp_0)
                .size(dp_30))

        Text(text = stringResource(id = R.string.detail4),
            fontSize = sp_22,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .constrainAs(detail4) {
                    top.linkTo(check4.top)
                    start.linkTo(check4.end)
                    end.linkTo(parent.end)
                }
                .padding(dp_30, dp_50))

        Image(painter = painterResource(id = R.drawable.baseline_check_circle_24),
            contentDescription = stringResource(id = R.string.check),
            modifier = Modifier
                .constrainAs(check5) {
                    top.linkTo(check4.bottom)
                    start.linkTo(parent.start)
                }
                .padding(dp_20, dp_50, dp_0, dp_0)
                .size(dp_30))

        Text(text = stringResource(id = R.string.detail5),
            fontSize = sp_22,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .constrainAs(detail5) {
                    top.linkTo(check5.top)
                    start.linkTo(check5.end)
                    end.linkTo(parent.end)
                }
                .padding(dp_30, dp_50, dp_50, dp_0))

        Divider(modifier = Modifier
            .constrainAs(divider) {
                top.linkTo(detail5.bottom)
            }
            .padding(dp_0, dp_20, dp_0, dp_0))

        Text(text = stringResource(id = R.string.text_free),
            fontSize = sp_18,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .constrainAs(text_free) {
                    top.linkTo(divider.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .padding(dp_0, dp_40, dp_0, dp_0))


        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(JournalTextBlue),
            contentPadding = PaddingValues(dp_50, dp_16),
            modifier = Modifier
                .constrainAs(btn_continue) {
                    top.linkTo(text_free.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .padding(dp_20)) {
            Text(
                text = stringResource(id = R.string.continue_btn),
                fontSize = sp_30,
                fontWeight = FontWeight.Bold
            )
        }

        Text(text = stringResource(id = R.string.fee_detail),
            fontSize = sp_18,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center,
            modifier = Modifier.constrainAs(text_fee_detail) {
                top.linkTo(btn_continue.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })
    }
}

@Preview
@Composable
private fun StartJourneyPrev() {
    StartJourney()
}