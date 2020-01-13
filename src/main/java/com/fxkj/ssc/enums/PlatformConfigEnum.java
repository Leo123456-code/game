/**
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 状态枚举
 *
 * @author jerry
 * @version $Id: Status.java, v 0.1 2017年7月17日 下午2:40:19 jerry Exp $
 */
public enum PlatformConfigEnum {

    DEL_BANKCARD_SWITCH("delBankCardSwitch", "解绑开关"),
    USER_QUOTAS("USER_QUOTAS", "用户配额区间"),
    IS_UPDATE_USER_QUOTAS("IS_UPDATE_USER_QUOTAS", "更新所有用户配额 0 否 1 是"),
    BJL_USER_CONFIG("BJL_USER_CONFIG", "百家乐返点返水配置"),
    IS_COMPUTER_LOWER_WATER("IS_COMPUTER_LOWER_WATER", "百家乐返水模式0：独享，1：共享"),
    REPORT_SELECT_USER_LV("REPORT_SELECT_USER_LV", "报表查询根据用户层级配置"),
    BAND_PAY_PASSWORD("BAND_PAY_PASSWORD", "必须绑定资金密码 false 否 true 是"),
    IS_MISS_ORDER("IS_MISS_ORDER", "是否进行系统漏单 false 否 true 是"),
    LOTTERY_PEER_REBATE_SWITCH("LOTTERY_PEER_REBATE_SWITCH", "同级返点开关 false 否 true 是"),
    LOTTERY_PEER_REBATE_MIN("LOTTERY_PEER_REBATE_MIN", "彩票同级返点最小值"),
    LOTTERY_PEER_REBATE_MAX("LOTTERY_PEER_REBATE_MIN", "彩票同级返点最大值"),
    IS_AUTOMATIC_PROCESSING_WITHDRAW_ORDER(
            "IS_AUTOMATIC_PROCESSING_WITHDRAW_ORDER",
            "是否自动处理币宝未处理的订单"),
    IS_AUTOMATIC_PROCESSING_RECHARGE_ORDER(
            "IS_AUTOMATIC_PROCESSING_RECHARGE_ORDER",
            "是否自动处理币宝未处理的订单"),
    CHECK_BANK_NAME_BY_CHINESE("CHECK_BANK_NAME_BY_CHINESE", "绑定银行卡姓名--中文校验"),
    CHECK_BANK_NAME_BY_ENGLISH("CHECK_BANK_NAME_BY_ENGLISH", "绑定银行卡姓名--英语校验"),

    LOGIN_SYS_SWITCH("LOGIN_SYS_SWITCH", "系统异地检查开关"),
    LOGIN_ERROR_NUM("LOGIN_ERROR_NUM", "密码最大能输入错误次数"),
    CODESWITCH("CODESWITCH", "验证码开关"),
    PLATFORM_VERSION_SWITCH("PLATFORM_VERSION_SWITCH", "支持手机的平台信息集合"),
    IS_REGISTEBY_PHONE_AND_QQ("IS_REGISTEBY_PHONE_AND_QQ", "是否支持手机注册"),
    PHONE_IS_ONLY_ONE("PHONE_IS_ONLY_ONE", "手机号唯一 true 开通  false 关闭"),
    QQ_IS_ONLY_ONE("QQ_IS_ONLY_ONE", "qq号唯一 true 开通  false 关闭"),
    COLLECT_BY_YIBU("COLLECT_BY_YIBU", "一部采集渠道一 true 开通  false 关闭"),
    ALI_APP_CODE("ALI_APP_CODE", "阿里云采集code"),
    CHANGE_USER_HIERARCHY_LIMIT("CHANGE_USER_HIERARCHY_LIMIT", "转线时间限制 例如 00:00:00-03:00:00"),
    IS_CZXFS_HUODONG_TEST_ENVIRONMENT(
            "IS_CZXFS_HUODONG_TEST_ENVIRONMENT",
            "是彩种消费送活动测试环境- true  false 不是"),
    IS_KSYJ_HUODONG_TEST_ENVIRONMENT(
            "IS_KSYJ_HUODONG_TEST_ENVIRONMENT",
            "是三级亏损佣金活动测试环境- true  false 不是"),
    POLLING_URL("POLLING_URL", "轮询接口"),
    IS_FILTER("IS_FILTER", "是否进行接口拦截"),
    ISREGISTER("ISREGISTER", "平台注册开关"),
    REGISTER_REBATE("REGISTER_REBATE", "平台注册默认返点"),
    MAX_API_COUNT("MAX_API_COUNT", "相同IP,单位时间，访问此次超过限制"),
    IP_MIDDLE_STATION("IP_MIDDLE_STATION", "采集中间站ip采集渠道配置"),

    IP_OPERATION_SWITCH("IP_OPERATION_SWITCH", "IP非法操作校验开关"),

