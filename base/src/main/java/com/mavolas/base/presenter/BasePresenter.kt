package com.mavolas.base.presenter

import com.mavolas.base.presenter.view.BaseView

/**
 * Author by Andy
 * Date on 2018/12/26.
 */
open class BasePresenter<T:BaseView> {

    lateinit var mView:T

}