import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.healthyus.R
import com.example.healthyus.community
import com.example.healthyus.daftar
import com.example.healthyus.inputPerasaan
import com.example.healthyus.inputPerasaan2
import com.example.healthyus.jurnal
import com.example.healthyus.konsultasi
import com.example.healthyus.montserratbold
import com.example.healthyus.montserratmedium
import com.example.healthyus.montserratregular
import com.example.healthyus.myBottomAppBar
import com.example.healthyus.profile
import com.example.healthyus.ui.theme.Green40



@Composable
fun healthy(navController: NavHostController) {
    Surface(
        color = Green40,
        modifier = Modifier
            .fillMaxSize()
    )

    {
        Image(
            painter = painterResource(id = R.drawable.asset1), contentDescription = null,
            modifier = Modifier.offset(y = (-130.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.asset5), contentDescription = null,
            modifier = Modifier.padding(top = 426.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.asset4), contentDescription = null,
            modifier = Modifier.padding(start = 39.dp, top = 325.dp)
        )


        Column(modifier = Modifier.padding(top = 95.dp, start = 39.dp)) {
            Text(
                text = "Welcome",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontFamily = montserratbold
                )
            )
            Row {

                Text(
                    text = "to",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 24.sp,
                        fontFamily = montserratbold
                    )
                )
                Text(
                    text = "HealthyUs",
                    modifier = Modifier.padding(start = 3.dp),
                    color = Green40,
                    fontSize = 24.sp,
                    fontFamily = montserratbold
                )
            }
            Text(
                text = "Solusi tepat untuk menjaga",
                fontSize = 16.sp,
                fontFamily = montserratmedium
            )
            Text(
                text = "kesehatan mentalmu",
                fontSize = 16.sp,
                fontFamily = montserratmedium
            )
            Row {
                Image(
                    painter = painterResource(id = R.drawable.asset2),
                    contentDescription = null,
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .offset(y = 130.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.asset3), contentDescription = null,
                    modifier = Modifier
                        .padding(start = 200.dp, top = 190.dp,)
                        .width(54.dp)
                        .height(47.dp)
                )
            }
        }
        Column {
            Image(
                painter = painterResource(id = R.drawable.asset6),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 535.dp)
                    .height(134.dp)
                    .width(132.dp)
                    .offset(x = 295.dp, y = 130.dp)
                    .clickable {
                        HealthyUsNavigation.gotosigninpage()
                    }
            )
        }

    }
}