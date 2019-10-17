/**
 * 
 */
package com.fxkj.ssc.enums;

/**
 * @author Karl
 * @Date 2018年12月15日
 */
public enum RiskControlEnum {

    FAILURE(0, "失败"),
    SUCCESS(1, "成功"),
    PLATFORMCODE(101, "平台代码不存在"),
    KEYERROR(102, "参数不合法,key值验证失败"),
    PARAMETERERROR(103, "解析参数值失败"),
    URLEXPIRED(104, "URL地址已过期"),
    UNKNOWNERROR(105, "未知错误,远程服务器错误");

    public static String getMessage(Integer code) {
        String message = null;
        for (RiskControlEnum riskControlEnum : RiskControlEnum.values()) {
            if (riskControlEnum.code == code) {
                message = riskControlEnum.message;
                break;
            }
        }
        return message;
    }

    private Integer code;

    private String  message;

    RiskControlEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
