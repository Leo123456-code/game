package com.fxkj.ssc.enums;

/**
 * 订单投注模式枚举
 * 
 * @author Mike -version 1.0
 * @date 2017年9月27日
 * @discription 计算投注注数使用
 */
public enum OrderCastMode2Enum {

	YUAN(0, 1),

	JIAO(1, 10),

	FEN(2, 100),

	LI(3, 1000);

	private Integer mode;

	private Integer value;

	private OrderCastMode2Enum(Integer mode, Integer value) {
		this.mode = mode;
		this.value = value;
	}

	/**
	 * 获取当前枚举
	 * 
	 * @param mode
	 * @return
	 */
	public static Integer getValue(Integer mode) {
		for (OrderCastMode2Enum enums : OrderCastMode2Enum.values()) {
			if (enums.mode == mode) {
				return enums.value;
			}
		}
		return 1;
	}

	public Integer getMode() {
		return mode;
	}

	void setMode(Integer mode) {
		this.mode = mode;
	}

	public Integer getValue() {
		return value;
	}

	void setValue(Integer value) {
		this.value = value;
	}

}
