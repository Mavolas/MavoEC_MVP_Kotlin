package com.mavolas.base.injection.component

import android.content.Context
import com.mavolas.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Author by Andy
 * Date on 2019-01-20.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun context():Context
}