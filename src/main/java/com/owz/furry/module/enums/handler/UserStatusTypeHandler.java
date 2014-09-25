/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.furry.module.enums.handler;

import com.owz.furry.common.mybatis.EnumType;
import com.owz.furry.common.mybatis.EnumTypeHandler;
import com.owz.furry.module.enums.UserStatusType;

/**
 * @author kongtong.ouyang created on 2014/9/25, 18:34
 * @version $Id$
 */
@EnumType(enumClass = UserStatusType.class, jdbcType = 1)
public class UserStatusTypeHandler extends EnumTypeHandler {
}
