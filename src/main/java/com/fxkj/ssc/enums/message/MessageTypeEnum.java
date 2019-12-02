package com.fxkj.ssc.enums.message;

/**
 * 作者: Jack
 * 时间: 2019年12月2日上午11:44:56
 * 说明: 消息类型枚举
 *
 */
public enum MessageTypeEnum {

	NOMAL(0,"连接成功消息类型");
	
	private Integer messageType;
	
	private String desc;

	public Integer getMessageType() {
		return messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	private MessageTypeEnum(Integer messageType, String desc) {
		this.messageType = messageType;
		this.desc = desc;
	}
		
	
}
