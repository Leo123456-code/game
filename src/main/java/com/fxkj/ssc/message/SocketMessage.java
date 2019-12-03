package com.fxkj.ssc.message;

import com.fxkj.ssc.utils.date.CreaditUuid;

public class SocketMessage {
    //消息随机id
	private String messageId;
	
	//消息类型，用来做业务区分
	private Integer messageType;
	//消息内容
	private BaseResult baseResult;
	
	public SocketMessage(){
		this.messageId = CreaditUuid.getNumberUuid16();
	}
	
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
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
}
