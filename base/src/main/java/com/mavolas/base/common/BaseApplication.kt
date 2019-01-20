package com.mavolas.base.common

import android.app.Application
import com.mavolas.base.injection.component.AppComponent
import com.mavolas.base.injection.component.DaggerAppComponent
import com.mavolas.base.injection.module.AppModule

/**
 * Author by Andy
 * Date on 2019-01-20.
 */
class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppinjection()
    }

    private fun initAppinjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}