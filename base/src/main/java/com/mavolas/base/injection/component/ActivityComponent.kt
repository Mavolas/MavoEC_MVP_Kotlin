package com.mavolas.base.injection.component

import android.app.Activity
import android.content.Context
import com.mavolas.base.injection.ActivityScope
import com.mavolas.base.injection.module.ActivityModule
import com.mavolas.base.injection.module.AppModule
import com.mavolas.base.injection.module.LifecycleProviderModule
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Component
import javax.inject.Singleton

/**
 * Author by Andy
 * Date on 2019-01-20.
 */

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class
        , LifecycleProviderModule::class))
interface ActivityComponent {
    fun activity(): Activity

    fun context():Context

    fun lifecycleProvider(): LifecycleProvider<*>
}