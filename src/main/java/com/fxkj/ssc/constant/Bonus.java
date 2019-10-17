package com.fxkj.ssc.constant;

/**
 * @author Erick
 * @Date 2018/3/2 17:22
 * @description
 */
public class Bonus {
    public static final String CURRENCY_CODE = "CNY";//默认币种代码

    public static final String CONTRACT_BOUNS_KEY = "CONTRACT_BOUNS_SWITCH";//契约分红开关

    public static final String CONTRACT_BOUNS_VALUE = "TRUE";//契约分红开关

    public static final String BONUS_CONTRACT_BONUS_CONFIGUARTION = "BONUS_CONTRACT_BONUS_CONFIGUARTION";//契约分红

    public static final String BONUS_CONTRACT_WLIWAGES_CONFIGUARTION = "BONUS_CONTRACT_WLIWAGES_CONFIGUARTION";//契约日工资

    public static final String BONUS_DIVIDENDS_CONFIGUARTION = "BONUS_DIVIDENDS_CONFIGUARTION";//日分红

    public static final String BONUS_DAYWLIWAGES_CONFIGUARTION = "BONUS_DAYWLIWAGES_CONFIGUARTION";//日工资

    public static final String BONUS_PLATFORM_CONFIGUARTION = "BONUS_PLATFORM_CONFIGUARTION";//平台分红
    
    public static final String USER_CLEAR_DETAIL_QUEUE="user-clear-detail-queue";//用户每日结算队列
    
    public static final String USER_BONUS_DETAIL_QUEUE="user-bonus-detail-queue";//契约分红单队列
    
    public static final String USER_PLATFORM_DETAIL_QUEUE="user-platform-detail-queue";//平台分红单队列
    
    public static final String USER_DAYBONUS_DETAIL_QUEUE="user-daybonus-detail-queue";//日分红单队列
    
    public static final String USER_SALARY_DETAIL_QUEUE="user-salary-detail-queue";//日工资分红单队列
    
    public static final String USER_DAILYWAGES_DETAIL_QUEUE="user-dailywages-detail-queue";//契约日工资单队列
    
    public static final String CONTRACT_DISTRIBUTE_TASK_QUEUE="contract-distribute-task-queue";//契约分红自动派发队列
    
    public static final String PLATFORM_DISTRIBUTE_TASK_QUEUE="platform-distribute-task-queue";//平台分红自动派发队列
    
    public static final String DAYBONUS_DISTRIBUTE_TASK_QUEUE="daybonus-distribute-task-queue";//日分红自动派发队列
    
    public static final String SALARY_DISTRIBUTE_TASK_QUEUE="salary-distribute-task-queue";//日工资自动派发队列
    
    public static final String DAILYWAGES_DISTRIBUTE_TASK_QUEUE="dailywages-distribute-task-queue";//契约日工资自动派发队列
    
    
}
