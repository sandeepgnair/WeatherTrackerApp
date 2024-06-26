package com.sandeep.router

import android.content.Context

interface Router {
    fun navigateToCitySearch(context: Context)
    fun navigateToWeatherScreen(context: Context)
    fun navigateToWeatherWarningsScreen(context: Context)
}