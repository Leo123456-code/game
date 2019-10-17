package com.fxkj.ssc.baseVo;

/**
 * @description: ${description}
 * @author: jerry
 * @version: $Id: AliCloudApi, v 0.1  2019年03月25日 15:23
 */
public class AliCloudApi {

    private int   error_code;
    private String   reason;

    private IpResult result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public IpResult getResult() {
        return result;
    }

    public void setResult(IpResult result) {
        this.result = result;
    }
}
