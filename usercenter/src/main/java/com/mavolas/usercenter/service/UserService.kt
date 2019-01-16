package com.mavolas.usercenter.service

import rx.Observable


/**
 * Author by Andy
 * Date on 2019-01-16.
 */
interface UserService {

    fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean>
}