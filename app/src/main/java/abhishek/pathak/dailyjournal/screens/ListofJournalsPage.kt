package abhishek.pathak.dailyjournal.screens

import abhishek.pathak.dailyjournal.R
import abhishek.pathak.dailyjournal.navigation.NavigationItem
import abhishek.pathak.dailyjournal.ui.theme.ColumnBackground
import abhishek.pathak.dailyjournal.ui.theme.InsideAppBackground
import abhishek.pathak.dailyjournal.ui.theme.dp_10
import abhishek.pathak.dailyjournal.ui.theme.dp_12
import abhishek.pathak.dailyjournal.ui.theme.dp_15
import abhishek.pathak.dailyjournal.ui.theme.dp_16
import abhishek.pathak.dailyjournal.ui.theme.dp_20
import abhishek.pathak.dailyjournal.ui.theme.dp_22
import abhishek.pathak.dailyjournal.ui.theme.dp_25
import abhishek.pathak.dailyjournal.ui.theme.dp_30
import abhishek.pathak.dailyjournal.ui.theme.dp_40
import abhishek.pathak.dailyjournal.ui.theme.dp_50
import abhishek.pathak.dailyjournal.ui.theme.dp_6
import abhishek.pathak.dailyjournal.ui.theme.dp_8
import abhishek.pathak.dailyjournal.ui.theme.dp_85
import abhishek.pathak.dailyjournal.ui.theme.sp_15
import abhishek.pathak.dailyjournal.ui.theme.sp_20
import abhishek.pathak.dailyjournal.ui.theme.sp_30
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun ListofJournalsPage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(InsideAppBackground),
        //horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                val (image1, image2, image3) = createRefs()
                Image(
                    painter = painterResource(id = R.drawable.baseline_apps_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(dp_50)
                        .padding(top = dp_20, end = dp_6)
                )
                IconButton(
                    onClick = { navController.navigate(NavigationItem.USER_BOTTOM_SHEET.route)},
                    modifier = Modifier
                        .padding(top = dp_20, end = dp_6)
                        .constrainAs(image2) {
                            top.linkTo(parent.top)
                            end.linkTo(parent.end)}
                ) {
                    Image(painter = painterResource(id = R.drawable.baseline_account_circle_24),
                        contentDescription = null,
                        modifier = Modifier
                            .size(dp_50))
                }

                Image(painter = painterResource(id = R.drawable.baseline_add_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(dp_50)
                        .padding(top = dp_20, end = dp_6)
                        .constrainAs(image3) {
                            top.linkTo(parent.top)
                            end.linkTo(image2.start)
                        })
            }

        }

        Text(
                text = "Journey",
                color = ColumnBackground,
                fontSize = sp_30,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(dp_16)
            )
        SearchBar(onSearch = {})
        Stories()






    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(onSearch:(String)->Unit){
    var searchText by remember {mutableStateOf("")}
    Card(
        colors = CardDefaults.cardColors(Color.DarkGray),
        modifier = Modifier
            .fillMaxWidth()
            .padding(dp_16),
        elevation = CardDefaults.cardElevation(dp_8),
        shape = RoundedCornerShape(dp_12)
    ) {
        Row( modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = R.drawable.baseline_search_24),
                contentDescription = null,
                modifier = Modifier
                    .size(dp_50)
                    .padding(top = dp_10)

                    )
            OutlinedTextField(value = searchText, onValueChange ={searchText=it;onSearch(it)},
                modifier = Modifier
                    .weight(1f)
                    .padding(dp_6),
                placeholder = { Text(stringResource(id = R.string.search), fontSize = sp_20,color= Color.LightGray) },
              )
                        
        }
    }

}
@Composable
fun Stories(){
  Card( colors = CardDefaults.cardColors(InsideAppBackground),
      modifier = Modifier
          .fillMaxWidth()
          .padding(dp_16),
      elevation = CardDefaults.cardElevation(dp_16),
      shape = RoundedCornerShape(dp_12)) {
      Column(modifier = Modifier
          .wrapContentSize()
          .padding(dp_20)) {
            Text(text = "STORIES",
                fontSize = sp_20,
                color = Color.White,
                fontWeight = FontWeight.Bold
                )
          Row(modifier = Modifier
              .wrapContentSize()
              .padding(top = dp_20, start = dp_15, bottom = dp_20)) {
              Column() {


              Text(
                  modifier = Modifier
                      .padding(top = dp_25, start = dp_12, end = dp_30)
                      .drawBehind {
                          drawCircle(
                              color = Color.Red,
                              radius = this.size.maxDimension
                          )
                      },
                  text = " 25\nMar", fontSize = sp_15)
                  Text(
                      text = stringResource(id = R.string.Today),
                      color =  Color.White,
                      fontSize = sp_20,
                      fontStyle = FontStyle.Normal,
                      fontWeight = FontWeight.Bold,
                      modifier = Modifier.padding(top= dp_22)
                  )
              }
              Column(modifier = Modifier
                  .wrapContentSize()) {

              Image(
                  painter = painterResource(id = R.drawable.baseline_replay_circle_filled_24),
                  contentDescription = "",
                  modifier= Modifier
                      .padding(start = dp_10)
                      .size(dp_85))
                  Text(
                      text = stringResource(id = R.string.Throwbacks),
                      color = Color.White,
                      fontSize = sp_20,
                      fontStyle = FontStyle.Normal,
                      fontWeight = FontWeight.Bold,
                      modifier = Modifier.padding( start= dp_10)
                  )

                  }}
          }
      }
  }


    @Preview
    @Composable
    fun ShowListofJournals() {
        Box {
            ListofJournalsPage(rememberNavController())
        }


    }
