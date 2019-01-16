package com.mavolas.base.ext

import com.mavolas.base.rx.BaseSubscriber
import rx.Observable
import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Author by Andy
 * Date on 2019-01-16.
 */
fun <T> Observable<T>.execute(subscriber:BaseSubscriber<T>) {

    this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)

}