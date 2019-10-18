package com.fxkj.ssc.constant;

public class MqConstant {

    //订单队列开始-------------------------------------------------------------------------------

    //开奖开始计算队列
    public static final String LOTTERY_COMPUTE_START_QUEUE = "lottery-compute-start-queue";
    //订单开奖
    public static final String ORDER_OPEN_RESULT_QUEUE = "order-open-result-queue";
    
    //更新订单状态，计算奖金队列
    public static final String ORDER_STATUS_QUEUE = "order-status-queue";

    //中奖后停止追号队列
    public static final String ORDER_OPEN_REVOKE_QUEUE = "order-open-revoke-queue";

    //用户个人返点计算队列
    public static final String ORDER_OPEN_COMPUTER_REBATE_QUEUE = "order-open-computer-rebate-queue";

    //用户上级返点更新队列
    public static final String ORDER_OPEN_COMPUTER_OWNER_REBATE_QUEUE = "order-open-computer-owner-rebate-queue";

    //上级返点单条数据计算队列
    public static final String OWNER_REBATE_COMPUTER_ITEM_QUEYE = "owner-rebate-computer-item-queue";

    //账户余额更新队列
    public static final String UPDATE_BALANCE_QUEUE = "update-balance-queue";

    //开奖完成后消费量计算队列
    public static final String ORDER_CONSUME_QUEUE = "order-consume-queue";

    //返点账户余额更新队列
    public static final String USER_REBATE_UPDATE_QUEUE = "user-rebate-update-queue";

    //漏单监听队列
    public static final String LEAK_ORDER_QUEUE = "leak-order-queue";

    //订单队列结束-------------------------------------------------------------------------------

    //号码采集队列
    public static final String COLLECT_TASK_QUEUE = "collect-task-queue";

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

    //活动队列开始-------------------------------------------------------------------------------

    //会员首充送活动队列
    public static final String ACTIVITY_HYSCS_QUEUE = "activity-hyscs-queue";

    //生成彩种消费送活动单队列
    public static final String ACTIVITY_CZXFS_QUEUE = "activity-czxfs-queue";

    //生成消费送新活动的活动单队列
    public static final String ACTIVITY_NEWXFS_QUEUE = "activity-newxfs-queue";
    
    //派发消费送新活动的活动彩金队列
    public static final String DISTRIBUTE_ACTIVITY_NEWXFS_QUEUE = "distribute-activity-newxfs-queue";
    //派发彩种消费送活动彩金队列
    public static final String DISTRIBUTE_ACTIVITY_CZXFS_QUEUE = "distribute-activity-czxfs-queue";

    //生成三级亏损佣金队列
    public static final String ACTIVITY_SJKSYJ_QUEUE = "activity-sjksyj-queue";

    //派发三级亏损佣金队列
    public static final String DISTRIBUTE_ACTIVITY_SJKSYJ_QUEUE = "distribute-activity-sjksyj-queue";

    //活动单详情超时过期
    public static final String ACTIVITY_TIMEOUT_TASK_QUEUE = "activity-timeout-task-queue";

    //新增皇家娱乐新消费送活动单生成队列
    public static final String DISTRIBUTE_ACTIVITY_HJXFS_QUEUE = "generate-activity-hjxfs-queue";

    //新增皇家娱乐新消费送活动单派发队列
    public static final String DISTRIBUTE_NEWHJXFS_ACTIVITYRECORD_QUEUE = "distribute-activity-new-hjxfs-queue";

    //新增充值送活动生成活动单队列
    public static final String GENERATE_NEW_CZS_ACTIVITYRECORD_QUEUE = "generate-new-czs-activityrecord-queue";

    public static final String DISTRIBUTE_NEW_CZS_ACTIVITYRECORD_QUEUE = "distribute-new-czs-activityrecord-queue";
    //拉取百家乐有消费量的用户数据
    public static final String PULL_BJL_BETREPORT_COMPUTE_QUEUE = "pull_bjl_betreport_compute_queue";
    //活动队列结束-------------------------------------------------------------------------------


