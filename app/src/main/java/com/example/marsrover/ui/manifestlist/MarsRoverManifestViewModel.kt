package com.example.marsrover.ui.manifestlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marsrover.data.MarsRoverManifestRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MarsRoverManifestViewModel @Inject constructor(
    private val marsRoverManifestRepo: MarsRoverManifestRepo
) : ViewModel() {

    fun getMarsRoverManifest(roverName: String) {
        viewModelScope.launch {
            marsRoverManifestRepo.getMarsRoverManifest(roverName).collect {
                
            }
        }
    }
}