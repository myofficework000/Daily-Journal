package abhishek.pathak.dailyjournal.screens


import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.ui.theme.DarkBlue
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SetPassCodeScreen(navController: NavController) {
    var passcode by remember { mutableStateOf("") }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        val (titleRef, dotsRef, numPadRef) = createRefs()

        Text(
            "SET PASSCODE",
            Modifier
                .constrainAs(titleRef) {
                    top.linkTo(parent.top, margin = 32.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .padding(top = 50.dp),
            color = DarkBlue,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        PasscodeDots(passcode,
            Modifier
                .constrainAs(dotsRef) {
                    top.linkTo(titleRef.bottom, margin = 16.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .padding(bottom = 150.dp))

        NumberPad(onNumberClick = { number ->
            when (number) {
                "delete" -> if (passcode.isNotEmpty()) passcode = passcode.dropLast(1)
                "check" -> {}
                else -> if (passcode.length < 4) passcode += number
            }
        }, Modifier.constrainAs(numPadRef) {
            top.linkTo(dotsRef.bottom, margin = 32.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
    }
}

@Composable
fun PasscodeDots(passcode: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 1..4) {
            Box(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .size(16.dp)
                    .background(
                        if (i <= passcode.length) Color.Black else DarkBlue,
                        shape = CircleShape
                    )
            )
        }
    }
}

@Composable
fun NumberPad(onNumberClick: (String) -> Unit, modifier: Modifier = Modifier) {
    val buttons = listOf(
        "1", "2", "3",
        "4", "5", "6",
        "7", "8", "9",
        "check", "0", "delete"
    )

    TableLayout(
        items = buttons,
        numColumns = 3,
        modifier = modifier,
        onNumberClick = onNumberClick
    )
}

@Composable
fun TableLayout(items: List<String>, numColumns: Int, onNumberClick: (String) -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        items.chunked(numColumns).forEach { row ->
            Row {
                row.forEach { item ->
                    TableCell(item, onNumberClick)
                }
            }
        }
    }
}

@Composable
fun TableCell(item: String, onNumberClick: (String) -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(40.dp)
            .clickable { onNumberClick(item) }
    ) {
        when (item) {
            "delete" -> Image(painter = painterResource(id = R.drawable.baseline_cancel_presentation_24), contentDescription = "Delete")
            "check" -> Image(painter = painterResource(id = R.drawable.baseline_check_24), contentDescription = "Check")
            else -> Text(text = item, fontSize = 24.sp, color = DarkBlue)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SetPassCodeScreenPreview() {
    SetPassCodeScreen(rememberNavController())
}
