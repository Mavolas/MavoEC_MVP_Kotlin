package com.mavolas.base.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.mavolas.base.R
import kotlinx.android.synthetic.main.layout_header_bar.view.*
import org.jetbrains.anko.attr

/**
 * Author by Andy
 * Date on 2019-01-25.
 */
class HeaderBar @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private var isShowBack = true
    private var titleText: String? = null
    private var titleRight: String? = null


    init {
        var typeArray = context.obtainStyledAttributes(attrs, R.styleable.HeaderBar)
        isShowBack = typeArray.getBoolean(R.styleable.HeaderBar_isShowBack, true)
        titleText = typeArray.getString(R.styleable.HeaderBar_titleText)
        titleRight = typeArray.getString(R.styleable.HeaderBar_rightText)

        initView()
        typeArray.recycle()
    }

    private fun initView() {

        View.inflate(context, R.layout.layout_header_bar, this)
        mLeftIv.visibility = if (isShowBack) View.VISIBLE else View.GONE

        titleText?.let {
            mTitleTv.text = it
        }
        titleRight?.let {
            mRightTv.text = it
        }

    }
}