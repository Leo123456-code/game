/**
 * ssc
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 
 * @author karl
 * @version $Id: UserLoginEnum.java, v 0.1 2017年7月18日 下午8:04:12 arvin Exp $
 */
public enum UPayEnum {

    MKT("秒卡通"),
    TF("通付"),
    SDK("SDK"),
    KY("快银"),
    KH("快狐");

    private UPayEnum(String desc) {
    }

    public static boolean contains(String channelCode) {
        for (UPayEnum c : UPayEnum.values()) {
            if (c.toString().equals(channelCode)) {
                return true;
            }
        }
        return false;
    }
}
