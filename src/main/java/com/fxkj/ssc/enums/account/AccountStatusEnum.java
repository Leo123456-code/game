/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums.account;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author jerry
 * @version $Id: AccountStatusEnum.java, v 0.1 2017年7月18日 上午10:05:56 jerry Exp $
 */
public enum AccountStatusEnum {

    LOGOF(-1, "注销"),
    NORMAL(0, "正常"),
    FREEZE(1, "冻结"),
    LIMIT_WITHDRAWALS(2, "限制取款"),

    ;

    private Integer code;
    private String  desc;

    private AccountStatusEnum(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
    * 根据名称获取账户状态code码
    * 
    * @param name
    * @return
    */
    public static Integer getCodeByName(String name) {

        Integer code = null;

        for (AccountStatusEnum uaenum : AccountStatusEnum.values()) {
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
