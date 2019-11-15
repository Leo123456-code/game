package com.fxkj.ssc.constant;

public class MqConstant {

    //账户余额更新队列
    public static final String UPDATE_BALANCE_QUEUE                              = "update-balance-queue";

    //消费量扣减计算队列
    public static final String USER_CONSUME_QUEUE                                = "user-consume-queue";

    //充值，提现队列开始-------------------------------------------------------------------------------

    //充值查询队列
    public static final String CAPITAL_RECHARGE_QUERY_QUEUE                      = "capital-recharge-query-queue";

    //提现查询队列
    public static final String CAPITAL_WITHDRAW_QUERY_QUEUE                      = "capital-withdraw-query-queue";

    //提现请求队列
    public static final String CAPITAL_WITHDRAW_REQUEST_QUEUE                    = "capital-withdraw-request-queue";

    //充值，提现队列结束-------------------------------------------------------------------------------

    //风控队列开始-------------------------------------------------------------------------------

    //分控密码变更后后续处理队列
    public static final String RISK_MANAGEMEN_QUEUE                              = "risk-managemen-queue";

    //用户登录后的风控计算队列
    public static final String RISK_USERLOGIN_CHECK_QUEUE                        = "risk-userlogin-check-queue";

    //风控队列结束-------------------------------------------------------------------------------

    //添加币种队列
    public static final String ADD_CURRENCY_QUEUE                                = "add-currency-queue";

    //百家乐投注记录采集和返点返水计算队列
    public static final String BJL_BET_RECORD_QUEUE                              = "bjl-bet-record-queue";

    //前台，后台操作日志队列
    public static final String OPERATION_LOG_QUEUE                               = "operation-log-queue";

    //用户层级变更队列
    public static final String USER_EXTENSION_QUEUE                              = "user-extension-queue";

    //层级关系变更监听队列
    public static final String UPDATE_USER_HIERARCHY_QUEUE                       = "update-user-hierarchy-queue";

    //账变记录基础队列
    //    public static final String BALANCE_LOG_COMPUTER_QUEUE = "balance-log-computer-queue";

    //sql慢查询队列
    public static final String SLOW_SQL_TASK_QUEUE                               = "slow-sql-task-queue";

    //开户时添加币宝账户队列
    public static final String CREATE_BIBAO_ACCOUN_QUEUE                         = "create-bibao-account-queue";

    //执行昨天币宝未处理的订单
    public static final String WITHDRAW_BIBAO_WEICHULI_QUEUE                     = "withdraw-bibao-weichuli-queue";

    //执行昨天个人转账未处理的订单
    public static final String RECHARGE_PERSON_WEICHULI_QUEUE                    = "recharge-person-weichuli-queue";

    //异地登录监听
    public static final String USER_LOGIN_LISTEN_QUEUE                           = "user-login-listen-queue";                     //用户登陆监听：是否异地登陆

    // 电子游戏平台游戏结算队列
    public static final String VENICE_BET_RECORD_DETAIL_QUEUE                    = "venice_bet_record_detail";

    // 电子游戏返点返水计算队列
    public static final String VENICE_BET_RECORD_COMPUTE_QUEUE                   = "venice_bet_record_compute_queue";

    // 电子游戏个人投注记录结算队列
    public static final String VENICE_MEMBER_BET_RECORD_QUEUE                    = "venice_member_bet_record_queue";

    // 电子游戏投注流水明细
    public static final String VENICE_BET_FLOW_DETAIL_QUEUE                      = "venice_bet_flow_detail_queue";

    // 电子游戏日投注记录
    public static final String VENICE_USE_DAY_REPORT_QUEUE                       = "venice_use_day_report_queue";

    // 注册送
    public static final String GAME_REGISTER_TO_SEND                             = "game_register_to_send";

    // 获取中间站彩票数据
    public static final String GAME_GET_LOTTERY_DATA                             = "game_get_lottery_data";

    //查询正在游戏中的用户
    public static final String GAME_IN_GAME_USER                                 = "game_in_game_user";

