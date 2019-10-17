/**
 * ssc
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.baseVo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fxkj.ssc.enums.ExceptionEnum;

/**
 * 
 * @author arvin
 * @version $Id: SSCRespopnse.java, v 0.1 2017年7月19日 上午9:07:36 arvin Exp $
 */
public class BaseDTO {

    @JSONField(serialize = false)
    private String        message;

    @JSONField(serialize = false)
    private Integer       code;

    private ExceptionEnum exceptionEnum;

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(ExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getDesc();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
