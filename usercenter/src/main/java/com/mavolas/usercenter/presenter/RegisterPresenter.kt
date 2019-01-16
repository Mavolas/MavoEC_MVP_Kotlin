package com.mavolas.usercenter.presenter

import com.mavolas.base.ext.execute
import com.mavolas.base.presenter.BasePresenter
import com.mavolas.base.rx.BaseSubscriber
import com.mavolas.usercenter.presenter.view.RegisterView
import com.mavolas.usercenter.service.impl.UserServiceImpl
import rx.Scheduler
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Author by Andy
 * Date on 2018/12/26.
 */
class RegisterPresenter :BasePresenter<RegisterView>() {

    fun register(mobile: String, pwd: String, verifyCode: String) {

        /**
         * 业务
         */
        val userService = UserServiceImpl()
        userService.register(mobile,pwd,verifyCode)
                .execute(object :BaseSubscriber<Boolean>(){

                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })

    }
}