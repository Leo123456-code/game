package com.fxkj.ssc.enums.account;

/**
 * Created by frank on 2017/12/20.
 */
public enum VirtualCoinChargeEnum {
    BTC(0,"BTC","btc","比特币"),
    LTC(1,"LTC","ltc","莱特币"),
    ETH(2,"ETH","eth","以太坊"),
    ETC(3,"ETC","etc","以太经典"),
    BCB(4,"BCB","bcb","以太坊的代币"),
    ;

    private Integer code;
    //本地币种代码
    private String  num;
    //外部币种代码
    private String  otherNum;
    //币种名称
    private String  bankName;

    public static VirtualCoinChargeEnum getByNum(String num){
        return valueOf(num);
    }

    private VirtualCoinChargeEnum(Integer code,String num,String otherNum,String bankName){
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
