package com.fxkj.ssc.enums;

/**
 * 用户登陆监听类型枚举
 */
public enum UserLoginListenTypeEnum {


    OTHER_PLACE(0, "异地登陆"),
    COUNTRY_PLACE(1, "跨国登陆"),
    LOGOUT(2, "账号异常登出"),;

    ;

    private Integer code;
    private String  desc;

    private UserLoginListenTypeEnum(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