    LOTTERY_FRONT_REGISTE_MIN("LOTTERY_FRONT_REGISTE_MIN", "彩票前台开户最小值"),
    USER_MAX_UPDATE_REBATE("USER_MAX_UPDATE_REBATE", "彩票前台升点最大值"),
    USER_MAX_REBATE("USER_MAX_REBATE", "彩票前台返点最大值"),
    USER_MIN_REBATE_CHECK("USER_MIN_REBATE_CHECK", "彩票前台返点需要校验最小值"),
    GTI_AGENT_BASE_CONFIG("GTI_AGENT_BASE_CONFIG", "git电子游戏基础配置"),
    YSB_SPORT_BASE_INFO("YSB_SPORT_BASE_INFO", "ysbSport基础配置"),
    DS_GAME_CONFIG("DS_GAME_CONFIG", "德胜游戏基础配置"),
    PLATFORM_VERSION_SWITCH_COLSE("PLATFORM_VERSION_SWITCH_COLSE", "不需要手机号注册的平台"),
    SMS_MESSAGE_CONFIG("SMS_MESSAGE_CONFIG", "发送手机号配置"),
    SMS_MESSAGE_LIMIT("SMS_MESSAGE_LIMIT", "发送手机号限制条件"),
    IS_USED_NOT_WIN_REBACK_ORDER_FUNCTION("IS_USED__NOT_WIN_REBACK_ORDER_FUNCTION", "是否启用不中奖退还本金功能"),
    VENICE_CONFIG("VENICE_CONFIG", "威尼斯游戏配置"),
    CODE_COMPUTER_CONFIG("CODE_COMPUTER_CONFIG", "三部杀数服务配置"),
    IS_REGISTEBY_PHONE("IS_REGISTEBY_PHONE", "是否必填手机号"),
    IS_REGISTEBY_QQ("IS_REGISTEBY_QQ", "是否必填qq号"),
    IS_AUTO_MATIC_CHANGE_LOTTER("IS_AUTO_MATIC_CHANGE_LOTTER", "是否自动转义采集彩种代码"),
    AUDIT_WITHDRAW_VOICE("AUDIT_WITHDRAW_VOICE", "审核提示声音"),
    RECHARGE_CONSUME_RATIO("RECHARGE_CONSUME_RATIO", "充值消费比率"),
    IS_PHONE_CODE("IS_PHONE_CODE", "是否开启手机验证码"),
    IS_MOBILE_NUMBER_LOGIN("IS_MOBILE_NUMBER_LOGIN", "是否开启手机一键登录"),
    IS_PASSWORD_PHONE_CODE("IS_PASSWORD_PHONE_CODE", "是否开启修改密码手机验证码"),
    IS_WITHDRAWAL_PHONE_CODE("IS_WITHDRAWAL_PHONE_CODE", "是否开启取款验证手机码"),
    IS_AGENT_REGISTRATION("IS_AGENT_REGISTRATION", "是否开启代理注册"),
    AGENT_REGISTRATION_SMS_CONTENT("AGENT_REGISTRATION_SMS_CONTENT", "代理注册短信内容"),
    IS_MEMBER_APPLICATION_AGENT("IS_MEMBER_APPLICATION_AGENT", "会员申请成为代理"),
    SUPER_REWARD_RANDOM_NUMBER("SUPER_REWARD_RANDOM_NUMBER", "超级彩金用户随机中奖金额区间"),
    GOOGLE_IMAGE_ISSUER_CONFIG("GOOGLE_IMAGE_ISSUER_CONFIG", "谷歌验证码生成的使用者配置"),
    MAX_USER_HEAD_IMG_LENGTH("MAX_USER_HEAD_IMG_LENGTH", "用户头像上传尺寸最大大小，单位为Kb"),
    WEB_SOCKET_SERVER_URL("WEB_SOCKET_SERVER_URL", "webSocket接入地址"),

    POPULARIZE("POPULARIZE", "推广人秘钥配置"),
    IS_OPEN_LANGUAGE("IS_OPEN_LANGUAGE","是否开启多语言版本"),
    OPEN_AGENT_DOMAIN("OPEN_AGENT_DOMAIN","是否开启代理域名绑定功能"),
    GAME_USER_WIN_MIN_MONEY("GAME_USER_WIN_MIN_MONEY","用户最小盈利金额，大于等于该金额将放入中奖列表中"),
    IS_OPEN_CLEAN_TABLES("IS_OPEN_CLEAN_TABLES","是否开启数据清理功能"),
    REGIST_IMG_INFO("REGIST_IMG_INFO","注册成功画图模板参数"),
    PLAT_FORM_NAME_CHANGE_CONFIG("PLAT_FORM_NAME_CHANGE_CONFIG","平台名称转换配置"),
    
    ;
    private String code;
    private String desc;

    private PlatformConfigEnum(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * 根据名称获取平台code码
     */
    public static String getCodeByName(String name) {

        String code = null;

        for (PlatformConfigEnum uaenum : PlatformConfigEnum.values()) {
            if (StringUtils.equals(uaenum.name(), name)) {
                return uaenum.getCode();
            }
        }

        return code;

    }

    /**
     * 根据平台code码获取具体信息
     */
    public static String getNameByCode(String code) {

        String desc = null;

        for (PlatformConfigEnum uaenum : PlatformConfigEnum.values()) {
            if (StringUtils.equals(uaenum.name(), code)) {
                return uaenum.getDesc();
            }
        }

        return desc;

    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
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
