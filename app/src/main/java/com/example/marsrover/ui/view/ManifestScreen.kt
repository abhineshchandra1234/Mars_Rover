package com.example.marsrover.ui.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import com.example.marsrover.ui.manifestlist.MarsRoverManifestViewModel

@Composable
fun ManifestScreen(
    roverName: String?,
    marsRoverManifestViewModel: MarsRoverManifestViewModel
) {
    if (roverName != null) {
        LaunchedEffect(Unit) {
            marsRoverManifestViewModel.getMarsRoverManifest(roverName)
        }
    }
    Text(text = "Manifest Screen $roverName")
}


@Preview
@Composable
fun ManifestScreenPreview() {
    //ManifestScreen("Perseverance")
}