package com.fxkj.ssc.jobMqVo;

import com.fxkj.ssc.baseVo.RabbitmqBaseVO;

public class UserMessageVo extends RabbitmqBaseVO {

	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 是否提现 0.否1.是
	 */
	private Integer isWithdraw;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getIsWithdraw() {
		return isWithdraw;
	}

	public void setIsWithdraw(Integer isWithdraw) {
		this.isWithdraw = isWithdraw;
	}

}
