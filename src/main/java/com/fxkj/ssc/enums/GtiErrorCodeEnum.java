package com.fxkj.ssc.enums;

/**
 * @author steven
 * @ClassName GtiErrorCodeEnum
 * @date 2019-10-19 21:17
 * @Description GIT单一转账钱包错误代码表
 * @Version
 */
public enum GtiErrorCodeEnum {

    AES_ENCODE_ERROR(900, "AES-ENCODE 检查码有误", "当收到的检查码与代理商端计算的检查码不同时，请勿执行请求内容并回应此错误代码"),
    AGENT_CODE_ERROR(902, "代理商代码错误", "当收到的代理商代码错误时，请勿执行请求内容并回应此错误代码"),
    MEMBER_ACCOUNT_ERROR(909, "会员账号错误", "当收到的账户不存在时，请勿执行请求内容并回应此错误代码"),
    TRANSACTION_NUM_ALREADY_EXIST(916, "Gti 交易单号已经存在", "投注与派彩所收到的 Gti 交易单号必须为唯一值，若有重复请勿执行请求内容并回应此错误代码");

    private int errorCode;

    private String errorMsg;

    private String description;

    GtiErrorCodeEnum(int errorCode, String errorMsg, String description) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.description = description;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
