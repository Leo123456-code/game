/**
 * ssc
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 
 * @author arvin
 * @version $Id: UserLoginEnum.java, v 0.1 2017年7月18日 下午8:04:12 arvin Exp $
 */
public enum SysExceptionEnum
{
	USER_NMAE_IS_NULL(1, "用户名不能为空"),
    IDENTIFYCODE_IS_NULL(2, "验证码为空"),
    IDENTIFYCODE_ERROR(3, "验证码错误"),
    IDENTIFYCODE_ISNOT_GENERATE(4, "验证码为空"),
    PASSWORD_ERROR(6, "用户名或密码错误"),
    PARAMTER_IS_NULL(5, "参数为空"),
    ADVERTISE_IS_NULL(7, "ADVERTISE参数为空"),
    ADVERTISEID_IS_NULL(8, "ADVERTISEID参数为空"),
    ADVERTISE_CONTENT_IS_NULL(9, "ADVERTISE参数为空"),
    ADVERTISE_WEIGHTS_IS_NULL(10, "ADVERTISE公告权重为空"),
    USER_ID_IS_NULL(11, "用户id不能为空"),
    ROLE_ID_IS_NULL(12, "角色id不能为空"),
    LOGINUSERID(0, "登陆用户sessionValue"),
    VALIDATECODE(0, "验证码"),
    VALIDATGEGOOGLECODE(0, "谷歌验证码"),
    PASSWORD_IS_NULL(13, "参数为空"),
    IS_NEED_GOOGLE(0, "后台管理是否需要谷歌验证登录"),
    IS_NEED_DUTY_GOOGLE(1, "值班人是否需要谷歌验证码验证修改配置"),
	KING_RELATIVE_RESTRICT(23,"king相关账号登录IP唯一标识为空"),
	IS_NEED_GOOGLE_ERROR_RELOGIN(44,"第一次谷歌验证错误是否启用30秒后重新重试"),
	GOOGLE_CODE_RELOGIN_TIME_INTERVAL(45,"谷歌验证错误间隔多少秒重试")  ;
    ;

    private Integer code;
    private String  msg;

    private SysExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getCode() {
        return this.code;
    }

}
