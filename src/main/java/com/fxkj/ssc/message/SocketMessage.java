package com.fxkj.ssc.message;

public class SocketMessage {

	//消息类型，用来做业务区分
	private Integer messageType;
	//消息内容
	private BaseResult baseResult;
	
	public BaseResult getBaseResult() {
		return baseResult;
	}
	public void setBaseResult(BaseResult baseResult) {
		this.baseResult = baseResult;
	}
	public Integer getMessageType() {
		return messageType;
	}
	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}
	
}
