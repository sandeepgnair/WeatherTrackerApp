package com.sandeep.weatherfeaturerunner

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.sandeep.weather.WeatherActivity

class WeatherFeatureRunnerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Start feature
        startActivity(Intent(this, WeatherActivity::class.java))
    }
}
