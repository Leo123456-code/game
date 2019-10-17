package com.fxkj.ssc.enums.account;

/**
 * Created by frank on 2017/11/1.
 */
public enum GsyBankChargeEnum {
    ABC(0,0,"ABC",1,"ABC","中国农业银行"),
    BOC(1,0,"BOC",1,"BOC","中国银行"),
    BOCOM(2,0,"BOCOM",1,"BOCOM","交通银行"),
    CCB(3,0,"CCB",1,"CCB","中国建设银行"),
    ICBC(4,0,"ICBC",1,"ICBC","中国工商银行"),
    PSBC(5,0,"PSBC",1,"PSBC","中国邮政储蓄银行"),
    CMB(6,0,"CMB",1,"CMBC","招商银行"),
    SPDB(7,0,"SPDB",1,"SPDB","浦发银行"),
    CEB(8,0,"CEB",1,"CEBBANK","中国光大银行"),
    CITIC(9,0,"CITIC",1,"ECITIC","中信银行"),
    PAB(10,0,"PAB",1,"PINGAN","平安银行"),
    CMBC(11,0,"CMBC",1,"CMBCS","中国民生银行"),
    HXB(12,0,"HXB",1,"HXB","华夏银行"),
    CGB(13,0,"CGB",1,"CGB","广发银行"),
    BCCB(14,0,"BCCB",1,"BCCB","北京银行"),
    BOS(15,0,"BOS",1,"BOS","上海银行"),
    CIB(16,0,"CIB",1,"CIB","兴业银行"),
    ;
    private Integer code;
    private String  num;
    private String  otherNum;

    private String  bankName;

    public static GsyBankChargeEnum getByNum(String num){
        return valueOf(num);
    }

    private GsyBankChargeEnum(Integer code,Integer type,String num,Integer otherType,String otherNum,String bankName){
        this.code=code;
        this.num=num;
        this.otherNum=otherNum;
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

    public String getOtherNum() {
        return otherNum;
    }

    public void setOtherNum(String otherNum) {
        this.otherNum = otherNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
