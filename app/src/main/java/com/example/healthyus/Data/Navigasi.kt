package com.example.healthyus.Data

import HealthyUsNavigation
import Screen
import Screens
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.Navigation
import androidx.navigation.compose.rememberNavController
import com.example.healthyus.Data.dataProvider.doctor
import com.example.healthyus.daftar
import com.example.healthyus.inputPerasaan
import com.example.healthyus.inputPerasaan2
import com.example.healthyus.inputPerasaan3
import com.example.healthyus.konsultanProfile
import com.example.healthyus.musicOnplay
import com.example.healthyus.myBottomAppBar
import com.example.healthyus.perasaanChart
import com.example.healthyus.perasaanConfirm
import com.example.healthyus.playSong
import com.example.healthyus.postingPage
import healthy
import signin

@Composable
fun Navigasi() {
    val navController = rememberNavController()

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White
        ) {
        Crossfade(targetState = HealthyUsNavigation.currentScreen.value) { currentState ->
            when(currentState) {
                is Screen.Healthy -> healthy(navController)
                is Screen.SignIn -> signin(navController)
                is Screen.Daftar -> daftar(navController)
                is Screen.myBottomBar -> myBottomAppBar()
                is Screen.inputPerasaan -> inputPerasaan(navController)
                is Screen.inputPerasaan2 -> inputPerasaan2()
                is Screen.inputPerasaan3 -> inputPerasaan3()
                is Screen.perasaanConfirm -> perasaanConfirm(navController)
                is Screen.konsultanProfile -> konsultanProfile(doctor)
                is Screen.playSong -> playSong()
                is Screen.musicOnplay -> musicOnplay()
                is Screen.perasaanChart -> perasaanChart()
                else -> {}
            }
        }
    }
}
