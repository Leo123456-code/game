/**
 * ssc Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 *
 * @author arvin
 * @version $Id: UserLoginEnum.java, v 0.1 2017年7月18日 下午8:04:12 arvin Exp $
 */
public enum ExceptionEnum {

    USER_IS_NOT_EXSIT(-00001, "用户不存在"),
    USER_IS_NOT_EXSIT_IN_PLATFORM(-00001, "用户在该平台不存在"),
    USER_TEMPLETE_NOT_EXSIT(-00001, "缓存中的用户信息异常"),
    USER_ID_IS_NOT_NULL(-10001, "用户ID不能为空"),
    PLATFORM_IS_NOT_NULL(-10000, "平台编码不能为空"),
    PLATFORM_ERROR_NUM_NULL(-10000, "密码最大能输入错误次数未配置"),
    PLATFORM_LOGIN_SYS_SWITCH_NULL(-10000, "系统异地检查开关未配置"),
    QUESTION_SUCCESS(0, "验证通过"),
    PASSWORD_SUCCESS(0, "密码修改成功"),
    QUESTION_SAVE_SUCCESS(0, "密保问题设置成功！"),
    QUESTION_CHECK_SUCCESS(0, "密保问题验证成功！"),
    LOGIN_SYS_SWITCH_SUCCESS(0, "修改异地登录检查开关成功！"),
    USER_REGISTER_SUCCESS(0, "注册成功！"),
    SIGN_CREATE_SUCCESS(0, "链接创建成功！"),
    SIGN_DELETE_SUCCESS(0, "链接删除成功！"),

    USER_LOGOUT(-20000, "用户已经失效，请重新登陆"),
    PARAM_IS_ERROR(-20001, "前台传输参数格式有误"),
    LINK_USAGE_TIMES_ERROR(-20002, "链接使用次数不能为空"),
    LINK_VALIDDAYS_ERROR(-20003, "链接有效时长不能为空"),

    JQUERY_GRID_ROWS(-20004, "每页显示条数不能为0"),
    JQUERY_GRID_PAGE(-20005, "当前页数不能为0"),
    LINK_DELETE(-20006, "链接不存在"),
    LINK_IS_NULL(-20006, "链接已经失效"),
    LINK_ID_ERROR(-20007, "链接id不能为空"),
    IS_ONLION_ERROR(-20008, "isOnline不能为空"),
    PLATFORM_ISREGISTE_NOT_NULL(-20009, "平台不允许直接注册"),
    VALIDATECODE_NOT_NULL(-20010, "谷歌密钥不能为空"),
    VALIDATECODE_ERROR(-20011, "谷歌密钥错误"),
    PAY_PWD_NOT_NULL(-20012, "资金密码不能为空"),
    PAY_PWD_ERROR(-20013, "密码错误"),
    CODE_NOT_NULL(-20014, "验证码不能为空"),
    CODE_ERROR(-20015, "验证码错误"),

    QUESTION_ERROR(-20013, "问题答案错误"),
    QUESTION_NULL(-20018, "请先设置密保问题！"),
    QUESTION_CHOOSE_NULL(-20013, "密保问题选择失败，用户未设置该问题！"),
    BANk_NAME_NULL(-20018, "请先设置银行卡姓名"),
    ALIPAY_NAME_NULL(-20018, "请先设置支付宝姓名"),
    GA_NULL(-20018, "请先设置谷歌验证"),
    PAY_PWD_NULL(-20018, "请先设置资金密码"),
    BANK_NAME_ERROR(-20013, "银行卡姓名错误！"),
    ALIPAY_NAME_ERROR(-20013, "支付宝姓名错误！"),

    NEW_PWD_NULL(-20014, "新密码不能为空！"),
    OLD_PWD_NULL(-20014, "旧密码不能为空！"),
    RE_PWD_NULL(-20014, "确认密码不能为空！"),

    RE_PWD_ERROR(-20015, "新密码与确认密码不一致！"),
    PWD_ERROR_COUNT(-20016, "密码输入错误已经达到最大限制！"),
    SYS_PWD_ERROR_NULL(-20017, "系统中未配置默认密码！"),
    SYS_LOTTERY_NULL(-20018, "系统中未配置彩票最小返点！"),
    BANG_GA_NULL(-20019, "平台不允许进行谷歌验证码解绑"),
    BANG_PAY_PWD_NULL(-20019, "平台不允许进行资金密码解绑"),
    BANG_BANK_NAME_NULL(-20019, "平台不允许进行银行卡解绑"),
    USER_BANG_BANK_NAME_NULL(-20019, "用户不允许进行银行卡解绑"),
    ALIPAY_NULL(-20019, "平台不允许进行支付宝解绑"),
    PHONE_AND_QQ_NULL(-20019, "平台不允许进行手机解绑"),
    QUESTION_SWITECH_NULL(-20019, "平台不允许进行密保问题解绑"),

