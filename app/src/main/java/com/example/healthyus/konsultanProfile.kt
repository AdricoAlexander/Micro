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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthyus.Data.dataProvider.doctor
import com.example.healthyus.Data.konsultan
import com.example.healthyus.ui.theme.Green50

@Composable
fun konsultanProfile(doctor : konsultan) {
    Box(modifier = Modifier
        .background(Color(0xFFF8F8F8))
        .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(painter = painterResource(id = R.drawable.asset100),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {
                            HealthyUsNavigation.gotobotbar()
                        }
                )
                Spacer(modifier = Modifier.width(10.dp)
                )
                Text(text = doctor.name,
                    fontSize = 16.sp,
                    fontFamily = montserratsemibold
                )
            }
            Spacer(modifier = Modifier.height(20.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.White, RoundedCornerShape(15.dp)),
                contentAlignment = Alignment.Center
            ){
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    docFace(doc = doctor)
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ){
                        Text(text = doctor.name,
                            fontFamily = montserratmedium,
                            fontSize = 14.sp
                        )
                        Spacer(modifier = Modifier
                            .height(10.dp)
                        )
                        Spacer(modifier = Modifier
                            .width(186.dp)
                            .height(2.dp)
                            .background(Color(0xFFE2E0E0))
                        )
                        Spacer(modifier = Modifier
                            .height(10.dp)
                        )
                        Text(text = "Spesialis",
                            fontFamily = montserratsemibold,
                            fontSize = 12.sp
                        )
                        Spacer(modifier = Modifier
                            .height(10.dp)
                        )
                        Text(text = doctor.spec,
                            fontFamily = montserratregular,
                            fontSize = 12.sp
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ){
                icon(gambar = painterResource(id = R.drawable.asset102),
                    jumlah = "1,000+", objek = "Klien"
                )
                icon(gambar = painterResource(id = R.drawable.asset103),
                    jumlah = "5+", objek = "Tahun"
                )
                icon(gambar = painterResource(id = R.drawable.asset106),
                    jumlah = "4.9", objek = "Rating"
                )
                icon(gambar = painterResource(id = R.drawable.asset105),
                    jumlah = "510", objek = "Reviews")
            }
            Spacer(modifier = Modifier.height(20.dp)
            )
            Text(text = "Tentang Saya",
                fontSize = 14.sp,
                fontFamily = montserratbold
            )
            Spacer(modifier = Modifier.height(7.dp)
            )
            Text(text = "Dengan latar belakang dalam psikologi perkembangan, saya berdedikasi untuk membantu individu dari berbagai rentang usia memahami dan... Lihat lebih banyak",
                fontFamily = montserratregular,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(25.dp)
            )
            Text(text = "Jam Kerja",
                fontSize = 14.sp,
                fontFamily = montserratbold
            )
            Spacer(modifier = Modifier.height(7.dp)
            )
            Text(text = "Senin - Sabtu, 08.00 - 21.00 WIB",
                fontFamily = montserratregular,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(15.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = "Reviews",
                    fontSize = 14.sp,
                    fontFamily = montserratbold
                )
                Text(text = "Lihat Semua",
                    fontSize = 12.sp,
                    fontFamily = montserratbold,
                    color = Color(0xFF689AD4)
                )
            }
            Spacer(modifier = Modifier.height(15.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = "Laura Sidqia",
                    fontSize = 14.sp,
                    fontFamily = montserratmedium
                )
                Box(
                    contentAlignment = Alignment.Center
                ){
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(painter = painterResource(id = R.drawable.asset107),
                            contentDescription = null
                        )
                        Text(text = "5.0",
                            fontFamily = montserratregular,
                            fontSize = 12.sp
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(3.dp)
            )
            Text(text = "Saya sangat terkesan dengan keahlian dan empati Psikolog Susanti dalam mendengarkan dan memahami masalah saya."
            , fontSize = 14.sp,
                fontFamily = montserratthick
            )
            Spacer(modifier = Modifier.height(80.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Button(
                    onClick = {
                        HealthyUsNavigation.gotobotbar()
                    },
                    modifier = Modifier.size(300.dp, 50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Green50),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Text(
                        text = "Buat Janji Temu",
                        fontFamily = montserratmedium,
                        fontSize = 16.sp,
                    )
                }
            }
        }
    }
}


@Composable
fun icon(gambar : Painter, jumlah : String, objek : String) {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(modifier = Modifier
            .background(
                Color(0xFFDFE9F1), shape = CircleShape
            )
            .size(45.dp),
            contentAlignment = Alignment.Center
        ){
            Image(painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
            )
        }
        Text(text = jumlah,
            fontSize = 14.sp,
            fontFamily = montserratsemibold
        )
        Text(text = objek,
            fontFamily = montserratregular,
            fontSize = 12.sp
        )
    }
}