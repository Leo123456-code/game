package com.fxkj.ssc.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by frank on 2018/1/26.
 */
public enum DsMessageEnum {
    /**
     * 成功
     */
    SUCCESS("0", "成功"),
    /**
     * 重复订单，订单已成功处理 
     */
    ORDER_REPETITION("1000 ", "重复订单，订单已成功处理 "),
    /**
     * token过期
     */
    TOKEN_OVERDUE("1001", "token过期"),
    /**
     * 代理商标示不存在
     */
    AGENTID_NULL("1002", "代理商标示不存在"),
    /**
     * 验证时间超时
     */
    OVER_TIME("1003", "验证时间超时"),
    /**
     * 参数加密字符串解析错误 
     */
    PARAM_ANALYSIS_ERROR("1004", "参数加密字符串解析错误 "),
    /**
     * MD5校验字符串验证错误 
     */
    MD5_ERROR("1005", "MD5校验字符串验证错误 "),
    /**
     * 访问IP不在白名单内
     */
    IP_NO_WHITE("1006", "访问IP不在白名单内"),
    /**
     * 没有该子操作类型 
     */
    NO_SUBRUN("1007", "没有该子操作类型 "),
    /**
     * 数据操作失败 
     */
    DATA_FAILED("1008", "数据操作失败 "),
    /**
     * 获取token失败 
     */
    TOKEN_FAILED("1009", "获取token失败 "),
    /**
     * 用户有其他订单未操作
     */
    ORDER_UNFINISHED("1010", "用户有其他订单未操作"),
    /**
     * 订单号格式有误 
     */
    ORDER_FORMAT_ERROR("1011", "订单号格式有误 "),
    /**
     * userCode有误
     */
    USERCODE_ERROR("1012", "userCode有误"),
    /**
     * 用户还在游戏中下分失败 
     */
    UP_DOWN_FAILED("1013", "用户还在游戏中下分失败 "),
    /**
     * 用户的分数不足 
     */
    SCORE_INSUFFICIENT("1014", "用户的分数不足 "),
    /**
     * 用户的可下分数不足 
     */
    UP_DOWN_INSUFFICIENT("1015", "用户的可下分数不足 "),
    /**
     * 订单号不存在 
     */
    ORDER_NULL("1016", "订单号不存在 "),
    /**
     * 踢用户离线失败 
     */
    T_FAILED("1017", "踢用户离线失败 "),
    /**
     * 用户列表格式有误 
     */
    USER_LIST_FORMAT_ERROR("1018", "用户列表格式有误 "),
    /**
     * 用户被锁定
     */
    USER_LOCK("1019", "用户被锁定"),
    /**
     * gameId有误
     */
    GAMEID_ERROR("1020", "gameId有误"),
    /**
     * 查询注单的时间有误
     */
    NOTE_SINGLE_ERROR("1021", "查询注单的时间有误"),
    /**
     * 上下分分数不能为负数 
     */
    SCORE_ERROR("1022", "上下分分数不能为负数 "),
    /**
     * homeUrl有误或者不是合法的 URL格式地址 
     */
    HOMEURL_ERROR("1023", "homeUrl有误或者不是合法的 URL格式地址 "),
    /**
     * 请求的代理标示非法
     */
    USERCODE_ILLEGALITY("1024", "请求的代理标示非法"),
    /**
     * 该代理标示存在未处理完成的封盘操作 
     */
    USERCODE_NO_OVER("1025", "该代理标示存在未处理完成的封盘操作 "),
    /**
     * 操作失败
     */
    OPERATION_FAILED("1026", "操作失败"),
    /**
     * 重复请求
     */
    REQUEST_REPETITION("1027", "重复请求"),
    /**
     * 代理商处于封盘中 
     */
    USERCODE_ENTERTAINED("1028", "代理商处于封盘中 "),
    /**
     * 该代理商的可用分数不足
     */
    USERCODE_INSUFFICIENT("1029", "该代理商的可用分数不足"),
    /**
     * 该代理商还未设置售分额度 
     */
    USERCODE_NO_LIMIT("1030", "该代理商还未设置售分额度 "),
    ;

    private String code;

    private String msg;

    private DsMessageEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsg(String code) {
        String msg = "";
        for (DsMessageEnum bacEnum : DsMessageEnum.values()) {
            if (StringUtils.equals(bacEnum.code, code)) {
                msg = bacEnum.msg;
                break;
            }
        }
        return msg;
    }

    /**
     * @return 获取 code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param 设置  code 
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return 获取 msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param 设置  msg 
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
