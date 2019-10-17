package com.fxkj.ssc.enums;

/**
 * 订单投注模式枚举
 * 
 * @author Mike -version 1.0
 * @date 2017年9月27日
 * @discription 计算奖金逻辑使用
 */
public enum OrderCastModeEnum {

	YUAN(0, 1.0),

	JIAO(1, 0.1),

	FEN(2, 0.01),

	LI(3, 0.001);

	private Integer mode;

	private Double value;

	private OrderCastModeEnum(Integer mode, Double value) {
		this.mode = mode;
		this.value = value;
	}

	/**
	 * 获取当前枚举
	 * 
	 * @param mode
	 * @return
	 */
	public static Double getValue(Integer mode) {
		for (OrderCastModeEnum enums : OrderCastModeEnum.values()) {
			if (enums.mode == mode) {
				return enums.value;
			}
		}
		return 0.0;
	}

	public Integer getMode() {
		return mode;
	}

	void setMode(Integer mode) {
		this.mode = mode;
	}

	public Double getValue() {
		return value;
	}

	void setValue(Double value) {
		this.value = value;
	}

}
