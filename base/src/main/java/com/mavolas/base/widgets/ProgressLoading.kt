package com.mavolas.base.widgets

import android.app.Dialog
import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.AnimationDrawable
import android.view.Gravity
import android.widget.ImageView
import com.mavolas.base.R
import org.jetbrains.anko.find

/**
 * Author by Andy
 * Date on 2019-01-25.
 */
class ProgressLoading(context: Context, theme: Int) : Dialog(context, theme) {

    companion object {
        private lateinit var mDialog: ProgressLoading
        private var animationDrawable: AnimationDrawable? = null

        fun create(context: Context) {
            mDialog = ProgressLoading(context, R.style.LightProgressDialog)
            mDialog.setContentView(R.layout.progress_dialog)
            mDialog.setCancelable(true)
            mDialog.setCanceledOnTouchOutside(false)
            mDialog.window.attributes.gravity = Gravity.CENTER

            val lp = mDialog.window.attributes
            lp.dimAmount = 0.2f
            mDialog.window.attributes = lp

            val loadingView = mDialog.find<ImageView>(R.id.iv_loading)

            animationDrawable = loadingView.background as AnimationDrawable

        }
    }

    fun showLoading() {
        super.show()
        animationDrawable?.start()
    }

    fun hideLoading() {
        super.dismiss()
        animationDrawable?.stop()
    }


}