package com.fxkj.ssc.enums;

public enum MessageEnum {
	MESSAGE_FLAG(1,"replyMessage"),
	FINAL_PAGE_NUMBER(1,"当前页"),
	FINAL_PAGE_SIZE(10,"每页显示数量"),
	MESSAGE_DELSEND_FLAG(2,"sendBox"),
	MESSAGE_DELRECEIVE_FLAG(3,"receiveBox"),
	MESSAG_TYPE_USER(1,"用户信息"),
	MESSAG_TYPE_SYSTEM(0,"系统信息"),
    MESSAG_TYPE_CUSTOMER(2,"客服信息"),
	NOT_SATISFIED_DIVIDEND(4,"本期日工资不满足分红条件"),
	DIVIDEND_INFORMATION(5,"日分红发放信息"),
	DIVIDEND_BEEN_SEND(6,"本期日工资已经发放，请注意查收"),
    MESSAGE_TYPE_ONE(1,"发送给上级"),
    MESSAGE_TYPE_TWO(2,"发送给客服"),
    MESSAGE_TYPE_THREE(3,"发送给下级"),
	;
	
	private int    code;
    private String desc;
    
	private MessageEnum(int code,String desc){
		this.code = code;
        this.desc = desc;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
