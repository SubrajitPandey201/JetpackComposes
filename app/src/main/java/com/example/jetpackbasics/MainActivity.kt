package com.example.jetpackbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //passing composable here
            Text(text = "Hello to the jetpack compose")

        }
    }
}
@Preview(showBackground = true, name = "hello message")
@Composable
fun SayCheesy(name: String="CheesyCode"){
    Text(text = "SaY Cheesy bOys from $name ")
}

@Preview(showBackground = true, name = "hello message 2", showSystemUi = true)
@Composable
fun SayCheesy2(name: String="CheesyCode"){
    Text(text = "SaY Cheesy bOys from $name ")
}
@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewFunction(){
    SayCheesy(name = "Hello everyone")

}