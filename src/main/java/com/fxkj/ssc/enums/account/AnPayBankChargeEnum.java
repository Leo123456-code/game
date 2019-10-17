package com.fxkj.ssc.enums.account;

/**
 * Created by frank on 2018/6/26.
 */
public enum AnPayBankChargeEnum {
    ABC(0,0,"ABC",2,"00017","中国农业银行"),
    BOC(1,0,"BOC",2,"00083","中国银行"),
    BOCOM(2,0,"BOCOM",2,"00005","交通银行"),
    CCB(3,0,"CCB",2,"00015","中国建设银行"),
    ICBC(4,0,"ICBC",2,"00018","中国工商银行"),
    PSBC(5,0,"PSBC",2,"00051","邮政储汇"),
    CMB(6,0,"CMB",2,"00060","招商银行"),
    CEB(8,0,"CEB",2,"00057","中国光大银行"),
    CITIC(9,0,"CITIC",2,"00054","中信银行"),
    PAB(10,0,"PAB",2,"00087","平安银行"),
    CMBC(11,0,"CMBC",2,"00013","中国民生银行"),
    HXB(12,0,"HXB",2,"00041","华夏银行"),
    CGB(13,0,"CGB",2,"00052","广发银行"),
    BCCB(14,0,"BCCB",2,"00050","北京银行"),
    BOS(15,0,"BOS",2,"00084","上海银行"),
    CIB(16,0,"CIB",2,"00016","兴业银行"),
    BJRCB(21,0,"BJRCB",2,"00056","北京农商银行"),
    NJCB(22,0,"NJCB",2,"00055","南京银行"),
    NBCB(23,0,"NBCB",2,"00085","宁波银行"),
    BHBC(24,0,"BHBC",2,"00095","渤海银行"),
    SPDB(25,0,"SPDB",2,"00032","上海浦东发展银行"),
    SRCB(26,0,"SRCB",2,"90004","上海农商银行"),
    CZB(27,0,"CZB",2,"00086","浙商银行"),
    unionpay(28,0,"unionpay",2,"90005","银联在线"),
    ALIPAY(17,2,"ALIPAY",3,"90000","支付宝支付"),
    QQPAY(18,2,"QQPAY",3,"90006","QQ扫码"),
    WXPAY(20,2,"WXPAY",3,"90002","微信支付"),
    JDPAY(29,2,"JDPAY",3,"90007","京东支付"),
    ;

    private Integer code;

    //本地银行卡编码
    private Integer type;
    private String  num;
    //外部银行卡编码 1 银行卡,2 第三方网银,3 扫码支付,4 H5
    private Integer otherType;
    private String  otherCode;

    private String  bankName;

    public static AnPayBankChargeEnum getByNum(String num){
        return valueOf(num);
    }

    private AnPayBankChargeEnum(Integer code,Integer type,String num,Integer otherType,String  otherCode,String bankName){
        this.code=code;
        this.type=type;
        this.num=num;
        this.otherType=otherType;
        this.otherCode=otherCode;
        this.bankName=bankName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOtherType() {
        return otherType;
    }

    public void setOtherType(Integer otherType) {
        this.otherType = otherType;
    }

    public String getOtherCode() {
        return otherCode;
    }

    public void setOtherCode(String otherCode) {
        this.otherCode = otherCode;
    }
}
