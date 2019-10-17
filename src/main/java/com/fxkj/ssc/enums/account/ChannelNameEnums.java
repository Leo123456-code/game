package com.fxkj.ssc.enums.account;

/**
 * Created by frank on 2019/1/18.
 */
public enum ChannelNameEnums {
    GSTPAY(1, "国盛通支付", 2),
    ANPAY(3, "币宝支付", 1),
    MIAOKATONGPAY(7, "秒卡通支付", 1),
    XINFUTONGPAY(9, "信付通支付", 1),
    SHENGFUPAY(10, "胜付支付", 1),
    PERSONAL(11, "个人转账", 1),
    SUFUPAY(12, "速付支付", 1),
    BCBPAY(13, "bcb支付", 1),
    UBEIPAY(14, "U贝支付", 1),
    WSTPAY(15, "威速通支付", 1),
    GHTPAY(16, "高汇通支付", 1),
    NUOJIEPAY(17, "诺捷支付", 1),
    TIANXIANPAY(18, "天下支付", 1),
    HETONGPAY(19, "和通支付", 1),
    YIFUPAY(20, "易付支付", 1),
    BIBAOVIRTUAL(21, "币宝数字货币", 1),
    BAISHENG(22, "百盛支付", 1),
    SHANFUPAY(23, "闪付支付", 1),
    LEHUIPAY(24, "乐汇支付", 1);

    private int    code;
    private String message;
    private int    status; //1有效 2无效

    private ChannelNameEnums(int code, String message, int status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
