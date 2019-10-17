package com.fxkj.ssc.enums.gateWay;


/**
 * 作者: Jack
 * 时间: 2019年9月25日下午5:14:09
 * 说明: 微服务白名单，配置白名单的微服务。所有请求都不进行拦截。
 *
 */
public enum ServiceWhiteEnums {

	DEMO_SERVICE("fxkj-microservice-demo","demo服务所有请求都不需要验证");

	private ServiceWhiteEnums(String serviceName, String desc) {
		this.serviceName = serviceName;
		this.desc = desc;
	}

	private String serviceName;
	
	private String desc;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
   
	
	
}
