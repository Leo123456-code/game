package com.fxkj.ssc.utils.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 精度计算工具类
 *
 * @author Mike
 * @date 2018年3月10日
 * @description 
 */
public class BigDecimalUtils {

    private BigDecimalUtils() {
    }

    /**
     * 由于Java的简单类型不能够精确的对浮点数进行运算，这个工具类提供精 确的浮点数运算，包括加减乘除和四舍五入。
     */
    // 默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;

    /**
     * 提供精确的加法运算。
     * 
     * @param v1
     *            被加数
     * @param v2
     *            加数
     * @return 两个参数的和
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确的减法运算。
     * 
     * @param v1
     *            被减数
     * @param v2
     *            减数
     * @return 两个参数的差
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算。
     * 
     * @param v1
     *            被乘数
     * @param v2
     *            乘数
     * @return 两个参数的积
     */
    public static double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以后10位，以后的数字四舍五入。
     * 
     * @param v1
     *            被除数
     * @param v2
     *            除数
     * @return 两个参数的商
     */
    public static double div(double v1, double v2) {
        if (v2 <= 0) {
            return 0;
        }
       double div = div(v1, v2, DEF_DIV_SCALE);
//       int numberDecimalDigits = getNumberDecimalDigits(div);
//       if(numberDecimalDigits >= DEF_DIV_SCALE) {
//          return BigDecimalUtils.subDouble(div(v1, v2, DEF_DIV_SCALE), 10);
//       }
       return div;
    }
    
    /**
     * 作者:Jack
     * 日期:2019年4月26日上午11:45:31
     * @param number
     * @return
     * 返回值:int
     * 返回值说明:获取小数个数
     */
    public static int getNumberDecimalDigits(double number) {
        String moneyStr = number + "";
        String[] num = moneyStr.split("\\.");
        if (num.length == 2) {
            for (;;){
                if (num[1].endsWith("0")) {
                    num[1] = num[1].substring(0, num[1].length() - 1);
                }else {
                    break;
                }
            }
            return num[1].length();
        }else {
            return 0;
        }
    }
    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
     * 
     * @param v1
     *            被除数
     * @param v2
     *            除数
     * @param scale
     *            表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static double div(double v1, double v2, int scale) {
        if (v2 <= 0) {
            return 0;
        }
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_DOWN).doubleValue();
    }

    /**
     * 提供精确的小数位四舍五入处理。
     * 
     * @param v
     *            需要四舍五入的数字
     * @param scale
     *            小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_DOWN).doubleValue();
    }

    /**
     * 提供精确的类型转换(Float)
     * 
     * @param v
     *            需要被转换的数字
     * @return 返回转换结果
     */
    public static float convertsToFloat(double v) {
        BigDecimal b = new BigDecimal(v);
        return b.floatValue();
    }

    /**
     * 提供精确的类型转换(Int)不进行四舍五入
     * 
     * @param v
     *            需要被转换的数字
     * @return 返回转换结果
     */
    public static int convertsToInt(double v) {
        BigDecimal b = new BigDecimal(v);
        return b.intValue();
    }

    /**
     * 提供精确的类型转换(Long)
     * 
     * @param v
     *            需要被转换的数字
     * @return 返回转换结果
     */
    public static long convertsToLong(double v) {
        BigDecimal b = new BigDecimal(v);
        return b.longValue();
    }

    /**
     * 返回两个数中大的一个值
     * 
     * @param v1
     *            需要被对比的第一个数
     * @param v2
     *            需要被对比的第二个数
     * @return 返回两个数中大的一个值
     */
    public static double returnMax(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.max(b2).doubleValue();
    }

    /**
     * 返回两个数中小的一个值
     * 
     * @param v1
     *            需要被对比的第一个数
     * @param v2
     *            需要被对比的第二个数
     * @return 返回两个数中小的一个值
     */
    public static double returnMin(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.min(b2).doubleValue();
    }

    /**
     * 精确对比两个数字
     * 
     * @param v1
     *            需要被对比的第一个数
     * @param v2
     *            需要被对比的第二个数
     * @return 如果两个数一样则返回0，如果第一个数比第二个数大则返回1，反之返回-1
     */
    public static int compareTo(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.compareTo(b2);
    }

    /**
     * 作者:Jack
     * 日期:2019年3月5日上午1:37:33
     * @param v1
     * @param scale
     * @return
     * 返回值:double
     * 返回值说明:截取小数个数
     */
    public static double subDouble(double v1, int scale) {
        BigDecimal bd = new BigDecimal(Double.toString(v1)).setScale(scale, BigDecimal.ROUND_DOWN);
        return bd.doubleValue();
    }
    
   
    /**
            * 将double格式化为指定小数位的String，不足小数位用0补全
     * @author James
     * @Time 2019年8月14日下午3:38:18
     * @Description
     */
    public static String roundByScale(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The   scale   must   be   a   positive   integer   or   zero");
        }
        if(scale == 0){
            return new DecimalFormat("0").format(v);
        }
        String formatStr = "0.";
        for(int i=0;i<scale;i++){
            formatStr = formatStr + "0";
        }
        return new DecimalFormat(formatStr).format(v);
    }

    public static void main(String[] args) {
        double subDouble = BigDecimalUtils.subDouble(1.60951938886222, 5);
        System.out.println(subDouble);
        int numberDecimalDigits = BigDecimalUtils.getNumberDecimalDigits(1.1000001);
        System.out.println(numberDecimalDigits);
        
        BigDecimal a = new BigDecimal(1.578848);
        System.out.println("down="+a.setScale(4,BigDecimal.ROUND_DOWN)+"\tup="+a.setScale(0,BigDecimal.ROUND_HALF_UP));
    }

}
