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
	
	/** 大爆奖活动的消息后台用户UserId*/
	public static final Long brust_back_userId = -20000L;
	
	/** 大爆奖活动的消息前台用户UserId*/
	public static final Long brust_cz_Activity = -11000L;
	
	/** 大爆奖活动的消息后台用户UserId*/
	public static final Long brust_cz_back_userId = -21000L;
	
	/** 公告的消息前台用户UserId*/
	public static final Long advertise_userId = -30000L;
	
	public static final String GAME_BRUST_ACTIVITY_CODE ="brustActivity";
	
	/**充值爆大奖活动的消息后台用户*/
	public static final String GAME_CZ_BRUST_ACTIVITY_CODE ="czBrustAct";
	
	public static final String GAME_SCS_ACTIVITY_CODE ="scsActivity";
	
	public static final String GAME_AGENT_ACTIVITY_CODE ="agentRebate";
	
	public static final String GAME_XFS_MODEL_CODE ="xfs";
	/**充值送的分组model_code代码*/
	public static final String GAME_SCS_MODEL_CODE = "czs";
	
	/** 奖池当前总余额Paramkey*/
	public static final String PPCURRENTAMOUNT = "ppCurrentAmount";
	
	/** 大爆奖当前派发总金额 Paramkey*/
	public static final String JJTOTALAMOUNT = "jjTotalAmount";
	
	/**充值消费提现限制比例*/
	public static final String RECHARGE_CONSUME_RATIO = "RECHARGE_CONSUME_RATIO";
	
	
	
	/**余额账户类型*/
	public static final int balance_account = 0;
	
	/**彩种订单类型*/
	public static final int lotter_Order = 0;
	/**游戏订单类型*/
	public static final int game_Order = 1;

	/**充值订单类型*/
	public static final int recharge_Order = 3;
	/**虚拟中奖类型*/
	public static final int system_Order = 2;
	
	/**系统随机用户的最小位数*/
	public static final int min = 8;
	
	/**系统随机用户的最大位数*/
	public static final int max = 10;
	
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
	
	//手动
	public static final int BY_HAND_WAY = 1;
	
	public static final int SYSTEM_WAY=0;
	//游戏流水
	public static final String ORDER_WATER = "order_water";
	//订单流水
	public static final String ORDER_INFO = "order_info";
	
	//消费奖金池
	public static final Integer CONSUME_POOL = 0;
	//充值奖金池
	public static final Integer RECHARGE_POOL = 1;
	
	
}
