/**
 * ] * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 用户登陆相关枚举
 * @author jerry
 * @version $Id: LoginEnum.java, v 0.1 2017年7月10日 下午6:37:23 jerry Exp $
 */
public enum LoginEnum {

    LOGINUSERID("登陆用户sessionValue"),
    VALIDATECODE("验证码"),
    GOOGLE_VALIDATECODE("谷歌验证码"),
    GA_SWITCH("GA解绑开关"),
    QUESTION_SWITCH("密保问题解绑开关"),
    BANK_NAME_PWD_SWITCH("银行卡姓名和资金密码解绑开关"),
    ALIPAY_SWITCH("支付宝解绑开关"),
    PHONE_AND_QQ_SWITCH("手机，qq解绑开关"),
    LOGIN_ERROR_NUM("密码最大能输入错误次数"),
    LOGIN_SYS_SWITCH("系统异地检查开关"),
    REBATE_ROLE("返点权限 "),
    CODESWITCH("验证码开关"),
    RECHARGE_CHOOSE_ROLE("下级充值权限（0-所有下级充值，1-直接下级充值）"),
    RECHARGE_CHILD_ROLE("下级充值权限(1：允许，0：不允许)"),
    SECURITY_LEVEL("安全等级配置"),
    PASSWORD_CHANGE_NUM("当日密码修改的最大限制次数：包括登录密码和资金密码"),
    IP_CHANGE_MAX_NUM("当日登录IP改变的最大次数"),
    NO_LOGIN_MAX_DAYS("未登录的最大天数，风控权限检测使用"),
    MAX_REWARD_NOW("当日最大奖金"),
    ON_DUTY("值班人"),
    LAST_BRUST_MESSAGE("爆奖活动最新中奖消息"),
    ADD_ADVERTISE_MESSAGE("新增公告消息"),
    
    ;

    private String desc;

    private LoginEnum(String desc) {
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
