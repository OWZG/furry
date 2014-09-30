package com.owz.furry.user.service;

import com.owz.furry.SpringTest;
import com.owz.furry.module.po.User;
import com.owz.furry.user.dao.IUserDao;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author ouyangkongtong Created on 2014/9/24, 23:45
 * @version $Id$
 */
public class UserServiceImplTest extends SpringTest {

    @Resource
    private IUserDao userDao;

    @Test
    public void queryByUserEmail(){
        User user = userDao.queryByUserEmail("1");
        System.out.println(user);
    }
}
