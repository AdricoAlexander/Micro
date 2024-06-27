package com.example.healthyus

import Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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

@Composable
fun riwayatJurnal2(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF8F8F8))
    ){
        Image(painter = painterResource(id = R.drawable.asset92),
            contentDescription = null,
            modifier = Modifier
                .padding(20.dp)
                .size(30.dp)
                .clickable {
                    navController.navigate(Screens.Jurnal.route)
                }
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = "Riwayat Jurnal",
                    fontFamily = montserratsemibold,
                    fontSize = 16.sp
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ){
                viewmodel(tanggal = "20/02/2024"
                    , Deskripsi = "Kemarin aku hangout sama teman teman, tapi aku tidak merasakan..."
                )
                Spacer(modifier = Modifier.height(20.dp)
                )
                viewmodel(tanggal = "23/02/2024"
                    , Deskripsi ="Senin ini tugas dikampus super banyak bikin stress aja, tapi..."
                )
                Spacer(modifier = Modifier.height(20.dp)
                )
                viewmodel(tanggal = "25/02/2024"
                    , Deskripsi = "Hancur udah, keluarga amburawut temen ga ada...."
                )
                Spacer(modifier = Modifier.height(20.dp)
                )
                viewmodel(tanggal = "26/02/2024"
                    , Deskripsi = "Traveling hari ini super seru, soalnya pergi ke gili..."
                )
                Spacer(modifier = Modifier.height(20.dp)
                )
                viewmodel(tanggal = "27/02/2024",
                    Deskripsi = "Hari ini kegiatan kampus berjalan lancar, semua yang sudah..."
                )
                Spacer(modifier = Modifier.height(20.dp)
                )
                viewmodel(tanggal = "28/02/2024"
                    , Deskripsi = "Gangerti lagi harus ngatasin masalah sama alvannis..."
                )
            }
        }
    }
}


@Composable
fun viewmodel(
    tanggal : String,
    Deskripsi : String
) {
    var textcolor by remember { mutableStateOf(Color.White)}
    var boxcolor by remember { mutableStateOf(Color(0xFF007186)) }
    var bordercolor by remember { mutableStateOf(Color.White) }
    var isClicked by remember { mutableStateOf(false)}
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(114.dp)
            .background(Color(0xFFEFEFEF), RoundedCornerShape(10.dp))
    ){
        Image(painter = painterResource(id = R.drawable.asset94),
            contentDescription = null
        )
        Box(
            modifier = Modifier
                .size(64.dp, 29.dp)
                .offset(x = 270.dp, y = 80.dp)
                .background(boxcolor, RoundedCornerShape(5.dp))
                .border(1.dp, bordercolor, RoundedCornerShape(5.dp))
                .clickable {
                    isClicked =! isClicked
                    if (isClicked) {
                        textcolor = Color.Black
                        boxcolor = Color.White
                        bordercolor = Color.Black
                    } else {
                        textcolor = Color.White
                        boxcolor = Color(0xFF007186)
                        bordercolor = Color.White
                    }
                },
            contentAlignment = Alignment.Center
        ){
            Text(text = "Baca"
                , fontSize = 14.sp,
                fontFamily = montserratregular,
                color = textcolor
            )
        }
        Row (
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Image(painter = painterResource(id = R.drawable.asset95),
                contentDescription = null,
                modifier = Modifier
                    .size(73.dp, 91.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Jurnal Harian",
                        fontFamily = montserratmedium,
                        fontSize = 16.sp)
                    Text(text = tanggal,
                        fontFamily = montserratregular,
                        fontSize = 12.sp)
                }
                Text(text = Deskripsi
                    , fontFamily = montserratregular,
                    fontSize = 14.sp,
                    color = Color(0xFFC5C5C5)
                )
            }
        }
    }
}