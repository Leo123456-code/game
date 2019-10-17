package com.fxkj.ssc.enums.bjl;

/**
 * Created by frank on 2018/9/25.
 */
public enum BjlTransferEnum {
    SYS_TO_BAC(1, "系统转百家乐"),
    BAC_TO_SYS(2, "百家乐转系统"),

    ;

    private Integer code;
    private String  desc;

    private BjlTransferEnum(Integer code, String desc) {
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
