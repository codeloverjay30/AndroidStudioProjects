package com.example.dietapp

import android.util.Log
import android.widget.EditText
import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dietapp.food.Food

object FoodComposable {
    val TAG = "FoodComposable"
    @Composable
    fun AddNewItem(){
        var isClicked by remember { mutableStateOf<Boolean>(false) }
        var name by remember { mutableStateOf("") }
        if(isClicked){
            Main.Main()
        }else{
            Column{
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {
                        isClicked = true
                        Log.d(TAG, "the button is clicked in AddNewItem method.")
                    }
                ) {
                    Text("Add")
                }
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("name")}

                )

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}