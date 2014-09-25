package com.owz.furry.user.service;

import com.owz.furry.module.po.User;
import com.owz.furry.user.dao.IUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ouyangkongtong Created on 2014/9/25, 0:11
 * @version $Id$
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User queryByUserEmai(String userEmail) {
        return userDao.queryByUserEmai(userEmail);
    }
}
