package com.u202021367.semana1_1_viernes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
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
    LazyColumn {
        items(1) {
            Column {
                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()
                        .background(color = Color.Red)){

                    Text(text = "HEROES DOTA 2",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color.White,)

                }

                Box(modifier = Modifier
                    .height(300.dp) // Aumenta la altura para acomodar el texto
                    .fillMaxWidth()
                    .padding(vertical = 30.dp)){

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://www.reddit.com/r/DotA2/comments/10d9oc3/time_for_practice_dota_2_sniper_fan_artwork/")
                                .transformations(CircleCropTransformation())
                                .build(),

                            contentDescription = "Axe",
                            modifier = Modifier.fillMaxWidth()
                        )

                    }


                }

                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()){

                    Text(text = "SNIPER",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,)

                }


                Box(modifier = Modifier
                    .height(300.dp) // Aumenta la altura para acomodar el texto
                    .fillMaxWidth()
                    .padding(vertical = 30.dp)){

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://cdn.akamai.steamstatic.com/apps/dota2/images/dota_react/heroes/zuus.png")
                                .transformations(CircleCropTransformation())
                                .build(),

                            contentDescription = "Axe",
                            modifier = Modifier.fillMaxWidth()
                        )

                    }


                }

                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()){

                    Text(text = "ZEUS",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,)

                }


                Box(modifier = Modifier
                    .height(300.dp) // Aumenta la altura para acomodar el texto
                    .fillMaxWidth()
                    .padding(vertical = 30.dp)){

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://dotaguia.com/wp-content/uploads/2021/04/thumb2-phantom-assassin-4k-warrior-art-dota-2.jpg")
                                .transformations(CircleCropTransformation())
                                .build(),

                            contentDescription = "Axe",
                            modifier = Modifier.fillMaxWidth()
                        )

                    }


                }

                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()){

                    Text(text = "PHANTHON ASASSIN",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,)

                }

                Box(modifier = Modifier
                    .height(300.dp) // Aumenta la altura para acomodar el texto
                    .fillMaxWidth()
                    .padding(vertical = 30.dp)){

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://media.graphassets.com/CRoaqOEReOB7uNeAW5tE")
                                .transformations(CircleCropTransformation())
                                .build(),

                            contentDescription = "Axe",
                            modifier = Modifier.fillMaxWidth()
                        )

                    }


                }

                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()){

                    Text(text = "WINDDRUNNER",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,)

                }


                Box(modifier = Modifier
                    .height(300.dp) // Aumenta la altura para acomodar el texto
                    .fillMaxWidth()
                    .padding(vertical = 30.dp)){

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://static.wikia.nocookie.net/dota2_gamepedia/images/2/23/Axe_icon.png/revision/latest/scale-to-width-down/300?cb=20160411211422")
                                .transformations(CircleCropTransformation())
                                .build(),

                            contentDescription = "Axe",
                            modifier = Modifier.fillMaxWidth()
                        )

                    }


                }

                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()){

                    Text(text = "AXE",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,)

                }


                Box(modifier = Modifier
                    .height(300.dp) // Aumenta la altura para acomodar el texto
                    .fillMaxWidth()
                    .padding(vertical = 30.dp)){

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://static.wikia.nocookie.net/dota2_gamepedia/images/2/23/Axe_icon.png/revision/latest/scale-to-width-down/300?cb=20160411211422")
                                .transformations(CircleCropTransformation())
                                .build(),

                            contentDescription = "Axe",
                            modifier = Modifier.fillMaxWidth()
                        )

                    }


                }

                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()){

                    Text(text = "AXE",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,)

                }


                Box(modifier = Modifier
                    .height(300.dp) // Aumenta la altura para acomodar el texto
                    .fillMaxWidth()
                    .padding(vertical = 30.dp)){

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://static.wikia.nocookie.net/dota2_gamepedia/images/2/23/Axe_icon.png/revision/latest/scale-to-width-down/300?cb=20160411211422")
                                .transformations(CircleCropTransformation())
                                .build(),

                            contentDescription = "Axe",
                            modifier = Modifier.fillMaxWidth()
                        )

                    }


                }

                Box (
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()){

                    Text(text = "AXE",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,)

                }

            }
        }
    }

}
