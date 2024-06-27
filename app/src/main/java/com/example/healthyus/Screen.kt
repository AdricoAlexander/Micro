import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen() {
    object SignIn : Screen()
    object Healthy : Screen()
    object Daftar : Screen()
    object myBottomBar : Screen()
    object inputPerasaan : Screen()
    object inputPerasaan2 : Screen()
    object inputPerasaan3 : Screen()
    object perasaanConfirm : Screen()
    object konsultanProfile : Screen()
    object playSong : Screen()
    object musicOnplay : Screen()
    object perasaanChart :Screen()
}

object      HealthyUsNavigation {
    var currentScreen : MutableState<Screen> = mutableStateOf(Screen.Healthy)

    fun gotolandingpage(){
        currentScreen.value = Screen.Healthy
    }
    fun gotosigninpage(){
        currentScreen.value = Screen.SignIn
    }
    fun gotodaftarpage(){
        currentScreen.value = Screen.Daftar
    }
    fun gotobotbar(){
        currentScreen.value = Screen.myBottomBar
    }
    fun gotoinputperasaan1(){
        currentScreen.value = Screen.inputPerasaan
    }
    fun gotoinputperasaan2(){
        currentScreen.value = Screen.inputPerasaan2
    }
    fun gotoinputperasaan3(){
        currentScreen.value = Screen.inputPerasaan3
    }
    fun gotoperasaanconfirm(){
        currentScreen.value = Screen.perasaanConfirm
    }
    fun gotokonsultanprofile(){
        currentScreen.value = Screen.konsultanProfile
    }
    fun gotoplaysong(){
        currentScreen.value = Screen.playSong
    }
    fun gotomusiconplay(){
        currentScreen.value = Screen.musicOnplay
    }
    fun gotoperasaanchart(){
        currentScreen.value = Screen.perasaanChart
    }
}

