package com.sandeep.warnings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sandeep.commoncomponents.theme.WeatherTrackerTheme
import com.sandeep.commoncomponents.ui.TopToolbar

class WarningsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherTrackerTheme {
                WarningsScreen()
            }
        }
    }
}

@Composable
fun WarningsScreen(modifier: Modifier = Modifier, onBackClicked: () -> Unit = {}) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopToolbar(title = "Warnings", navigateBack = onBackClicked)
        }
    ) { innerPadding ->

        Box(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text("Weather warnings")
        }
    }
}

@Preview
@Composable
fun WarningsScreenPreview() {
    WeatherTrackerTheme {
        WarningsScreen()
    }
}