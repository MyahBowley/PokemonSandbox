package com.example.pokemonsandbox

import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.systemGestureExclusion
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokemonsandbox.ui.theme.PokemonSandboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokemonSandboxTheme {
//                LazyFood()
                ProfileCard()
//                Text(text = "Hello Android")

                }
            }
        }
    }

@Composable
fun Counter() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(color = Color.Magenta)

        ) {
            Text(text = "Hello")

            for (count in 5..100) {
                Text(text = "Android")
            }
            Text("Goodbye")
        }
    }

@Composable
fun LazyFood() {
    val foodList = listOf("Eggs","Milk","Bread","Cinnamon","Yeast","Flour","Chocolate Chips","Butter","Powdered Sugar","Granulated Sugar","Baking Soda","Baking Powder", "Cocoa Powder","Vanilla Extract","Condensed Milk","Heavy Cream","Salt","Caramel","Chocolate Syrup","Almond Flour",)

    LazyColumn()
    {
        items(foodList) { food ->
            Text(food)
        }
    }
}

@Composable
fun ProfileCard() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
    ){
        Text(text = "Yoda, My Beloved")
    Image(
        painter = painterResource(id = R.drawable.yoda_profile),
        contentDescription = "Yoda My Dude",
        contentScale = ContentScale.Crop, // Crops the image
        modifier = Modifier
            .size(250.dp) // changes image size

            .clip(CircleShape) // cuts image into a circle

        )
        Text("RIP")
    }
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = Modifier
//            .fillMaxHeight()
//            .background(color = Color.Blue)
//    ){
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(color = Color.Magenta)
//        ){
//            Text(text = "Hello")
//            Text(text = "Hello")
//        }
//    }
}