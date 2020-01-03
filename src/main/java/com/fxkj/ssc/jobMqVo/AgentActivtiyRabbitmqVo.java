/**
 * 
 */
package com.fxkj.ssc.jobMqVo;

import java.util.Date;

import com.fxkj.ssc.baseVo.RabbitmqBaseVO;
import com.fxkj.ssc.jobMqVo.agent.AgentLossRuleDto;


/**  
* @ClassName: AgentActivtiyRabbitmqVo  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author james
* @date 2019年12月31日  
*    
*/
public class AgentActivtiyRabbitmqVo extends RabbitmqBaseVO{
	
    private AgentUserDto agentUserDto;
	
    private  AgentLossRuleDto agentLossRuleDto;
    
    private Date  dayTime;
	
	/**活动代码*/
	private String activityCode;

	/**执行日期*/
	private String  executeCurrentDayDate;

	
	
	
	/**
	 * @return agentLossRuleDto
	 */
	public AgentLossRuleDto getAgentLossRuleDto() {
		return agentLossRuleDto;
	}

	/**
	 * @param agentLossRuleDto 要设置的 agentLossRuleDto
	 */
	public void setAgentLossRuleDto(AgentLossRuleDto agentLossRuleDto) {
		this.agentLossRuleDto = agentLossRuleDto;
	}

	/**
	 * @return agentUserDto
	 */
	public AgentUserDto getAgentUserDto() {
		return agentUserDto;
	}

	/**
	 * @param agentUserDto 要设置的 agentUserDto
	 */
	public void setAgentUserDto(AgentUserDto agentUserDto) {
		this.agentUserDto = agentUserDto;
	}

	/**
	 * @return dayTime
	 */
	public Date getDayTime() {
		return dayTime;
	}

	/**
	 * @param dayTime 要设置的 dayTime
	 */
	public void setDayTime(Date dayTime) {
		this.dayTime = dayTime;
	}

	/**
	 * @return activityCode
	 */
	public String getActivityCode() {
		return activityCode;
	}

	/**
	 * @param activityCode 要设置的 activityCode
	 */
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	/**
	 * @return executeCurrentDayDate
	 */
	public String getExecuteCurrentDayDate() {
		return executeCurrentDayDate;
	}

	/**
	 * @param executeCurrentDayDate 要设置的 executeCurrentDayDate
	 */
	public void setExecuteCurrentDayDate(String executeCurrentDayDate) {
		this.executeCurrentDayDate = executeCurrentDayDate;
	}
	
	
	
	
	
	
     
}
