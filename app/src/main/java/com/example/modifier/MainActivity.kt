package com.example.modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val text = "Привет"
            val customModifierOne = Modifier
                .fillMaxSize()
                .padding(start = 100.dp, end = 100.dp, bottom = 50.dp, top = 700.dp)
                .border(width = 2.dp, Color.Red)
                .padding(15.dp)
                .border(width = 2.dp, Color.Red)
                .background(Color.Yellow)
            MessageOne(text = text, modifier = customModifierOne)

            val customModifierTwo = Modifier
                .padding(top = 60.dp, start = 5.dp)
                .size(350.dp)
                .border(width = 2.dp, Color.Green, shape = CircleShape)
                .background(color = colorResource(id = R.color.blue), shape = CircleShape)
                .padding(top = 175.dp)
            MessageTwo(text = text, modifier = customModifierTwo)
        }
    }
}

@Composable
fun MessageOne(
    text: String,
    modifier: Modifier = Modifier
) {
    val defaultModifier = Modifier
        .fillMaxSize()
        .padding(start = 100.dp, end = 100.dp, bottom = 50.dp, top = 700.dp)
        .border(width = 2.dp, Color.Red)
        .padding(15.dp)

    Text(
        text = text,
        modifier = modifier,
        textAlign = TextAlign.Center
    )
}

@Composable
fun MessageTwo(
    text: String,
    modifier: Modifier = Modifier
        .fillMaxSize()
        .padding(top = 60.dp)
) {
    Text(
        text = text,
        modifier = modifier,
        textAlign = TextAlign.Center
    )
}