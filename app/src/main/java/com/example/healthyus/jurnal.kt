package com.example.healthyus

import HealthyUsNavigation
import Screens
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.healthyus.ui.theme.Blue50
import com.example.healthyus.ui.theme.Gray50
import com.example.healthyus.ui.theme.Green100
import com.example.healthyus.ui.theme.Green90
import com.example.healthyus.ui.theme.White30

@Composable
fun jurnal(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Blue50)
    ){
        Column {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.asset26),
                        contentDescription = null,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(Screens.Home.route)
                            }
                    )
                    Text(
                        text = "Journaling",
                        fontFamily = montserratsemibold,
                        fontSize = 16.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.asset27),
                        contentDescription = null,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(Screens.riwayatJurnal.route)
                            }
                    )
                }
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp)
                    .height(100.dp)
            ) {
                Column(
                ) {
                    Text(
                        text = "Halo, Nina!",
                        fontFamily = montserratmedium,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(bottom = 5.dp)
                    )
                    Text(
                        text = "Jangan lewatkan journalingmu ya",
                        fontFamily = montserratregular,
                        fontSize = 14.sp
                    )
                }
            }
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(550.dp)
                        .background(
                            White30,
                            RoundedCornerShape(
                                topStart = 50.dp, topEnd = 50.dp
                            )
                        ),
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                    ){
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(35.dp)
                                .height(100.dp)
                                .background(Gray50, RoundedCornerShape(15.dp))
                        ) {
                            Column (){
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .padding(10.dp)
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.asset28),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .size(36.dp)
                                        )
                                        Text(
                                            text = "Apa saja manfaat dari journaling yang kamu tau ?",
                                            fontFamily = montserratregular,
                                            fontSize = 14.sp,
                                            modifier = Modifier
                                                .padding(start = 10.dp)
                                        )
                                    }
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(7.dp),
                                    contentAlignment = Alignment.CenterEnd
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.asset29),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                }
                            }
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 35.dp, end = 35.dp)
                                .height(140.dp)
                                .background(Green90, RoundedCornerShape(15.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.asset30),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(77.dp, 99.dp)
                                    .offset(x = 128.dp, y = 30.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .width(227.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.asset31),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(114.dp, 104.dp)
                                )
                                Column {
                                    Text(
                                        text = "Buatlah Jurnal Hari Ini",
                                        fontFamily = montserratmedium,
                                        fontSize = 16.sp,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "Mulai tulis Jurnal Harian mu Yuk !",
                                        fontFamily = montserratregular,
                                        fontSize = 12.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }
                        Box(
                            modifier = Modifier

                                .padding(35.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Riwayat Jurnalmu", fontFamily = montserratregular,
                                    fontSize = 14.sp
                                )
                                Text(
                                    text = "Lihat Semua",
                                    fontSize = 14.sp,
                                    fontFamily = montserratregular,
                                    color = Green100,
                                    modifier = Modifier
                                        .clickable {
                                            navController.navigate(Screens.riwayatJurnal2.route )
                                        }
                                )
                            }
                        }
                        Image(painter = painterResource(id = R.drawable.asset32),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(start = 35.dp, end = 35.dp)
                                .size(401.dp, 114.dp)
                        )
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                        )
                        Image(painter = painterResource(id = R.drawable.asset52),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(start = 35.dp, end = 35.dp)
                                .size(401.dp, 114.dp)
                        )
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                        )
                        Image(painter = painterResource(id = R.drawable.asset53),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(start = 35.dp, end = 35.dp)
                                .size(401.dp, 114.dp)
                        )
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                        )
                    }
                }
            }
        }
    }
}
