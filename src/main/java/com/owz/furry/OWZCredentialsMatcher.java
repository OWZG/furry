package com.owz.furry;

import com.owz.furry.common.utils.EncryptionUtil;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * Author: kongtong.ouyang
 * Date: 2014/8/4, 18:07
 */
public class OWZCredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        return this.equals(usernamePasswordToken.getPassword(), info.getCredentials());
    }


    protected boolean equals(char[] tokenCredentials, Object accountCredentials) {

        String rawPass = new String(tokenCredentials);
        String encodedPass = (String) accountCredentials;

        return EncryptionUtil.matches(rawPass, encodedPass);
    }
}
