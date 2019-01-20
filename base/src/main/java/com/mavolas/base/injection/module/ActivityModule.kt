package com.mavolas.base.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides

/**
 * Author by Andy
 * Date on 2019-01-20.
 */
@Module
class ActivityModule(private val activity:Activity) {

    @Provides
    fun providesActivity():Activity{

        return activity
    }
}