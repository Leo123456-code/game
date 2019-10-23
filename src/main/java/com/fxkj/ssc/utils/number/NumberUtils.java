package com.fxkj.ssc.utils.number;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
     * 
    * @Title: valiadPositiveInteger  
    * @Description: 判断一个字符串是否可以转成正整数 
    * @param @param target
    * @param @return    参数  
    * @author james
    * @date 2019年10月23日
    * @return boolean    返回类型  
    * @throws
     */
    public static boolean valiadPositiveInteger(String 	target) {
    	Matcher mer = Pattern.compile("^[+]?\\d+(.\\d+)?$").matcher(target);
    	return mer.find();
    }
    












}