    //用户层级变更队列
    public static final String USER_EXTENSION_QUEUE = "user-extension-queue";

    //分红队列开始-------------------------------------------------------------------------------

    //分红派发队列
    public static final String BOUNS_DISTRIBUTE_TASK_QUEUE = "bouns-distribute-task-queue";

    //分红队列结束-------------------------------------------------------------------------------

    //杀数提交
    public static final String ORDER_CONVERT_SUBMIT_QUEUE = "order-convert-submit-queue";

    //开奖结果监听-当开奖结束之后,计算当前订单的消费量
    public static final String ORDER_ACTIVITY_CONSUME_QUEUE = "order-activity-consume-queue";

    //用户每日结算队列
    public static final String USER_CLEAR_DETAIL_QUEUE = "user-clear-detail-queue";

    //契约分红单队列
    public static final String USER_BONUS_DETAIL_QUEUE = "user-bonus-detail-queue";

    //订单撤单队列
    public static final String ORDER_CONVERT_REVKED_QUEUE = "order-convert-revked-queue";

    //同号撤单队列
    public static final String SAMECODE_REVKED_QUEUE = "samecode-revked-queue";

    //更新订单状态撤单的队列
    public static final String ORDER_REVKED_UPDATE_STATE_QUEUE = "order-revked-update-state-queue";

    //日分红单队列
    public static final String USER_DAYBONUS_DETAIL_QUEUE = "user-daybonus-detail-queue";

    //日工资分红单队列
    public static final String USER_SALARY_DETAIL_QUEUE = "user-salary-detail-queue";

    //契约日工资单队列
    public static final String USER_DAILYWAGES_DETAIL_QUEUE = "user-dailywages-detail-queue";

    //平台分红单队列
    public static final String USER_PLATFORM_DETAIL_QUEUE = "user-platform-detail-queue";

    //
    public static final String REGENERATE_BONUS_DETAIL_QUEUE = "regenerate-bonus-detail-queue";

    //修改分红比例队列
    public static final String MODIFY_BONUS_DETAIL_QUEUE = "modify-bonus-detail-queue";

    //契约分红自动派发队列
    public static final String CONTRACT_DISTRIBUTE_TASK_QUEUE = "contract-distribute-task-queue";

    //契约日工资自动派发队列
    public static final String DAILYWAGES_DISTRIBUTE_TASK_QUEUE = "dailywages-distribute-task-queue";

    //日分红自动派发队列
    public static final String DAYBONUS_DISTRIBUTE_TASK_QUEUE = "daybonus-distribute-task-queue";

    //平台分红自动派发队列
    public static final String PLATFORM_DISTRIBUTE_TASK_QUEUE = "platform-distribute-task-queue";

    //日工资自动派发队列
    public static final String SALARY_DISTRIBUTE_TASK_QUEUE = "salary-distribute-task-queue";

    //层级关系变更监听队列
    public static final String UPDATE_USER_HIERARCHY_QUEUE = "update-user-hierarchy-queue";

    //返点转主账户队列
    public static final String CAPITAL_CORN_COMMISSION_QUEUE = "capital-corn-commission-queue";

    //彩种盈亏计算队列
    public static final String REPORT_DAY_COMPUTER_QUEUE = "report-day-computer-queue";

    //玩法综合报表计算队列
    public static final String REPORT_USER_RULE_ANALYSIS_QUEUE = "report_user_rule_analysis-queue";

    //用户个人结算报表计算队列
    public static final String REPORT_USER_SETTLEMENT_QUEUE = "report_user_settlement-queue";

    //综合报表分析队列
    public static final String REPORT_DAY_COMPREHENSIVE_QUEUE = "report_day_comprehensive-queue";

    //表的列更新计算
    public static final String REPORT_TABLE_COLUMN_QUEUE = "report-table-column-queue";

