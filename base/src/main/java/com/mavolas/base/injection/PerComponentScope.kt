package com.mavolas.base.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import javax.inject.Scope
import java.lang.annotation.RetentionPolicy.RUNTIME

/**
 * Author by Andy
 * Date on 2019-01-20.
 */

@Scope
@Documented
@Retention(RUNTIME)
annotation class PerComponentScope