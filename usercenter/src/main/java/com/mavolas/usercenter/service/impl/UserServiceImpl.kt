package com.mavolas.usercenter.service.impl

import com.mavolas.base.data.protocol.BaseResp
import com.mavolas.base.rx.BaseException
import com.mavolas.base.rx.BaseFuncBoolean
import com.mavolas.usercenter.data.repository.UserRepository
import com.mavolas.usercenter.service.UserService
import rx.Observable
import rx.functions.Func1
import javax.inject.Inject


/**
 * Author by Andy
 * Date on 2019-01-16.
 */
class UserServiceImpl @Inject constructor() : UserService {

    @Inject
    lateinit var repository: UserRepository

    override fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean> {


        return repository.register(mobile,pwd,verifyCode)
                .flatMap(BaseFuncBoolean());

    }

}