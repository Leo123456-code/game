/**
 *
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 
 * @author jerry
 * @version $Id: ResponseCodeEnum.java, v 0.1 2018年9月10日 上午10:28:45 jerry Exp $
 */
public enum ResponseCodeEnum {

    SUCCESS(0, "返回成功code码");

    private int    code;

    private String message;

    private ResponseCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
