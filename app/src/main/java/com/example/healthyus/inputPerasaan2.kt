package com.example.healthyus

import HealthyUsNavigation
import Screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun inputPerasaan2(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F8F8))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.asset59),
                    contentDescription = null,
                    modifier = Modifier
                        .clickable {
                            HealthyUsNavigation.gotoinputperasaan1()
                        }
                )
                Image(painter = painterResource(id = R.drawable.asset60),
                    contentDescription = null,
                    modifier = Modifier
                        .clickable {
                            HealthyUsNavigation.gotobotbar()
                        }
                )
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Apa saja emosi yang sedang kamu",
                        fontSize = 16.sp,
                        fontFamily = montserratbold
                    )
                    Text(
                        text = " rasakan sekarang?",
                        fontSize = 16.sp,
                        fontFamily = montserratbold
                    )
                }
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
            )
            Text(
                text = "Emosi Positif",
                fontFamily = montserratmedium,
                fontSize = 14.sp
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                editbox(text = "Antusias")
                editbox(text = "Gembira")
                editbox(text = "Takjub")
                editbox(text = "Semangat")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                editbox(text = "Bangga")
                editbox(text = "Santai")
                editbox(text = "Tenang")
                editbox(text = "Lega")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                editbox(text = "Senang")
                Spacer(
                    modifier = Modifier
                        .width(11.dp)
                )
                editbox(text = "Puas")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(0xFFDDDDDD))
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )
            Text(
                text = "Emosi Negatif",
                fontFamily = montserratmedium,
                fontSize = 14.sp
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(15.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                editbox(text = "Marah")
                editbox(text = "Takut")
                editbox(text = "Stress")
                editbox(text = "Waspada")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                editbox(text = "Kesal")
                editbox(text = "Malu")
                editbox(text = "Cemas")
                editbox(text = "Lesu")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                editbox(text = "Sedih")
                editbox(text = "Bosan")
                editbox(text = "Apatis")
                editbox(text = "Kesepian")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)

            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                editbox(text = "Bingung")
                editbox(text = "Gelisah")
                editbox(text = "Murung")
                editbox(text = "Kecewa")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(
                    modifier = Modifier
                        .width(5.dp)
                )
                editbox(text = "Patah Hati")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
            )
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
                Button(onClick = {
                                 HealthyUsNavigation.gotoinputperasaan3()
                },modifier = Modifier
                    .size(302.dp,50.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF007186)),
                    shape = RoundedCornerShape(5.dp)) {
                    Text(
                        text = "Selanjutnya",
                        fontFamily = montserratmedium,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
fun editbox(text: String){
    var boxColor1 by remember { mutableStateOf(Color.White) }
    var textColor1 by remember { mutableStateOf(Color.Black) }
    var isClicked1 by remember { mutableStateOf(false)}
    Box(
        modifier = Modifier
            .size(80.dp, 40.dp)
            .background(boxColor1, RoundedCornerShape(25.dp))
            .border(2.dp, Color(0xFFBDD2E2), RoundedCornerShape(25.dp))
            .clickable {
                isClicked1 = !isClicked1
                if (isClicked1) {
                    boxColor1 = Color(0xFF0097B2)
                    textColor1 = Color.White
                } else {
                    boxColor1 = Color.White
                    textColor1 = Color.Black
                }
            },
        contentAlignment = Alignment.Center
    ){
        Text(text = "$text",
            fontSize = 12.sp,
            fontFamily = montserratregular,
            color = textColor1
        )
    }

}

