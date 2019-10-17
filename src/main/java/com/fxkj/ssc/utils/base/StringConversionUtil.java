/**
 * 
 */
package com.fxkj.ssc.utils.base;

import java.lang.reflect.Field;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONObject;

/**
 * @author Karl
 * @Date 2019年4月5日
 */
public class StringConversionUtil {

    private static final Logger logger = LoggerFactory.getLogger(StringConversionUtil.class);

    @SuppressWarnings("unchecked")
	public static <T> T strToObj(String str, Class<T> clazz) {
        try {
            if (str.indexOf("&") >= 0)
                str = strToJson(str);
            Object pojo;
            JSONObject jsonObject = JSONObject.fromObject(str);
            pojo = JSONObject.toBean(jsonObject, clazz);
            return (T) pojo;

        } catch (Exception ex) {
            logger.info("错误信息{}", ex);
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * get请求参数&拼接转化为json字符串
     * @return
     */
    private static String strToJson(String str) {
        String replaceAll = str.replaceAll("&", ",");
        replaceAll = "{" + replaceAll + "}";
        return replaceAll;
    }

    public static <T> String objToStr(T t, String splice) {

        StringBuffer sb = new StringBuffer();

        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String key = field.getName();
            Object obj = null;
            String value = "";
            try {
                obj = field.get(t);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (!(obj == null || StringUtils.isEmpty(obj.toString()))) {
                value = obj.toString();
                sb.append(key);
                sb.append("=");
                sb.append(value);
                sb.append(splice);
            }
        }

        //父类需要加密的
        Field[] superclass = t.getClass().getSuperclass().getDeclaredFields();
        for (Field field : superclass) {
            field.setAccessible(true);
            String key = field.getName();
            Object obj = null;
            String value = "";
            try {
                obj = field.get(t);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (!(obj == null || StringUtils.isEmpty(obj.toString()))) {
                value = obj.toString();
                sb.append(key);
                sb.append("=");
                sb.append(value);
                sb.append(splice);

            }
        }
        return sb.substring(0, sb.length() - 1);
    }
}
