package com.fxkj.ssc.enums.venice;

/**
 * Created by frank on 2018/7/23.
 */
public enum OrderStatuEnum {
	UNKNOWN(-3, "http请求响应状态未知"),
    LOCKED(-2, "http请求无响应"),
    FAILED(-1, "失败"),
    SUCCESS(1, "成功"),
    ;
    private int    code;
    private String desc;

    private OrderStatuEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static String getDesc(int code) {
        for (OrderStatuEnum c : OrderStatuEnum.values()) {
            if (c.getCode() == code) {
                return c.desc;
            }
        }
        return null;
    }
}
