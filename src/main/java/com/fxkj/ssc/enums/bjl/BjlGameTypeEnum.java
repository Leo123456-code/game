package com.fxkj.ssc.enums.bjl;

/**
 * 作者: Jack
 * 时间: 2018年9月26日下午4:10:26
 * 说明: 百家乐游戏类型枚举
 *
 */
public enum BjlGameTypeEnum {
	ZHEN_REN(1, "真人"),
	TI_YU(2, "体育"),
	DIAN_ZI(3, "电子"),
	CAI_PIAO(4, "彩票");
	
    private Integer gameType;
	
	private String gameName;
	
	private BjlGameTypeEnum(Integer gameType, String gameName) {
		this.gameType = gameType;
		this.gameName = gameName;
	}

	public Integer getGameType() {
		return gameType;
	}

	public void setGameType(Integer gameType) {
		this.gameType = gameType;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	
}
