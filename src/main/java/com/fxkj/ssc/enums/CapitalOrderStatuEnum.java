package com.fxkj.ssc.enums;

/**
 * Created by frank on 2018/7/23.
 */
public enum CapitalOrderStatuEnum {
    DELETE(-5,"删除"),
    LOCKED(-4,"锁定"),
    FAILED(-3,"失败"),
    REFUSE(-2,"拒绝"),
    CANCEL(-1,"取消"),
    SUBMIT(0,"已提交"),
    PROCESSING(1,"处理中"),
    WAIT_REVIEW(2,"待审核"),
    REVIEWING(3,"审核中"),
    REVIEW_OK(4,"审核通过"),
    SUCCESS(5,"成功"),
    WITH_CONSENT(6, "提款同意"),
    ;
    private int    code;
    private String desc;

    private CapitalOrderStatuEnum(int code, String desc) {
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

    public static String getDesc(int code){
        for (CapitalOrderStatuEnum c:CapitalOrderStatuEnum.values()) {
            if(c.getCode() == code){
                return c.desc;
            }
        }
        return null;
    }
}
