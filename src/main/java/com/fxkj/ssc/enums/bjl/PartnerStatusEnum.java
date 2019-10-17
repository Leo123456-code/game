/**
 *
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.fxkj.ssc.enums.bjl;

/**
 * 状态：0 可用、1 关闭
 * @author jerry
 * @version $Id: PartnerStatusEnum.java, v 0.1 2018年1月22日 下午2:17:00 jerry Exp $
 */
public enum PartnerStatusEnum {

    /** 1 平台关闭*/
    PARTNER_CLOSE(1, "平台关闭"),

    /** 0 平台可用*/
    PARTNER_OPEN(0, "平台可用"),

    ;
    private int    code;
    private String desc;

    private PartnerStatusEnum(int code, String desc) {
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
