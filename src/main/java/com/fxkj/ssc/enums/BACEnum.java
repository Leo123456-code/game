package com.fxkj.ssc.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by frank on 2018/1/26.
 */
public enum BACEnum {
    OG("0001","OG"),
    PT("0002","PT"),
    BBIN("0003","BBIN"),
    AG("0004","AG"),
    XPJ("0005","XPJ"),
    MG("0006","MG"),
    KBET("0007","KBET"),
    CROWN("0008","CROWN"),
    IRS("0009","IRS"),
    UC8("0010","UC8"),
    Chess("0011","Chess"),
    ybb("0012","188"),
    eBET("0013","eBET"),
    VGS("0014","VGS"),
    MT4("0015","UC8"),
    ;

    public static BACEnum  getByName(String platformName){
        BACEnum result=null;
        for(BACEnum bacEnum:BACEnum.values()){
            if (StringUtils.equals(bacEnum.platformName, platformName)) {
                result= bacEnum;
                break;
            }
        }
        return result;
    }

    public static BACEnum  getByCode(String platformCode){
        BACEnum result=null;
        for(BACEnum bacEnum:BACEnum.values()){
            if (StringUtils.equals(bacEnum.platformCode, platformCode)) {
                result= bacEnum;
                break;
            }
        }
        return result;
    }
    private String platformCode;
    private String  platformName;
    private BACEnum(String platformCode,String platformName){
        this.platformCode=platformCode;
        this.platformName=platformName;
    }
}
