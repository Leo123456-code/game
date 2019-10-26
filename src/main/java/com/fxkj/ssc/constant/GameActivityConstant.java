/**
 * 
 */
package com.fxkj.ssc.constant;

/**  
* @ClassName: GameActivityConstant  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author james
* @date 2019年10月25日  
*    
*/
public class GameActivityConstant {

	
	/** 大爆奖活动的消息前台用户UserId*/
	public static final Long brust_Activity = -10000L;
	
	public static final String GAME_BRUST_ACTIVITY_CODE ="brustActivity";
	
	/** 奖池当前总余额Paramkey*/
	public static final String PPCURRENTAMOUNT = "ppCurrentAmount";
	
	/** 大爆奖当前派发总金额 Paramkey*/
	public static final String JJTOTALAMOUNT = "jjTotalAmount";
	
	/**余额账户类型*/
	public static final int balance_account = 0;
	
	/**彩种订单类型*/
	public static final int lotter_Order = 0;
	/**游戏订单类型*/
	public static final int game_Order = 1;
    
	/**领奖状态，-1表示人工审核未通过，-2过期未领取, 1表示人工审核中，2表示已派发未领取，3表示已审核已领取*/
	public static final int brust_bouns_status_review = 1;
	
	public static final int brust_bouns_status_distributed = 2;
	
	public static final int brust_bouns_status_received = 3;
	
	/**当前中奖用户留后门*/
	public static final int is_back_door_true = 1;
	
	/**当前中奖用户不留后门*/
	public static final int is_back_door_false = 0;
	
	public static final String CURRENCY_CODE = "CNY";
	
	//活动账变
	public static final int  CHANGE_TYPE          = 14;
	
	public static final int  brust_status_over          = 2;
}
