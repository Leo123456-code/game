package com.fxkj.ssc.enums;

/**
 * 代理角色等级枚举
 * 
 * @author jerry
 * @version $Id: RoleEnum.java, v 0.1 2017年8月10日 下午5:00:56 jerry Exp $
 */
public enum RoleEnum {

    NORMAL_ROLE(0, "普通角色"),
    PROXY_ROLE(1, "代理角色"),

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

        for (RoleEnum uaenum : RoleEnum.values()) {
            if (uaenum.code.intValue() == code.intValue()) {
                return uaenum.getDesc();
            }
        }

        return safeEnum;

    }

    private RoleEnum(Integer code, String desc) {
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
