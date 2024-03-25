package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.ui.theme.JournalBackgroundBlue
import abhishek.pathak.dailyjournal.ui.theme.JournalTextBlue
import abhishek.pathak.dailyjournal.ui.theme.dp_0
import abhishek.pathak.dailyjournal.ui.theme.dp_10
import abhishek.pathak.dailyjournal.ui.theme.dp_12
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_24
import abhishek.pathak.dailyjournal.ui.theme.dp_28
import abhishek.pathak.dailyjournal.ui.theme.dp_30
import abhishek.pathak.dailyjournal.ui.theme.dp_300
import abhishek.pathak.dailyjournal.ui.theme.dp_34
import abhishek.pathak.dailyjournal.ui.theme.dp_40
import abhishek.pathak.dailyjournal.ui.theme.dp_80
import abhishek.pathak.dailyjournal.ui.theme.sp_18
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_24
import abhishek.pathak.dailyjournal.ui.theme.sp_30
import abhishek.pathak.dailyjournal.ui.theme.sp_40
import abhishek.pathak.dailyjournal.ui.theme.sp_60
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun KeepMemoryForever(){

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(JournalBackgroundBlue)
    ){
        val (text_title, text_subtitle, btn_linkAcc, btn_Skip, btn_termOfUse, btn_privacy) = createRefs()
        val (termOfUse, privacy) = createRefs()
        val (img_header, img_termOfUse, img_privacy) = createRefs()

        Image(painter = painterResource(id = R.drawable.keep_memory_svg),
            contentDescription = stringResource(id = R.string.keep_memory_img),
            modifier = Modifier
                .constrainAs(img_header) {
                    top.linkTo(parent.top)
                    bottom.linkTo(text_title.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(dp_300))

        Text(text = stringResource(id = R.string.keep_memory_title),
            fontSize = sp_40,
            fontWeight = FontWeight.ExtraBold,
            lineHeight = sp_60,
            color = JournalTextBlue,
            modifier = Modifier
                .constrainAs(text_title) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
                .padding(dp_28, dp_0, dp_80, dp_0)
        )

        Text( text = stringResource(id = R.string.keep_memory_subtitle),
            fontSize = sp_20,
            fontWeight = FontWeight.Bold,
            lineHeight = sp_30,
            color = JournalTextBlue,
            modifier = Modifier
                .constrainAs(text_subtitle) {
                    start.linkTo(parent.start)
                    top.linkTo(text_title.bottom)
                }
                .padding(dp_28, dp_10))


        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(JournalTextBlue),
            contentPadding = PaddingValues(dp_34, dp_12),
            modifier = Modifier
                .constrainAs(btn_linkAcc) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(text_subtitle.bottom)
                }
                .padding(dp_0, dp_16)

        ) {
            Text(text = stringResource(id = R.string.link_account),
                fontSize = sp_24,
                color = Color.White,
                fontWeight = FontWeight.Bold)
        }


        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(JournalBackgroundBlue),
            contentPadding = PaddingValues(dp_40, dp_10),
            modifier = Modifier.constrainAs(btn_Skip){
                top.linkTo(btn_linkAcc.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            Text(text = stringResource(id = R.string.skip),
                fontSize = sp_24,
                fontWeight = FontWeight.Bold,
                color = JournalTextBlue)
        }


        ConstraintLayout(modifier = Modifier
            .constrainAs(termOfUse) {
                start.linkTo(parent.start)
                bottom.linkTo(parent.bottom)
            }
            .padding(dp_30, dp_10, dp_0, dp_10))
        {
            Image(painter = painterResource(id = R.drawable.baseline_menu_book_24),
                contentDescription = stringResource(id = R.string.menu_img),
                modifier = Modifier
                    .constrainAs(img_termOfUse) {
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    })

            TextButton(onClick = {},
                modifier = Modifier
                    .constrainAs(btn_termOfUse) {
                        start.linkTo(img_privacy.end)
                        end.linkTo(parent.end)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
                    .padding(dp_24, dp_0)){
                Text(text = stringResource(id = R.string.term_of_use),
                    fontSize = sp_18,
                    fontWeight = FontWeight.Bold,
                    color = JournalTextBlue,)
            }
        }



        ConstraintLayout(
            modifier = Modifier
                .constrainAs(privacy) {
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
                .padding(dp_0, dp_10, dp_30, dp_10))
        {
            Image(painter = painterResource(id = R.drawable.baseline_info_outline_24),
                contentDescription = stringResource(id = R.string.info_img),
                modifier = Modifier
                    .constrainAs(img_privacy) {
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    })

            TextButton(onClick = {},
                modifier = Modifier.constrainAs(btn_privacy){
                    start.linkTo(img_privacy.end)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }){
                Text(text = stringResource(id = R.string.privacy_policy),
                    fontSize = sp_18,
                    fontWeight = FontWeight.Bold,
                    color = JournalTextBlue )
            }
        }
    }

}

@Preview
@Composable
private fun KeepMemoryForeverPrev() {
    KeepMemoryForever()
}