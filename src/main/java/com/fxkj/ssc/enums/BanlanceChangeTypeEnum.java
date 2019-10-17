/**
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

/**
 * 帐变类型：1 充值、2 提款申请、
 * 3 转账、4 购买、5 撤单、6 中奖、8 返点、9 修正资金、10百家乐转账、11百家乐返水、12百家乐返点、
 * 13百家乐活动、14活动彩金、15提现失败退款、16 上级取款、17下级充值 、18 抢红包、19、日分红、20、日工资、21、契约日工资、22、契约分红、23、平台分红、24：充值手续费、25：提现手续费、26：修正彩票分红、
 * 27：修正真人分红、28：修正体育分红、29：修正电子分红、30：修正棋牌分红、31：修正彩票返水、32：修正百家乐返水、33：修正活动奖金、
 * 34：修正百家乐活动奖金、35：修正分红',36：修正红包账户',37：修正日工资',38：修正契约日工资',39：修正日分红',40：修正平台分红',41：修正契约分红',42：修正首冲送',43：修正消费送',44：修正三级亏损佣金',45：提现确认到账
 * 作者: Jack
 * 时间: 2018年11月14日上午10:47:35
 * 说明:
 */
public enum BanlanceChangeTypeEnum {

    CHONGZHI(1, "充值"),
    QUKUAN(2, "提款申请"),
    ZHUANZHANG(3, "转账"),
    GOUMAI(4, "购买"),
    CHEDAN(5, "撤单"),
    ZHONGJIANG(6, "中奖"),
    XIAOFEILIANG(7, "消费量确认"),
    FANDIAN(8, "返点"),
    HOUTAI(9, "修正资金"),
    BJLTOSYS(10, "百家乐转账到系统"),
    BAIJIALEFS(11, "百家乐返水"),
    BAIJIALEFD(12, "百家乐返点"),
    BAIJIALHUODONG(13, "百家乐活动"),
    HUODONGCAIJING(14, "活动彩金"),
    QUKUANERROR(15, "提现失败退款"),
    OWNERQUKUAN(16, "上级取款"),
    LOWNERCHONGZ(17, "下级充值"),
    QIANGHONGBAO(18, "抢红包"),
    RIFENHONG(19, "日分红"),
    RIGONGZI(20, "日工资"),
    QIYUERIGONGZI(21, "契约日工资"),
    QIYUEFENHONG(22, "契约分红"),
    PINGTAIFENHONG(23, "平台分红"),
    CHONGZSHOUXUFEI(24, "充值手续费"),
    TIXIANSHOUXUFEI(25, "提现手续费"),
    XIUZCAIPFENHONG(26, "修正彩票分红"),
    XIUZZHENRENFENHONG(27, "修正真人分红"),
    XIUZTIYUFENHONG(28, "修正体育分红"),
    XIUZDIANZIFENHONG(29, "修正电子分红"),
    XIUZQIPAIFENHONG(30, "修正棋牌分红"),
    XIUZCAIPFANSHUI(31, "修正彩票返水"),
    XIUZBAIJIALEFANSHUI(32, "修正百家乐返水"),
    XIUZHUODONGJIANGJIN(33, "修正活动奖金"),
    XIUZBAIJIELAHUODONGJIANGJIN(34, "修正百家乐活动奖金"),
    XIUZFENHONG(35, "修正分红"),
    XIUZHONGBAOACCOUNT(36, "修正红包账户"),
    XIUZRIGONGZI(37, "修正日工资"),
    XIUZQIYUERIGONGZI(38, "修正契约日工资"),
    XIUZRIFENHONG(39, "修正日分红"),
    XIUZPINTTAIFENHONG(40, "修正平台分红"),
    XIUZQIYUEFENHONG(41, "修正契约分红"),
    XIUZSHOUCHONGSONG(42, "修正首冲送"),
    XIUZXIAOFEISONG(43, "修正消费送"),
    XIUZSANJIKUISHUN(44, "修正三级亏损佣金"),
    TIXIANQUERENDAOZHANG(45, "提现确认到账"),
    SYSTOBJL(46, "系统转百家乐"),
    SYSTOBJLTUIKUAN(47, "系统转百家乐失败退款"),
    RIYONGJIN(48, "日佣金"),
    XIUZHENRIYONGJIN(49, "修正日佣金"),
    SYSTOJF(50, "系统转久发"),
    JFTOSYS(51, "久发转系统"),
    SYSTOJFTUIKUAN(52, "系统转久发失败退款"),
    JIUFASETTLEMENT(53, "久发游戏结算"),
    BJLDIVIEND(54, "百家乐分红派发"),
    BJLMODIFYDIVIEND(55, "修正百家乐分红"),
    XZCHONGZ(56, "修正充值"),
    XZQUKUAN(57, "修正取款"),
    XIUZEHNGJIANGJIN(58, "修正奖金"),
    XIUZHENGFANDIAN(59, "修正返点"),
    ROLLBACKPRINCIPAL(60, "恢复本金"),
    JIUFACONSUMENUM(61, "久发游戏消费量"),
    JIUFACONPUMPNUM(62, "久发游戏抽水量"),
    QIYUERIGONGZIPAIFAXIAJI(63, "契约日工资派发下级"),
    GTI_RECHARGE(64, "GTI充值余额扣减"),
    GTI_WITHDRAW(65, "GTI取款成功增加余额"),
    GTI_RECHARGE_ERROR(66, "GTI充值失败退款"),
    YSB_RECHARGE(67, "YSB充值余额扣减"),
    YSB_WITHDRAW(68, "YSB取款成功增加余额"),
    YSB_RECHARGE_ERROR(69, "YSB充值失败退款"),
    DS_RECHARGE(70, "DS充值余额扣减"),
    DS_WITHDRAW(71, "DS取款成功增加余额"),
    DS_RECHARGE_ERROR(72, "DS充值失败退款"),
    VENICE_RECHARGE(73, "第三方游戏充值余额扣减"),
    VENICE_WITHDRAW(74, "第三方游戏取款成功增加余额"),
    VENICE_RECHARGE_ERROR(75, "第三方游戏充值失败退款"),


    RED_ENVELOPE_RECEIVED(76, "领取群红包增加余额"),
    RED_ENVELOPE_DEDUCTION_BANLANCE(77, "发群红包扣减余额"),
    RED_ENVELOPE_EXPIRED_NOT_RECEIVED(78, "群红包24小时未领取自动退款增加余额"),
    VENICE_GAME_WATER(79, "Venice游戏返水");

    private Integer code;
    private String desc;

    private BanlanceChangeTypeEnum(Integer code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     *
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
