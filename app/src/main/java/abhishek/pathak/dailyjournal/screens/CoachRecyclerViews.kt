package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.ui.theme.Purple40
import abhishek.pathak.dailyjournal.ui.theme.dp_172
import abhishek.pathak.dailyjournal.ui.theme.dp_20
import abhishek.pathak.dailyjournal.ui.theme.dp_8
import abhishek.pathak.dailyjournal.ui.theme.sp_16
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_24
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
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
  CoachRecyclerViews()
}

@Composable
fun CoachRecyclerViews() {

    Column(modifier = Modifier
        .background(
            Color.Black
        )
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        ) {
            CoachText()
        ProgramUI()
        ProgramUI()
        Row(modifier = Modifier.wrapContentSize()){
            Text(
                text = stringResource(id=R.string.Latest_program),
                modifier = Modifier.padding(dp_8),
                color = Color.White,
                fontSize = sp_20,
                fontWeight = FontWeight.Bold
            )

            IconButton(onClick = {  },Modifier.paint(painterResource(id = R.drawable.baseline_arrow_forward_ios_24_coach))) {

            }
        }
        Text(
            text = stringResource(id=R.string.Explore_the_latest),
            modifier = Modifier.padding(dp_8),
            color = Color.White,
        )

        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()){
            item(5){
                LatestTemplates()
                LatestTemplates()
                LatestTemplates()
                LatestTemplates()
                LatestTemplates()

            }
        }
        Row(modifier = Modifier.wrapContentSize()){
            Text(
                text = stringResource(id=R.string.Latest_templates),
                modifier = Modifier.padding(dp_8),
                color = Color.White,
                fontSize = sp_20,
                fontWeight = FontWeight.Bold
            )
            IconButton(onClick = {  },Modifier.paint(painterResource(id = R.drawable.baseline_arrow_forward_ios_24_coach))) {

            }
        }
        Text(
            text = stringResource(id=R.string.Find_a_template),
            modifier = Modifier.padding(dp_8),
            color = Color.White,
        )

        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()){
            item(5){
                LatestTemplates()
                LatestTemplates()
                LatestTemplates()
                LatestTemplates()
                LatestTemplates()
            }
        }
        Row(modifier = Modifier.wrapContentSize()){
            Text(
                text = stringResource(id=R.string.Featured_Coaches),
                modifier = Modifier.padding(dp_8),
                color = Color.White,
                fontSize = sp_20,
                fontWeight = FontWeight.Bold
            )
        }
        Text(
            text = stringResource(id=R.string.Find_out),
            modifier = Modifier.padding(dp_8),
            color = Color.White,
        )

        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()){
            item(5){
                FeaturedCoaches()
                FeaturedCoaches()
                FeaturedCoaches()
                FeaturedCoaches()
                FeaturedCoaches()
            }
        }

        }
}

@Composable
fun CoachText() {
    Text(
        text = stringResource(id=R.string.Coach),
        modifier = Modifier.padding(dp_8),
        color = Color.Cyan,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    )
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
                    .height(270.dp)
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
                modifier = Modifier.padding(dp_8),
                color = Color.White
            )
            Text(
                text = stringResource(id=R.string.Description),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier.padding(dp_8),
                color = Color.White
            )
            Text(
                text = stringResource(id=R.string.Description),
                modifier = Modifier.padding(dp_8),
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
                    .width(200.dp)
                    .height(200.dp)
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
                modifier = Modifier.padding(dp_8),
                fontSize = sp_16,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = stringResource(id=R.string.Description),
                modifier = Modifier.padding(dp_8),
                fontSize = sp_16,
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
                modifier = Modifier.padding(dp_8)

            )
            {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                )
            }


            Text(
                text = stringResource(id = R.string.Name),
                modifier = Modifier.padding(dp_8),
                fontSize = sp_24,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
 }
