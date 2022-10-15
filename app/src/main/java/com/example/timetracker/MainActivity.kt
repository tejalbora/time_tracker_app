package com.example.timetracker

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.time.ExperimentalTime

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalTime::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val image = painterResource(R.drawable.main_bkg)
            Box {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        val navigate = Intent(this@MainActivity, CountdownTimer::class.java)
                        startActivity(navigate)
                    },
                    colors = ButtonDefaults.buttonColors()
                ) {
                    Text(text = "1 Minute Timer", fontSize = 20.sp)
                }

                Button(
                    onClick = {
                        val navigate = Intent(this@MainActivity, clock::class.java)
                        startActivity(navigate)
                    },
                    colors = ButtonDefaults.buttonColors(
                    )
                ) {
                    Text(text = "Clock (Current Time)", fontSize = 20.sp)
                }

                Button(
                    onClick = {
                        val navigate = Intent(this@MainActivity, StopWatch::class.java)
                        startActivity(navigate)
                    },
                    colors = ButtonDefaults.buttonColors(
                    )
                ) {
                    Text(text = "StopWatch", fontSize = 20.sp)
                }
            }
        }
    }
}



