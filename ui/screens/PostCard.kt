package com.example.teachmeskillscompose.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PostCard(
    name: String,
    description: String,
    image: Int,
    context: Context,
) {
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(all = 10.dp)
                .clickable {
                    Toast
                        .makeText(context, "123", Toast.LENGTH_SHORT)
                        .show()
                },
            shape = MaterialTheme.shapes.medium,
            elevation = 5.dp,
            backgroundColor = MaterialTheme.colors.surface,
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    modifier = Modifier
                        .size(130.dp)
                        .padding(8.dp),
                    contentScale = ContentScale.Fit,
                )
                Column(Modifier.padding(8.dp)) {
                    Text(
                        text = name,
                        style = MaterialTheme.typography.h4,
                        color = MaterialTheme.colors.onSurface,
                    )
                    Text(
                        text = description,
                        style = MaterialTheme.typography.body2,
                        color = MaterialTheme.colors.error
                    )
                }
            }
        }
    }
}