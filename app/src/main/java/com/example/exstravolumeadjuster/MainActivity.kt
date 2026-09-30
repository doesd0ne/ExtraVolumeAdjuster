package com.example.exstravolumeadjuster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.exstravolumeadjuster.ui.theme.ExstraVolumeAdjusterTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExstraVolumeAdjusterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var count by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = modifier
    ) {
        Text("Hello $name!")

        Text("カウント: $count")

        Button(
            onClick = {
                count++
            }
        ) {
            Text("+1")
        }
    }
}

data class User(
    val name:String,
    val age:Int
)

fun checkAge(age:Int){
    if(age>=18){
        println("$age 歳は成人です")
    }else{
        println("$age 歳は未成年です")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExstraVolumeAdjusterTheme {
        Greeting("Android")
    }
}