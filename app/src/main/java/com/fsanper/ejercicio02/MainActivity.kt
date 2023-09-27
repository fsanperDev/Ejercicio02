package com.fsanper.ejercicio02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.fsanper.ejercicio02.ui.theme.Ejercicio02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio02Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyBox()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.NEXUS_5
)
@Composable
fun GreetingPreview() {
    Ejercicio02Theme {
        MyBox()
    }
}

@Composable
fun MyBox(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "Esto es un texto de ejemplo")
    }
}