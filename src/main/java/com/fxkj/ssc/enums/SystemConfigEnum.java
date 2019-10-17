/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 系统参数枚举
 * @author jerry
 * @version $Id: SystemConfig.java, v 0.1 2017年7月18日 下午2:35:31 jerry Exp $
 */
public enum SystemConfigEnum {
    PASSWORD("默认密码"),
    PAY_PASSWORD("默认的资金密码"),
    TRUE("是"),
    FALSE("否"),
    //彩票
    ADMIN_USER_MAX_REBATE("彩票类型超级管理员用户可设置的最大的彩票返点数"),
    GENERAL_USER_MAX_REBATE("彩票类型普通管理员用户可设置的最大的彩票返点数"),
    //快乐彩
    ADMIN_USER_MAX_KLC_REBATE("快乐彩类型超级管理员用户可设置的最大的快乐彩返点数"),
    GENERAL_USER_MAX__KLC_REBATE("快乐彩类型普通管理员用户可设置的最大的快乐彩返点数"),
    //百家乐
    ADMIN_USER_MAX_BJL_REBATE("百家乐类型超级管理员用户可设置的最大的百家乐返点数"),
    GENERAL_USER_MAX__BJL_REBATE("百家乐类型普通管理员用户可设置的最大的百家乐返点数"),
    ADMIN_USER_MAX_BJL_WATER("百家乐类型超级管理员用户可设置的最大的百家乐返水数"),
    GENERAL_USER_MAX__BJL_WATER("百家乐类型普通管理员用户可设置的最大的百家乐返水数"),
    //线路检测
    LINE_DETECTION("线路检测"),
    //APP下载地址
    APP_DOWNLOAD_URL("APP下载地址"),
    //客服电话
    CUSTOMER_SERVICE("客服电话"),
    CUSTOMER_SERVICE_URL("客服URL"),
    //返点配额
    REBATE_INTERVAL("平台返点配额区间"),
    LOTTERY_PEER_REBATE_MIN("彩票同级返点最大值"),
    LOTTERY_PEER_REBATE_MAX("彩票同级返点最小值"),
    LOTTERY_PEER_REBATE_SWITCH("彩票同级返点开关"),
    LOTTERY_FRONT_REGISTE_MIN("彩票前台开户最小值"),
    USER_MAX_UPDATE_REBATE("彩票前台升点最大值"),
    USER_MAX_REBATE("彩票前台返点最大值"),
    USER_MIN_REBATE_CHECK("彩票前台返点需要校验最小值"),
    USER_BANK_CARD_MAX_NUMBER("用户绑定银行卡最大数"),
    BANK_CARD_INIT_STATUS("用户绑定银行初始化状态"),
    ;
    private String desc;

    private SystemConfigEnum(String desc) {
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
