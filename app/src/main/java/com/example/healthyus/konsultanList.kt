package com.example.healthyus

import HealthyUsNavigation
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthyus.Data.konsultan
import com.example.healthyus.ui.theme.Green70
import com.example.healthyus.ui.theme.White40
import com.example.healthyus.ui.theme.White90

@Composable
fun doctorlistView(doctor : konsultan) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .background(White40, shape = RoundedCornerShape(10.dp))
        .clickable {
            HealthyUsNavigation.gotokonsultanprofile()
        },
        contentAlignment = Alignment.Center
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ){
            docFace(doc = doctor)
            Column (
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Text(text = "${doctor.name}",
                    fontFamily = montserratmedium,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                )
                Row(
                    modifier = Modifier
                        .padding(start = 10.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.asset55),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(end = 5.dp)
                    )
                    Text(text = "${doctor.rate}"
                        , fontFamily = montserratregular,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier
                        .width(15.dp)
                    )
                    Text(text = "(${doctor.review} Reviews)",
                        fontFamily = montserratregular,
                        fontSize = 12.sp
                        )
                }
            }
        }
    }
}

@Composable
fun docFace(doc :konsultan) {
    Image(painter = painterResource(id = doc.docPicId)
        , contentDescription = null,
        modifier = Modifier
            .size(80.dp))
}
