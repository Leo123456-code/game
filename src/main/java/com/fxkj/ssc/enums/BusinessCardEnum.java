package com.fxkj.ssc.enums;

/**
 * 分销商卡枚举
 * 
 * @author jerry
 * @version $Id: BusinessCardEnum.java, v 0.1 2017年9月7日 下午3:35:50 jerry Exp $
 */
public enum BusinessCardEnum {

    TRUE(1, "是否分销商卡：0 否、1 是"),
    FALSE(0, "是否分销商卡：0 否、1 是"),

    ;

    private Integer code;
    private String  desc;

    private BusinessCardEnum(Integer code, String desc) {
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
