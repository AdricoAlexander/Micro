package com.example.healthyus

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.healthyus.ui.theme.Green70
import com.example.healthyus.ui.theme.Green80

@Composable
fun profile() {
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Image(painter = painterResource(id = R.drawable.asset21),
            contentDescription = null,
            modifier = Modifier
                .offset(340.dp,35.4.dp)
            )
        Column(
            modifier = Modifier
                .padding(35.dp)
                .fillMaxSize()
        ){
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Profile",
                    fontFamily = montserratbold,
                    fontSize = 20.sp
                )
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
            )
            Box(
                contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
            ){
                Image(painter = painterResource(id = R.drawable.asset22),
                    contentDescription = null,
                    modifier = Modifier
                        .size(89.dp,87.dp)
                    )
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Kucing Garong",
                        fontFamily = montserratregular,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(end = 5.dp)
                    )
                    Text(text = " . "
                    )
                    Text(text = "Perempuan",
                        fontFamily = montserratregular,
                        color = Color.Gray,
                        fontSize = 10.sp,
                        modifier = Modifier
                            .padding(start = 5.dp)
                        )
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column {
                    var text by remember { mutableStateOf(TextFieldValue("hihanghoheng.@gmail.com")) }
                    Text(text = "Email",
                        fontFamily = montserratmedium,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(bottom = 20.dp)
                    )
                    TextField(value = text,
                        onValueChange = { newText -> text = newText},
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column {
                    var text by remember { mutableStateOf(TextFieldValue("beribu-ribu bintang dilangit, pinjam dulu seratus")) }
                    Text(text = "Bio",
                        fontFamily = montserratmedium,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(bottom = 20.dp)
                    )
                    TextField(value = text,
                        onValueChange = { newText -> text = newText},
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(37.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Box(modifier = Modifier
                    .size(194.dp, 46.dp)
                    .background(Green80, RoundedCornerShape(5.dp)),
                    contentAlignment = Alignment.Center
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        Image(painter = painterResource(id = R.drawable.asset23),
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp, 18.dp)
                        )
                        Text(text = "Riwayat Konsultasi",
                            fontSize = 14.sp,
                            fontFamily = montserratbold
                        )

                    }
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth(),
            ){
                Row (
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Box(modifier = Modifier
                        .size(135.dp, 46.dp)
                        .background(Green80, RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Image(painter = painterResource(id = R.drawable.asset24),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(20.dp, 18.dp)
                            )
                            Text(text = "Teman",
                                fontSize = 14.sp,
                                fontFamily = montserratbold
                            )

                        }
                    }
                    Box(modifier = Modifier
                        .size(135.dp, 46.dp)
                        .background(Green80, RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Image(painter = painterResource(id = R.drawable.asset25),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(20.dp, 18.dp)
                            )
                            Text(text = "Bookmark",
                                fontSize = 14.sp,
                                fontFamily = montserratbold
                            )

                        }
                    }
                }
            }
        }
    }
}
