package com.example.healthyus

import HealthyUsNavigation
import Screen
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun inputPerasaan(navController : NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(121.dp, 50.dp)
                        .background(Color(0xFFDFE9F1), RoundedCornerShape(20.dp))
                ){
                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        Text(text = "Rab, 3 Mar",
                            fontFamily = montserratregular,
                            fontSize = 14.sp
                        )
                        Image(painter = painterResource(id = R.drawable.asset56),
                            contentDescription = null,
                            modifier = Modifier
                                .size(15.dp))
                    }
                }
                Image(painter = painterResource(id = R.drawable.asset57),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {
                            HealthyUsNavigation.gotobotbar()
                        })
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = "Bagaimana perasaanmu hari ini?",
                        fontFamily = montserratbold,
                        fontSize = 16.sp
                    )
                    Text(text = "Suasana hati yang dipilih paling mencerminkan bagaimana perasaan kamu saat ini",
                        fontFamily = montserratthick,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(10.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
            )
            Image(painter = painterResource(id = R.drawable.asset58),
                contentDescription = null
            )
            Box(modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Netral",
                    fontSize = 16.sp,
                    fontFamily = montserratmedium
                )
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Button(onClick = {
                    HealthyUsNavigation.gotoinputperasaan2()
                }, modifier = Modifier
                    .size(302.dp,50.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF007186)),
                    shape = RoundedCornerShape(5.dp)
                ){
                    Text(text = "Selanjutnya",
                        fontFamily = montserratmedium,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}



