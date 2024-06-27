package com.example.healthyus

import HealthyUsNavigation
import Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.healthyus.ui.theme.Gray60

@Composable
fun community(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(15.dp)
    ){
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(painter = painterResource(id = R.drawable.asset22),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                )
                val search = remember { mutableStateOf("")}
                OutlinedTextField(value = search.value,
                    onValueChange = { searchValue -> search.value = searchValue},
                    leadingIcon = { Icon(imageVector = Icons.Default.Search,
                        contentDescription = null) },
                    label = { Text(text = "Cari konten Terkait",
                        fontSize = 16.sp,
                        color = Gray60
                    )},
                )
            }
        }
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
        )
        Box(modifier = Modifier
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Image(painter = painterResource(id = R.drawable.asset39),
                                    contentDescription = null
                                )
                                Text(text = "Plek Ketiplek"
                                    , fontFamily = montserratbold,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 10.dp)
                                )
                                Text(text = " . 10 menit",
                                    fontFamily = montserratbold,
                                    fontSize = 10.sp,
                                    color = Color.LightGray
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            contentAlignment = Alignment.CenterStart
                        ){
                            Text(text = "Menyala abangkuhhhh \uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25",
                                fontFamily = montserratmedium,
                                fontSize = 12.sp
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(start = 20.dp, end = 20.dp, top = 10.dp)
                                .fillMaxWidth()
                                .height(175.dp)
                                .background(Color.White, RoundedCornerShape(10.dp))
                                .border(2.dp, Color.Black, RoundedCornerShape(10.dp)),

                        ){
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(20.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(text = "Amati Tiru Menyala\uD83D\uDD25\uD83D\uDD25 (ATM)"
                                    , fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Spacer(modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                                )
                                Row (
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .horizontalScroll(rememberScrollState()),
                                    verticalAlignment = Alignment.CenterVertically
                                ){
                                    Image(painter = painterResource(id = R.drawable.meme1),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(90.dp)
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(painter = painterResource(id = R.drawable.meme2),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(90.dp)
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(painter = painterResource(id = R.drawable.meme3),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(90.dp)
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(painter = painterResource(id = R.drawable.meme4),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(90.dp)
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(painter = painterResource(id = R.drawable.meme5),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(90.dp)
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(10.dp)
                        )
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth()
                            ){
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.5f),
                                    horizontalArrangement = Arrangement.Start
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset40),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    animatedHeart()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset42),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset43),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    animatedChieve()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset45),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(21.dp)
                        .padding(10.dp)
                        .background(Color.Black)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                    
                ){
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Image(painter = painterResource(id = R.drawable.asset46),
                                    contentDescription = null
                                )
                                Text(text = "Mimi"
                                    , fontFamily = montserratbold,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 10.dp)
                                )
                                Text(text = " . 1 Hari",
                                    fontFamily = montserratbold,
                                    fontSize = 10.sp,
                                    color = Color.LightGray
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            contentAlignment = Alignment.CenterStart
                        ){
                            Column {
                                Text(text = "Sahuuurrrr... Sahuuuuurrrr.........",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "Saatnya Berburu Takjil...",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "Infokan tempat terdekat lurrrr..............",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "OTW borong semua takjilnya dibawah ini :",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = " - Kolak",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = " - Sup buah",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = " - Risol",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = " - Bakwan",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(10.dp)
                        )
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth()
                            ){
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.5f),
                                    horizontalArrangement = Arrangement.Start
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset40),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    animatedHeart()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset42),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset43),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    animatedChieve()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset45),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(21.dp)
                        .padding(10.dp)
                        .background(Color.Black)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Image(painter = painterResource(id = R.drawable.asset47),
                                    contentDescription = null
                                )
                                Text(text = "Komeng"
                                    , fontFamily = montserratbold,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 10.dp)
                                )
                                Text(text = " . 30 Menit",
                                    fontFamily = montserratbold,
                                    fontSize = 10.sp,
                                    color = Color.LightGray
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            contentAlignment = Alignment.CenterStart
                        ){
                            Column {
                                Text(text = "UHUYYYYYYY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "Katakan Uhuyy bersama saya\uD83D\uDE31\uD83D\uDE31\uD83D\uDD25",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "@nusantara_harmony  @infinitelearning",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp,
                                    color = Color(0xFF0058DC)
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(20.dp),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(painter = painterResource(id = R.drawable.asset48),
                                        contentDescription = null   )
                                }
                            }
                        }
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(10.dp)
                        )
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth()
                            ){
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.5f),
                                    horizontalArrangement = Arrangement.Start
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset40),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    animatedHeart()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset42),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset43),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    animatedChieve()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset45),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(21.dp)
                        .padding(10.dp)
                        .background(Color.Black)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()

                ){
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Image(painter = painterResource(id = R.drawable.asset49),
                                    contentDescription = null
                                )
                                Text(text = "Samsudin"
                                    , fontFamily = montserratbold,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 10.dp)
                                )
                                Text(text = " . 2 jam",
                                    fontFamily = montserratbold,
                                    fontSize = 10.sp,
                                    color = Color.LightGray
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            contentAlignment = Alignment.CenterStart
                        ){
                            Column {
                                Text(text = "Hidup seperti Larry",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "Kamu tidak harus menjadi hebat untuk memulai",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "tapi kamu harus memulai untuk menjadi hebat",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = " ",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "#Quotes #QuotesIndonesia #Freefire",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(10.dp)
                        )
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth()
                            ){
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.5f),
                                    horizontalArrangement = Arrangement.Start
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset40),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    animatedHeart()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset42),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset43),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                   animatedChieve()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset45),
                                        contentDescription = null
                                    )
                                }
                            }
                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(21.dp)
                        .padding(10.dp)
                        .background(Color.Black)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()

                ){
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Image(painter = painterResource(id = R.drawable.asset50),
                                    contentDescription = null
                                )
                                Text(text = "Menyalaaa"
                                    , fontFamily = montserratbold,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, end = 10.dp)
                                )
                                Text(text = " . 2 jam",
                                    fontFamily = montserratbold,
                                    fontSize = 10.sp,
                                    color = Color.LightGray
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            contentAlignment = Alignment.CenterStart
                        ){
                            Column {
                                Text(text = "Tebak tebakan yuukkkkk!!!!!!!!",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "Ayam, ayam apa hayoooooooo",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "   ",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = " ",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                                Text(text = "#Tebakapasih #tebakkata #mencobamelawak",
                                    fontFamily = montserratmedium,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(10.dp)
                        )
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth()
                            ){
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(0.5f),
                                    horizontalArrangement = Arrangement.Start
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset40),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    animatedHeart()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset42),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset43),
                                        contentDescription = null
                                    )
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    animatedChieve()
                                    Spacer(
                                        modifier = Modifier
                                            .fillMaxHeight()
                                            .width(10.dp)
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.asset45),
                                        contentDescription = null
                                    )
                                }
                            }
                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(21.dp)
                        .padding(10.dp)
                        .background(Color.Black)
                )
            }
        }
    }
    Image(painter = painterResource(id = R.drawable.asset51),
        contentDescription = null,
        modifier = Modifier
            .size(50.dp)
            .offset(x = 340.dp, y = 635.dp)
            .clickable {
                navController.navigate(Screens.postingPage.route)
            }
    )
}


@Composable
fun animatedHeart() {
    var isClicked by remember { mutableStateOf(false) }
    var image by remember { mutableStateOf(R.drawable.asset41) }

    Image(painter = painterResource(id = image), contentDescription = null,
        modifier = Modifier
            .size(24.8.dp)
            .clickable {
                isClicked = !isClicked
                if (isClicked) {
                    image = R.drawable.asset84
                } else {
                    image = R.drawable.asset41
                }
            }
    )
}

@Composable
fun animatedChieve() {
    var isClicked by remember { mutableStateOf(false)}
    var image by remember { mutableStateOf(R.drawable.asset44)}

    Image(painter = painterResource(id = image)
        , contentDescription = null,
        modifier = Modifier
            .size(24.8.dp)
            .clickable {
                isClicked = !isClicked
                if (isClicked) {
                    image = R.drawable.asset85
                } else {
                    image = R.drawable.asset44
                }
            }
        )
}