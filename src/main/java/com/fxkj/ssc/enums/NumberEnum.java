package com.fxkj.ssc.enums;

/**   
* @Title: NumberEnum.java 
* @Package com.fxkj.ssc.enums 
* @Description:数字常量
* @author Jack  
* @date 2018年3月9日 上午10:31:04 
* @version V1.0   
*/ 
public enum NumberEnum {
	
    ZERO(0,"零"),
	ONE(1,"一"),
	TWO(2,"二"),
	THREE(3,"三"),
	FOUR(4,"四"),
	FIVE(5,"五"),
	SIX(6,"六"),
	SEVEN(7,"七"),
	EIGHT(8,"八"),
	NINE(9,"九"),
    TEN(10,"十"),
	ELEVEN(11,"十一"),
	TWELVE(12,"十二"),
	THIRTEEN(13,"十三"),
	FOURTEEN(14,"十四"),
	FIFTEEN(15,"十五");
	
	//数字
	private Integer number;
	//描述
	private String  desc;
	
	
	private NumberEnum(Integer number, String desc) {
		this.number = number;
		this.desc = desc;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
