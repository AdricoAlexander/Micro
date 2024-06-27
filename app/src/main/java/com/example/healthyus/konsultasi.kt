package com.example.healthyus

import HealthyUsNavigation
import Screens
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthyus.Data.dataProvider
import androidx.compose.foundation.lazy.items
import androidx.navigation.NavController

@Composable
fun konsultasi(navController: NavController) {
    val doctors = remember { dataProvider.doctorList }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF8F8F8))
        .padding(20.dp)
    ){
        Column {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .height(70.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.asset54),
                        contentDescription = null,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(Screens.Home.route)
                            }
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(30.dp)
                    )
                    var value = remember { mutableStateOf("") }
                    TextField(value = value.value, onValueChange = { newValue ->
                        value.value = newValue
                    },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search, contentDescription = null
                            )
                        },
                        label = {
                            Text(text = "Cari")
                        }
                    )
                }
            }
            Text(text = "Pilihan Psikolog",
                fontSize = 16.sp,
                fontFamily = montserratsemibold,
                modifier = Modifier
                    .padding(start = 25.dp)
                )
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
            )
            LazyColumn(contentPadding = PaddingValues(vertical = 8.dp
            )
            ){
                items(
                    items = doctors,
                    itemContent = {
                        doctorlistView(doctor = it)
                    }
                )
            }
        }
    }
}