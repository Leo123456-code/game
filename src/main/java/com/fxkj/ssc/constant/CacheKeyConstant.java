package com.fxkj.ssc.constant;

/**
 * 缓存key
 *
 * @author Mike version 1.0
 * @data 2017年11月27日
 * @decription
 */
public class CacheKeyConstant {

    CacheKeyConstant() {
    }

    /**
     * @param USER_REBATE 用户返点缓存key
     */
    public static final String USER_REBATE             = "@userRebateByUserId_";

    /**
     * @param LOTTER 彩种缓存key
     */
    public static final String LOTTER                  = "@lotterList";
    /**
     * @param lOTTERByCGCODE 根据彩种分类查彩种缓存Key
     *  CGCode ==> categoryCode
     */
    public static final String lOTTER_BY_CGCODE        = "@lotterByCGCodeList";
    /**
     * @param LOTTER_REBATE 彩种模式缓存key
     */
    public static final String LOTTER_REBATE           = "@lotterRebate";

    /**
     * @param LOTTER_RULE 彩种玩法缓存key
     */
    public static final String LOTTER_RULE_HASH        = "LOTTER_RULE";

    /**
     * @param LOTTER_REBATE 彩种模式缓存key
     */
    public static final String LOTTER_REBATE_HASH      = "LOTTER_REBATE";

    /**
     * @param LOTTER_RULE_RATE 彩种玩法赔率缓存key
     */
    public static final String LOTTER_RULE_RATE_HASH   = "LOTTER_RULE_RATE";

    /**
     * @param LOTTER_RULE_REWARD 彩种玩法单挑区间缓存key
     */
    public static final String LOTTER_RULE_REWARD_HASH = "LOTTER_RULE_REWARD";

    /**
     * @param LOTTER_RULE_GRADES 彩种玩法多组奖金缓存key
     */
    public static final String LOTTER_RULE_GRADES_HASH = "LOTTER_RULE_GRADES";

    /**
     * @param  活动缓存Key
     */
    public static final String ACTIVITY_LIST="ACTIVITY";
    /**
     * @param  所有彩种信息
     *
     */
    public static final String LOTTER_ALL="LOTTER_ALL";

    /**
     * @param  所有外盘玩法信息
     *
     */
    public static final String LOTTER_WP_RULL_ALL="LOTTER_WP_RULE";


}
