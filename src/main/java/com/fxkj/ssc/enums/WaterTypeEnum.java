/**
 *
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 用户返水枚举 （返水类型：0 彩票返水、1 快乐彩返水、2 百家乐真人返水、3 百家乐体育返水、4 百家乐电子返水、5 百家乐彩票返水）
 * @author jerry
 * @version $Id: WaterTypeEnum.java, v 0.1 2018年9月25日 下午3:30:26 jerry Exp $
 */
public enum WaterTypeEnum {

    BJL_ZR_WATER(2, "百家乐真人返水"),
    BJL_TY_WATER(3, "百家乐体育返水"),
    BJL_DZ_WATER(4, "百家乐电子返水"),
    BJL_CP_WATER(5, "百家乐彩票返水"),
    VENICE_GAME_WATER(10, "Venice游戏返水")
    ;

    private Integer code;
    private String  desc;

    private WaterTypeEnum(Integer code, String desc) {
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
