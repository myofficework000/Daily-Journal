package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.navigation.NavigationItem
import abhishek.pathak.dailyjournal.ui.theme.JournalTextBlue
import abhishek.pathak.dailyjournal.ui.theme.PopUpBGGray
import abhishek.pathak.dailyjournal.ui.theme.TextColor
import abhishek.pathak.dailyjournal.ui.theme.WaterMark
import abhishek.pathak.dailyjournal.ui.theme.dp_0
import abhishek.pathak.dailyjournal.ui.theme.dp_1
import abhishek.pathak.dailyjournal.ui.theme.dp_10
import abhishek.pathak.dailyjournal.ui.theme.dp_14
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_20
import abhishek.pathak.dailyjournal.ui.theme.dp_30
import abhishek.pathak.dailyjournal.ui.theme.dp_4
import abhishek.pathak.dailyjournal.ui.theme.dp_40
import abhishek.pathak.dailyjournal.ui.theme.dp_8
import abhishek.pathak.dailyjournal.ui.theme.dp_80
import abhishek.pathak.dailyjournal.ui.theme.sp_18
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_24
import abhishek.pathak.dailyjournal.ui.theme.sp_4
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun UserBottomSheetWithLazyList(navController: NavController){

    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(PopUpBGGray)
    ) {
        val (btnClose, imgUser, textUserName, btnUpgrade, btnLogin, listOptions, waterMark) = createRefs()

        IconButton(onClick = { navController.navigate(NavigationItem.JOURNALS_LIST.route) },
            modifier = Modifier
                .constrainAs(btnClose) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
                .padding(dp_16, dp_40)) {
            Image(painter = painterResource(id = R.drawable.baseline_close_24),
                contentDescription = null)
        }

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
                fontSize = sp_20
            )
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
                fontSize = sp_24
            )
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
                .padding(dp_16, dp_30)) {

            LazyColumn {
//                items(options){
//                    OptionView(it)
//                }

                itemsIndexed(options){ index: Int, listOption: ListOption ->
                    OptionView(listOption)
                    if (index < options.size - 1){
                        Divider()
                    }
                }
            }
        }


        Row(modifier = Modifier
            .constrainAs(waterMark) {
                top.linkTo(listOptions.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
            .padding(dp_0, dp_10)) {
            Image(painter = painterResource(id = R.drawable.baseline_folder_gray_24),
                contentDescription = null, modifier = Modifier.size(dp_30))

            Text(text = stringResource(id = R.string.journey_all_cap)
                , fontSize = sp_20, letterSpacing = sp_4,
                fontWeight = FontWeight.Bold, color = WaterMark,
                modifier = Modifier.padding(dp_10, dp_0))

        }

    }
}

@Composable
fun OptionView(listOption: ListOption) {

    ConstraintLayout(
        Modifier
            .fillMaxWidth()
            .padding(dp_10, dp_20)) {

        val (icon, title, subtitle, chevron) = createRefs()

        Image(
            painter = painterResource(id = listOption.icon),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(icon) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
                .padding(dp_10, dp_0)
        )

        Text(
            text = stringResource(id = listOption.title),
            fontSize = sp_18,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .constrainAs(title) {
                    top.linkTo(parent.top)
                    start.linkTo(icon.end)
                }
                .padding(dp_10, dp_0)
        )

        if (listOption.subtitle != null){
            Text(
                text = stringResource(id = listOption.subtitle),
                modifier = Modifier
                    .constrainAs(subtitle) {
                        top.linkTo(title.bottom)
                        start.linkTo(icon.end)
                    }
                    .padding(dp_10, dp_0)
            )
        }

        Image(
            painter = painterResource(id = listOption.chevron),
            contentDescription = null,
            Modifier
                .constrainAs(chevron){
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        )
    }
}

data class ListOption(
    val icon: Int,
    val title: Int,
    val subtitle: Int?,
    val chevron: Int
)

val options = listOf(
    ListOption(R.drawable.baseline_settings_24, R.string.settings,null, R.drawable.baseline_chevron_right_24),
    ListOption(R.drawable.baseline_cloud_24, R.string.cloud_services, null, R.drawable.baseline_chevron_right_24),
    ListOption(R.drawable.baseline_card_membership_24, R.string.addons, null, R.drawable.baseline_chevron_right_24),
    ListOption(R.drawable.baseline_card_giftcard_24, R.string.send_a_gift, null, R.drawable.baseline_chevron_right_24),
    ListOption(R.drawable.baseline_launch_24, R.string.go_to_web, R.string.web_link, R.drawable.baseline_chevron_right_24)
)

@Preview
@Composable
private fun UserBottomSheetWithLazyListPrev() {
    UserBottomSheetWithLazyList(rememberNavController())
}

@Preview
@Composable
private fun OptionViewPrev() {
    OptionView(options[4])
}