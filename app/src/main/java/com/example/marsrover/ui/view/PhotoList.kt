package com.example.marsrover.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marsrover.domain.model.RoverPhotoUiModel


@Composable
fun PhotoList() {
}

@Composable
fun Photo(
    roverPhotoUiModel: RoverPhotoUiModel
) {
    Card(
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = roverPhotoUiModel.roverName, modifier = Modifier.padding(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PhotoPreview() {
    Photo(
        roverPhotoUiModel = RoverPhotoUiModel(
            id = 4,
            roverName = "Curiosity",
            imgSrc = "https://domain.com",
            sol = "34",
            earthDate = "2021-03-05",
            cameraFullName = "Mast Camera Zoom - Right"
        )
    )
}
