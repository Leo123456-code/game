package com.fxkj.ssc.enums.logEnum;

public enum LogEnum {

    ERROR_MDE_SIGN("MD5签名异常，sessionId:{},deptId:{},cmd:{},异常原因:{}"),
    ERROR_DIO_SYSTEM("DIO服务异常，sessionId:{},deptId:{},cmd:{},http请求结果:{},异常原因:{}"),
    ERROR_DIO_RESULT_FAILD("外部返回结果失败，sessionId:{},deptId:{},cmd:{},返回结果码:{},失败描述:{}"),

    ;

    private String message;

    private LogEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
