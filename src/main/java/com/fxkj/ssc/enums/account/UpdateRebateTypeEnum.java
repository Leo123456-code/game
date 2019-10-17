/**
 *
 * Copyright (c) 2017-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums.account;

/**
 * 
 * @author chuck
 * 
 */
public enum UpdateRebateTypeEnum {

    ADD("加"),
    SUB("减");

    private String desc;

    private UpdateRebateTypeEnum(String desc) {
        this.desc = desc;
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
