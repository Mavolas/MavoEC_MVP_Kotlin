package com.mavolas.base.ui.activity

import com.mavolas.base.presenter.BasePresenter
import com.mavolas.base.presenter.view.BaseView

/**
 * Author by Andy
 * Date on 2018/12/26.
 */
open class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(),BaseView {

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    lateinit var mPresenter: T;
}