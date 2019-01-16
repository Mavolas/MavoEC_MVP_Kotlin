package com.mavolas.base.data.protocol

/**
 * Author by Andy
 * Date on 2019-01-16.
 */
class BaseResp<out T>(val status:Int,val message :String, val data:T)
