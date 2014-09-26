package com.owz.furry.user.service;

import com.owz.furry.module.po.User;
import com.owz.furry.user.dao.IUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ouyangkongtong Created on 2014/9/25, 0:11
 * @version $Id$
 */
@Service
public class UserServiceImpl implements IUserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private IUserDao userDao;

    @Override
    public User queryByUserEmail(String userEmail) {
        return userDao.queryByUserEmail(userEmail);
    }
}
