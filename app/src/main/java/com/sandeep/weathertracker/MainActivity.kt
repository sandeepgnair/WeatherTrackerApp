package com.sandeep.weathertracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sandeep.commoncomponents.theme.StandardPadding
import com.sandeep.commoncomponents.theme.WeatherTrackerTheme
import com.sandeep.router.Router

class MainActivity : ComponentActivity() {

    lateinit var router: Router
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherTrackerTheme {
                MainContent(
                    viewModel = mainViewModel,
                    onAddClicked = {
                        navigateToCitySearch()
                    })
            }
        }
    }

    private fun navigateToCitySearch() = router.navigateToCitySearch()
}

@Composable
fun MainContent(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier,
    onAddClicked: () -> Unit,
) {
    val state by viewModel.uiState.collectAsState()

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            Text(
                text = "Weather Tracker",
                modifier = Modifier.padding(StandardPadding)
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Text(
                text = state.label,
                modifier = Modifier.align(Alignment.Center)
            )
            FloatingActionButton(
                onClick = onAddClicked,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(StandardPadding)
            ) {
                Icon(Icons.Rounded.Add, contentDescription = "")
            }
        }
    }
    LaunchedEffect(Unit) {
        viewModel.init()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherTrackerTheme {
        MainContent(
            onAddClicked = {},
            viewModel = MainViewModel()
        )
    }
}