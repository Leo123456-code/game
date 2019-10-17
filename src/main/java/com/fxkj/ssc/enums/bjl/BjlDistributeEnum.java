package com.fxkj.ssc.enums.bjl;

/**   
* @Title: BjlDistributeEnum.java 
* @Package com.fxkj.ssc.enums 
* @Description:百家乐计算的，返点，返水，以及活动的金额，是否已经派发枚举
* @author Jack  
* @date 2018年3月8日 下午6:55:00 
* @version V1.0   
*/ 
public enum BjlDistributeEnum {

	NO_DISTRIBUTE(0,"未派发"),
	IS_DISTRIBUTE(1,"已派发");
	
	private Integer state;
    private String  desc;
    
	private BjlDistributeEnum(Integer state, String desc) {
		this.state = state;
		this.desc = desc;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
    
	
	
}
