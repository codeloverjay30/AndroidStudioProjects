package com.example.dietapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

object Main {
    @Composable
    fun Main(){
        var isClicked by remember { mutableStateOf(false) }
        val datas = listOf("Dog", "Cat")
        if(isClicked) {
            FoodComposable.AddNewItem()
        }else {
            Column {
                Spacer(
                    modifier = Modifier.height(40.dp)
                )
                Text(text = "Diet App")
                Spacer(
                    modifier = Modifier.height(10.dp)
                )
                Button(
                    onClick = {
                        isClicked = true
                    },
                    modifier = Modifier.height(30.dp)
                ) {
                    Text("Add new one")
                }
                Spacer(
                    modifier = Modifier.height(40.dp)
                )
                for (data in datas) {
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                        modifier = Modifier.height(80.dp).fillMaxWidth()
                    ) {
                        Text(data)
                    }
                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )
                }
            }
        }
    }
}