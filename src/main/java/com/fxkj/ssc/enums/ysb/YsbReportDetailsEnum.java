package com.fxkj.ssc.enums.ysb;

import org.apache.commons.lang.StringUtils;

/**
 * @author steven
 * @ClassName YsbBalanceUrlEnum.java
 * @date 2019-05-20 09:19
 * @Description ysb 报表详情
 * @Version
 */
public enum YsbReportDetailsEnum {

    CLIENT_DAILY_PROFIT_LOSS(1,"DPNL","客户每日的利润和损失","client_daily_profit_loss"),
    CLIENT_BET_DETAILS(2,"BD","客户投注详情","client_bet_details"),
    TRANSFER_DETAIL(3,"TD","转账详情","ysb_transfer_details"),
    PENDING_BET(4,"PB","未结算注单详情","ysb_peding_bet"),
    P_L_BET(5,"PNLBET","已结算投注详情","client_bet_details");
//    NEW_CLIENTS_DETAILS(6,"NC","新客户详情"),
//    EVENT_DETAILS(7,"ED","赛事详情"),
//    HOT_EVENT(8,"HOT","热门赛事"),
//    HOT_EVENT_SELECTION(9,"HOTSEL","热门赛事选择"),
//    PNL_SUMMARY(10,"APNLS","游戏输赢报表详情");


    private Integer type;

    private String name;

    private String desc;

    private String tableName;

    YsbReportDetailsEnum(Integer type, String name, String desc,String tableName) {
        this.type = type;
        this.name = name;
        this.desc = desc;
        this.tableName = tableName;
    }

    /**
     *
     * @param type 通过类型获取name 或者 desc
     * @return
     */
    public static YsbReportDetailsEnum getYsbEnumByType(Integer type) {

        for (YsbReportDetailsEnum ysbEnum : YsbReportDetailsEnum.values()) {
            if (StringUtils.equals(String.valueOf(ysbEnum.getType()), String.valueOf(type))) {
                return ysbEnum;
            }
        }

        return null;
    }

    public static YsbReportDetailsEnum getYsbEnumByName(String name) {

        for (YsbReportDetailsEnum ysbEnum : YsbReportDetailsEnum.values()) {
            if (StringUtils.equals(ysbEnum.getName(), name)) {
                return ysbEnum;
            }
        }

        return null;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }}
