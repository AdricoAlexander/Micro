package com.example.healthyus

import HealthyUsNavigation
import Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.healthyus.ui.theme.Green50

@Composable
fun perasaanChart() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF8F8F8))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Image(painter = painterResource(id = R.drawable.asset96),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {
                            HealthyUsNavigation.gotoinputperasaan2()
                        }
                )
                Spacer(modifier = Modifier.width(10.dp)
                )
                Box(modifier = Modifier
                    .size(121.dp, 40.dp)
                    .background(Color(0xFFDFE9F1), RoundedCornerShape(20.dp)),
                    contentAlignment = Alignment.Center
                ){
                    Row(
                        Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround
                    ){
                        Text(text = "Rab, 3 Mar",
                            fontSize = 14.sp,
                            fontFamily = montserratregular
                        )
                        Image(painter = painterResource(id = R.drawable.asset97),
                            contentDescription = null,
                            modifier = Modifier
                                .size(15.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier
                .height(20.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ){
                dateFeeling(hari = "Sen", tanggal = "1", image = painterResource(id = R.drawable.burukface)
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
                dateFeeling(hari = "Sel", tanggal = "2", image = painterResource(id = R.drawable.biasaface)
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
                Column(horizontalAlignment = Alignment.CenterHorizontally){
                    Box(modifier = Modifier
                        .size(50.dp, 68.dp)
                        .background(Color(0xFF0088A0), RoundedCornerShape(30.dp)),
                        contentAlignment = Alignment.Center
                    ){
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceAround
                        ){
                            Text(text = "Rab",
                                fontFamily = montserratregular,
                                fontSize = 14.sp,
                                color = Color.White
                            )
                            Text(text = "3",
                                fontFamily = montserratregular,
                                fontSize = 14.sp,
                                color = Color.White
                            )
                        }
                    }
                    Box(modifier = Modifier
                        .background(Color(0xFF0088A0), shape = CircleShape)
                        .size(34.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.lumayanface),
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp))
                    }
                }
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
                datefeelingEmpty(hari = "Kam", tanggal = "4"
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
                datefeelingEmpty(hari = "Jum", tanggal = "5"
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
                datefeelingEmpty(hari = "Sab", tanggal = "6"
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
                datefeelingEmpty(hari = "Min", tanggal = "7"
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
            }
            Spacer(modifier = Modifier.height(30.dp)
            )
            Text(text = "Check-in Mingguan",
                fontSize = 16.sp,
                fontFamily = montserratsemibold
            )
            Spacer(modifier = Modifier.height(20.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(295.dp)
                .background(Color(0xFFEAF1F6), RoundedCornerShape(18.dp))
            ){
                Text(text = "Mood Chart",
                    fontFamily = montserratsemibold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(15.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    chart(hari = "Senin", tinggi = 82
                        , gambar = painterResource(id = R.drawable.burukface)
                        , warna = Color(0xFFFF5C00)
                    )
                    chart(hari = "Selasa", tinggi = 119, gambar = painterResource(id = R.drawable.biasaface),
                        warna = Color(0xFFF1EC70)
                    )
                    chart(hari = "Rabu", tinggi = 176, gambar = painterResource(id = R.drawable.lumayanface) ,
                        warna = Color(0xFF7AB4E8)
                    )
                    emptychart(hari = "Kamis"
                    )
                    emptychart(hari = "Jumat"
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(164.dp)
                .background(Color(0xFFEAF1F6)),
                contentAlignment = Alignment.Center
            ){
                Row(
                    Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    Column(
                        modifier = Modifier
                            .width(195.dp)
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceAround,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(text = "Kamu memiliki gangguan emosi ?",
                            fontFamily = montserratsemibold,
                            fontSize = 14.sp
                        )
                        Button(
                            onClick = {
                                      HealthyUsNavigation.gotobotbar()
                            },
                            modifier = Modifier.size(250.dp, 50.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Green50),
                            shape = RoundedCornerShape(5.dp)
                        ) {
                            Text(
                                text = "Konsultasi Sekarang",
                                fontFamily = montserratmedium,
                                fontSize = 14.sp,
                            )
                        }
                    }
                    Image(painter = painterResource(id = R.drawable.asset99),
                        contentDescription = null)
                }
            }
        }
    }
}

@Composable
fun dateFeeling(hari :String, tanggal: String, image : Painter) {
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Box(modifier = Modifier
            .size(50.dp, 68.dp)
            .background(Color(0xFFDFE9F1), RoundedCornerShape(30.dp)),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ){
                Text(text = hari,
                    fontFamily = montserratregular,
                    fontSize = 14.sp
                )
                Text(text = tanggal,
                    fontFamily = montserratregular,
                    fontSize = 14.sp
                )
            }
        }
        Box(modifier = Modifier
            .background(Color(0xFFDFE9F1), shape = CircleShape)
            .size(34.dp),
            contentAlignment = Alignment.Center
        ){
           Image(painter = image,
               contentDescription = null,
               modifier = Modifier
                   .size(20.dp))
        }
    }
}

@Composable
fun datefeelingEmpty(hari : String, tanggal: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Box(modifier = Modifier
            .size(50.dp, 68.dp)
            .background(Color(0xFFDFE9F1), RoundedCornerShape(30.dp)),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ){
                Text(text = hari,
                    fontFamily = montserratregular,
                    fontSize = 14.sp
                )
                Text(text = tanggal,
                    fontFamily = montserratregular,
                    fontSize = 14.sp
                )
            }
        }
        Box(modifier = Modifier
            .background(Color(0xFFDFE9F1), shape = CircleShape)
            .size(34.dp),
            contentAlignment = Alignment.Center
        ){

        }
    }
}

@Composable
fun chart(hari :String, tinggi : Int, gambar : Painter, warna : Color) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = hari,
            fontSize = 10.sp,
            fontFamily = montserratregular
        )
        Spacer(modifier = Modifier.height(5.dp)
        )
        Box(modifier = Modifier
            .size(25.dp, 211.dp)
            .background(Color.White, RoundedCornerShape(30.dp)),
            contentAlignment = Alignment.BottomCenter
        ){
            Box(modifier = Modifier
                .size(25.dp, tinggi.dp)
                .background(warna, RoundedCornerShape(30.dp)),
                contentAlignment = Alignment.TopCenter
            ){
                Image(painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(22.dp))
            }
        }
    }
}

@Composable
fun emptychart(hari :String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = hari,
            fontSize = 10.sp,
            fontFamily = montserratregular
        )
        Spacer(modifier = Modifier.height(5.dp)
        )
        Box(modifier = Modifier
            .size(25.dp, 211.dp)
            .background(Color.White, RoundedCornerShape(30.dp)),
            contentAlignment = Alignment.BottomCenter
        ){

        }
    }
}
