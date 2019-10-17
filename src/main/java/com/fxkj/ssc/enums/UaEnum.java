/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 注册平台枚举
 * @author jerry
 * @version $Id: UaEnum.java, v 0.1 2017年7月17日 下午2:14:35 jerry Exp $
 */
public enum UaEnum {

    COMPULTER(0, "pc"),
    ANDROID(1, "android"),
    IOS(2, "ios"),
    WEB(3, "web"),
    WAP(4, "wap"),
    FLASH(5, "flash"),

    ;

    private Integer code;
    private String  desc;

    private UaEnum(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * 根据名称获取平台code码
     * 
     * @param name
     * @return
     */
    public static Integer getCodeByName(String name) {

        Integer code = null;

        for (UaEnum uaenum : UaEnum.values()) {
            if (StringUtils.equals(uaenum.getDesc(), name.toLowerCase())) {
                return uaenum.getCode();
            }
        }

        return code;

    }

    /**
     * 根据名称获取平台code码
     * 
     * @param name
     * @return
     */
    public static String getNameByCode(Integer name) {

        String code = null;

        for (UaEnum uaenum : UaEnum.values()) {
            if (uaenum.getCode() == name) {
                return uaenum.getDesc();
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
