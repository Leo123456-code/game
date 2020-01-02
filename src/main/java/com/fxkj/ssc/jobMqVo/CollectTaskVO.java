package com.fxkj.ssc.jobMqVo;


import java.util.Calendar;
import java.util.Date;

import com.fxkj.ssc.baseVo.RabbitmqBaseVO;


/**
 * 作者: Jack
 * 时间: 2019年3月21日下午8:59:53
 * 说明: Jack
 *
 */
public class CollectTaskVO extends RabbitmqBaseVO {
	   //默认最大重试次数
	   public static final Integer MAXTRYTIMES =  20;
	
	   private String lottery;

	    private String lotteryType;

	    private String rule;

	    private String initExcept;

	    private Long   timeInterval;
	  //开始采集时间
	    private Date   collectStartTime;
	    //系统时间
	    private Calendar nowCalandar;
	    /**
	     * 周期时间（在此时间内，可以重新采集，不计入漏单）
	     */
	    private Long jetLog;
	    
	    //最大重试次数
	    private Integer maxTryTimes;
	    
	    public CollectTaskVO() {
	    	
	    }
	    
	public CollectTaskVO(String lottery, String lotteryType, String rule, String initExcept, Long timeInterval,
				Date collectStartTime, Calendar nowCalandar, Long jetLog, Integer maxTryTimes) {
			super();
			this.lottery = lottery;
			this.lotteryType = lotteryType;
			this.rule = rule;
			this.initExcept = initExcept;
			this.timeInterval = timeInterval;
			this.collectStartTime = collectStartTime;
			this.nowCalandar = nowCalandar;
			this.jetLog = jetLog;
			this.maxTryTimes = maxTryTimes;
		}



	public String getLottery() {
		return lottery;
	}

	public void setLottery(String lottery) {
		this.lottery = lottery;
	}

	public Long getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(Long timeInterval) {
		this.timeInterval = timeInterval;
	}

	public Long getJetLog() {
		return jetLog;
	}

	public void setJetLog(Long jetLog) {
		this.jetLog = jetLog;
	}

	public Date getCollectStartTime() {
		return collectStartTime;
	}

	public void setCollectStartTime(Date collectStartTime) {
		this.collectStartTime = collectStartTime;
	}

	public Calendar getNowCalandar() {
		return nowCalandar;
	}

	public void setNowCalandar(Calendar nowCalandar) {
		this.nowCalandar = nowCalandar;
	}

	public String getLotteryType() {
		return lotteryType;
	}

	public void setLotteryType(String lotteryType) {
		this.lotteryType = lotteryType;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getInitExcept() {
		return initExcept;
	}

	public void setInitExcept(String initExcept) {
		this.initExcept = initExcept;
	}

	public Integer getMaxTryTimes() {
		return maxTryTimes;
	}

	public void setMaxTryTimes(Integer maxTryTimes) {
		this.maxTryTimes = maxTryTimes;
	}
	
}
