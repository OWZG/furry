/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.furry.oauth2.controller;

import org.apache.oltu.oauth2.as.request.OAuthAuthzRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kongtong.ouyang created on 2014/9/26, 16:36
 * @version $Id$
 */
@Controller
public class AuthorizeController {

    private Logger logger = LoggerFactory.getLogger(AuthorizeController.class);

    @RequestMapping()
    public Object authorize(HttpServletRequest request, HttpServletResponse response){
        try {
            OAuthAuthzRequest oAuthAuthzRequest = new OAuthAuthzRequest(request);

//            OAuthResponse oAuthResponse = OAuthASResponse.errorResponse(302).setError("");
        } catch (OAuthSystemException e) {
            logger.error("", e);
        } catch (OAuthProblemException e) {
            logger.error("", e);
        }



        return null;
    }
}
