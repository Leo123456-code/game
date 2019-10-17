/**
 * 
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums.account;

/**
 *  渠道枚举
 * @author ant
 * @version $Id: ChannelEnums.java, v 0.1 2017年7月19日 下午2:52:48 ant Exp $
 */
public enum ChannelEnums {
    GSTPAY(1, "国盛通支付"),
    FOO518(2, "FOO518支付"),
    ANPAY(3, "币宝支付"),
    HEBAOPAY(4, "hebao支付"),
    HUIBOPAY(5, "汇博支付"),
    LINHANGPAY(6, "琳航支付"),
    MIAOKATONGPAY(7, "秒卡通支付"),
    SUFUPAY(12, "速付支付"),
    XINFUTONGPAY(9, "信付通支付"),
    SHENGFUPAY(10, "胜付支付"),
    PERSONAL(11, "个人支付"),
    VIRTUALCURRENCY(8, "虚拟货币"),
    NUOJIEPAY(17, "诺捷支付"),
    BIBAOVIRTUAL(21, "虚拟货币"),
    MANUALLYPAY(22, "手动提现"),
    YIFUBAOPAY(23, "易付宝支付"),
    TONGFUPAY(24, "通付支付"),
    TONGFUDFPAY(25, "通付代付"),
    YIFUTONGPAY(26, "易富通支付"),
    UPAY(27, "优付支付"),
    JUJIANGPAY(28, "巨匠支付"),
    YUNMAPAY(29, "云码支付"),
    KUAIYINPAY(30,"快银支付"),

    GSTPAY_CYBER(10002, "acceptRechargeNotice"),
    GSTPAY_WITHDRAW(10001, "acceptWithdrawNotice"),
    MKTPAY_CYBER(70002, "acceptRechargeNotice"),
    MKTPAY_WITHDRAW(70001, "acceptWithdrawNotice"),
    SFPAY_CYBER(100002, "acceptRechargeNotice"),
    SFPAY_WITHDRAW(100001, "acceptWithdrawNotice"),
    XFTPAY_CYBER(90002, "acceptRechargeNotice"),
    XFTPAY_WITHDRAW(90001, "acceptWithdrawNotice"),
    SUFUPAY_CYBER(120002, "acceptRechargeNotice"),
    SUFUPAY_WITHDRAW(120001, "acceptWithdrawNotice"),
    FOO518_CYBER(20002, "acceptRechargeNotice"),
    FOO518_WITHDRAW(20001, "acceptWithdrawNotice"),

    PERSONAL_CYBER(110002, "isnull"),
    PERSONAL_ALIPAY(110003, "isnull"),
    PERSONAL_WECHAT(110004, "isnull"),
    PERSONAL_QR(110005, "isnull"),
    ZFPAY(1000061, "isnull"),
    ZFPAYMENT(1000062, "isnull"),
    ;

    private int    code;
    private String message;

    private ChannelEnums(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public int getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>message</tt>.
     * 
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     * 
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
