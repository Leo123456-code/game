package com.fxkj.ssc.enums.ysb;

/**
 * @author steven
 * @ClassName YsbBalanceUrlEnum.java
 * @date 2019-05-20 09:19
 * @Description ysb 体育游戏 转账、充值、提现、url枚举接口
 * @Version
 */
public enum YsbBalanceUrlEnum {

    GET_BALANCE("1","玩家余额请求","RMB"),
    DEPOSIT("2","充值请求","RMB"),
    CONFIRM_DEPOSIT("3","充值确定回复","RMB"),
    WITHDRAW("4","兑换请求","RMB"),;


    private String trancType;
    private String curid;
    private String desc;

     YsbBalanceUrlEnum() {
    }

    YsbBalanceUrlEnum(String trancType, String curid, String desc) {
        this.trancType = trancType;
        this.curid = curid;
        this.desc = desc;
    }

    public String getTrancType() {
        return trancType;
    }

    public void setTrancType(String trancType) {
        this.trancType = trancType;
    }

    public String getCurid() {
        return curid;
    }

    public void setCurid(String curid) {
        this.curid = curid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
