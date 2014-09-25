/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.furry.common.mybatis;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author kongtong.ouyang created on 2014/8/13, 22:23
 * @version $Id$
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EnumType {

    Class enumClass();

    int jdbcType();
}
