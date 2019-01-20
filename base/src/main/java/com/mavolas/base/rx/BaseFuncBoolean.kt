package com.mavolas.base.rx

import com.mavolas.base.data.protocol.BaseResp
import rx.Observable
import rx.functions.Func1

/**
 * Author by Andy
 * Date on 2019-01-20.
 */
class BaseFuncBoolean<T> : Func1<BaseResp<T>, Observable<Boolean>> {

    override fun call(t: BaseResp<T>): Observable<Boolean> {

        if (t.status != 0) {
            return Observable.error(BaseException(t.status, t.message))

        }
        return Observable.just(true)
    }

}