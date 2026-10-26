package com.example.pokemonsandbox.ui.screens

import android.R.id.message
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pokemonsandbox.R

//
// Search a pokemon character
//

@Composable
fun SearchScreen()
{
//    val message = viewModel.message

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){
        // TESTING - Show message from ViewModel
        Text("Value of message: $message")

        Image(
            painter = painterResource(R.drawable.ditto),
            contentDescription = "Ditto",
//            resourceID = R.drawable.ditto
        )

        Text(text = "Ditto",
            style = MaterialTheme.typography.displayLarge)

        Spacer(modifier = Modifier
            .height(10.dp))

        //HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        Text(text = "Abilities:",
            style = MaterialTheme.typography.titleLarge)

        Text("limber, imposter")
    }
}