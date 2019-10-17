package com.fxkj.ssc.utils.date;

public class StringUtils {
    /**
     * 验空返回默认值
     * 
     * @param str
     * @param defaultStr
     * @return
     */
    public static String defaultStr(Object str, String defaultStr) {
        if (null == str) {
            return defaultStr;
        }
        return (String) str;
    }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || "".equals(str))
            return true;
        else
            return false;
    }
}
