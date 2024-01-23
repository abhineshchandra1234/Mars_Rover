package com.example.marsrover.ui.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.example.marsrover.ui.photolist.MarsRoverPhotoViewModel

@Composable
fun PhotoScreen(
    roverName: String?,
    sol: String?,
    marsRoverPhotoViewModel: MarsRoverPhotoViewModel
) {
    if (roverName != null && sol != null) {
        LaunchedEffect(Unit) {
            marsRoverPhotoViewModel.getMarsRoverPhoto(roverName, sol)
        }
    }
    Text(text = "Photo screen")
}