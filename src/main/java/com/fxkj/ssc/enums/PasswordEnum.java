package com.fxkj.ssc.enums;

/**
 * @description: 密码枚举
 * @author: jerry
 * @version: $Id: PasswordEnum, v 0.1  2018年12月06日 9:56
 */
public enum  PasswordEnum {

    BAND_PAY_PASSWORD("BAND_PAY_PASSWORD", "强制修改资金密码 false 否 true 是"),
    PASSWORD("PASSWORD", "默认登陆密码"),
    PASSWORD_LENGTH("PASSWORD_LENGTH", "密码最小长度"),
    PAY_PASSWORD("PAY_PASSWORD", "默认资金密码"),
    BAND_PASSWORD("BAND_PASSWORD", "强制修改登陆密码 false 否 true 是"),
    PASSWORD_NUM("PASSWORD_NUM", "密码是否包含数字  false 否 true 是"),
    PASSWORD_SPECIAL_CHARACTER("PASSWORD_SPECIAL_CHARACTER", "密码是否包含特殊字符  false 否 true 是"),
    PASSWORD_LETTER("PASSWORD_LETTER", "密码是否包含字母  false 否 true 是"),
    ;


    private String code;
    private String desc;

    private PasswordEnum(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
