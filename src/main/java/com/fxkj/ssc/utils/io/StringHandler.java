/**
 * 
 */
package com.fxkj.ssc.utils.io;

import java.util.Random;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Arvin
 *
 */
public class StringHandler {

	/**
	 * 扰身份证信息
	 * @param s
	 * @return
	 */
	public static String fuzzyIdCard(String s){
		StringBuffer buffer = new StringBuffer();
		int length = s.length();
		buffer.append(s.substring(0, 4));
		for (int i = 0; i < length - 8; i++) {
			buffer.append("*");
		}
		
		buffer.append(s.substring(length-4));
		return buffer.toString();
	}
	
	/**
	 * 扰手机号码
	 * @param s
	 * @return
	 */
	public static String fuzzyPhoneNum(String s){
		StringBuffer buffer = new StringBuffer();
		int length = s.length();
		buffer.append(s.substring(0, 2));
		for (int i = 0; i < length - 5; i++) {
			buffer.append("*");
		}
		
		buffer.append(s.substring(length-3));
		return buffer.toString();
	}
	
	/**
	 * 按位生成code
	 * @param count int 
	 * @return 验证码/邀请码
	 */
	public static String getCode(int count){
		StringBuffer buf = new StringBuffer();
		Random ran = new Random();
		for(int i=0;i<count;i++){
			buf.append(ran.nextInt(10));
		}
		
		return buf.toString();
	}
	
	/**
	 * 按位生成code
	 * @param count int 
	 * @return 验证码/邀请码
	 */
	static final String[] codeStr = {"2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","J","K","L","M",
			"N","P","Q","R","S","T","U","V","W","X","Y","Z"};
	public static String getComplexCode(int count){
		StringBuffer buf = new StringBuffer();
		Random ran = new Random();
		for(int i=0;i<count;i++){
			buf.append(codeStr[ran.nextInt(codeStr.length)]);
		}
		
		return buf.toString();
	}
	
	public static String ramdomUUID(){
		UUID id = UUID.randomUUID();
		String idStr = id.toString().replaceAll("-", "");
		return idStr;
	}

	public static String list2Str(List<?> list, String separator) {
		if(list == null || list.size() <= 0){
			return null;
		}
		
		StringBuffer buffer = new StringBuffer();
		int length = list.size() - 1;
		for (int i = 0; i < length; i++) {
			buffer.append(list.get(i).toString());
			buffer.append(separator);
		}
		buffer.append(list.get(length));
		return buffer.toString();
	}
	
	public static String array2Str(String separator, String...args) {
		if(args == null || args.length <= 0){
			return "";
		}
		
		StringBuffer buffer = new StringBuffer();
		int length = args.length - 1;
		for (int i = 0; i < length; i++) {
			buffer.append(args[i].toString());
			buffer.append(separator);
		}
		buffer.append(args[length]);
		return buffer.toString();
	}
	/**
	 * 是否是手机号
	 * @param phoneNum
	 * @return
	 */
	public static boolean isPhoneNum(String phoneNum){       
        String pattern = "^((13[0-9])|(15[^4,\\D])|(17[0-9])|(18[0-9]))\\d{8}$";
        return patternCheck(phoneNum, pattern);      
    }   
     
    public static boolean isEmail(String email){       
    	String pattern = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";  
        return patternCheck(email, pattern);  
    }
    
    public static boolean isChinese(String str){
    	String pattern = "^[\u4e00-\u9fa5],{0,}$";
        return patternCheck(str, pattern);  
    }
    
    public static boolean isIdCard(String idCardStr){
    	String pattern = "(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])";
        return patternCheck(idCardStr, pattern);  
    }
    
    public static boolean isURL(String urlStr){
    	String pattern = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
        return patternCheck(urlStr, pattern);  
    }
    
    public static boolean isIp(String urlStr){
    	String pattern = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
        return patternCheck(urlStr, pattern);  
    }
    
    /**
     * 判断是否是合规的amout数据(最多只能有两位小数)
     * @param amount
     * @return
     */
    public static boolean isAmount(String amount){
    	String pattern = "^\\d+(|\\.\\d{1,2})$";
    	return patternCheck(amount, pattern);  
    }
    
    private static boolean patternCheck(String sourceStr, String pattern){       
        Pattern p = Pattern.compile(pattern);       
        Matcher m = p.matcher(sourceStr);       
        return m.matches();       
    } 
}
