package com.mavolas.base.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mavolas.base.common.AppManager
import com.trello.rxlifecycle.components.support.RxAppCompatActivity


/**
 * Author by Andy
 * Date on 2018/12/26.
 */
open class BaseActivity : RxAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppManager.instance.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppManager.instance.finishActivity(this)
    }
}