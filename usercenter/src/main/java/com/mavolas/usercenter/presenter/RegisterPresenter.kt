package com.mavolas.usercenter.presenter

import com.mavolas.base.ext.execute
import com.mavolas.base.presenter.BasePresenter
import com.mavolas.base.rx.BaseSubscriber
import com.mavolas.usercenter.presenter.view.RegisterView
import com.mavolas.usercenter.service.UserService
import com.mavolas.usercenter.service.impl.UserServiceImpl
import javax.inject.Inject

/**
 * Author by Andy
 * Date on 2018/12/26.
 */
class RegisterPresenter @Inject constructor() :BasePresenter<RegisterView>() {


    @Inject
    lateinit var userService: UserService

    fun register(mobile: String, pwd: String, verifyCode: String) {

        /**
         * 业务
         */
        userService.register(mobile,pwd,verifyCode)
                .execute(object :BaseSubscriber<Boolean>(){

                    override fun onNext(t: Boolean) {
                        if (t)
                        mView.onRegisterResult("注冊成功")
                    }
                },lifecycleProvider)

    }
}