package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.ui.theme.JournalTextBlue
import abhishek.pathak.dailyjournal.ui.theme.PopUpBGGray
import abhishek.pathak.dailyjournal.ui.theme.TextColor
import abhishek.pathak.dailyjournal.ui.theme.WaterMark
import abhishek.pathak.dailyjournal.ui.theme.dp_0
import abhishek.pathak.dailyjournal.ui.theme.dp_1
import abhishek.pathak.dailyjournal.ui.theme.dp_10
import abhishek.pathak.dailyjournal.ui.theme.dp_110
import abhishek.pathak.dailyjournal.ui.theme.dp_14
import abhishek.pathak.dailyjournal.ui.theme.dp_140
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_168
import abhishek.pathak.dailyjournal.ui.theme.dp_172
import abhishek.pathak.dailyjournal.ui.theme.dp_20
import abhishek.pathak.dailyjournal.ui.theme.dp_30
import abhishek.pathak.dailyjournal.ui.theme.dp_34
import abhishek.pathak.dailyjournal.ui.theme.dp_4
import abhishek.pathak.dailyjournal.ui.theme.dp_40
import abhishek.pathak.dailyjournal.ui.theme.dp_50
import abhishek.pathak.dailyjournal.ui.theme.dp_8
import abhishek.pathak.dailyjournal.ui.theme.dp_80
import abhishek.pathak.dailyjournal.ui.theme.sp_18
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_24
import abhishek.pathak.dailyjournal.ui.theme.sp_4
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun UserBottomSheet(){
    
    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(PopUpBGGray)
    ) {
        val (btnClose, imgUser, textUserName, btnUpgrade, btnLogin, listOptions, waterMark) = createRefs()
        
        Image(painter = painterResource(id = R.drawable.baseline_close_24),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(btnClose) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
                .padding(dp_16, dp_40))

        Image(painter = painterResource(id = R.drawable.baseline_account_circle_24),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(imgUser) {
                    top.linkTo(btnClose.bottom)
                    start.linkTo(parent.start)
                }
                .padding(dp_16, dp_30, dp_0, dp_0)
                .size(dp_80))

        Text(text = stringResource(id = R.string.user),
            fontSize = sp_24,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .constrainAs(textUserName) {
                    top.linkTo(imgUser.top)
                    start.linkTo(imgUser.end)
                }
                .padding(dp_10, dp_30, dp_0, dp_0)
        )

        OutlinedButton(onClick = { /*TODO*/ },
            contentPadding = PaddingValues(dp_8, dp_0),
            shape = RoundedCornerShape(dp_4),
            border = BorderStroke(dp_1, TextColor),
            modifier = Modifier
                .constrainAs(btnUpgrade) {
                    top.linkTo(textUserName.bottom)
                    start.linkTo(textUserName.start)
                }
                .padding(dp_10, 0.dp)
            ) {
            Text(text = stringResource(id = R.string.upgrade),
                color = TextColor,
                fontSize = sp_20)
        }

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(JournalTextBlue),
            modifier = Modifier
                .constrainAs(btnLogin) {
                    end.linkTo(parent.end)
                    top.linkTo(textUserName.top)
                    bottom.linkTo(btnUpgrade.bottom)
                }
                .padding(dp_10, dp_30, dp_16, dp_0)) {
            Text(text = stringResource(id = R.string.login),
                fontSize = sp_24)
        }

        Surface (shape = RoundedCornerShape(dp_14),
            color = Color.White,
            modifier = Modifier
                .constrainAs(listOptions) {
                    top.linkTo(imgUser.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth()
                .height(388.dp)
                .padding(dp_16, dp_20)) {

            Column {
                Row (modifier = Modifier.padding(dp_20)){
                    Image(painter = painterResource(id = R.drawable.baseline_settings_24),
                        contentDescription = null)
                    Text(text = stringResource(id = R.string.settings),
                        fontSize = sp_18,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(dp_20, dp_0))
                    Spacer(modifier = Modifier.width(dp_172))
                    Image(painter = painterResource(id = R.drawable.baseline_chevron_right_24),
                        contentDescription = null)
                }

                Divider()

                Row (modifier = Modifier.padding(dp_20)){
                    Image(painter = painterResource(id = R.drawable.baseline_cloud_24),
                        contentDescription = null)
                    Text(text = stringResource(id = R.string.cloud_services),
                        fontSize = sp_18,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(dp_20, dp_0))
                    Spacer(modifier = Modifier.width(dp_110))
                    Image(painter = painterResource(id = R.drawable.baseline_chevron_right_24),
                        contentDescription = null)
                }
                Divider()

                Row (modifier = Modifier.padding(dp_20)){
                    Image(painter = painterResource(id = R.drawable.baseline_card_membership_24),
                        contentDescription = null)
                    Text(text = stringResource(id = R.string.addons),
                        fontSize = sp_18,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(dp_20, dp_0))
                    Spacer(modifier = Modifier.width(dp_168))
                    Image(painter = painterResource(id = R.drawable.baseline_chevron_right_24),
                        contentDescription = null)
                }
                Divider()

                Row (modifier = Modifier.padding(dp_20)){
                    Image(painter = painterResource(id = R.drawable.baseline_card_giftcard_24),
                        contentDescription = null)
                    Text(text = stringResource(id = R.string.send_a_gift),
                        fontSize = sp_18,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(dp_20, dp_0))
                    Spacer(modifier = Modifier.width(dp_140))
                    Image(painter = painterResource(id = R.drawable.baseline_chevron_right_24),
                        contentDescription = null)
                }
                Divider()

                Row (modifier = Modifier.padding(dp_20)){
                    Image(painter = painterResource(id = R.drawable.baseline_launch_24),
                        contentDescription = null,
                        Modifier.padding(dp_0, dp_10))

                    Column(modifier = Modifier.padding(dp_20, dp_0)) {
                        Text(text = stringResource(id = R.string.go_to_web),
                            fontSize = sp_18,
                            fontWeight = FontWeight.SemiBold)
                        Text(text = stringResource(id = R.string.web_link))
                    }
                    Spacer(modifier = Modifier.width(dp_50))
                    Image(painter = painterResource(id = R.drawable.baseline_chevron_right_24),
                        contentDescription = null, Modifier.padding(dp_0, dp_10))
                }

            }
        }

        Row(modifier = Modifier.constrainAs(waterMark){
            top.linkTo(listOptions.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }.padding(dp_0, dp_34)) {
            Image(painter = painterResource(id = R.drawable.baseline_folder_gray_24),
                contentDescription = null, modifier = Modifier.size(dp_30))

            Text(text = stringResource(id = R.string.journey_all_cap)
                , fontSize = sp_20, letterSpacing = sp_4,
                fontWeight = FontWeight.Bold, color = WaterMark,
                modifier = Modifier.padding(dp_10, dp_0))

        }

    }
}

@Preview
@Composable
private fun UserBottomSheetPrev() {
    UserBottomSheet()
}