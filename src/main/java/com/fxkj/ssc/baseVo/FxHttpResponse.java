package com.fxkj.ssc.baseVo;

import com.fxkj.ssc.enums.ExceptionEnum;

public class FxHttpResponse {

    //0:success,1:fail
    private Integer       code    = 0;

    private String        message = "success";

    private BaseDTO       data;

    private ExceptionEnum exceptionEnum;

    public FxHttpResponse() {

    }

    public FxHttpResponse(BaseDTO dto) {
        this.code = dto.getCode() == null ? null : dto.getCode();
        this.message = dto.getMessage() == null ? null : dto.getMessage();
    }

    public static FxHttpResponse bizError(BaseDTO dto) {
        FxHttpResponse result = new FxHttpResponse(dto);
        result.setData(null);
        return result;
    }

    public static FxHttpResponse sysError(String message) {
        FxHttpResponse result = new FxHttpResponse();
        result.setCode(500);
        result.setMessage(message);
        return result;
    }

    public static FxHttpResponse bizError(ExceptionEnum exceptionEnum) {
        FxHttpResponse result = new FxHttpResponse();
        result.setCode(exceptionEnum.getCode());
        result.setMessage(exceptionEnum.getDesc());
        result.setData(null);
        return result;
    }

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BaseDTO getData() {
        return data;
    }

    public void setData(BaseDTO data) {

        if (data.getCode() == null && data.getMessage() == null) {

            this.data = data;

        } else {

            this.code = data.getCode();

            this.message = data.getMessage();
        }

    }

}
