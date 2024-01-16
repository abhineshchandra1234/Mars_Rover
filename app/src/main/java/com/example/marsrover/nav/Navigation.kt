package com.example.marsrover.nav

import androidx.navigation.NavController


object Destinations {
    const val Home = "home"
    const val Manifest = "manifest/{roverName}"
}

class Action(navController: NavController) {
    val home: () -> Unit = {
        navController.navigate(Destinations.Home)
    }
    val manifest: (roverName: String) -> Unit = { roverName ->
        navController.navigate("manifest/${roverName}")
    }
}