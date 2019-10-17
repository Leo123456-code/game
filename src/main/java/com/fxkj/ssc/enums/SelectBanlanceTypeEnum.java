/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 用户类型
 * @author jerry
 * @version $Id: UserTypeEnum.java, v 0.1 2017年7月17日 下午2:46:58 jerry Exp $
 */
public enum SelectBanlanceTypeEnum {

    SELF(0, "自己"),
    CHILD(1, "直属下级"),
    SOMEONE(2, "某个下级"),
    ALL(3, "所有下级");

    private Integer code;
    private String  desc;

    private SelectBanlanceTypeEnum(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
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
