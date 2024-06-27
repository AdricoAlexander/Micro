import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import com.example.healthyus.MainActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.healthyus.R
import com.example.healthyus.montserratbold
import com.example.healthyus.montserratregular
import com.example.healthyus.ui.theme.Green50
import com.example.healthyus.ui.theme.Green70
import com.example.healthyus.ui.theme.White40

@Composable
fun signin(navController: NavController) {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    val myIcon = painterResource(id = R.drawable.closedpass)
    val myIcon2 = painterResource(id = R.drawable.leakpass)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Green50)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.asset7),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 267.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.asset8),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = -20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.asset9),
                contentDescription = null,
                modifier = Modifier
                    .offset(y = 120.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .offset(y = 30.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .background(Color.White)

        ){
            Column () {
                Text(text = "Masuk",
                    fontFamily = montserratbold,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(start = 30.dp)
                )
                Text(text = "Masukkan email dan kata sandi dengan benar",
                    fontFamily = montserratregular,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(start = 30.dp, top = 14.dp)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp)
                ) {
                    OutlinedTextField(
                        value = email.value,
                        onValueChange = {newValue -> email.value = newValue},
                        leadingIcon = {
                                      Icon(
                                          imageVector = Icons.Default.Email,
                                          contentDescription = "Email Icon"
                                      )
                        },
                        label = { Text(text = "E-Mail")},
                        modifier = Modifier
                            .align(Alignment.Center)
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                ) {
                    OutlinedTextField(
                        value = password.value,
                        onValueChange = {passwordValue -> password.value = passwordValue},
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = "Email Icon"
                            )
                        },
                        trailingIcon = {
                                       Icon(
                                           painter = if (passwordVisible.value) myIcon2 else myIcon,
                                           contentDescription = "password leak",
                                           modifier = Modifier
                                               .clickable {
                                                   passwordVisible.value = !passwordVisible.value
                                               },
                                       )
                        },
                        label = { Text(text = "Kata sandi")},
                        visualTransformation = if(passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation(),
                        modifier = Modifier
                            .align(Alignment.Center)
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp),
                        contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = {
                                  HealthyUsNavigation.gotobotbar()
                        },
                        modifier = Modifier.size(250.dp, 50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Green50),
                        shape = RoundedCornerShape(5.dp)
                    ) {
                        Text(
                            text = "Masuk",
                            fontFamily = montserratbold,
                            fontSize = 16.sp,
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row {
                        Text(text = "Tidak Punya akun ?",
                            fontFamily = montserratregular,
                            fontSize = 12.sp)
                        Text(text = "Daftar",
                            fontFamily = montserratbold,
                            fontSize = 12.sp,
                            color = Green70,
                            modifier = Modifier
                                .padding(start = 5.dp)
                                .clickable {
                                    HealthyUsNavigation.gotodaftarpage()
                                })
                    }
                }
            }
        }
    }
}


@Composable
fun myMainButton(
    text : String,
    output : NavController
) {
    Button(onClick = {

    }
    ){

    }
}