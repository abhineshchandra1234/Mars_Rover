package com.example.marsrover.ui.photolist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marsrover.data.MarsRoverPhotoRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MarsRoverPhotoViewModel @Inject constructor(
    private val marsRoverPhotoRepo: MarsRoverPhotoRepo
) : ViewModel() {

    fun getMarsRoverPhoto(roverName: String, sol: String) {
        viewModelScope.launch {
            marsRoverPhotoRepo.getMarsRoverPhoto(roverName, sol).collect {
                
            }
        }
    }
}