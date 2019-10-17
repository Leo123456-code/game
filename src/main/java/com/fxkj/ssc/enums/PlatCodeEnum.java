package com.fxkj.ssc.enums;

/**
 * Created by frank on 2017/11/10.
 */
public enum PlatCodeEnum {
    YTH("0001","YTH","3LK0V/qWsjnMe935IUgNzw==");

    private String codeHex;
    private String platCode;
    private String codeMd5;

    public static PlatCodeEnum getByCodeHex(String codeHex){
        for (PlatCodeEnum p:PlatCodeEnum.values()) {
            if(p.codeHex.equals(codeHex)){
                return p;
            }
        }
        return null;
    }

    public static PlatCodeEnum getByPlatCode(String platCode){
        for (PlatCodeEnum p:PlatCodeEnum.values()) {
            if(p.platCode.equals(platCode)){
                return p;
            }
        }
        return null;
    }

    public static PlatCodeEnum getByCodeMd5(String codeMd5){
        for (PlatCodeEnum p:PlatCodeEnum.values()) {
            if(p.codeMd5.equals(codeMd5)){
                return p;
            }
        }
        return null;
    }
    private PlatCodeEnum(String codeHex,String platCode,String codeMd5){
        this.codeHex=codeHex;
        this.platCode=platCode;
        this.codeMd5=codeMd5;
    }

    public String getCodeHex() {
        return codeHex;
    }

    public void setCodeHex(String codeHex) {
        this.codeHex = codeHex;
    }

    public String getPlatCode() {
        return platCode;
    }

    public void setPlatCode(String platCode) {
        this.platCode = platCode;
    }

    public String getCodeMd5() {
        return codeMd5;
    }

    public void setCodeMd5(String codeMd5) {
        this.codeMd5 = codeMd5;
    }
}
