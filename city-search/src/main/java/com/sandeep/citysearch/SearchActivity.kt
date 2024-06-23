package com.sandeep.citysearch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import com.sandeep.commoncomponents.theme.WeatherTrackerTheme

class SearchActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherTrackerTheme {
                Text(
                    text = "Hello module",
                )
            }
        }
    }
}