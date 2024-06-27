package com.example.healthyus

import HealthyUsNavigation
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun playSong() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF8F8F8))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.SpaceBetween
            ){
                Text(text = "Bagaimana harimu ?",
                    fontFamily = montserratbold,
                    fontSize = 20.sp
                    )
                Image(painter = painterResource(id = R.drawable.asset62),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {
                            HealthyUsNavigation.gotobotbar()
                        }
                )
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(5.dp)
            )
            Text(text = "Mari buat dirimu rileks",
                fontSize = 14.sp,
                fontFamily = montserratregular
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(15.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(227.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color.White, Color(0xFF007186)
                        )
                    ),
                    RoundedCornerShape(15.dp)
                )
                .border(1.dp, Color.White, RoundedCornerShape(15.dp))
            ){
                Image(painter = painterResource(id = R.drawable.asset63),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(x = 70.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .fillMaxHeight()
                        .padding(30.dp),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = "20 menit musik " +
                            "untuk bantu " +
                            "beristirahat",
                        fontFamily = montserratsemibold,
                        fontSize = 16.sp
                        )
                    Button(onClick = {
                                     HealthyUsNavigation.gotomusiconplay()
                    },modifier = Modifier
                        .size(112.dp,50.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF007186)),
                        shape = RoundedCornerShape(30.dp)
                    ) {
                        Text(
                            text = "Mainkan",
                            fontFamily = montserratmedium,
                            fontSize = 14.sp
                        )
                    }
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
            )
            Text(text = "Terbaik untukmu",
                fontSize = 16.sp,
                fontFamily = montserratmedium
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
            )
            imageview()
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
            )
            Text(text = "Rekomendasi Lain",
                fontFamily = montserratmedium,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
            )
            lagu(image = painterResource(id = R.drawable.asset67)
                , name = "Moon Time by Moody" , time = "02:00 min"
            )
            Spacer(modifier = Modifier
                .height(10.dp)
            )
            lagu(image = painterResource(id = R.drawable.asset69),
                name = "Rain by P. Shaun", time = "03:20 min"
            )
            Spacer(modifier = Modifier
                .height(10.dp)
            )
            lagu(image = painterResource(id = R.drawable.asset70),
                name = "Northen Night by J. Doe", time = "04:00 min"
            )
            Spacer(modifier = Modifier
                .height(10.dp)
            )
            lagu(image = painterResource(id = R.drawable.asset71),
                name = "Time Flies by J. Shushter", time = "02:40 min"
            )
            Spacer(modifier = Modifier
                .height(10.dp)
            )
        }
    }
}


@Composable
fun imageview() {
    Box(modifier = Modifier
        .fillMaxWidth()
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.Start,
            Alignment.CenterVertically
        ){
            Image(painter = painterResource(id = R.drawable.asset64),
                contentDescription = null,
                modifier = Modifier
                    .size(137.dp, 174.dp)
                    .clickable {
                        HealthyUsNavigation.gotomusiconplay()
                    }
            )
            Spacer(modifier = Modifier
                .width(10.dp)
            )
            Image(painter = painterResource(id = R.drawable.asset65),
                contentDescription = null,
                modifier = Modifier
                    .size(137.dp, 174.dp)
                    .clickable {
                        HealthyUsNavigation.gotomusiconplay()
                    }
            )
            Spacer(modifier = Modifier
                .width(10.dp)
            )
            Image(painter = painterResource(id = R.drawable.asset66),
                contentDescription = null,
                modifier = Modifier
                    .size(137.dp, 174.dp)
                    .clickable {
                        HealthyUsNavigation.gotomusiconplay()
                    }
            )
            Spacer(modifier = Modifier
                .width(10.dp)
            )
        }
    }
}

@Composable
fun lagu(image: Painter, name: String, time: String) {
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
                    .clickable {
                        HealthyUsNavigation.gotomusiconplay()
                    }
            )
        }
    }
}