package abhishek.pathak.dailyjournal.screens


import abhishek.pathak.dailyjournal.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.ui.Modifier

@Composable
fun SafePrivateScreen() {

    val progress = 0.5f // 50%

    Column(modifier = Modifier.fillMaxSize()) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            val logo: Painter = painterResource(R.drawable.splash_brand_logo)
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


//        LinearProgressIndicator(
//            progress = progress,
//            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
//            color = Color.Blue,
//            backgroundColor = Color.LightGray
//        )


        val lockImage: Painter = painterResource(R.drawable.onboard_screen2_lock)
        Image(
            painter = lockImage,
            contentDescription = "Lock Image",
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .wrapContentHeight(Alignment.CenterVertically)
        )


        Text(
            text = "Safe & Private.\nYour journal belongs to you. Add passcode to keep your diary private.",
            fontFamily = FontFamily.Cursive,
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier.padding(16.dp)
        )


        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { /* handle add password */ }) {
                Text("Add Passcode")
            }
            Button(onClick = { /* skip handle */ }) {
                Text("Skip")
            }
        }
    }
}
