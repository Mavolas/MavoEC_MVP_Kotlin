package com.mavolas.base.injection.component

import android.app.Activity
import android.content.Context
import com.mavolas.base.injection.ActivityScope
import com.mavolas.base.injection.module.ActivityModule
import com.mavolas.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Author by Andy
 * Date on 2019-01-20.
 */

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun activity(): Activity
}