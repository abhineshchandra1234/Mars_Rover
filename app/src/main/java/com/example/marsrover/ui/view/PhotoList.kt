package com.example.marsrover.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marsrover.R
import com.example.marsrover.domain.model.RoverPhotoUiModel


@Composable
fun PhotoList(
    roverPhotoUiModelList: List<RoverPhotoUiModel>
) {

    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn {
            items(count = roverPhotoUiModelList.size, itemContent = { index ->
                Photo(roverPhotoUiModel = roverPhotoUiModelList[index])
            })
        }
    }
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
            Text(text = stringResource(id = R.string.sol, roverPhotoUiModel.sol))
            Text(text = stringResource(id = R.string.earth_date, roverPhotoUiModel.earthDate))
            Text(text = roverPhotoUiModel.cameraFullName)
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
