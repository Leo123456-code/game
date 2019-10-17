package com.fxkj.ssc.enums;


/**
 * 作者: Jack
 * 时间: 2018年12月26日下午4:26:17
 * 说明: 订单漏单枚举
 *
 */
public enum MissOrderTypeEnum {
	MISS_ORDER(0,"漏单"),
	NOT_ON_LINE(1,"超时"),
	LOGIN_OUT(2,"掉线"),
	;
    private Integer leakType;
    private String  leakName;
    private MissOrderTypeEnum(Integer leakType,String leakName){
        this.leakType=leakType;
        this.leakName=leakName;
    }
	public Integer getLeakType() {
		return leakType;
	}
	public void setLeakType(Integer leakType) {
		this.leakType = leakType;
	}
	public String getLeakName() {
		return leakName;
	}
	public void setLeakName(String leakName) {
		this.leakName = leakName;
	}
    
}
