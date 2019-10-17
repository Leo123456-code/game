/**
 * 
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.utils.date;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 
 * @author ant
 * @version $Id: Money.java, v 0.1 2017年7月18日 下午1:49:28 ant Exp $
 */
public class Money {

    /**     数据库默认值*/
    public final static String   INIT_AMOUNT   = "0.00000";

    // 默认除法运算精度
    private static final Integer DEF_DIV_SCALE = 4;

    /**
     * 提供精确的加法运算。
     *
     * @param value1 被加数
     * @param value2 加数
     * @return 两个参数的和
     */
    public static Double add(Double value1, Double value2) {
        if (null == value1) {
            value1 = 0.00000;
        }
        if (null == value2) {
            value2 = 0.00000;
        }
        BigDecimal b1 = new BigDecimal((Double) value1);
        BigDecimal b2 = new BigDecimal((Double) value2);
        return b1.add(b2).doubleValue();
    }
    
    public static double addString(Double value1, Double value2) {
        
        if (null == value1) {
            value1 = 0.00000;
        }
        if (null == value2) {
            value2 = 0.00000;
        }
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确的减法运算。
     *
     * @param value1 被减数
     * @param value2 减数
     * @return 两个参数的差
     */
    public static double sub(Double value1, Double value2) {
        if (null == value1) {
            value1 = 0.00000;
        }
        if (null == value2) {
            value2 = 0.00000;
        }
        BigDecimal b1 = new BigDecimal((Double) value1);
        BigDecimal b2 = new BigDecimal((Double) value2);
        return b1.subtract(b2).doubleValue();
    }
    
    public static double subString(Double value1, Double value2) {
        
        if (null == value1) {
            value1 = 0.00000;
        }
        if (null == value2) {
            value2 = 0.00000;
        }
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算。
     *
     * @param value1 被乘数
     * @param value2 乘数
     * @return 两个参数的积
     */
    public static Double mul(Double value1, Double value2) {
        if (null == value1) {
            value1 = 0.00000;
        }
        if (null == value2) {
            value2 = 0.00000;
        }
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时， 精确到小数点以后10位，以后的数字四舍五入。
     *
     * @param dividend 被除数
     * @param divisor  除数
     * @return 两个参数的商
     */
    public static Double divide(Double dividend, Double divisor) {
        return divide(dividend, divisor, DEF_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算。 当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入。
     *
     * @param dividend 被除数
     * @param divisor  除数
     * @param scale    表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static Double divide(Double dividend, Double divisor, Integer scale) {
        if (null == dividend) {
            dividend = 0.00000;
        }
        if (null == divisor) {
            divisor = 1.00000;
        }
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(dividend));
        BigDecimal b2 = new BigDecimal(Double.toString(divisor));
        return b1.divide(b2, scale, RoundingMode.HALF_UP).doubleValue();
    }


    public static String addByString(String value1, String value2) {

        if (null == value1 || "".equals(value1)) {
            value1 = "0";
        }
        if (null == value2 || "".equals(value2)) {
            value2 = "0";
        }
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));
        return b1.add(b2).toPlainString();
    }

    public static String subByString(String value1, String value2) {

        if (null == value1 || "".equals(value1)) {
            value1 = "0";
        }
        if (null == value2 || "".equals(value2)) {
            value2 = "0";
        }
        BigDecimal b1 = new BigDecimal(String.valueOf(value1));
        BigDecimal b2 = new BigDecimal(String.valueOf(value2));
        return b1.subtract(b2).toPlainString();
    }
}
