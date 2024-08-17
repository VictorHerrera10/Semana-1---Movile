package com.u202021367.semana1_1_viernes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.u202021367.semana1_1_viernes.ui.theme.Semana1_1_viernesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            principal()
        }
    }
}



@Composable
fun principal() {

    Column {
        Text(text = "Hello, UPC!")
        Text(text = "Desarrollo de aplicaciones móviles", Modifier
            .background(Color.Yellow)
            .padding(vertical = 30.dp)) // Codigo de color y padding en el texto
        Text(text = "Clase 1")
        Text(text = "Jetpack")

        Row {
            Text(text = "Android")
            Text(text = "Kotlin")
            Text(text = "Jetpack")
        }
    }

}