    //处理正在游戏中的用户
    public static final String GAME_DISPOSE_IN_GAME_USER                         = "game_dispose_in_game_user";

    // 消费送
    public static final String GAME_CONSUMER_DELIVERY                            = "game_consumer_delivery";

    // 派发消费送
    public static final String GAME_DISTRIBUTE_CONSUMER_DELIVERY                 = "game_distribute_consumer_delivery";

    //生成爆奖计划队列
    public static final String GENERATION_PLAN_QUEUE                             = "generation-brust-plan-queue";

    //爆奖执行队列
    public static final String BRUST_START_QUEUE                                 = "brust_start_queue";

    //首充送活动单生成队列
    public static final String GAME_GENERATION_SCXACT_RECORD                     = "game-generation-scxact-record";

    //首充送活动单派发队列
    public static final String GAME_DISTRIBUTE_SCXACT_RECORD                     = "game-distribute-scxact-record";

    //奖金池抽成订单增加金额队列
    public static final String GAME_PRIZE_POOL_AMOUNT_INCRESE                    = "game_prize_pool_amount_increse_queue";

    //活动扣减待消费额，解冻冻结余额
    public static final String GAME_ACTIVITY_WITH_DRAW_REDUCE_QUEUE              = "game_activity_with_draw_reduce_queue";

    //各种消费量使用的中继站队列
    public static final String GAME_CONSUME_RELAY_POINT_QUEUE                    = "game_consume_relay_point_queue";
    //活动扣减待消费额实际执行队列，
    public static final String GAME_REAL_ACTIVITY_WITH_DRAW_REDUCE_COMPUTE_QUEUE = "real_activity_with_draw_reduce_compute_queue";
    //----------------------------------------------------------------------------------------
    //单笔充值金额，Vip等级提升监听
    public static final String GAME_VIP_SINGLE_DEPOSIT                           = "game-vip-single-deposit-queue";

    //vip晋级彩金队列
    public static final String GAME_VIP_RISEBONS_QUEUE                           = "game-vip-riseBons-queue";

    //Vip月累计充值检测
    public static final String GAME_VIP_MONTH_GRAND_QUEUE                        = "game-vip-month-grand-queue";

    //转运金
    public static final String GAME_VIP_CHANGE_LUCK_QUEUE                        = "game-vip-change-luck-queue";

    //vip自动降级检测
    public static final String GAME_VIP_DEMOTED_QUEUE                            = "game-vip-demoted-queue";

    // 活动自动过期
    public static final String GAME_EVENT_EXPIRED                                = "game_event_expired_queue";
    //----------------------------------------------------------------------------------------

    //查询所有用户mq
    public static final String GAME_USER_ALL_QUERY                               = "game_user_all_query";

    //获取用户所有游戏金额
    public static final String GAME_USER_GAME_BALANCE                            = "game_user_game_balance";
    //威尼斯提现mq
    public static final String GAME_WITHDRAW_AGENT                               = "game_withdraw_agent";
    //查询查询所有充提订单
    public static final String GAME_TRANSFER_STATUS                              = "game_transfer_status";
    //查询充值订单状态mq
    public static final String GAME_RECHARGE_STATUS                              = "game_recharge_status";
    //查询提现订单状态mq
    public static final String GAME_WITHDRAW_STATUS                              = "game_withdraw_status";
    //进入游戏需要转账mq
    public static final String GAME_STARTGAME_TRANSFER                           = "game_startgame_transfer";

    //查询威尼斯代理统计报表
    public static final String GET_AGENT_COLLECTION                              = "get_agent_collection";
    public static final String GET_USER_COLLECTION                               = "get_user_collection";
    public static final String GET_ORDER_DETAIL                                  = "get_order_detail";
    //定时任务发送拉取报表mq
    public static final String GET_VENICE_REPORT                                 = "get_venice_report";

    // 查询最大在线会员人数
    public static final String GET_ONLINE_MEMBER_QUANTITY                        = "get_online_member_quantity";

    public static final String VENICE_WATER_GENERATE                             = "venice-water-generate";

    public static final String VENICE_WATER_DISTRIBUTE                           = "venice-water-distribute";
}
