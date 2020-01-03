/**
 * 
 */
package com.fxkj.ssc.jobMqVo.agent;

/**  
* @ClassName: AgentEffectiveDto  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author james
* @date 2019年11月20日  
*    
*/
public class AgentEffectiveDto {
   
	/**最小消费量限制 */
	private Double consumeMin;
	
	/**最小充值量限制 */
	private Double rechargeMin;
	
	/**有效会员类型*/
	private Integer effectiveType;

	
    private Integer valiadDays;
	
	private Integer settlementType;
	
	
	
	/**
	 * @return valiadDays
	 */
	public Integer getValiadDays() {
		return valiadDays;
	}

	/**
	 * @param valiadDays 要设置的 valiadDays
	 */
	public void setValiadDays(Integer valiadDays) {
		this.valiadDays = valiadDays;
	}

	/**
	 * @return settlementType
	 */
	public Integer getSettlementType() {
		return settlementType;
	}

	/**
	 * @param settlementType 要设置的 settlementType
	 */
	public void setSettlementType(Integer settlementType) {
		this.settlementType = settlementType;
	}

	/**
	 * @return consumeMin
	 */
	public Double getConsumeMin() {
		return consumeMin;
	}

	/**
	 * @param consumeMin 要设置的 consumeMin
	 */
	public void setConsumeMin(Double consumeMin) {
		this.consumeMin = consumeMin;
	}

	/**
	 * @return rechargeMin
	 */
	public Double getRechargeMin() {
		return rechargeMin;
	}

	/**
	 * @param rechargeMin 要设置的 rechargeMin
	 */
	public void setRechargeMin(Double rechargeMin) {
		this.rechargeMin = rechargeMin;
	}

	/**
	 * @return effectiveType
	 */
	public Integer getEffectiveType() {
		return effectiveType;
	}

	/**
	 * @param effectiveType 要设置的 effectiveType
	 */
	public void setEffectiveType(Integer effectiveType) {
		this.effectiveType = effectiveType;
	}

	
	
	
}
