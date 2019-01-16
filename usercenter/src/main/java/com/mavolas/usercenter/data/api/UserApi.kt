package com.mavolas.usercenter.data.api

import com.mavolas.base.data.protocol.BaseResp
import com.mavolas.usercenter.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * Author by Andy
 * Date on 2019-01-16.
 */
interface UserApi {

    @POST("userCenter/register")
    fun register(@Body reg: RegisterReq): Observable<BaseResp<String>>
}