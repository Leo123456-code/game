package com.fxkj.ssc.enums;

/**   
* @Title: OrderRevkedTypeEnum.java 
* @Package com.fxkj.ssc.enums 
* @Description:状态：-3 后台手动撤单、-2 用户手动撤单、-1 系统自动撤单
* @author Jack  
* @date 2018年8月7日 下午2:00:49 
* @version V1.0   
*/ 
public enum OrderRevkedTypeEnum {

	SystemRevked(-1,"系统自动撤单"),
	FrontUserRevked(-2,"用户手动撤单"),
	BackUserRevked(-3,"后台手动撤单");
	
	private Integer revkedType;
	
	private String desc;

	public Integer getRevkedType() {
		return revkedType;
	}

	public void setRevkedType(Integer revkedType) {
		this.revkedType = revkedType;
		System.out.println();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	private OrderRevkedTypeEnum(Integer revkedType, String desc) {
		this.revkedType = revkedType;
		this.desc = desc;
	}
	
	
}



