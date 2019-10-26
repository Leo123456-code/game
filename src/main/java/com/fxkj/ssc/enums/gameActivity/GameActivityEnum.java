/**
 * 
 */
package com.fxkj.ssc.enums.gameActivity;



/**  
* @ClassName: GameActivityEnum  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author james
* @date 2019年10月26日  
*    
*/
public enum GameActivityEnum {
    
	FIRSTPRIZE(1,"一等奖"),
	SECONDPRIZE(2,"二等奖"),
	THIRDPRIZE(3,"三等奖"),
	;
	
	private Integer code;
	
	private String name;
	
	
	GameActivityEnum(Integer code,String name){
		this.code = code;
		this.name = name;
	}
	
	public static GameActivityEnum getByCode(Integer code) {
		GameActivityEnum result = null;
		for(GameActivityEnum gameEnum: GameActivityEnum.values()) {
			if(gameEnum.code.equals(code)) {
				result = gameEnum;
			}
		}
		return result;
	}

	public static GameActivityEnum getByName(String name) {
		GameActivityEnum result = null;
		for(GameActivityEnum gameEnum: GameActivityEnum.values()) {
			if(gameEnum.name.equals(name)) {
				result = gameEnum;
			}
		}
		return result;
	}
	/**
	 * @return code
	 */
	public Integer getCode() {
		return code;
	}


	/**
	 * @param code 要设置的 code
	 */
	public void setCode(Integer code) {
		this.code = code;
	}


	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
