package com.fxkj.ssc.enums.venice;

/**
 * @author steven
 * @ClassName VeniceGameBaccaratCodeEnum
 * @date 2019-07-25 14:15
 * @Description TODO
 * @Version
 */
public enum VeniceBaccaratCodeEnum {

    GTI_GAMING(0, "GTI", "GTI电子游戏"),
    YSB_GAMING(1, "YSB", "YSB易胜博体育游戏"),
    DS_GAMING(2, "DS", "德胜棋牌游戏"),
    JJ_PLAY_GAMING(3, "JJPLAY", "99PlayGaming真人游戏"),
    PT_GAMING(4, "PT", "PT电子游戏"),
    JL_GAMING(5, "JL", "金龙棋牌游戏"),
    AG_GAMING(6, "AG", "ag游戏"),
    OG_GAMING(7, "OG", "og游戏"),
    KY_GAMING(8,"KY","开元棋牌游戏"),
    SBO_GAMING(9,"SBO","SBO利计体育游戏");
    private Integer type;
    private String baccaratCode;
    private String description;

    VeniceBaccaratCodeEnum(Integer type, String baccaratCode, String description) {
        this.type = type;
        this.baccaratCode = baccaratCode;
        this.description = description;
    }

    public static Integer getTypeByBaccaratCode(String baccaratCode) {
        Integer type = null;
        VeniceBaccaratCodeEnum[] values = VeniceBaccaratCodeEnum.values();
        for (VeniceBaccaratCodeEnum value : values) {
            if (value.baccaratCode.equals(baccaratCode)) {
                type = value.type;
                return type;
            }
        }
        return type;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getBaccaratCode() {
        return baccaratCode;
    }

    public void setBaccaratCode(String baccaratCode) {
        this.baccaratCode = baccaratCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
