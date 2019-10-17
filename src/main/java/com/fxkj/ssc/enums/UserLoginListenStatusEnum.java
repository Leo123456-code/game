package com.fxkj.ssc.enums;

/**
 * 用户登陆监听状态枚举 状态：0 正常登陆、1 未处理 、 2 异常登陆
 */
public enum UserLoginListenStatusEnum {


    SUCCESS(0, "正常登陆"),
    UNTREATED(1, "未处理"),
    ERROR(2, "异常登陆"),;

    ;

    private Integer code;
    private String  desc;

    private UserLoginListenStatusEnum(Integer code, String desc) {
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
