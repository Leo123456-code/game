
package com.fxkj.ssc.enums.chat;

/**
 * @author james
 * @date 2019年7月8日
 * @description 
 * @version 1.0
 */
public enum ChatMessageEnum {

	
	GROUP_CHAT("GROUP_CHAT","群聊类型"),
	
	SINGLE_CHAT("SINGLE_CHAT","私聊类型"),
	
	SYSTEM_CHAT("SYSTEM_CHAT","系统消息类型"),
	
	REFUND_REDENVEL("REFUND_REDENVEL","红包退款消息"),
	
	DELETE_GROUP("DELETE_GROUP","解散群聊"),
	
	REMOVE_GROUP("REMOVE_GROUP","移出群成员"),
	
	INVITE_GROUP("INVITE_GROUP","邀请群成员"), 

	GROUP_ADVERTISE("GROUP_ADVERTISE","群公告消息"),
	
	TEXT_MESSAGE("TEXT_MESSAGE","文本消息"),
	
	VOICE_MESSAGE("VOICE_MESSAGE","语音消息"),
	
	PICTURE_MESSAGE("PICTURE_MESSAGE","图片消息"),
	
	EMOTIONAL_MESSAGE("EMOTIONAL_MESSAGE","表情消息"), 
	
	RED_ENVELOPE_MESSAGE("RED_ENVELOPE_MESSAGE","发红包的消息"),
//	RECEIVED_RED_ENVELOPE_MESSAGE("RECEIVED_RED_ENVELOPE_MESSAGE","领取红包的消息"),
	
	GROUP_SYSTEM_MESSAGE("GROUP_SYSTEM_MESSAGE","群内部系统消息"),
	//区分个人头像还是群头像
    PERSON_HEADPIC("PERSON_HEADPIC","个人头像"),
	
	GROUP_HEADPIC("GROUP_HEADPIC","群头像"),
	
	//区分普通文件还是头像文件
	COMMON_FILE("COMMON_FILE","普通文件上传类型"),
	HEAD_IMAGE("HEAD_IMAGE","头像文件上传类型"),
	
	;

    private String decription;
	
	private String code;

    private ChatMessageEnum(String code,String decription) {
        this.decription = decription;
        this.code = code;
    }

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
