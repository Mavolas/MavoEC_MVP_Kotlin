package com.mavolas.base.injection.module

import android.app.Activity
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Module
import dagger.Provides

/**
 * Author by Andy
 * Date on 2019-01-20.
 */
@Module
class LifecycleProviderModule(private val lifecycleProvider: LifecycleProvider<*>) {

    @Provides
    fun providesLifecycleProvider():LifecycleProvider<*>{

        return lifecycleProvider
    }
}