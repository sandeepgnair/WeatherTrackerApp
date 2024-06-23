package com.sandeep.citysearch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.sandeep.commoncomponents.theme.StandardPadding
import com.sandeep.commoncomponents.theme.WeatherTrackerTheme
import com.sandeep.commoncomponents.ui.TopToolbar

class SearchActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherTrackerTheme {
                SearchScreenContent(
                    onSearchClicked = {

                    },
                    onBackClicked = { }
                )
            }
        }
    }
}

@Composable
fun SearchScreenContent(
    modifier: Modifier = Modifier,
    onSearchClicked: () -> Unit,
    onBackClicked: () -> Unit,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopToolbar(title = "Weather Tracker", navigateBack = onBackClicked)
        }
    ) { innerPadding ->
        var text by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Text(
                text = "Search by city",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = StandardPadding, end = StandardPadding, top = StandardPadding)
            )
            OutlinedTextField(
                value = "",
                onValueChange = { text = it },
                label = { Text("City") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = StandardPadding, end = StandardPadding, top = StandardPadding)
            )
            TextButton(
                onClick = onSearchClicked,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = StandardPadding, end = StandardPadding, top = StandardPadding)
            ) {
                Text(
                    text = "Search",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(StandardPadding)
                )
            }
        }
    }
}
