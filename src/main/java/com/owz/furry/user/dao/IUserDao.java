package com.owz.furry.user.dao;


import com.owz.furry.module.po.User;
import org.springframework.stereotype.Repository;

/**
 * @author ouyangkongtong Created on 2014/9/25, 0:29
 * @version $Id$
 */
@Repository
public interface IUserDao {

    User queryByUserEmail(String userEmail);
}
