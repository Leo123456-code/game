package com.fxkj.ssc.enums;

/**
 * @author Karl
 * @version 1.0.0
 * @ClassName DSInterfaceEnum.java
 * @Description ds电子游戏接口枚举
 * @createTime 2019年05月10日 11:43:00
 */
public enum DSInterfaceEnum {

    /**
     * 登录游戏
     */
    LOGIN(1, "登录游戏", "/agentHandle"),
    /**
     * 查询用户信息
     */
    SELECT_USER(2, "查询用户信息", "/agentHandle"),
    /**
     * 充值
     */
    RECHARGE(3, "充值", "/agentHandle"),
    /**
     * 提现
     */
    WITHDRAW(4, "提现", "/agentHandle"),
    /**
     * 查询订单状态
     */
    SELECT_ORDER(5, "查询订单状态", "/agentHandle"),
    /**
     * 踢下线
     */
    T_DOWNLINE(6, "踢下线", "/agentHandle"),
    /**
     * 封号
     */
    SETHONOR(7, "封号", "/agentHandle"),
    /**
     * 游戏列表
     */
    GAME_LIST(8, "游戏列表", "/agentHandle"),
    /**
     * 查询游戏注单
     */
    SELECT_NOTE_SINGLE(9, "查询游戏注单", "/logHandle"),
    /**
     * 注单明细
     */
    NOTE_SINGLE_DETAIL(10, "注单明细", "/logHandle"),
    /**
     * 信用网封盘通知
     */
    ENTERTAINED_INFOM(11, "信用网封盘通知", "/verifyHandle"),
    /**
     * 信用网解封盘
     */
    DEBLOCKING(12, "信用网解封盘", "/verifyHandle"),
    /**
     * 重置用户分数
     */
    RESET_SCORE(13, "重置用户分数", "/verifyHandle"),
    /**
     * 查询重置用户分数
     */
    SELECT_RESET_SCORE(14, "查询重置用户分数", "/verifyHandle"),
    /**
     * 解析牌局明细
     */
    ANALYSIS_CHESS(15, "解析牌局明细", "/agentHandle");

    private Integer ac;
    private String  message;
    private String  url;

    private DSInterfaceEnum(Integer ac, String message, String url) {
        this.message = message;
        this.ac = ac;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getAc() {
        return ac;
    }

    public void setAc(Integer ac) {
        this.ac = ac;
    }
}
