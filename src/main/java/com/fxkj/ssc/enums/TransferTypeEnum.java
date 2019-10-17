package com.fxkj.ssc.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by frank on 2018/9/7.
 */
public enum TransferTypeEnum {
    BASE_TRANSFER(0, "普通转账"),
    DOWN_RECHARGE(1, "下级充值"),
    COMMISSIONTOBALANCE(2, "返点转主账户"),
    DIVIDENTTOBALANCE(3, "分红转主账户"),
    DIVIDENTPAIFA(4, "分红派发"),
    ACTIVITYTOBALANCE(5, "活动账户转余额账户"),
    UPWITHDRAW(6, "上级取款"),
    ENVELOPETOBALANCE(7, "红包转主账户"),
    ;

    private Integer code;
    private String  desc;

    private TransferTypeEnum(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * 根据名称获取平台code码
     *
     * @param name
     * @return
     */
    public static Integer getCodeByName(String name) {

        Integer code = null;

        for (TransferTypeEnum uaenum : TransferTypeEnum.values()) {
            if (StringUtils.equals(uaenum.getDesc(), name)) {
                return uaenum.getCode();
            }
        }

        return code;

    }

    /**
     * 根据名称获取平台code码
     *
     * @param name
     * @return
     */
    public static String getNameByCode(Integer name) {

        String code = null;

        for (TransferTypeEnum uaenum : TransferTypeEnum.values()) {
            if (uaenum.getCode() == name) {
                return uaenum.getDesc();
            }
        }

        return code;

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
