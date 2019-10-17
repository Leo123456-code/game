/**
 *
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 返点枚举（返点类型：0 彩票返点、1 快乐彩返点、2 百家乐返点）
 * @author jerry
 * @version $Id: RabateTypeEnum.java, v 0.1 2018年9月25日 下午3:16:48 jerry Exp $
 */
public enum RabateTypeEnum {

    CP_REBATE(0, "彩票返点"),
    KLC_REBATE(1, "快乐彩返点"),
    BJL_REBATE(2, "百家乐返点"),
    VENICE_REBATE(3,"电子游戏返点")
    ;

    private Integer code;
    private String  desc;

    private RabateTypeEnum(Integer code, String desc) {
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
