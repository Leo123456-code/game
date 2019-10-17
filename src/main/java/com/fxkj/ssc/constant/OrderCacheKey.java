/**
 * ssc
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.constant;

/**
 * 
 * @author arvin
 * @version $Id: OrderCacheKey.java, v 0.1 2017年7月22日 上午11:26:44 arvin Exp $
 */
public class OrderCacheKey {

	/**
	 * 订单大key
	 * 
	 * @param lotterCode
	 * @param openIssue
	 * @return
	 */
	public static String orderCompute(String lotterCode, String openIssue) {
		return lotterCode + "_" + openIssue;
	}

	public static String messageId() {
		return "COMPUTE_MESSAGE_ID";
	}
	
	public static String openIssueId() {
		return "COMPUTE_OPENISSUE_ID";
	}
	
	public static String orderId() {
		return "COMPUTE_ORDER_ID";
	}

}
