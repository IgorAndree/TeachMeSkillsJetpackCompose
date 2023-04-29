package com.example.teachmeskillscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}

@Preview
@Composable
fun LoginScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green)
            .padding(all = 30.dp)
    ) {
        var username by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 60.dp),
            text = "Register Please",
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Yellow
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 60.dp),
            value = username,
            onValueChange = {
                username = it
            },
            label = { Text("Please enter a name") }
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 285.dp),
            value = password,
            onValueChange = {
                password = it
            },
            label = { Text("Please enter a password") }

        )

        OutlinedButton(onClick = {

        }) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                text = "Login",
                fontFamily = FontFamily.Serif,
                fontSize = 25.sp,
                color = Color.Green,
                textAlign = TextAlign.Center
            )
        }
    }
}