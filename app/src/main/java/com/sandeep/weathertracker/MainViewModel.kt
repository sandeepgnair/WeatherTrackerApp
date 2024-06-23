package com.sandeep.weathertracker

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel(): ViewModel() {
    private val _uiState: MutableStateFlow<MainViewState> = MutableStateFlow(MainViewState())
    val uiState = _uiState.asStateFlow()


}

data class MainViewState(
    val label: String = "",
)