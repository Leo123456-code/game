package com.fxkj.ssc.enums;

/**
 * 奖励等级枚举类
 * 
 * @author mike -version 1.0
 * @date 2017年8月16日
 * @description 
 */
public enum RewardEnum {

	ONE("一等奖", 1),

	TWO("二等奖", 2),

	THREE("三等奖", 3),

	FOUR("四等奖", 4),

	FIVE("五等奖", 5),

	SIX("六等奖", 6),

	SEVEN("七等奖", 7);
	
	private String name;

	private Integer index;

	private RewardEnum(String name, Integer index) {
		this.name = name;
		this.index = index;
	}

	/**
	 * 获取当前枚举值
	 * 
	 * @param index
	 * @return
	 */
	public static String getValue(Integer index) {
		for (RewardEnum rewardEnum : RewardEnum.values()) {
			if (rewardEnum.index == index) {
				return rewardEnum.name;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

}
