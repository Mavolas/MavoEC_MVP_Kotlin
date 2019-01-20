package com.mavolas.base.ext

import android.arch.lifecycle.Lifecycle
import android.view.View
import com.mavolas.base.data.protocol.BaseResp
import com.mavolas.base.rx.BaseFunc
import com.mavolas.base.rx.BaseFuncBoolean
import com.mavolas.base.rx.BaseSubscriber
import com.trello.rxlifecycle.LifecycleProvider
import com.trello.rxlifecycle.kotlin.bindToLifecycle
import rx.Observable
import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Author by Andy
 * Date on 2019-01-16.
 */
fun <T> Observable<T>.execute(subscriber:BaseSubscriber<T>,lifecycleProvider: LifecycleProvider<*>) {

    this.observeOn(AndroidSchedulers.mainThread())
            .compose(lifecycleProvider.bindToLifecycle())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)

}

fun <T> Observable<BaseResp<T>>.convert(): Observable<T>{
    return this.flatMap(BaseFunc())
}

fun <T> Observable<BaseResp<T>>.convertBoolean(): Observable<Boolean>{
    return this.flatMap(BaseFuncBoolean())
}

fun View.onClick(listener:View.OnClickListener){
    this.setOnClickListener(listener)
}

fun View.onClick(method:()-> Unit){
    this.setOnClickListener{method()}
}