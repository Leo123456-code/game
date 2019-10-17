package com.fxkj.ssc.enums;

/**
 * 订单业务信息枚举
 *
 * @author mike -version 1.0
 * @date 2017年7月18日
 * @description
 */
public enum OrderInfoEnum {

    BALANCE_INFO(-20, "错误：账户信息不存在"),

    QUERY_USER_BASEINFO_ERROR(-9, "异常：用户未登录，请登录后重试"),

    QUERY_ORDER_ADDITION_ERROR(-9, "异常：获取追号订单详情列表信息失败"),

    QUERY_USER_LAST_ISSUE_REWARD_ERROR(-9, "异常：获取上期中奖通知信息失败"),

    QUERY_LOTTERY_ERROR(-9, "异常：获取彩种列表信息失败"),

    QUERY_LOTTER_RULE_REWARD_ERROR(-9, "异常：获取彩种玩法奖励失败"),

    QUERY_LOTTER_RULE_MODE_ERROR(-9, "异常：获取彩种玩法模式失败"),

    QUERY_LOTTER_RULE_RATE_ERROR(-9, "异常：获取彩种玩法赔率失败"),

    QUERY_LOTTER_RULE_GRADES_ERROR(-9, "异常：获取彩种玩法等级失败"),

    QUERY_LOTTER_MISS(-9, "异常：获取彩种信息失败！"),

//    QUERY_LOTTER_ERROR(-9, "异常：彩种已禁用！"),

    QUERY_LOTTER_ERROR(-9, "网络异常：下单失败！"),

    QUERY_LOTTER_RULE_ERROR(-9, "异常：获取彩种玩法信息失败"),

    QUERY_LOTTER_EXCEPTISSUE_ERROR(-9, "异常：获取彩种未开奖期号列表失败"),

    QUERY_LOTTER_OPEN_TIME_ERROR(-9, "异常：获取开奖时间失败"),

    QUERY_LOTTER_OPEN_RESULT_ERROR(-9, "异常：获取上期开奖结果失败"),

    QUERY_RECENTLY_REWARD_ERROR(-9, "异常：获取近期开奖号失败"),

    QUERY_LUZHU_ERROR(-9, "异常：获取珠盘路失败"),

    QUERY_PLATFORM_INFO_ERROR(-9, "异常：获取百家乐平台数据失败"),

    QUERY_USER_REWARD_INFO_ERROR(-9, "异常：获取系统中奖用户记录失败"),

    QUERY_ORDER_INFO_ERROR(-9, "异常：获取订单详情失败"),

    ORDER_INFO_ERROR(-9, "异常：下单失败，请稍后重试"),

    ORDER_REVKED_ERROR(-9, "异常：撤单失败"),

    ACC_BALANCE_ERROR(-9, "异常：查询账户余额失败"),

    USER_ID(-1, "错误：参数[userId]不能为空或负数"),

    LOTTER_CODE(-1, "错误：参数[lotterCode]不能为空"),

    RULE_CODE(-1, "错误：参数[ruleCode]不能为空或负数"),

    AMOUNT(-1, "错误：参数[amount]不能为空或负数"),

    CAST_AMOUNT(-1, "错误：参数[castAmount]不能为空或负数"),

    CAST_MODE(-1, "错误：参数[castMode]不能为空或负数"),

    REBATE_MODE_WRONG(-1, "错误：参数[rebateModel]投注模式校验错误"),

    ORDER_ISSUE(-1, "错误：参数[orderIssue]不能为空"),

    CAST_ISSUE(-1, "错误：参数[castIssue]不能为空"),

    NO_AUTHORATY(-1, "投注权限被限制，无法进行下单！"),

    ORDER_ISSUE_FORMAT(-1, "错误：参数[orderIssue]错误，期号不能为非数字字符表示"),

    ORDER_TYPE(-1, "错误：参数[orderType]不能为空或负数"),

    PLATFORM_CODE(-1, "错误：参数[platformCode]不能为空"),

    DETAILS_LIST(-1, "错误：参数[detailsList]不能为空"),

    CAST_CODES(-1, "错误：参数[castCodes]不能为空或投注格式不正确"),

    CAST_CODES_REGULAR(-2, "错误：投注格式不正确"),

    CAST_CODES_REGULAR_NULL_POINTER(-3, "错误：投注格式校验空指针错误"),

    CHECK_CAST_CODES_REGULAR_ERROR(-4, "错误：校验投注格式系统错误"),

    ORDER_ID(-1, "错误：参数[orderId]不能为空"),

