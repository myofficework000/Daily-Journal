package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.ui.theme.Purple40
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CoachRecyclerViewsPrev() {
    FeaturedCoaches()
    ProgramUI()
    LatestTemplates()
}

@Composable
fun CoachRecyclerViews() {

    Column {

        Text(
            text = stringResource(id=R.string.Coach),
            modifier = Modifier.padding(8.dp),
            color = Color.Cyan,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        ProgramUI()
        ProgramUI()

    }
}

@Composable
fun ProgramUI() {
    Surface(
        modifier = Modifier.padding(12.dp),
        shape = RoundedCornerShape(10.dp),
        color = (Color(0xFF33322E)),
    ) {
        Column {
            Surface(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(370.dp)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                )
            }


            Text(
                text = stringResource(id=R.string.Heading),
                modifier = Modifier.padding(8.dp),
                color = Color.White
            )
            Text(
                text = stringResource(id=R.string.Description),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier.padding(8.dp),
                color = Color.White
            )
            Text(
                text = stringResource(id=R.string.Description),
                modifier = Modifier.padding(8.dp),
                color = Color.White
            )
        }
    }
}

@Composable
fun LatestTemplates() {
    Surface(
        modifier = Modifier.padding(12.dp),
        shape = RoundedCornerShape(10.dp),
        color = (Color(0xFF33322E)),
    ) {
        Column {
            Surface(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(370.dp)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                )
            }


            Text(
                text = stringResource(id=R.string.Heading),
                modifier = Modifier.padding(8.dp),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = stringResource(id=R.string.Description),
                modifier = Modifier.padding(8.dp),
                fontSize = 25.sp,
                color = Color.White
            )
        }
    }

}

@Composable
fun FeaturedCoaches() {
    Surface(
        modifier = Modifier.padding(12.dp),
        shape = RoundedCornerShape(10.dp),
        color = Purple40,
    ) {
        Row {
            Surface(
                shape = RoundedCornerShape(200.dp),
                modifier = Modifier.padding(8.dp)

            )
            {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                )
            }


            Text(
                text = stringResource(id=R.string.Name),
                modifier = Modifier.padding(8.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
    
}