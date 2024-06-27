package com.example.healthyus

import HealthyUsNavigation
import Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun perasaanConfirm(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(painter = painterResource(id = R.drawable.asset61),
                contentDescription = null
            )
            Text(text = "Kamu dalam keadaan yang baik !",
                fontSize = 14.sp,
                fontFamily = montserratsemibold
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(5.dp)
            )
            Text(text = "Harimu berjalan luarbiasa",
                fontSize = 14.sp,
                fontFamily = montserratsemibold
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(17.dp)
            )
            Text(text = "Terus pantau perasaanmu untuk",
                fontSize = 12.sp,
                fontFamily = montserratthick
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(5.dp)
            )
            Text(text = "jaga kesehatan mental mu",
                fontSize = 12.sp,
                fontFamily = montserratthick
            )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(33.dp)
            )
            Button(onClick = {
                             HealthyUsNavigation.gotoperasaanchart()
            },modifier = Modifier
                .size(302.dp,50.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF007186)),
                shape = RoundedCornerShape(5.dp)
            ) {
                Text(
                    text = "Mengerti",
                    fontFamily = montserratmedium,
                    fontSize = 16.sp
                )
            }
        }
    }
}
