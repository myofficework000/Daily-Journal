package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.navigation.NavigationItem
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SafePrivateScreen(navController: NavController) {
    val progress = 0.5f // 50%

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar2()
//        ProgressBar(progress)
        LockImage()
        SafePrivateText()
        val nav= navController
        BottomButtons(nav)
    }
}

@Composable
fun TopBar2() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val logo: Painter = painterResource(R.drawable.splash_brand_logo)
        Image(
            painter = logo,
            contentDescription = "Brand Logo",
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
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
//fun ProgressBar(progress: Float) {
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
fun LockImage() {
    val lockImage: Painter = painterResource(R.drawable.onboard_screen2_lock)
    Image(
        painter = lockImage,
        contentDescription = "Lock Image",
        modifier = Modifier
//            .weight(1f)
            .fillMaxWidth()
            .height(200.dp)
    )
}

@Composable
fun SafePrivateText() {
    Text(
        text = "Safe & Private.\nYour journal belongs to you. Add passcode to keep your diary private.",
        fontFamily = FontFamily.Cursive,
        fontSize = 18.sp,
        color = Color.Black,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun BottomButtons(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(onClick = {navController.navigate(NavigationItem.PASSCODE.route) }) {
            Text("Add Passcode")
        }
        Button(onClick = { navController.navigate(NavigationItem.KEEP_MEMORY.route)  }) {
            Text("Skip")
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun SafePrivateScreenPreview() {
    SafePrivateScreen(rememberNavController())
}

