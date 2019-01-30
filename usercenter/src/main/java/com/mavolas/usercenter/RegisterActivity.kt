package com.mavolas.usercenter

import android.os.Bundle
import com.mavolas.base.common.AppManager
import com.mavolas.base.ui.activity.BaseMvpActivity
import com.mavolas.usercenter.injection.component.DaggerUserComponent
import com.mavolas.usercenter.injection.module.UserModule
import com.mavolas.usercenter.presenter.RegisterPresenter
import com.mavolas.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast


/**
 * Author by Andy
 * Date on 2018/12/26.
 */
class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    private var pressTime: Long = 0;

    override fun injectComponent() {
        DaggerUserComponent.builder().activityComponent(activityComponent).userModule(UserModule()).build().inject(this)
        mPresenter.mView = this;

    }

    override fun onRegisterResult(result: String) {

        toast(result)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mRegisterBtn.setOnClickListener {
            mPresenter.register(mPhone.text.toString(), mPassword.text.toString(), mVerifyCode.text.toString());
        }
    }

    override fun onBackPressed() {

        val currentTime = System.currentTimeMillis()
        if (currentTime - pressTime > 2000) {
            toast("再按一次退出程序")
            pressTime = currentTime;
        } else {
            AppManager.instance.exitApp(applicationContext)
        }
    }
}