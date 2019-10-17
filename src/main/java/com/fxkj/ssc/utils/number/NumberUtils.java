package com.fxkj.ssc.utils.number;

import java.text.DecimalFormat;
/**
* @Description: 数字格式化工具
* @author:James
*
* @return
* @exception
* @date        2019/4/29 15:46
*/
public class NumberUtils {


    /**
     *  double类型转String,格式化 900,000,000
     * @param number
     * @return
     */
    public static String numberFormat(Double number){
        DecimalFormat df = new DecimalFormat("￥###,###,###,###,###.0000");
        return  df.format(number);
    }
    /**
     *  Long类型转String,格式化 900,000,000
     * @param number
     * @return
     */
//    public static String numberFormat(Long number){
//        DecimalFormat df = new DecimalFormat("￥###,###,###,###,###.0000");
//        return  df.format(number);
//    }











}
