package com.sandeep.weathertracker.di

import com.sandeep.router.Router
import com.sandeep.weathertracker.routing.IntentRouter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class RouterModule {

    @Binds
    abstract fun bindRouter(
        intentRouter: IntentRouter
    ): Router
}