package com.fxkj.ssc.jobMqVo;

import com.fxkj.ssc.baseVo.RabbitmqBaseVO;

/**
*@author  peck
*@date  2019年11月1日 下午3:41:21
*/
public class EventExpiredMqVo extends RabbitmqBaseVO {

	// 执行时间
	private String currentDate;

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}


}
