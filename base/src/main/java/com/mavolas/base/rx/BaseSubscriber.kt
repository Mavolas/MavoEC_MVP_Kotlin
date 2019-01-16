package com.mavolas.base.rx

import rx.Subscriber

/**
 * Author by Andy
 * Date on 2019-01-16.
 */
open class BaseSubscriber<T> :Subscriber<T>() {
    override fun onNext(t: T) {

    }

    override fun onCompleted() {

    }

    override fun onError(e: Throwable?) {

    }
}