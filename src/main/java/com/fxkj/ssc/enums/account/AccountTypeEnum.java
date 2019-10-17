/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums.account;

import org.apache.commons.lang3.StringUtils;

/**
 * 账户类型
 * @author jerry
 * @version $Id: AccountTypeEnum.java, v 0.1 2017年7月18日 上午10:01:08 jerry Exp $
 */
public enum AccountTypeEnum {

    BALANCE_ACCOUNT(0, "余额账户"),
    BONUS_ACCOUNT(1, "分红账户"),
    REBATE_ACCOUNT(2, "返点账户"),
    ACTIVITY_ACCOUNT(3, "活动账户"),

    ;

    private Integer code;
    private String  desc;

    private AccountTypeEnum(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
    * 根据名称获取账户类型code码
    * 
    * @param name
    * @return
    */
    public static Integer getCodeByName(String name) {

        Integer code = null;

        for (AccountTypeEnum uaenum : AccountTypeEnum.values()) {
            if (StringUtils.equals(uaenum.name(), name)) {
                return uaenum.getCode();
            }
        }

        return code;

    }

    /**
    * Getter method for property <tt>code</tt>.
    * 
    * @return property value of code
    */
    public Integer getCode() {
        return code;
    }

    /**
    * Setter method for property <tt>code</tt>.
    * 
    * @param code value to be assigned to property code
    */
    public void setCode(Integer code) {
        this.code = code;
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
