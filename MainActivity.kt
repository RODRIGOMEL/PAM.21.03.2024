package com.example.atividadetecnologia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atividadetecnologia.ui.theme.AtividadetecnologiaTheme
import androidx.compose.foundation.Image

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AtividadetecnologiaTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "Happy Birthday Sam!",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingImage(message: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.imgtecnologia)
    Image(
        painter = image,
        contentDescription = null

    )
    Column {
        Text(
            text = message,
            fontSize = 17.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Left
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AtividadeTecnologiaPreview() {
    AtividadetecnologiaTheme {
        GreetingImage(
            message = "2º Novotec Desenvolvimento de Sistemas",
        )
    }
}