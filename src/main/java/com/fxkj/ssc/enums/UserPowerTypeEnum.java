package com.fxkj.ssc.enums;

/**
 * @description: 用户权限类型枚举
 * @author: jerry
 * @version: $Id: UserPowerTypeEnum, v 0.1  2018年11月16日 13:40
 */
public enum UserPowerTypeEnum {

    LOWER_LEVEL_RECHARGE_KEY("lower_level_recharge", "下级充值权限"),
    LOTTERY_REBATE_AUTHORITY_KEY("lottery_rebate_authority", "用户彩票同级返点权限"),
    KLC_REBATE_AUTHORITY_KEY("klc_rebate_authority","用户快乐彩同级返点权限"),
    BETTING_AUTHORITY_KEY("betting_authority","投注权限"),
    DRAW_AUTHORITY_KEY("draw_authority", "取款权限"),
    BJL_TRANSFER_AUTHORITY_KEY("bjl_transfer_authority", "百家乐转账权限"),

    ;

    private String powerName;
    private String powerDesc;


    UserPowerTypeEnum(String powerName, String powerDesc) {
        this.powerName = powerName;
        this.powerDesc = powerDesc;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }


    public String getPowerDesc() {
        return powerDesc;
    }

    public void setPowerDesc(String powerDesc) {
        this.powerDesc = powerDesc;
    }
}
