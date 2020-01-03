/**
 * 
 */
package com.fxkj.ssc.jobMqVo.agent;

import java.util.List;

/**  
* @ClassName: AgentLossRuleDto  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author james
* @date 2020年1月3日  
*    
*/
public class AgentLossRuleDto {
   
	/**方案A*/
	private BillDecriptionsDto billProgramA;
	
	/**方案B*/
    private BillDecriptionsDto billProgramB;
    
    /**方案B参数*/
    private AgentEffectiveDto  effective;
    
    /**游戏大类*/
    private List<String> gameList;
   
    /**累计方式 0表示不累计，1表示累计佣金,2表示累计亏损*/
    private Integer accumulateWay;

	/**
	 * @return billProgramA
	 */
	public BillDecriptionsDto getBillProgramA() {
		return billProgramA;
	}

	/**
	 * @param billProgramA 要设置的 billProgramA
	 */
	public void setBillProgramA(BillDecriptionsDto billProgramA) {
		this.billProgramA = billProgramA;
	}

	/**
	 * @return billProgramB
	 */
	public BillDecriptionsDto getBillProgramB() {
		return billProgramB;
	}

	/**
	 * @param billProgramB 要设置的 billProgramB
	 */
	public void setBillProgramB(BillDecriptionsDto billProgramB) {
		this.billProgramB = billProgramB;
	}

	/**
	 * @return effective
	 */
	public AgentEffectiveDto getEffective() {
		return effective;
	}

	/**
	 * @param effective 要设置的 effective
	 */
	public void setEffective(AgentEffectiveDto effective) {
		this.effective = effective;
	}

	/**
	 * @return gameList
	 */
	public List<String> getGameList() {
		return gameList;
	}

	/**
	 * @param gameList 要设置的 gameList
	 */
	public void setGameList(List<String> gameList) {
		this.gameList = gameList;
	}

	/**
	 * @return accumulateWay
	 */
	public Integer getAccumulateWay() {
		return accumulateWay;
	}

	/**
	 * @param accumulateWay 要设置的 accumulateWay
	 */
	public void setAccumulateWay(Integer accumulateWay) {
		this.accumulateWay = accumulateWay;
	}
    
    
}
