package com.sandeep.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sandeep.commoncomponents.theme.FontXLarge
import com.sandeep.commoncomponents.theme.FontXXLarge
import com.sandeep.commoncomponents.theme.StandardPadding
import com.sandeep.commoncomponents.theme.TextColorInverted
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

        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.sunny),
                contentDescription = "Currently sunny",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                Text(
                    text = "Currently Sunny",
                    color = TextColorInverted,
                    fontSize = FontXLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = StandardPadding,
                            end = StandardPadding,
                            top = StandardPadding
                        )
                )
                Text(
                    text = "25°c",
                    color = TextColorInverted,
                    fontSize = FontXXLarge,
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(
                            start = StandardPadding,
                            end = StandardPadding,
                            top = StandardPadding
                        )
                )
            }
        }
    }
}

@Preview
@Composable
fun WeatherScreenContentPreview() {
    WeatherScreenContent(
        onBackClicked = { }
    )
}