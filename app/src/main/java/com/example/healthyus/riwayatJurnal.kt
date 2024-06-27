package com.example.healthyus

import Screens
import android.widget.Space
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun riwayatJurnal(navController: NavController) {
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
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Text(text = "Kalender Jurnal",
                    fontFamily = montserratsemibold,
                    fontSize = 16.sp
                    )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(
                        rememberScrollState()
                    )
            ) {
                Text(
                    text = "Februari,2024",
                    fontSize = 16.sp,
                    fontFamily = montserratmedium,
                    color = Color(0xFF007186)
                )
                Spacer(
                    modifier = Modifier.height(15.dp)
                )
                diary(
                    tanggal = "26",
                    hari = "Senin",
                    wajah = painterResource(id = R.drawable.baikface),
                    perasaan = "Senang",
                    deskripsi = "Traveling hari ini super seru, soalnya pergi ke gili lebak terus nyoba berbagai kuliner..."
                )
                diary(tanggal = "27",
                    hari = "Selasa",
                    wajah = painterResource(id = R.drawable.baikface),
                    perasaan = "Senang",
                    deskripsi = "Hari ini kegiatan kampus berjalan lancar, semua yang sudah direncanakan terlaksana..."
                )
                diary(tanggal = "28",
                    hari = "Rabu",
                    wajah = painterResource(id = R.drawable.burukface),
                    perasaan = "Sedih",
                    deskripsi = "Gangerti lagi harus ngatasin masalah sama alvannis gimana, udah ga habis pikir..."
                )
                diary(tanggal = "29",
                    hari = "Kamis",
                    wajah = painterResource(id = R.drawable.baikface),
                    perasaan = "Senang",
                    deskripsi = "Hari ini akhirnya masalah sama alvan selesai. Kita udah baikan lagi..."
                )
                Spacer(modifier = Modifier
                    .height(17.dp)
                )
                Text(
                    text = "Maret,2024",
                    fontSize = 16.sp,
                    fontFamily = montserratmedium,
                    color = Color(0xFF007186)
                )
                Spacer(modifier = Modifier
                    .height(17.dp)
                )
                diary(
                    tanggal = "1",
                    hari = "Jumat",
                    wajah = painterResource(id = R.drawable.baikface),
                    perasaan = "Senang",
                    deskripsi = "TSuper happyyy!! Soalnya hari ini hari ulang tahunku. Teman-teman jg kasih surprise ke aku...  "
                )
                diary(tanggal = "2",
                    hari = "Sabtu",
                    wajah = painterResource(id = R.drawable.baikface),
                    perasaan = "Senang",
                    deskripsi = "Hari ini kegiatan kampus berjalan lancar, semua yang sudah direncanakan terlaksana..."
                )
                diary(tanggal = "3",
                    hari = "Minggu",
                    wajah = painterResource(id = R.drawable.burukface),
                    perasaan = "Sedih",
                    deskripsi = "Gangerti lagi harus ngatasin masalah sama alvannis gimana, udah ga habis pikir..."
                )
                diary(tanggal = "4",
                    hari = "Senin",
                    wajah = painterResource(id = R.drawable.baikface),
                    perasaan = "Senang",
                    deskripsi = "Hari ini akhirnya masalah sama alvan selesai. Kita udah baikan lagi..."
                )
            }
        }
    }
}


@Composable
fun diary(
    tanggal : String,
    hari : String,
    wajah : Painter,
    perasaan : String,
    deskripsi : String
    
) {
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ){
        Column(
            modifier = Modifier
                .width(55.dp)
                .height(40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = tanggal,
                fontFamily = montserratmedium,
                fontSize = 16.sp,
                color = Color(0xFF9A9A9A)
            )
            Text(text = hari,
                fontFamily = montserratmedium,
                fontSize = 16.sp,
                color = Color(0xFF9A9A9A)
            )
        }
        Box(
            modifier = Modifier
                .width(270.dp)
                .height(101.dp)
                .background(Color.White, RoundedCornerShape(10.dp))
        ){
            Row (
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    Image(painter = wajah,
                        contentDescription = null
                    )
                    Text(text = perasaan,
                        fontSize = 14.sp,
                        fontFamily = montserratregular
                    )
                }
                Box(
                    modifier = Modifier
                        .size(187.dp,68.dp)
                ){
                    Text(text = deskripsi,
                        fontSize = 14.sp,
                        fontFamily = montserratregular,
                        color = Color(0xFFC5C5C5)
                        )
                }
            }
        }
    }
}