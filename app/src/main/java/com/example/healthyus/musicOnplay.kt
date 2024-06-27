package com.example.healthyus

import HealthyUsNavigation
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun musicOnplay() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF8F8F8))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ){
           Box(
               modifier = Modifier
                   .fillMaxWidth()
                   .height(150.dp),
               contentAlignment = Alignment.Center
           ){
               Image(painter = painterResource(id = R.drawable.asset73),
                   contentDescription = null,
               )
           }
            Spacer(modifier = Modifier
                .height(20.dp)
            )
            Text(text = "Bed Time",
                fontSize = 16.sp,
                fontFamily = montserratsemibold
            )
            Spacer(modifier = Modifier
                .height(10.dp)
            )
            Text(text = "Nusantara Harmony",
                fontFamily = montserratmedium,
                fontSize = 12.sp
            )
            Spacer(modifier = Modifier
                .height(10.dp)
            )
            Image(painter = painterResource(id = R.drawable.asset74),
                contentDescription = null
            )
            Spacer(modifier = Modifier
                .height(10.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "04.20",
                    fontSize = 12.sp,
                    fontFamily = montserratsemibold
                )
                Text(text = "-05.40",
                    fontSize = 12.sp,
                    fontFamily = montserratmedium
                )
            }
            Spacer(modifier = Modifier
                .height(10.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ){
                controller(control = painterResource(id = R.drawable.asset76)
                )
                controller(control = painterResource(id = R.drawable.asset77)
                )
                controller(control = painterResource(id = R.drawable.asset75)
                )
                controller(control = painterResource(id = R.drawable.asset78)
                )
                controller(control = painterResource(id = R.drawable.asset79)
                )
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0xFFEBEBEB))
                .padding(30.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
            )
            Text(text = "Rekomendasi Lain",
                fontFamily = montserratmedium,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
            ){
                play(image = painterResource(id = R.drawable.asset80)
                    , name = "Moon Time by Moody"
                    , time = "02:00 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset81)
                    , name = "Rain by P. Shaun"
                    , time = "03:20 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset82)
                    , name = "Northen Night by J. Doe"
                    , time = "04:00 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset83)
                    , name = "Time Flies by J. Shushter"
                    , time = "02:40 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset80)
                    , name = "Moon Time by Moody"
                    , time = "02:00 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset81)
                    , name = "Rain by P. Shaun"
                    , time = "03:20 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset82)
                    , name = "Northen Night by J. Doe"
                    , time = "04:00 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset83)
                    , name = "Time Flies by J. Shushter"
                    , time = "02:40 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset80)
                    , name = "Moon Time by Moody"
                    , time = "02:00 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset81)
                    , name = "Rain by P. Shaun"
                    , time = "03:20 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset82)
                    , name = "Northen Night by J. Doe"
                    , time = "04:00 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                play(image = painterResource(id = R.drawable.asset83)
                    , name = "Time Flies by J. Shushter"
                    , time = "02:40 min"
                )
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
            }
        }
    }
    Image(painter = painterResource(id = R.drawable.asset72),
        contentDescription = null,
        modifier = Modifier
            .padding(20.dp)
            .size(30.dp)
            .clickable {
                HealthyUsNavigation.gotoplaysong()
            }
    )
}



@Composable
fun controller(control : Painter) {
    var isClicked by remember { mutableStateOf(false)}
    var baseColor by remember { mutableStateOf(Color.White) }

    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(baseColor)
            .clickable {
                isClicked = !isClicked
                if (isClicked) {
                    baseColor = Color(0xFFBDD2E2)
                } else {
                    baseColor = Color.White
                }
            },
        contentAlignment = Alignment.Center
    ){
        Image(painter = control,
            contentDescription = null,
            modifier = Modifier
                .size(12.dp,14.dp)
        )
    }
}


@Composable
fun play(image: Painter, name: String, time: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(painter = image, contentDescription = name,
                modifier = Modifier
                    .size(53.dp)
            )
            Column(){
                Text(text = "$name",
                    fontSize = 14.sp,
                    fontFamily = montserratregular
                )
                Text(text = "$time",
                    fontSize = 12.sp,
                    fontFamily = montserratthick
                )
            }
            Spacer(modifier = Modifier
                .width(90.dp)
            )
            Image(painter = painterResource(id = R.drawable.asset68)
                , contentDescription = name,
                modifier = Modifier
                    .size(30.dp)
            )
        }
    }
}