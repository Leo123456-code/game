/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums.account;

/**
 * 
 * @author jerry
 * @version $Id: AccountStatusEnum.java, v 0.1 2017年7月18日 上午10:05:56 jerry Exp $
 */
public enum EchartsSelectTypeEnum {

    tx("提现"),
    tz("投注"),
    cz("充值"),
    fd("返点"),
    xz("新增");

    private String desc;

    private EchartsSelectTypeEnum(String desc) {
        this.desc = desc;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     * 
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     * 
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
