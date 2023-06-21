package com.example.teachmeskillscompose.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.teachmeskillscompose.data.Post

@Composable
fun AllPosts(
    posts: List<Post>,
    context: Context,
) {
    LazyColumn(
        Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
    ) {

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(vertical = 25.dp)
                    .clickable {
                        Toast
                            .makeText(context, "123456", Toast.LENGTH_SHORT)
                            .show()
                    },
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "New posts",
                    style = MaterialTheme.typography.h2
                )
            }
        }
        items(posts) { post ->
            PostCard(
                name = post.name,
                description = post.description,
                image = post.imageRes,
                context = context
            )
        }
    }
}





























