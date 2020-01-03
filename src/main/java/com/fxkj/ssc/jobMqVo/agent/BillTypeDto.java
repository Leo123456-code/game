/**
 * 
 */
package com.fxkj.ssc.jobMqVo.agent;

/**  
* @ClassName: BillTypeDto  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author james
* @date 2019年11月20日  
*    
*/
public class BillTypeDto {
   
	/**结算类型 */
	private String billType;
	
	/**返佣比例 */
	private Double  propotions; 
	
	/**
	 * @return billType
	 */
	public String getBillType() {
		return billType;
	}

	/**
	 * @param billType 要设置的 billType
	 */
	public void setBillType(String billType) {
		this.billType = billType;
	}

	/**
	 * @return propotions
	 */
	public Double getPropotions() {
		return propotions;
	}

	/**
	 * @param propotions 要设置的 propotions
	 */
	public void setPropotions(Double propotions) {
		this.propotions = propotions;
	}

	

	
	
	
}
