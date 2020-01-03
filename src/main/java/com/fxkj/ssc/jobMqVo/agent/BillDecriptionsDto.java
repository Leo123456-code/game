/**
 * 
 */
package com.fxkj.ssc.jobMqVo.agent;

import java.util.List;

/**  
* @ClassName: BillDecriptionsDto  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author james
* @date 2019年11月20日  
*    
*/
public class BillDecriptionsDto {

	/**返佣规则*/
	private List<BillTypeDto> bill;
	
	/**描述*/
	private String description;
	
	private String agentType;

	
	
	/**
	 * @return agentType
	 */
	public String getAgentType() {
		return agentType;
	}

	/**
	 * @param agentType 要设置的 agentType
	 */
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}

	/**
	 * @return bill
	 */
	public List<BillTypeDto> getBill() {
		return bill;
	}

	/**
	 * @param bill 要设置的 bill
	 */
	public void setBill(List<BillTypeDto> bill) {
		this.bill = bill;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description 要设置的 description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
