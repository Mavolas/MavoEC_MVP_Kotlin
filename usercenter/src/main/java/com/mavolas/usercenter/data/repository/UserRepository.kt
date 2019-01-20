package com.mavolas.usercenter.data.repository

import com.mavolas.base.data.net.RetrofitFactory
import com.mavolas.base.data.protocol.BaseResp
import com.mavolas.usercenter.data.api.UserApi
import com.mavolas.usercenter.data.protocol.RegisterReq
import rx.Observable
import javax.inject.Inject


/**
 * Author by Andy
 * Date on 2019-01-16.
 */
class UserRepository @Inject constructor() {

    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseResp<String>> {

        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterReq(mobile,pwd,verifyCode))

    }


}