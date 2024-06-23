package com.sandeep.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sandeep.commoncomponents.theme.StandardPadding
import com.sandeep.commoncomponents.theme.WeatherTrackerTheme
import com.sandeep.commoncomponents.ui.TopToolbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeatherActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherTrackerTheme {
                WeatherScreenContent(
                    onBackClicked = { }
                )
            }
        }
    }
}

@Composable
fun WeatherScreenContent(
    modifier: Modifier = Modifier,
    onBackClicked: () -> Unit,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopToolbar(title = "Weather", navigateBack = onBackClicked)
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Text(
                text = "Current Weather",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = StandardPadding, end = StandardPadding, top = StandardPadding)
            )
        }
    }
}
