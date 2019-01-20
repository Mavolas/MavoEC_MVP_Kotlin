package com.mavolas.usercenter

import android.os.Bundle
import com.mavolas.base.ui.activity.BaseMvpActivity
import com.mavolas.usercenter.presenter.RegisterPresenter
import com.mavolas.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast


/**
 * Author by Andy
 * Date on 2018/12/26.
 */
class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {
    override fun onRegisterResult(result: Boolean) {

        toast("success")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisterPresenter();
        mPresenter.mView = this;

        mRegisterBtn.setOnClickListener{
            mPresenter.register(mPhone.text.toString(),mPassword.text.toString(),mVerifyCode.text.toString());
        }
    }


}