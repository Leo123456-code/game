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
public enum UPayModeEnum {

    WY(0, "网银支付"),
    ZFB(1, "支付宝支付"),
    WX(2, "微信支付"),
    YL(5, "银联支付"),
    QQ(6, "QQ支付"),
    JD(7, "京东支付");

    private int    payMode;
    private String desc;

    private UPayModeEnum(int payMode, String desc) {
        this.payMode = payMode;
        this.desc = desc;
    }

    /**
     * @return the payMode
     */
    public int getPayMode() {
        return payMode;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    public static String getDesc(int payMode) {
        for (UPayModeEnum c : UPayModeEnum.values()) {
            if (c.getPayMode() == payMode) {
                return c.desc;
            }
        }
        return null;
    }

    public static String getName(int payMode) {
        for (UPayModeEnum c : UPayModeEnum.values()) {
            if (c.getPayMode() == payMode) {
                return c.toString();
            }
        }
        return null;
    }
}
