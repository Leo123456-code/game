package com.fxkj.ssc.enums.bjl;

/**
 * 百家乐类型枚举类
 *
 * @author Mike
 * @date 2018年3月8日
 * @description
 */
public enum BaiJiaLeEnum {

	/**
	 * ZHEN_REN 真人
	 */
	ZHEN_REN(1, 2),
	
	/**
	 * TI_YU 体育
	 */
	TI_YU(2, 3),
	
	/**
	 * DIAN_ZI 电子
	 */
	DIAN_ZI(3, 4),
	
	/**
	 * CAI_PIAO 彩票
	 */
	CAI_PIAO(4, 5);
	
	private Integer index;
	
	private Integer value;
	
	private BaiJiaLeEnum(Integer index, Integer value) {
		this.index = index;
		this.value = value;
	}

	/**
	 * 获取对应类型编号
	 * 
	 * @param index
	 * @return
	 */
	public static Integer getIndex(Integer index) {
		BaiJiaLeEnum[] values = BaiJiaLeEnum.values();
		for (Integer i = 0; i < values.length; i++) {
			BaiJiaLeEnum baijiale = values[i];
			if (baijiale.index == index) {
				return baijiale.value;
			}
		}
		return null;
	}
	
	/**
	* 获取index
	* 
	* @return index - index
	*/
	public Integer getIndex() {
		return index;
	}

	/**
	* 设置index
	* 
	* @param index - index
	*/
	void setIndex(Integer index) {
		this.index = index;
	}

	/**
	* 获取value
	* 
	* @return value - value
	*/
	public Integer getValue() {
		return value;
	}

	/**
	* 设置value
	* 
	* @param value - value
	*/
	void setValue(Integer value) {
		this.value = value;
	}

}
