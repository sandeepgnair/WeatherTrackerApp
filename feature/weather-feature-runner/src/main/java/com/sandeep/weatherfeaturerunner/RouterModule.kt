package com.sandeep.weatherfeaturerunner

import android.content.Context
import android.widget.Toast
import com.sandeep.router.Router
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

@Module
@InstallIn(ActivityComponent::class)
abstract class RouterModule {

    @Binds
    abstract fun bindRouter(
        fakeRouter: FakeRouter
    ): Router
}

class FakeRouter @Inject constructor(): Router {
    override fun navigateToCitySearch(context: Context) {
        TODO("Not yet implemented")
    }

    override fun navigateToWeatherScreen(context: Context) {
        TODO("Not yet implemented")
    }

    override fun navigateToWeatherWarningsScreen(context: Context) {
        Toast
            .makeText(context, "Weather Warnings activity launched", Toast.LENGTH_SHORT)
            .show()
    }

}