    BATCH_NO(-1, "错误：参数[batchNo]不能为空"),

    IS_ADDITION(-1, "错误：参数[isAddition]不能为空或负数"),

    HALT_ADDITION(-1, "错误：参数[haltAddition]不能为空或负数"),

    IS_OUTER(-1, "错误：参数[isOuter]不能为空或负数"),

    ORDER_ID_OR_BATCH_NO(-1, "错误：参数[orderId或batchNo]不能为空"),

    CAST_MULTIPLE(-1, "错误：参数[castMultiple]不能为空或负数"),

    CAST_MULTIPLE_CHECK_ERROR(-1, "错误：订单投注倍数不正确"),

    REBATE_MODE(-1, "错误：参数[rebateMode]不能为空或负数"),

    LIMIT_RED_ID(-1, "错误：参数[limitRedId]不能为空或负数"),

    ADD_ORDER_SUCCESS(0, "正确：下单成功"),

    REVKED_ORDER_SUCCESS(0, "正确：撤单操作成功"),

    REVKED_ORDER_CHECK_ERROR(-1, "错误：存在订单无法进行撤单，撤单失败！"),

    QUERY_ORDER_ADDITION_SUCCESS(0, "正确：获取追号订单详情列表信息成功"),

    QUERY_ORDER_INFO_DETAILS_SUCCESS(0, "正确：获取订单详情成功"),

    QUERY_USER_REWARD_INFO_SUCCESS(0, "正确：获取系统中奖用户记录成功"),

    QUERY_PLATFORM_INFO_SUCCESS(0, "正确：获取百家乐平台数据成功"),

    QUERY_RECENTLY_REWARD_SUCCESS(0, "正确：获取近期开奖号成功"),

    QUERY_LOTTER_LUZHU_SUCCESS(0, "正确：获取路珠列表成功"),

    QUERY_LOTTER_EXCEPTISSUE_SUCCESS(0, "正确：获取彩种未开奖期号列表成功"),

    QUERY_LOTTER_OPEN_TIME_SUCCESS(0, "正确：获取开奖时间成功"),

    QUERY_LOTTER_OPEN_RESULT_SUCCESS(0, "正确：获取上期开奖结果成功"),

    QUERY_LOTTER_RULE_SUCCESS(0, "正确：获取彩种玩法信息成功"),

    QUERY_LOTTER_RULE_GRADES_SUCCESS(0, "正确：获取彩种玩法等级成功"),

    QUERY_LOTTER_RULE_RATE_SUCCESS(0, "正确：获取彩种玩法赔率成功"),

    QUERY_HOT_LOTTER_SUCCESS(0, "正确：获取热门彩种以及最新期开奖号码成功"),

    QUERY_HOT_LOTTER_ERROR(1, "错误：获取热门彩种以及最新期开奖号码失败"),

    QUERY_LOTTER_RULE_MODE_SUCCESS(0, "正确：获取彩种玩法模式成功"),

    QUERY_LOTTER_RULE_REWARD_SUCCESS(0, "正确：获取彩种玩法奖励成功"),

    QUERY_LOTTERY_SUCCESS(0, "正确：获取彩种列表信息成功"),

    QUERY_USER_LAST_ISSUE_REWARD_SUCCESS(0, "正确：获取上期中奖通知信息成功"),

    QUERY_LUZHU_FAILD(1, "错误：获取珠盘路失败"),

    QUERY_USER_LAST_ISSUE_REWARD_FAILD(1, "错误：获取上期中奖通知信息不存在"),

    QUERY_USER_REWARD_INFO_FAILD(1, "错误：获取系统中奖用户记录不存在"),

    QUERY_LOTTER_RULE_FAILD(1, "错误：获取彩种玩法信息不存在"),

    QUERY_ORDER_ADDITION_FAILD(1, "错误：获取追号订单详情列表信息不存在"),

    QUERY_PLATFORM_INFO_FAILD(1, "错误：获取百家乐平台数据不存在"),

    ADD_ORDER_FAILD(1, "错误：订单入库失败"),

    SUBORDER_FAILD(1, "错误：请勿重复提交订单"),

    QUERY_ORDER_INFO_DETAILS_FAILD(1, "错误：获取订单详情不存在"),

    ORDER_REVKED_COUNT(1, "错误：撤单失败，订单金额不正确"),

    ORDER_REVKED_FAILD(1, "错误：撤单失败，订单已过期"),

    ORDER_REVKED_OPENING(1, "错误：撤单失败，订单正在开奖中"),

