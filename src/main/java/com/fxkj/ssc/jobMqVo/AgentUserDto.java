/**
 * 
 */
package com.fxkj.ssc.jobMqVo;

import java.util.List;

/**  
* @ClassName: AgentUserDto  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author james
* @date 2019年11月21日  
*    
*/
public class AgentUserDto {

	private Long ownerId;
	
	private List<Long> userIds;

	/**代理方案*/
	private String  agentType;
	
	
	/**
	 * @return ownerId
	 */
	public Long getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId 要设置的 ownerId
	 */
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * @return userIds
	 */
	public List<Long> getUserIds() {
		return userIds;
	}

	/**
	 * @param userIds 要设置的 userIds
	 */
	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}

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
	
	
	
	
	
}
