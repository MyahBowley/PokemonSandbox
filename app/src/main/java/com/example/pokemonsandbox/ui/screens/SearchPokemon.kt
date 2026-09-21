package com.example.pokemonsandbox.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
//import androidx.compose.foundation.R  // WRONG IMPORT
import com.example.pokemonsandbox.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text

@Composable
fun SearchPokemon(innerPadding: PaddingValues)
{
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ){
        Image(
            painter = painterResource(R.drawable.ditto),
            contentDescription = "Ditto"
        )

        Text(text = "Ditto",
            style = MaterialTheme.typography.displayLarge)
        Text(text = "Abilities:",
            style = MaterialTheme.typography.titleLarge)

        Text("limber, imposter")
    }

}