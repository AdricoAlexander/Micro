package com.example.healthyus

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun inputPerasaan3() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF8F8F8))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ){
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
                            HealthyUsNavigation.gotoinputperasaan2()
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
                        text = "Menurut kamu, emosi tersebut",
                        fontSize = 16.sp,
                        fontFamily = montserratbold
                    )
                    Text(
                        text = "Datang dari mana ?",
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
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                editbox(text = "Keluarga")
                editbox(text = "Pekerjaan")
                editbox(text = "Teman")
                editbox(text = "Percintaan")
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
                editbox(text = "Kesehatan")
                editbox(text = "Pendidikan")
                editbox(text = "Tidur")
                editbox(text = "Perjalanan")
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
                editbox(text = "Makanan")
                editbox(text = "Olahraga")
                editbox(text = "Ibadah")
                editbox(text = "Hobi")
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
                editbox(text = "Cuaca")
                editbox(text = "Belanja")
                editbox(text = "Keuangan")
                editbox(text = "Refleksi Diri")
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(325.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Button(onClick = {
                    HealthyUsNavigation.gotoperasaanconfirm()
                },modifier = Modifier
                    .size(302.dp,50.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF007186)),
                    shape = RoundedCornerShape(5.dp)
                ) {
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
