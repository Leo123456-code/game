package com.fxkj.ssc.constant;

/**
 * 作者: Jack
 * 时间: 2018年12月1日下午10:14:05
 * 说明: 微服务名称
 * 特殊说明：
 * 配置在网关节点中的服务可以进行服务之间进行相互调用。
 * 没有在网关中进行配置的服务则仅仅作为微服务，不能为其他微服务提供调用。
 */
public class MicroServiceNameConstant {
	
	//订单服务
	public static final String  ORDER = "ssc-microservice-order";
	//用户服务
	public static final String  USER = "ssc-microservice-user";
    //充值提现服务
	public static final String CAPITAL = "ssc-microservice-capital";
	//日志服务
	public static final String LOG = "ssc-microservice-log";
	//后台服务
	public static final String MANAGE = "ssc-microservice-manage";
	//报表服务
	public static final String REPORT = "ssc-microservice-report";
	//task服务
	public static final String TASK = "ssc-microservice-task";
	//号码采集服务
	public static final String COLLECT = "ssc-microservice-collect";
	//前台报表服务
	public static final String FROUNT_REPORT = "ssc-microservice-front-report";
	//模式计算服务
	public static final String MODEL_COMPUTER = "ssc-microservice-model-computer";
	
	
	
	
}