    ORDER_ISSUE_FLAG(1, "错误：下单失败，当前期号不正确或已开奖"),

    ORDER_CAST_AMOUNT_ERROR(1, "错误：订单投注金额有误，请重新下单"),

    REWARD_INFO_ISEMPTY(1, "错误：当前彩种期号未开奖"),

    ACC_BALANCE_ZERO(20, "错误：账户余额为0"),

    ACC_BALANCE_LACK(21, "错误：账户余额不足"),

    ACC_BALANCE_FAILD(22, "错误：扣减账户余额失败"),

    LOTTER_RULE_INFO(30, "错误：当前彩种玩法已下线或不存在"),

    LOTTER_RULE_REFUSAL(31, "错误：当前彩种玩法不能投注"),

    CAST_NUMBER(32, "错误：订单投注注数已超出最大限制"),

    CAST_NUMBER_CHECK_ERROR(38, "错误：订单投注注数不正确"),

    CAST_NUMBER_CHECK_SYSTEM_ERROR(39, "错误：订单投注注数算法异常"),

    CAST_NUMBER_CHECK_NO_COMPUTER(40, "错误：投注注数算法未添加"),

    LOTTER_NUMBER(33, "错误：彩种球数不正确"),

    CAST_CODES_PATTERN(34, "错误：彩种投注号码区间有误或投注格式不正确"),

    RATE_CODE_IS_EMPTY(35, "错误：外盘订单，赔率名称不能为空"),

    CURRENCY_CODE_IS_EMPTY(36, "错误：币种代码不能为空"),

    EXCEPT_COUNT_DOWN(37, "当前期号已经过期，请重新投注！"),

    ORDER_SUBMIT_ORDINARY_ERROR(-1,"不允许用普通方式提交订单信息！"),

    ORDER_INFO_CONVERT_ERROR(-2,"下单失败：订单格式错误！"),

    ORDER_INFO_DECODE_ERROR(-5,"下单失败：无法解密有效订单信息！"),

    ORDER_INFO_SUBMIT_QUICKLY(-3,"下单失败：相同订单信息2秒内不允许重复提交！"),

    SUBMIT_LOCK_ERROR(-99, "下单失败：加锁异常!"),

	NO_AUTHORIZE(-3, "无授权参数，下单失败！"),

	AUTHORIZE_ERROR(-4, "授权用户名或密码错误，下单失败！"),

	NOT_ONLINE_OR_TIME_OUT(-9, "网络异常，下单失败！"),

	BETT_STATUS_NOT_ONLINE(-10, "下单失败，网络异常！"),

	LOTTER_NOT_OPEN(-60001, "网络异常，正在为你努力加载数据！"),

	DO_LOGIN_OUT(-9, "网络异常，请重新登录！"),

	INSERT_ORDER_ERROR(-9, "订单写入失败，下单失败！"),

	NO_USERID(-9, "下单失败，查询不到用户！"),

    GET_OPEN_MODEL_SUCCESS(0, "获取彩种开启模式成功"),
    NO_GET_OPEN_MODEL(-9, "系统异常,查询彩种开启模式失败!"),
    NO_OPEN_CLASSIC(-9, "下单失败，经典盘未开启！"),
    NO_OPEN_OUTER(-9, "下单失败，外盘盘未开启！"),
    NO_GET_OPEN(-9, "获取开启彩种模式失败！"),
    
    BET_MODE_IS_NOT_TURNED_ON(-10,"下单失败,投注模式未开启"),
    LESS_BET_AMOUNT(-11,"下单失败,最小投注金额为:"),
    IS_STUD(-12,"下单失败,一键梭哈未开启!"),
    NO_OPEN_MODEL(-9,"彩种模式未开启,无法下单!"),
    NO_OPEN_MODEL_LOTTER(-9,"彩种模式未开启,无法查询彩种信息!"),
    QUERY_ORDER_MAX_CAST_NUMBEL_ERROR(-9, "异常：获取订单最大注数失败"),
    QUERY_ORDER_CONFIG_MAX_CAST_NUMBEL_ERROR(-9, "异常：获取玩法最大注数限制失败"),
	;

    private int    code;

    private String message;

    private OrderInfoEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 获取code
     *
     * @return code - code
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置code
     *
     * @param code code
     */
    void setCode(int code) {
        this.code = code;
    }

    /**
     * 获取message
     *
     * @return message - message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message
     *
     * @param message message
     */
    void setMessage(String message) {
        this.message = message;
    }

}
