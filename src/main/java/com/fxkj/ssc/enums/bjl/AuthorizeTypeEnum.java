/**
 *
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.fxkj.ssc.enums.bjl;

/**
 * 认证类型：0 百家乐、1 游戏（只对 PT， MG，KBET，BBIN，AG 有效）
 * @author jerry
 * @version $Id: AuthorizeTypeEnum.java, v 0.1 2018年1月22日 下午2:15:29 jerry Exp $
 */
public enum AuthorizeTypeEnum {

    /** 认证类型：1 游戏（只对 PT， MG，KBET，BBIN，AG 有效）*/
    AUTHORIZE_GAME(1, "游戏（只对 PT， MG，KBET，BBIN，AG 有效）"),

    /** 认证类型：0 百家乐*/
    AUTHORIZE_BJL(0, "百家乐"),

    ;
    private int    code;
    private String desc;

    private AuthorizeTypeEnum(int code, String desc) {
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