    //报表字段更新队列
    public static final String REPORT_DAY_COMPREHENSIVE_UPDATE_QUEUE = "report-day-comprehensive-update-queue";

    //报表字段更新队列
    public static final String REPORT_DAY_COMPUTER_UPDATE_QUEUE = "report-day-computer-update-queue";

    //报表字段更新队列
    public static final String REPORT_USER_RULE_ANALYSIS_UPDATE_QUEUE = "report-user-rule-analysis-update-queue";

    //报表字段更新队列
    public static final String REPORT_USER_SETTLEMENT_UPDATE_QUEUE = "report-user-settlement-update-queue";

    //账变记录基础队列
    public static final String BALANCE_LOG_COMPUTER_QUEUE = "balance-log-computer-queue";

    //开奖计算订单详情队列
    public static final String LOTTERY_COMPUTE_INFO_QUEUE = "lottery-compute-info-queue";

    //发送数据日计算队列
    public static final String SYSTEM_DAY_COMPUTER_QUEUE = "system-day-computer-queue";

    //生成分红单
    public static final String GENERATE_DIVIDEND_LIST_QUEUE = "generate-dividend-list-queue";

    //生成分红数据
    public static final String GENERATE_DIVIDEND_DATA_QUEUE = "generate-dividend-data-queue";

    //派发分红单
    public static final String DISTRIBUTED_DIVIDEND_QUEUE = "distributed-dividend-queue";

    //sql慢查询队列
    public static final String SLOW_SQL_TASK_QUEUE = "slow-sql-task-queue";

    //开户时添加币宝账户队列
    public static final String CREATE_BIBAO_ACCOUN_QUEUE = "create-bibao-account-queue";

    //OTC活动队列
    public static final String ACTIVITY_OTC_QUEUE = "activity-otc-queue";

    //号码采集漏期补号队列
    public static final String COLLECT_MISS_LOTTERY_QUEUE = "collect-miss-lottery-queue";

    //balanceLog报表计算属性填充队列
    public static final String BALANCE_LOG_TABLE_COLUNM_FILL_QUEUE = "balance-log-table-colunm-fill-queue";

    public static final String COMPUTE_RESULT_TO_EXCEL_BATCH_QUEUE = "compute-result-to-excel-batch-queue";

    public static final String COMPUTE_RESULT_TO_EXCEL_SINGLE_QUEUE = "compute-result-to-excel-single-queue";

    public static final String COMPUTE_RESULT_WRITE_TO_EXCEL_QUEUE = "compute-result-write-to-excel-queue";

    //rabbitmq消费成功之后的通知消息处理
    public static final String CONSUME_SUCCESS_NOTICE = "consume-success-notice";

    //rabbitmq消费成功之后的通知消息处理
    public static final String COLLECT_MISS_WORK_QUEUE = "collect-miss-work-queue";

    //特殊漏期彩种处理 暂时废弃不再进行使用
    public static final String COLLECT_SPECIAL_MISS_LOTTERY_QUEUE = "collect-special-miss-lottery-queue";

    //幸运飞艇号码采集
    public static final String COLLECT_XYFT_QUEUE = "collect-xyft-queue";

    //执行昨天币宝未处理的订单
    public static final String WITHDRAW_BIBAO_WEICHULI_QUEUE = "withdraw-bibao-weichuli-queue";
    
    //执行昨天个人转账未处理的订单
    public static final String RECHARGE_PERSON_WEICHULI_QUEUE = "recharge-person-weichuli-queue";

    //采集期号计算队列
    public static final String COLLECT_ISSUE_COMPUTER_QUEUE = "collect-issue-computer-queue";

    //真实的号码采集队列
    public static final String COLLECT_OPEN_CODE_QUEUE = "collect-open-code-queue";
    //一部采集队列
    public static final String COLLECT_OPEN_CODE_YI_BU_QUEUE = "collect-open-code-yi-bu-queue";

