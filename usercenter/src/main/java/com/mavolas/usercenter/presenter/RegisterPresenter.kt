package com.mavolas.usercenter.presenter

import com.mavolas.base.presenter.BasePresenter
import com.mavolas.usercenter.presenter.view.RegisterView

/**
 * Author by Andy
 * Date on 2018/12/26.
 */
class RegisterPresenter :BasePresenter<RegisterView>() {

    fun register(mobile: String, pwd: String, verifyCode: String) {

        /**
         * 业务
         */
        mView.onRegisterResult(true);
    }
}