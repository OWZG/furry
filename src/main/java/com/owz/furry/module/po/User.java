/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.furry.module.po;

import com.owz.furry.module.enums.UserStatusType;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author kongtong.ouyang created on 2014/9/25, 18:14
 * @version $Id$
 */
public class User {

    private long userId;

    private String userEmail;

    private String userPassword;

    private UserStatusType status;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public UserStatusType getStatus() {
        return status;
    }

    public void setStatus(UserStatusType status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
