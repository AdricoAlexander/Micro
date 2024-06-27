import android.graphics.drawable.shapes.Shape
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.healthyus.R
import com.example.healthyus.montserratmedium
import com.example.healthyus.montserratregular
import com.example.healthyus.montserratsemibold
import com.example.healthyus.myBottomAppBar
import com.example.healthyus.ui.theme.Blue40
import com.example.healthyus.ui.theme.Gray40
import com.example.healthyus.ui.theme.Green40
import com.example.healthyus.ui.theme.Green60
import com.example.healthyus.ui.theme.Green90
import com.example.healthyus.ui.theme.White30
import com.example.healthyus.ui.theme.White40
import com.example.healthyus.ui.theme.White90


@Composable
fun home(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(White30)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ){
            Image(painter = painterResource(id = R.drawable.asset14),
                contentDescription = null,
                modifier = Modifier
                    .offset(310.dp, 70.dp)
                    .clickable {
                        navController.navigate(Screens.Profile.route)
                    }
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
            )
            Row {
                Image(painter = painterResource(id = R.drawable.asset15),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 25.dp)
                )
                Text(text = "Tangerang",
                    fontFamily = montserratregular,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(start = 7.dp)
                )
            }
            Text(text = "Selamat Pagi, Nina !",
                fontFamily = montserratmedium,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 25.dp)
            )
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ){


                Box(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .height(192.dp)
                        .width(306.dp)
                        .background(Blue40, shape = RoundedCornerShape(30.dp)),
                    contentAlignment = Alignment.Center,
                ) {
                    Box(
                        modifier = Modifier
                            .height(160.dp)
                            .width(280.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Column(
                                modifier = Modifier
                                    .height(192.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "The key to",
                                    fontSize = 16.sp,
                                    fontFamily = montserratsemibold
                                )
                                Text(
                                    text = "immortality is first",
                                    fontSize = 16.sp,
                                    fontFamily = montserratsemibold
                                )
                                Text(
                                    text = "living a life worth",
                                    fontSize = 16.sp,
                                    fontFamily = montserratsemibold
                                )
                                Text(
                                    text = "remembering",
                                    fontSize = 16.sp,
                                    fontFamily = montserratsemibold
                                )
                            }
                            Column(
                                modifier = Modifier
                                    .height(192.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.asset16),
                                    contentDescription = null
                                )
                            }
                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 29.dp)
            ){
                Row(modifier = Modifier
                    .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.asset17),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(37.dp)
                                    .width(39.dp)
                                    .clickable {
                                        navController.navigate(Screens.Konsultasi.route)
                                    }
                            )
                            Text(text = "Konsultasi",
                                fontFamily = montserratregular,
                                fontSize = 14.sp
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.asset18),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(37.dp)
                                    .width(39.dp)
                                    .clickable {
                                        HealthyUsNavigation.gotoinputperasaan1()
                                    }
                            )
                            Text(text = "Mood Tracker",
                                fontFamily = montserratregular,
                                fontSize = 14.sp
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.asset19),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(37.dp)
                                    .width(39.dp)
                                    .clickable {
                                        navController.navigate(Screens.Jurnal.route)
                                    }
                            )
                            Text(text = "Journaling",
                                fontFamily = montserratregular,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
            ){
                Box(
                    contentAlignment = Alignment.Center
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(start = 30.dp)
                    ){
                        Image(painter = painterResource(id = R.drawable.asset20),
                            contentDescription = null,
                            modifier = Modifier
                                .size(37.dp, 39.dp)
                                .clickable {
                                    HealthyUsNavigation.gotoplaysong()
                                }
                        )
                        Text(text = "Musik Terapi",
                            fontFamily = montserratregular,
                            fontSize = 14.sp
                        )
                    }
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
            )
            Text(text = "Bagaimana perasaanmu saat ini ?",
                fontFamily = montserratmedium,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 25.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 28.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(58.dp)
                                .border(2.dp, Gray40, shape = RoundedCornerShape(5.dp))
                                .clickable {
                                    HealthyUsNavigation.gotoinputperasaan1()
                                }
                        ){
                            Image(painter = painterResource(id = R.drawable.baikface),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(34.dp))
                        }
                        Text(text = "Baik",
                            fontFamily = montserratregular,
                            fontSize = 12.sp
                        )

                    }
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(58.dp)
                                .border(2.dp, Gray40, shape = RoundedCornerShape(5.dp))
                                .clickable {
                                    HealthyUsNavigation.gotoinputperasaan1()
                                }
                        ){
                            Image(painter = painterResource(id = R.drawable.lumayanface),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(34.dp))
                        }
                        Text(text = "Lumayan",
                            fontFamily = montserratregular,
                            fontSize = 12.sp
                        )

                    }
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(58.dp)
                                .border(2.dp, Gray40, shape = RoundedCornerShape(5.dp))
                                .clickable {
                                    HealthyUsNavigation.gotoinputperasaan1()
                                }
                        ){
                            Image(painter = painterResource(id = R.drawable.biasaface),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(34.dp))
                        }
                        Text(text = "Biasa",
                            fontFamily = montserratregular,
                            fontSize = 12.sp
                        )

                    }
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(58.dp)
                                .border(2.dp, Gray40, shape = RoundedCornerShape(5.dp))
                                .clickable {
                                    HealthyUsNavigation.gotoinputperasaan1()
                                }
                        ){
                            Image(painter = painterResource(id = R.drawable.kurangface),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(34.dp))
                        }
                        Text(text = "Kurang",
                            fontFamily = montserratregular,
                            fontSize = 12.sp
                        )

                    }
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(58.dp)
                                .border(2.dp, Gray40, shape = RoundedCornerShape(5.dp))
                                .clickable {
                                    HealthyUsNavigation.gotoinputperasaan1()
                                }
                        ){
                            Image(painter = painterResource(id = R.drawable.burukface),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(34.dp))
                        }
                        Text(text = "Buruk",
                            fontFamily = montserratregular,
                            fontSize = 12.sp
                        )

                    }
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(25.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
            ){
                Text(text = "Dokter yang tersedia",
                    fontFamily = montserratmedium,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
            ){
                Row(
                    modifier = Modifier
                        .horizontalScroll(rememberScrollState())
                ){
                    Box(modifier = Modifier
                        .height(120.dp)
                        .width(280.dp)
                        .background(Blue40, RoundedCornerShape(10.dp))
                        .padding(10.dp)
                    ){
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Box(modifier = Modifier
                                .fillMaxWidth()
                            ){
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceAround,
                                    Alignment.CenterVertically
                                ){
                                    Image(painter = painterResource(id = R.drawable.asset33),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(46.dp)
                                    )
                                    Column {
                                        Text(text = "Lauren, M.Psi., Psikolog",
                                            fontSize = 12.sp,
                                            fontFamily = montserratregular
                                            )
                                        Text(text = "Konsultan",
                                            fontFamily = montserratregular,
                                            fontSize = 12.sp,
                                            color = Color.LightGray
                                        )
                                    }
                                    Image(painter = painterResource(id = R.drawable.asset34),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(18.dp)
                                    )
                                }
                            }
                            Box(modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp),
                                contentAlignment = Alignment.Center
                            ){
                                Text(text = "Hari Ini, 08.00-10.00 ",
                                    fontSize = 12.sp,
                                    fontFamily = montserratregular,
                                    color = Green90
                                    )
                            }
                        }
                    }
                    Spacer(modifier = Modifier
                        .width(20.dp)
                    )
                    Box(modifier = Modifier
                        .height(120.dp)
                        .width(280.dp)
                        .background(Blue40, RoundedCornerShape(10.dp))
                        .padding(10.dp)
                    ){
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Box(modifier = Modifier
                                .fillMaxWidth()
                            ){
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceAround,
                                    Alignment.CenterVertically
                                ){
                                    Image(painter = painterResource(id = R.drawable.asset37),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(46.dp)
                                    )
                                    Column {
                                        Text(text = "Chika, M.Psi., Psikolog",
                                            fontSize = 12.sp,
                                            fontFamily = montserratregular
                                        )
                                        Text(text = "Konsultan",
                                            fontFamily = montserratregular,
                                            fontSize = 12.sp,
                                            color = Color.LightGray
                                        )
                                    }
                                    Image(painter = painterResource(id = R.drawable.asset34),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(18.dp)
                                    )
                                }
                            }
                            Box(modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp),
                                contentAlignment = Alignment.Center
                            ){
                                Text(text = "Kamis, 09.30-10.00 ",
                                    fontSize = 12.sp,
                                    fontFamily = montserratregular,
                                    color = Green90
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier
                        .width(20.dp)
                    )
                    Box(modifier = Modifier
                        .height(120.dp)
                        .width(280.dp)
                        .background(Blue40, RoundedCornerShape(10.dp))
                        .padding(10.dp)
                    ){
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Box(modifier = Modifier
                                .fillMaxWidth()
                            ){
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceAround,
                                    Alignment.CenterVertically
                                ){
                                    Image(painter = painterResource(id = R.drawable.asset38),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(46.dp)
                                    )
                                    Column {
                                        Text(text = "Nicholas, M.Psi., Psikolog",
                                            fontSize = 12.sp,
                                            fontFamily = montserratregular
                                        )
                                        Text(text = "Konsultan",
                                            fontFamily = montserratregular,
                                            fontSize = 12.sp,
                                            color = Color.LightGray
                                        )
                                    }
                                    Image(painter = painterResource(id = R.drawable.asset34),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(18.dp)
                                    )
                                }
                            }
                            Box(modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp),
                                contentAlignment = Alignment.Center
                            ){
                                Text(text = "Selasa, 09.30-10.00 ",
                                    fontSize = 12.sp,
                                    fontFamily = montserratregular,
                                    color = Green90
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier
                        .width(20.dp)
                    )
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
            ){
                Text(text = "Pantau aktifitas Terakhirmu",
                    fontFamily = montserratmedium,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
            ){
                Box(modifier = Modifier
                    .width(300.dp)
                    .height(120.dp)
                    .background(Color.White, RoundedCornerShape(10.dp))
                    .border(1.dp, Green60, RoundedCornerShape(10.dp))
                    .padding(10.dp),
                    contentAlignment = Alignment.Center
                ){
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                    ){
                        Box(modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Text(text = "Mood Chart",
                                    fontSize = 16.sp,
                                    fontFamily = montserratmedium
                                )
                                Text(text = "16/03/24",
                                    fontSize = 14.sp,
                                    fontFamily = montserratregular
                                )
                            }
                        }
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(10.dp)
                        )
                        Text(text = "Riwayat Mood Mingguan",
                            fontFamily = montserratregular,
                            fontSize = 14.sp,
                            color = Green40
                        )
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .height(5.dp))
                        Image(painter = painterResource(id = R.drawable.asset35),
                            contentDescription = null,
                            modifier = Modifier
                                .size(204.dp, 17.dp)
                        )
                        Box(modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Image(painter = painterResource(id = R.drawable.asset36),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable {
                                            HealthyUsNavigation.gotoperasaanchart()
                                        }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
