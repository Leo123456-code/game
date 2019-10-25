package com.fxkj.ssc.jobMqVo;

import java.util.Date;

import com.fxkj.ssc.baseVo.RabbitmqBaseVO;

/**
 * 作者: Jack
 * 时间: 2019年10月24日下午1:56:56
 * 说明: 转运金
 *
 */
public class ChangeLuckMqVo extends RabbitmqBaseVO {

	//执行时间
	private Date currentDate;

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
}
