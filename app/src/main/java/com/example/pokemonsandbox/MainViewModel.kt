package com.example.pokemonsandbox

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var message by mutableStateOf<String?>(value = null) // compose will watch message for changes and recompose accordingly

    // Properties

    init {
        // Initializations go here
    }

    // Functions
    fun changeMessage(newMessage: String) {
        message = newMessage
    }
}