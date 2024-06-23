package com.sandeep.weathertracker

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {
    private val _uiState: MutableStateFlow<MainViewState> = MutableStateFlow(MainViewState())
    val uiState = _uiState.asStateFlow()

    fun init() {
        _uiState.update {
            it.copy(label = "Hello App")
        }
    }

}

data class MainViewState(
    val label: String = "",
)