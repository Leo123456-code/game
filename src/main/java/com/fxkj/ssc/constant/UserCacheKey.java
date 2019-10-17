/**
 * ssc
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.constant;

/**
 * 
 * @author arvin
 * @version $Id: UserCacheKey.java, v 0.1 2017年7月19日 下午2:43:54 arvin Exp $
 */
public class UserCacheKey {

    public static String signUp(Long userId) {
        return  "SIGN_UP_" + userId;
    }
}
