package com.fxkj.ssc.jobMqVo;

import java.util.Date;

import com.fxkj.ssc.baseVo.RabbitmqBaseVO;

/**
 * 作者: Jack
 * 时间: 2019年12月4日上午10:47:50
 * 说明: Vip永久累计消费检测
 *
 */
public class VipForeverAmontCheckVo extends RabbitmqBaseVO{

	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
