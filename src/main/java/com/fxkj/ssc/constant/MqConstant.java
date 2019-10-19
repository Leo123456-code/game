package com.fxkj.ssc.constant;

public class MqConstant {

    //账户余额更新队列
    public static final String UPDATE_BALANCE_QUEUE = "update-balance-queue";

    //充值，提现队列开始-------------------------------------------------------------------------------

    //充值查询队列
    public static final String CAPITAL_RECHARGE_QUERY_QUEUE = "capital-recharge-query-queue";

    //提现查询队列
    public static final String CAPITAL_WITHDRAW_QUERY_QUEUE = "capital-withdraw-query-queue";

    //提现请求队列
    public static final String CAPITAL_WITHDRAW_REQUEST_QUEUE = "capital-withdraw-request-queue";

    //充值，提现队列结束-------------------------------------------------------------------------------

    //风控队列开始-------------------------------------------------------------------------------

    //分控密码变更后后续处理队列
    public static final String RISK_MANAGEMEN_QUEUE = "risk-managemen-queue";

    //用户登录后的风控计算队列
    public static final String RISK_USERLOGIN_CHECK_QUEUE = "risk-userlogin-check-queue";

    //风控队列结束-------------------------------------------------------------------------------

    //添加币种队列
    public static final String ADD_CURRENCY_QUEUE = "add-currency-queue";

    //百家乐投注记录采集和返点返水计算队列
    public static final String BJL_BET_RECORD_QUEUE = "bjl-bet-record-queue";

    //前台，后台操作日志队列
    public static final String OPERATION_LOG_QUEUE = "operation-log-queue";

    //用户层级变更队列
    public static final String USER_EXTENSION_QUEUE = "user-extension-queue";

    //层级关系变更监听队列
    public static final String UPDATE_USER_HIERARCHY_QUEUE = "update-user-hierarchy-queue";

    //账变记录基础队列
//    public static final String BALANCE_LOG_COMPUTER_QUEUE = "balance-log-computer-queue";

    //sql慢查询队列
    public static final String SLOW_SQL_TASK_QUEUE = "slow-sql-task-queue";

    //开户时添加币宝账户队列
    public static final String CREATE_BIBAO_ACCOUN_QUEUE = "create-bibao-account-queue";

    //执行昨天币宝未处理的订单
    public static final String WITHDRAW_BIBAO_WEICHULI_QUEUE = "withdraw-bibao-weichuli-queue";
    
    //执行昨天个人转账未处理的订单
    public static final String RECHARGE_PERSON_WEICHULI_QUEUE = "recharge-person-weichuli-queue";

    //异地登录监听
    public static final String USER_LOGIN_LISTEN_QUEUE = "user-login-listen-queue";               //用户登陆监听：是否异地登陆

    public static final String VENICE_BET_RECORD_DETAIL_QUEUE = "venice_bet_record_detail";

    public static final String VENICE_BET_RECORD_COMPUTE_QUEUE = "venice_bet_record_compute_queue";

    public static final String VENICE_MEMBER_BET_RECORD_QUEUE = "venice_member_bet_record_queue";
    
}

