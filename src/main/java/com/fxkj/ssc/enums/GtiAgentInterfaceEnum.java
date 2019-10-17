package com.fxkj.ssc.enums;

import org.apache.commons.lang.StringUtils;

/**
 * @author jerry
 * @version 1.0.0
 * @ClassName GtiAgentInterfaceEnum.java
 * @Description git电子游戏接口枚举
 * @createTime 2019年05月10日 11:43:00
 */
public enum GtiAgentInterfaceEnum {

    CREATE_ACCOUNT("create_account", "建立新账户", "/v1/create_account"),
    CHECK_ACCOUNT_INFO("check_account_info", "查询账户是否存在", "/v1/account_info"),
    UPDATE_PASSWORD("update_password", "更新账户密码", "/v1/update_password"),
    BALANCE_INFO("balance_info", "取得账户金额", "/v1/balance_info"),
    WITHDRAW("withdraw", "账户交易：提款", "/v1/memtransfer"),
    RECHARGE("recharge", "账户交易：存款", "/v1/memtransfer"),
    MEMTRANSFER("memtransfer", "账户交易：结果查询", "/v1/memtransfer"),
    GETTOKEN("gettoken", "取得登入令牌", "/v1/gettoken"),
    AUTO_LOGIN("auto_login", "执行游戏", "/home/auto_login"),
    BETLOG("betlog", "取得投注记录", "/v1/betlog"),
    SET_ACCOUNT_INFO("set_account_info", "更新账户信息", "/v1/account_info"),
    GT_REPORT("gt_report", "查询代理商统计", "/v1/gt_report"),
    GET_JPSTATUS("get_jpstatus", "Jackpot 金额", "/v1/get_jpstatus"),
    GET_QUOTA("get_quota", "代理商额度", "/v1/get_quota"),
    BETTRACER("betTracer", "详细注单 Bet Tracer", "/v1/betTracer"),
    KICK_OUT("kick_out", "强制离线", "/v1/kick_out"),
    USER_IN_GAME("user_in_game", "查询账号在线状态", "/v1/user_in_game"),
    MEMBER_REPORT("member_report", "查询会员统计报表", "/v1/member_report"),
    SET_GAME("set_game", "设定游戏启用或关闭", "/v1/set_game"),;

    private String name;
    private String message;
    private String url;

    private GtiAgentInterfaceEnum(String name, String message, String url) {
        this.message = message;
        this.name = name;
        this.url = url;
    }

    /**
     * 通过名称获取枚信息
     */
    public static GtiAgentInterfaceEnum getGtiEnumByName(String name) {

        for (GtiAgentInterfaceEnum gitEnum : GtiAgentInterfaceEnum.values()) {
            if (StringUtils.equals(gitEnum.getName(), name)) {
                return gitEnum;
            }
        }

        return null;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
