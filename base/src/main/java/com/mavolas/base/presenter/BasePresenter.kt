package com.mavolas.base.presenter

import com.mavolas.base.presenter.view.BaseView
import com.trello.rxlifecycle.LifecycleProvider
import javax.inject.Inject

/**
 * Author by Andy
 * Date on 2018/12/26.
 */
open class BasePresenter<T:BaseView> {

    lateinit var mView:T

    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

}