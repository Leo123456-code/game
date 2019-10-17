package com.fxkj.ssc.enums.bjl;

/**   
* @Title: BjlDistributeTypeEnum.java 
* @Package com.fxkj.ssc.enums 
* @Description:百家乐返点，返水类型，活动
* @author Jack  
* @date 2018年3月9日 上午9:49:33 
* @version V1.0   
*/ 
public enum BjlDistributeTypeEnum {

	//返点类型
	BJL_ZHEN_REN_REBATE(2,"百家乐真人返点"),
	BJL_TI_YU_REBATE(3,"百家乐体育返点"),
	BJL_DIAN_ZI_REBATE(4,"百家乐电子返点"),
	BJL_CAI_PIAO_REBATE(5,"百家乐彩票返点"),
	//返水类型
	BJL_ZHEN_REN_WATER(2,"百家乐真人返水"),
	BJL_TI_YU_WATER(3,"百家乐体育返水"),
	BJL_DIAN_ZI_WATER(4,"百家乐电子返水"),
	BJL_CAI_PIAO_WATER(5,"百家乐彩票返水"),
	;
	
	private Integer type;
    private String  desc;
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private BjlDistributeTypeEnum(Integer type, String desc) {
		this.type = type;
		this.desc = desc;
	}
    
	

}
