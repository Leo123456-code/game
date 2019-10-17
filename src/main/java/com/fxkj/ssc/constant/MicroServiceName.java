package com.fxkj.ssc.constant;

public class MicroServiceName {

	//后台管理系统基础服务，负责后台用户管理，菜单管理等，不参与业务代码。
	public static final String MANAGE_CORE = "fxkj-microservice-manage-core";
	
	//后台管理系统业务服务。只参与业务，不参与菜单用户等操作。
	public static final String MANAGE = "fxkj-microservice-manage";
	
}
