package com.example.marsrover

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marsrover.nav.Action
import com.example.marsrover.nav.Destinations
import com.example.marsrover.nav.Destinations.Home
import com.example.marsrover.ui.theme.MarsRoverTheme
import com.example.marsrover.ui.view.ManifestScreen
import com.example.marsrover.ui.view.RoverList

@Composable
fun NavCompose() {

    val navController = rememberNavController()
    val actions = remember(navController) {
        Action(navController)
    }

    MarsRoverTheme {
        NavHost(navController = navController, startDestination = Home) {
            composable(Home) {
                RoverList() { roverName ->
                    actions.manifest(roverName)
                }
            }
            composable(Destinations.Manifest) { backStackEntry ->
                ManifestScreen(
                    roverName = backStackEntry.arguments?.getString("roverName"),
                    marsRoverManifestViewModel = hiltViewModel()
                )
            }
        }
    }
}