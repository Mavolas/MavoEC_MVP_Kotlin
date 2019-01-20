package com.mavolas.usercenter.injection.module

import com.mavolas.usercenter.service.UserService
import com.mavolas.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Author by Andy
 * Date on 2019-01-20.
 */
@Module
class UserModule {

    @Provides
    fun providesUserService(service: UserServiceImpl):UserService{
        return service;
    }
}