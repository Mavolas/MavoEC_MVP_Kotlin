package com.mavolas.usercenter.injection.component

import com.mavolas.base.injection.PerComponentScope
import com.mavolas.base.injection.component.ActivityComponent
import com.mavolas.base.injection.component.AppComponent
import com.mavolas.usercenter.RegisterActivity
import com.mavolas.usercenter.injection.module.UserModule
import dagger.Component

/**
 * Author by Andy
 * Date on 2019-01-20.
 */
@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class),modules = arrayOf(UserModule::class))
interface UserComponent {

    fun inject(activit:RegisterActivity)
}