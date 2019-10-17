package com.fxkj.ssc.enums.venice;

/**
 * Created by frank on 2018/7/23.
 */
public enum OrderTypeEnum {
    RECHARGE(1, "充值"),
    WITHDRAW(2, "提现"),
    ;
    private int    code;
    private String desc;

    private OrderTypeEnum(int code, String desc) {
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
        for (OrderTypeEnum c : OrderTypeEnum.values()) {
            if (c.getCode() == code) {
                return c.desc;
            }
        }
        return null;
    }
}
