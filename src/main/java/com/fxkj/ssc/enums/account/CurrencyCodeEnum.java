package com.fxkj.ssc.enums.account;

/**
 * 币种
 * 
 * @author jerry
 * @version $Id: CurrencyCodeEnum.java, v 0.1 2017年9月2日 下午3:17:36 jerry Exp $
 */
public enum CurrencyCodeEnum {

    RMB(0, "人民币"),
    CNY(2, "人民币"),
    BTB(1, "比特币"),

    ;

    private Integer code;
    private String  desc;

    private CurrencyCodeEnum(Integer code, String desc) {
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
