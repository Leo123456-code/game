package com.fxkj.ssc.enums;

/**
 * @description: 用户登陆日志枚举 状态：1 成功、2 失败、3 退出
 * @author: jerry
 * @version: $Id: UserLogStateEnum, v 0.1  2018年12月24日 17:08
 */
public enum UserLogStateEnum {


    SUCCESS(1, "登陆成功"),
    ERROR(2, "登陆失败"),
    LOGOUT(3, "用户登出"),

    ;

    private Integer code;
    private String  desc;

    private UserLogStateEnum(Integer code, String desc) {
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


