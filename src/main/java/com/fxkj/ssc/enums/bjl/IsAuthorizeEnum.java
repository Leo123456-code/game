/**
 *
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.fxkj.ssc.enums.bjl;

/**
 * 是否认证通过：0 否、1 是
 * @author jerry
 * @version $Id: IsAuthorizeEnum.java, v 0.1 2018年1月22日 下午2:12:05 jerry Exp $
 */
public enum IsAuthorizeEnum {

    /** 1 认证通过*/
    AUTHORIZE_TRUE(1, "认证通过"),

    /** 0 认证失败*/
    AUTHORIZE_FALSE(0, "认证失败"),

    ;
    private int    code;
    private String desc;

    private IsAuthorizeEnum(int code, String desc) {
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
