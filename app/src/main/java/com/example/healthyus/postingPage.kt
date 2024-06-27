package com.example.healthyus

import HealthyUsNavigation
import Screens
import android.graphics.Paint.Align
import android.inputmethodservice.Keyboard
import android.widget.Space
import android.widget.Toast
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun postingPage(navController: NavController) {
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
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(painter = painterResource(id = R.drawable.asset86),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {
                            navController.navigate(Screens.Komunitas.route)
                        }
                )
                Button(onClick = {
                },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0097B2)),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .size(120.dp,35.dp)
                    ){
                    Text(text = "Posting",
                        fontSize = 14.sp,
                        fontFamily = montserratbold
                    )
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
            ){
                Image(painter = painterResource(id = R.drawable.asset87),
                    contentDescription = null,
                    modifier = Modifier
                        .size(35.dp)
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
                MyEditText()
            }
            Spacer(modifier = Modifier
                .height(100.dp)
            )
            Image(painter = painterResource(id = R.drawable.asset88),
                contentDescription = null
            )
            Spacer(modifier = Modifier
                .height(15.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(painter = painterResource(id = R.drawable.asset89),
                    contentDescription = null,
                    modifier = Modifier
                        .size(35.dp,24.dp)
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
                Image(painter = painterResource(id = R.drawable.asset90),
                    contentDescription = null,
                    modifier = Modifier
                        .size(35.dp,24.dp)
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
                Image(painter = painterResource(id = R.drawable.asset91),
                    contentDescription = null,
                    modifier = Modifier
                        .size(35.dp,24.dp)
                )
                Spacer(modifier = Modifier
                    .width(10.dp)
                )
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyEditText() {
    val text = remember { mutableStateOf("")}

    TextField(value = text.value
        , onValueChange = {newValue -> text.value = newValue},
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        singleLine = false,
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.White,
            containerColor = Color.White
        ),
        label = { if(text.value.isEmpty())
            Text(text = "Apa yang sedang terjadi?",
                fontSize = 14.sp,
                fontFamily = montserratregular,
                color = Color(0xFF858585))}
    )
}
