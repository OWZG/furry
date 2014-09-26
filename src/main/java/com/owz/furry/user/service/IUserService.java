package com.owz.furry.user.service;

import com.owz.furry.module.po.User;

/**
 * @author ouyangkongtong Created on 2014/9/25, 0:11
 * @version $Id$
 */
public interface IUserService {

    User queryByUserEmail(String userEmail);
}
