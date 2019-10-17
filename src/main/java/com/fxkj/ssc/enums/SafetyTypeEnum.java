/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 认证类型
 * @author jerry
 * @version $Id: SafetyTypeEnum.java, v 0.1 2017年7月24日 下午2:58:12 jerry Exp $
 */
public enum SafetyTypeEnum {

    QUESTION(0, "问题答案"),
    GOOGLE(1, "Google验证"),
    PASSWORD(2, "资金密码"),
    EMAIL(3, "邮箱验证"),
    PHONE(4, "手机验证"),
    QQ(5, "QQ验证"),
    BANKUSERNAME(6, "银行卡姓名"),
    ALIPAY(7, "支付宝认证"),

    ;

    private Integer code;
    private String  desc;

    /**
     * 根据名称获取平台code码
     * 
     * @param name
     * @return
     */
    public static String getDescByCode(Integer code) {

        String safeEnum = null;

        for (SafetyTypeEnum uaenum : SafetyTypeEnum.values()) {
            if (uaenum.code.intValue() == code.intValue()) {
                return uaenum.getDesc();
            }
        }

        return safeEnum;

    }

    private SafetyTypeEnum(Integer code, String desc) {
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
