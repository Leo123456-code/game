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
public enum UserTypeEnum {

    //数据库状态
    MEMBER(0, "会员"),
    VISITOR(-1, "游客"),
    AGENT(1, "代理"),

    //系统状态
    TOP_AGENT(2, "总代理"),

    ;

    private Integer code;
    private String  desc;

    private UserTypeEnum(Integer code, String desc) {
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
