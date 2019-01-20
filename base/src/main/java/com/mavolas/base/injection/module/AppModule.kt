package com.mavolas.base.injection.module

import android.content.Context
import com.mavolas.base.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Author by Andy
 * Date on 2019-01-20.
 */
@Module
class AppModule(private val context:BaseApplication) {

    @Provides
    @Singleton
    fun providesContext():Context{

        return context;
    }


}