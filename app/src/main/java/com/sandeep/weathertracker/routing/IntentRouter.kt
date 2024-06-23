package com.sandeep.weathertracker.routing

import android.content.Context
import android.content.Intent
import com.sandeep.citysearch.SearchActivity
import com.sandeep.router.Router
import com.sandeep.weather.WeatherActivity
import javax.inject.Inject

class IntentRouter @Inject constructor(): Router {
    override fun navigateToCitySearch(context: Context) {
        context.startActivity(Intent(context, SearchActivity::class.java))
    }

    override fun navigateToWeatherScreen(context: Context) {
        context.startActivity(Intent(context, WeatherActivity::class.java))
    }
}