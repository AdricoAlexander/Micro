package com.example.healthyus

import Screen
import Screens
import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.healthyus.ui.theme.Green60
import home

@Composable
fun myBottomAppBar() {
    val navController = rememberNavController()
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }
    var icon by remember { mutableStateOf(R.drawable.home) }
    var isClicked by remember { mutableStateOf(false) }
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Scaffold(
        bottomBar = {
            if((currentRoute != Screens.postingPage.route) &&
                (currentRoute != Screens.riwayatJurnal.route) &&
                (currentRoute != Screens.riwayatJurnal2.route)
                ) {
                BottomAppBar(
                    containerColor = Color.White, tonalElevation = 10.dp
                ) {
                    IconButton(
                        onClick = {
                            selected.value
                            navController.navigate(Screens.Home.route) {
                                popUpTo(0)
                            }
                        }, modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(id = icon),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    IconButton(
                        onClick = {
                            selected.value
                            navController.navigate(Screens.Konsultasi.route) {
                                popUpTo(0)
                            }
                        }, modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.konsultasi),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    IconButton(
                        onClick = {
                            selected.value
                            navController.navigate(Screens.Komunitas.route) {
                                popUpTo(0)
                            }
                        }, modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.community),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    IconButton(
                        onClick = {
                            selected.value
                            navController.navigate(Screens.Jurnal.route) {
                                popUpTo(0)
                            }
                        }, modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.jurnal),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    IconButton(
                        onClick = {
                            selected.value
                            navController.navigate(Screens.Profile.route) {
                                popUpTo(0)
                            }
                        }, modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                }
            }
        }
    ){paddingValues ->
        NavHost(navController = navController, startDestination = Screens.Home.route,
            modifier = Modifier.padding(paddingValues)) {
            composable(Screens.Home.route) { home(navController) }
            composable(Screens.Konsultasi.route) { konsultasi(navController) }
            composable(Screens.Komunitas.route) { community(navController) }
            composable(Screens.Jurnal.route) { jurnal(navController) }
            composable(Screens.Profile.route) { profile() }
            composable(Screens.postingPage.route){ postingPage(navController)}
            composable(Screens.riwayatJurnal.route){ riwayatJurnal(navController)}
            composable(Screens.riwayatJurnal2.route){ riwayatJurnal2(navController)}
        }
    }
}