    //真实的号码采集队列
    public static final String COLLECT_OPEN_CODE_MIDDLE_STATION = "collect-opencode-middle-station-queue";

    //号码采集到之后的处理队列
    public static final String COLLECT_OPENCODE_FINISH_QUEUE = "collect-opencode-finish-queue";

    public static final String USER_LOGIN_LISTEN_QUEUE = "user-login-listen-queue";               //用户登陆监听：是否异地登陆

    //生成彩种计划队列
    public static final String GENERATION_PLAN_QUEUE = "generation-plan-queue";

    //自动补号队列
    public static final String AUTOMATIC_FILLING_QUEUE = "automatic-filling-queue";

    //开奖成功后的mq处理，目前主要是清除缓存
    public static final String CLEAN_OPEN_SUCCESS_QUEUE = "clean-open-success-queue";

    //采集通道计算
    public static final String COLLECT_CHANNEL_QUEUE = "collect-channel-queue";

    //清洗miss的报表
    public static final String REPORT_MISS_QUEUE = "report-miss-prepare-queue";

    //拉取百家乐分红数据
    public static final String GENERATE_BJL_DIVIDEND_DATA_QUEUE = "generate-bjl-dividend-data-queue";
    //拉取gti电子游戏投注记录
    public static final String ACCEPT_GTI_BET_LOG_QUEUE = "accept-gti-bet-log-queue";

    //拉取ysb易胜博体育游戏记录
    public static final String GRAP_YSB_BET_DETAILS_QUEUE = "grap_ysb_bet_details_queue";

    public static final String GRAP_YSB_CLIENT_DAILY_P_L_QUEUE = "grap_ysb_client_daily_p_l_queue";

    public static final String GRAP_YSB_PEDING_BET_DETAIL_QUEUE = "grap_ysb_peding_bet_detail_queue";

    public static final String GRAP_YSB_TRANSFER_DETAILS_QUEUE = "grap_ysb_transfer_details_queue";

    public static final String GRAP_YSB_PL_BET_DETAILS_QUEUE = "grap_ysb_pl_bet_details_queue";

    //拉取德胜棋牌注单记录
    public static final String ACCEPT_DS_BET_LOG_QUEUE = "accept-ds-bet-log-queue";

    //返点账户余额更新队列
    public static final String USER_REBATE_UPDATE_CLOUMN_QUEUE = "user-rebate-update-cloumn-queue";

    // 从中间站拉取数据队列
    public static final String YSB_BET_RECORD_DETAIL_QUEUE = "ysb_bet_record_detail_queue";

    public static final String GTI_BET_RECORD_DETAIL_QUEUE = "gti_bet_record_detail_queue";

    public static final String DS_BET_RECORD_DETAIL_QUEUE = "ds_bet_record_detail_queue";

    public static final String VENICE_BET_RECORD_DETAIL_QUEUE = "venice_bet_record_detail";

    public static final String VENICE_BET_RECORD_COMPUTE_QUEUE = "venice_bet_record_compute_queue";

    public static final String VENICE_MEMBER_BET_RECORD_QUEUE = "venice_member_bet_record_queue";
    
    //聊天群的红包领取到账队列
    public static final String DISTRIBUTE_REDENVELOPE_QUEUE = "distribute_redenvelope_queue"; 
    //拉取24小时过期红包的数据
    public static final String DRAW_EXPIRED_RED_ENVELOPE_DATA_QUEUE = "draw_expired_red_envelope_data_queue"; 
    //计算24小时过期红包并且退款
    public static final String COMPUTE_RED_ENVELOPE_AMOUNT_QUEUE = "compute_red_envelope_amount_queue"; 
    
    //后台彩种代码开启或者禁用后的后续业务处理MQ
    public static final String LOTTER_STATUS_CHANGE_QUEYE = "lotter_status_change_queue";
    
	// 注册送
	public static final String REGISTER_TO_SEND = "register_to_send";
}

