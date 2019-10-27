package com.fxkj.ssc.utils.base;

import java.util.Random;

/**
 *   
 * 
 * @Title: RandomHelper.java
 * @Package com.jarvis.base.util
 * @Description: 随机数工具类
 * @author Jack 
 * @date 2017年9月2日 下午4:01:38
 * @version V1.0  
 */
public class RandomHelper {
	/**
	 * RANDOM 基数
	 */
	private final static int RANDOM_BASE = 10;

	/**
	 * 产生指定长度的数字值随机数
	 *
	 * @param length
	 *            需要产生的长度
	 * @return
	 */
	public static String getRandomStr(int length) {
		Random random = new Random();
		String randStr = "";
		for (int i = 0; i < length; i++) {
			String randItem = String.valueOf(random.nextInt(RANDOM_BASE));
			randStr += randItem;
		}
		return randStr;
	}

	/**
	 * 描述：手机验证码生成带字符，包含数字和字符 作者： 时间：Oct 29, 2008 3:40:07 PM
	 * 
	 * @param len
	 *            生成手机验证码长度
	 * @return
	 */
	public static String generateChatAndNumberIdentifyCode(int len) {
		char[] identifyStr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		// char[] identifyStr={'0','1','2','3','4','5','6','7','8','9'};
		// 生成随机类
		// Random random = new Random();
		int min = 0;
		int maxnum = identifyStr.length;
		String codeStr = "";
		for (int i = 0; i < len; i++) {
			int num = (int) ((maxnum - min) * Math.random() + min);
			codeStr += identifyStr[num];
		}
		return codeStr;
	}

	/**
	 * 描述：手机验证码生成带字符不包含数字
	 * 
	 * @param len
	 *            生成手机验证码长度
	 * @return
	 */
	public static String generateIdentifyCode(int len) {
		char[] identifyStr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		// char[] identifyStr={'0','1','2','3','4','5','6','7','8','9'};
		// 生成随机类
		// Random random = new Random();
		int min = 0;
		int maxnum = identifyStr.length;
		String codeStr = "";
		for (int i = 0; i < len; i++) {
			int num = (int) ((maxnum - min) * Math.random() + min);
			codeStr += identifyStr[num];
		}
		return codeStr;
	}

	/**
	 * 作者:Jack
	 * 日期:2019年10月27日上午4:07:55
	 * @param start
	 * @param end
	 * @return
	 * 返回值:int
	 * 返回值说明:产生两个数时间的随机数
	 */
	public static int getRandomNumber(int start,int end) {
		
		 //创建Random类对象
        Random random = new Random();              
         
        //产生随机数
        int number = random.nextInt(end - start + 1) + start;
         
        return number;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getRandomNumber(0,1));
	}
}
