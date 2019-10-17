package com.fxkj.ssc.utils.http;

import java.util.UUID;

import javax.servlet.http.Cookie;

import com.fxkj.ssc.constant.TokenIdRule;
import com.fxkj.ssc.constant.TokenPlatFormKey;
import com.fxkj.ssc.enums.VisitModel;


/**
 * 作者: Jack
 * 时间: 2019年10月4日下午1:34:10
 * 说明: token工具类
 *
 */
public class TokenUtils {

    public static String getTokenId(Cookie[] cookies, VisitModel model) {

        if (cookies != null && cookies.length > 0) {

            for (Cookie cookie : cookies) {

                String name = cookie.getName();

                if (name.equals(getTokenKey(model))) {

                    return cookie.getValue();
                }
            }

        } else {

            return null;

        }

        return null;
    }

    public static String generatorTokenId(Long userId, VisitModel model) {

        String tokenId = null;

        if (userId == null) {

            tokenId = getTokenKey(model) + TokenIdRule.TOKEN_JOINT + TokenIdRule.DEFAULT_USER + TokenIdRule.TOKEN_JOINT + UUID.randomUUID().toString();

        } else {

            tokenId = getTokenKey(model) + TokenIdRule.TOKEN_JOINT + userId + TokenIdRule.TOKEN_JOINT + UUID.randomUUID().toString();
        }

        return tokenId;
    }

    public static String getTokenKey(VisitModel model) {

    	String platform = TokenPlatFormKey.TOKEN_PLAT_FORM_KEY;
    	
        String tokenKey = model.getDesc() + TokenIdRule.TOKEN_JOINT + TokenIdRule.TOKEN_PREFIX + TokenIdRule.TOKEN_JOINT + platform;

        return tokenKey;

    }
}
