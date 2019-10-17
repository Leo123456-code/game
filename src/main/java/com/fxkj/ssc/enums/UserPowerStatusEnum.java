package com.fxkj.ssc.enums;

/**
 * @description: 用户权限状态枚举
 * @author: jerry
 * @version: $Id: UserPowerStatusEnum, v 0.1  2018年11月16日 11:44
 */
public enum UserPowerStatusEnum {

    USER_POWER_ENABLE(1, "开通"),
    USER_SWITCH_DISABLE(0, "取消"),;

    private Integer code;
    private String desc;

    UserPowerStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    /**
     * 根据名称获取平台code码
     *
     * @param code
     * @return
     */
    public static String getDescByCode(Integer code) {
        for (UserPowerStatusEnum logTypeEnum : UserPowerStatusEnum.values()) {
            if (logTypeEnum.code.intValue() == code.intValue()) {
                return logTypeEnum.getDesc();
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
