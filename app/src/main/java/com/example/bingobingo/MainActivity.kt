package com.example.bingobingo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BingoBingoApp()
        }
    }
}

@Composable
fun BingoBingoApp() {
    val numbers = listOf(1, 5, 7, 10, 15, 20)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Bingo Bingo 預測結果",
            style = MaterialTheme.typography.headlineLarge
        )
        CardLayoutExample(numbers)
        ListLayoutExample(numbers)
    }
}

@Composable
fun CardLayoutExample(numbers: List<Int>) {
    LazyColumn {
        items(numbers) { number ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                elevation = 4.dp
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "預測號碼: $number",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}

@Composable
fun ListLayoutExample(numbers: List<Int>) {
    LazyColumn {
        items(numbers) { number ->
            Text(
                text = "預測號碼: $number",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    }
}
