package com.fxkj.ssc.constant;

/**
 * 用户权限开关配置常量类
 * 
 * @author Mike -version 1.0
 * @date 2017年11月3日
 * @discription TODO
 */
public class UserPowerConstant {

	/**
	 * @param LOWER_LEVEL_RECHARGE_KEY 下级充值权限key  对应Value含义： 下级充值权限：（0：允许，1：不允许）
	 */
	public static final String LOWER_LEVEL_RECHARGE_KEY = "lower_level_recharge";
	
	/**
	 * @param REBATE_AUTHORITY_KEY 用户彩票同级返点权限key   对应Value含义：彩票同级返点权限：(0:已开通  1：未开通)
	 */
	public static final String LOTTERY_REBATE_AUTHORITY_KEY = "lottery_rebate_authority";
	
	/**
	 * @param REBATE_AUTHORITY_KEY 用户快乐彩同级返点权限key   对应Value含义：快乐彩同级返点权限：(0:已开通  1：未开通)
	 */
	public static final String KLC_REBATE_AUTHORITY_KEY = "klc_rebate_authority";
	
//	/**
//	 * 投注权限：风控使用权限字段，当不满足风控要求时，自动写入记录： 0：允许投注 1：不允许投注
//	 */
//	public static final String BETTING_AUTHORITY_KEY = "betting_authority";
	
	/**
	 * 取款权限：风控使用权限字段，当不满足风控要求的时候，自动写入记录 ： 0 ：允许取款 1：不允许取款
	 */
	public static final String DRAW_AUTHORITY_KEY = "draw_authority";
	
	/**
	 * 百家乐转账权限：风控使用权限字段，当不满足风控要求的时候，自动写入记录 ： 0 ：允许百家乐转账  1：不允许百家乐转账
	 */
	public static final String BJL_TRANSFER_AUTHORITY_KEY = "bjl_transfer_authority";

	/**
	 * 清除银行卡姓名： 0 ：允许  1：不允许
	 */
	public static final String BANK_NAME_PWD_SWITCH = "bank_name_pwd_switch";
	
	
}
