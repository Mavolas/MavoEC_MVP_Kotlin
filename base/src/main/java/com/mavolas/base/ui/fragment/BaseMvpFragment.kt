package com.mavolas.base.ui.fragment

import android.os.Bundle
import com.mavolas.base.common.BaseApplication
import com.mavolas.base.injection.component.ActivityComponent
import com.mavolas.base.injection.component.DaggerActivityComponent
import com.mavolas.base.injection.module.ActivityModule
import com.mavolas.base.injection.module.LifecycleProviderModule
import com.mavolas.base.presenter.BasePresenter
import com.mavolas.base.presenter.view.BaseView
import com.mavolas.base.ui.activity.BaseActivity
import javax.inject.Inject

/**
 * Author by Andy
 * Date on 2018/12/26.
 */
open abstract class BaseMvpFragment<T : BasePresenter<*>> : BaseFragment(), BaseView {

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()

        injectComponent()
    }

    private fun initActivityInjection() {

        activityComponent = DaggerActivityComponent.builder().appComponent((activity.application as BaseApplication).appComponent)
                .activityModule(ActivityModule(activity))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()
    }

    abstract fun injectComponent();

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    lateinit var mPresenter: T;
}