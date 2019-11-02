/**
 * 
 */
package com.fxkj.ssc.enums;

/**
 * @author Karl
 * @Description: 免转模式回调路径
 * @Date 2019年11月1日 下午2:23:07
 */
public enum CallBackErrorEnum {

    SUCCESS(0, "成功"),

    FAIL(1, "失败"),

    PARAMETER_NULL(-99, "参数为空"),

    NO_USER(-100, "不存在用户"),

    NO_BALANCE(-101, "余额不足"),

    SIGN_ERROR(-102, "签名错误"),

    ORDER_ERROR(-103, "订单号不存在"),

    ORDER_REPEAT(-104, "订单重复"),

    ORDER_REVOKED(-105, "订单已撤销"),

    ;

    private Integer code;

    private String  desc;

    private CallBackErrorEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * @return 获取 code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param 设置  code 
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return 获取 desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param 设置  desc 
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
