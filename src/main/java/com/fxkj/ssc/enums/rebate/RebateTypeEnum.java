/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums.rebate;

/**
 * 返点类型
 * @author jerry
 * @version $Id: RebateTypeEnum.java, v 0.1 2017年7月20日 上午9:32:18 jerry Exp $
 */
public enum RebateTypeEnum {

    LOTTERY(0, "彩票返点"),
    BJL(2, "百家乐返点"),
    KLC(1, "快乐彩返点"),

    ;

    private int    code;
    private String desc;

    private RebateTypeEnum(int code, String desc) {
        this.desc = desc;
        this.setCode(code);
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
