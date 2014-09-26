/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.furry.module.enums;

import com.owz.furry.common.mybatis.EnumTrait;

/**
 * @author kongtong.ouyang created on 2014/9/25, 18:33
 * @version $Id$
 */
public enum UserStatusType implements EnumTrait {

    INACTIVE(1, "未激活"),
    ACTIVATED(2, "已激活");

    private int code;
    private String text;

    private UserStatusType(int code, String text) {
        this.code = code;
        this.text = text;
    }

    @Override
    public int getCode() {
        return 0;
    }

    public String getText() {
        return text;
    }
}
