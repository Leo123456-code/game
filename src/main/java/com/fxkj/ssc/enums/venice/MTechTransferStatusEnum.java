package com.fxkj.ssc.enums.venice;

import org.apache.commons.lang.StringUtils;

/**
 * @author Karl
 * @version 1.0.0
 * @ClassName MTechTransferStatusEnum.java
 * @Description m-tech电子游戏转账状态枚举
 * @createTime 2019年05月10日 11:43:00
 */
public enum MTechTransferStatusEnum {

    /**
     * 成功
     */
    SUCCESS("Success", 2, "成功"),
    /**
     * 失败
     */
    FAIL("Failed", -1, "失败"),
    /**
     *不存在该笔转帐"
     */
    NOT_FOUND("Not Found", -1, "不存在该笔转帐"),
    /**
     * 处理中
     */
    PENDING("Pending", 1, "处理中");

    private String  resultStatus;

    private Integer status;

    private String  message;

    private MTechTransferStatusEnum(String resultStatus, Integer status, String message) {

        this.resultStatus = resultStatus;
        this.status = status;
        this.message = message;
    }

    /**
     * @return 获取 resultStatus
     */
    public String getResultStatus() {
        return resultStatus;
    }

    /**
     * @param 设置  resultStatus 
     */
    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    /**
     * @return 获取 status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param 设置  status 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return 获取 message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param 设置  message 
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public static Integer getStatusByResult(String resultStatus) {

        for (MTechTransferStatusEnum MTech : MTechTransferStatusEnum.values()) {
            if (StringUtils.equals(MTech.getResultStatus(), resultStatus)) {
                return MTech.getStatus();
            }
        }

        return -2;
    }

}
