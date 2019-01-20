package com.mavolas.base.rx

import com.mavolas.base.data.protocol.BaseResp
import rx.Observable
import rx.functions.Func1

/**
 * Author by Andy
 * Date on 2019-01-20.
 */
class BaseFunc<T> : Func1<BaseResp<T>, Observable<T>> {

    override fun call(t: BaseResp<T>): Observable<T> {

        if (t.status != 0) {
            return Observable.error(BaseException(t.status, t.message))

        }
        return Observable.just(t.data)
    }

}