    ERROR_ACCOUNTID_IS_NULL(-30000, "账户id为空"),
    ERROR_USERID_IS_NULL(-30000, "用户Id为空"),
    ERROR_DOWN_USERID_IS_NULL(-30000, "下级用户Id为空"),
    ERROR_BANK_CODE_IS_NULL(-30000, "bankCode为空"),
    ERROR_BANKCARD_IS_NULL(-30000, "银行卡号为空"),
    ERROR_PWD_IS_NULL(-30000, "密码为空"),
    ERROR_PWDTYPE_IS_NULL(-30000, "密码类型为空"),
    ERROR_CURRENCYCODE_IS_NULL(-30000, "币种为空"),
    ERROR_LIMIT_IS_NULL(-30000, "分页条件不能为空"),
    ERROR_AMONT_IS_NULL(-30000, "订单金额为空"),
    ERROR_RESULT_URL_IS_NULL(-30000, "跳转页面为空"),
    ERROR_ChannelCode_IS_NULL(-30000, "渠道代码为空"),
    ERROR_ChannelAlias_IS_NULL(-30000, "渠道别名为空"),

    WITHDRAW_AMONT_IS_NULL(-30000, "提现金额必须大于0"),
    ERROR_WITHDRAW_REQUEST_SYS(-30001, "提现服务异常"),
    ERROR_IS_ALLOW_ACCOUNT(-30002, "验证账户是否有效接口异常"),
    ERROR_QUERY_WITHDRAW_RECORD(-30003, "获取提现记录服务异常"),
    ERROR_CONFIG_REDIS_MYSQL(-30004, "配置信息未找到"),
    ERROR_PAW_TYPE_KNOW(-30006, "资金密码类型未知"),
    ERROR_CAPITAL_PAW(-30006, "资金密码错误"),
    ERROR_GOOGLE_PAW_NULL(-30006, "谷歌密码未设置"),
    ERROR_REQUEST_RECHARFE_SERVICE(-30005, "充值服务异常"),
    ERROR_ACCOUNT_LIMITED(-30007, "账户被限制"),
    ERROR_REBATE_ACCOUNT_LIMITED(-30007, "返点账户被限制"),
    ERROR_DIVIDENT_ACCOUNT_LIMITED(-30007, "分红账户被限制"),
    ERROR_ENVELOPE_ACCOUNT_LIMITED(-30007, "红包账户被限制"),
    ERROR_DOWN_ACCOUNT_LIMITED(-30007, "下级账户被限制"),
    ERROR_ACCOUNT_BALANCE_NOT_ENOUGH(-30008, "账户余额不足"),
    ERROR_UNKNOW_CHANNEL(-30009, "未知渠道"),
    ERROR_QUERY_REBATE_RECORDS(-30010, "返点记录查询异常"),
    ERROR_QUERY_RECHARGE_RECORDS(-30012, "充值记录查询异常"),
    ERROR_QUERY_TRANSFER_RECORDS(-30013, "转账记录查询异常"),
    ERROR_QUERY_WATER_RECORDS(-30014, "返水记录查询异常"),
    ERROR_QUERY_BALANCE_LOG_RECORDS(-30015, "账变记录查询异常"),
    ERROR_PLATFORM_ACCOUNT(-300016, "平台账户为配置"),
    ERROR_ACCOUNT_TRANSFER(-300017, "转账业务异常"),
    ERROR_BANK_CARD_INVALID(-300017, "银行卡无效"),
    ERROR_PAYCHANNEL_CLOSE(-300018, "支付渠道已关闭"),
    ERROR_USER_NOT_LONGIN(-300019, "用户未登录"),
    ERROR_BALANCE_CONSUME_ENOUGH(-300020, "账户代消费额未达到 限制取款"),
    ERROR_IS_USER_CONSUME(-300021, "验证用户消费配额异常"),

    ERROR_BAC_DEPOSIT(-300022, "百家乐存款业务异常"),
    ERROR_BAC_WITHDRAW(-300023, "百家乐取款业务异常"),
    ERROR_ACTIVITY_ACCOUNT_NOT_ENOUGH(-300024, "活动账户未达到消费额度"),
    USER_BONUS_NOT_FINISH(-300024, "下级分红未派发完成，分红账户余额不能转至余额账户"),

    PASSWORD_ERROR_MAX(10005, "密码输入错误已经达到最大限制,请联系客服！"),
    PASSWORD_ERROR(10015, "用户名密码错误"),
    SYSTEM_ERROR(10000, "系统异常"),
    LOGIN_NAME_NULL(10012, "用户名不能为空"),
    PASSWORD_NULL(10013, "用户密码不能为空"),;

    private int code;
    private String desc;

    private ExceptionEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getCode() {
        return this.code;
    }

}
