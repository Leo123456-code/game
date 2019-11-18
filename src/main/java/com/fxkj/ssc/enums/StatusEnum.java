/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 状态枚举 状态：0 有效、1 注销、2 黑名单、3 禁用、4 永久冻结
 * @author jerry
 * @version $Id: Status.java, v 0.1 2017年7月17日 下午2:40:19 jerry Exp $
 */
public enum StatusEnum {

    VALID(0, "有效"),
    CANCLE(1, "注销"),
    BLACKLIST(2, "加入黑名单"),
    JIN_YONG(3, "禁用"),
    DONG_JIE(4, "永久冻结"),
	PENDING_REVIEW(5, "待审核"),
    ;

    private Integer code;
    private String  desc;

    private StatusEnum(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * 根据code获取平台desc
     *
     * @param code
     * @return
     */
    public static String getDecByName(Integer code) {

        String desc = null;

        for (StatusEnum uaenum : StatusEnum.values()) {
            if (uaenum.getCode().intValue() == code.intValue()) {
                return uaenum.getDesc();
            }
        }

        return desc;

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
