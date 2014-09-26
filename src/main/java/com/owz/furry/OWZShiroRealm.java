package com.owz.furry;

import com.owz.furry.module.po.User;
import com.owz.furry.user.service.UserServiceImpl;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: kongtong.ouyang
 * Date: 2014/7/24, 20:44
 */
@Component
public class OWZShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 认证
     *
     * @param token
     * @return AuthenticationInfo
     * @throws org.apache.shiro.authc.AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String userName = usernamePasswordToken.getUsername();
        char[] password = usernamePasswordToken.getPassword();

//        if (StringUtils.isBlank(userName)) throw new UnknownAccountException();

        User user = userService.queryByUserEmail(userName);
        if (null == user) throw new UnknownAccountException();

//        if (!user.getUserPassword().equals(new String(password))) throw new IncorrectCredentialsException();

        return new SimpleAuthenticationInfo(userName, user.getUserPassword(), getName());
    }

    /**
     * 授权
     *
     * @param principals
     * @return AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        principals.fromRealm(getName().intern());
        return null;
    }


    public static void main(String[] args) {

        System.out.println(new Sha512Hash("1111").toString());
//        System.out.println(Password.toString());
    }
}
