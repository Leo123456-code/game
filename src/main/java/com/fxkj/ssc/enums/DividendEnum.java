/**
 *
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 是否认证通过：0 否、1 是
 * @author jerry
 * @version $Id: IsAuthorizeEnum.java, v 0.1 2018年1月22日 下午2:12:05 jerry Exp $
 */
public enum DividendEnum {

    CONTRACT_DIVIDEND(1, "contractDividendService", "CONTRACT_DIVIDEND_LIST", "契约分红"),

    PLATFORM_DIVIDEND(2, "platformDividendService", "PLATFORM_DIVIDEND_LIST", "平台分红"),

    DAY_DIVIDEND(3, "dividendService", "DAY_DIVIDEND_LIST", "日分红"),

    DAY_WAGE(4, "dividendService", "DAY_WAGE_LIST", "日工资"),

    CONTRACT_DAY_WAGE(5, "contractdDayWageService", "CONTRACT_DAY_WAGE_LIST", "契约日工资"),

    BJL_DIVIDEND(6, "bjlDividendService", "BJL_DIVIDEND_LIST", "百家乐分红");

    //类型
    private int    type;
    //实现类名
    private String name;
    //平台配置名
    private String paramKey;
    //描述
    private String desc;

    private DividendEnum(int type, String name, String paramKey, String desc) {
        this.type = type;
        this.name = name;
        this.paramKey = paramKey;
        this.desc = desc;
    }

    public static DividendEnum getDividendEnumByType(int type) {

        for (DividendEnum dividendEnum : DividendEnum.values()) {
            if (dividendEnum.getType() == type) {
                return dividendEnum;
            }
        }

        return null;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the paramKey
     */
    public String getParamKey() {
        return paramKey;
    }

    /**
     * @param paramKey the paramKey to set
     */
    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

}
