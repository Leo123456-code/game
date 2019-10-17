package com.fxkj.ssc.utils.password;

import com.fxkj.ssc.utils.encryption.AesUtil;

/**
 * 作者: Jack
 * 时间: 2019年10月7日下午1:52:05
 * 说明: Aes密码加解密
 *
 */
public class AesPassWordUtil {

	/**
	 * 作者:Jack
	 * 日期:2019年10月7日下午1:47:05
	 * @param passWord
	 * @return
	 * 返回值:String
	 * 返回值说明:密码加密
	 */
	public static String enCodePwd(String passWord) {
		
		String aesEncrypt = AesUtil.aesEncrypt(passWord);
		
		return aesEncrypt;
	}
	
	/**
	 * 作者:Jack
	 * 日期:2019年10月7日下午1:48:55
	 * @param aesPassWord
	 * @return
	 * 返回值:String
	 * 返回值说明:解密
	 */
	public static String deCodePwd(String aesPassWord) {
		
		 String aesDecrypt = AesUtil.aesDecrypt(aesPassWord);
		
		 return aesDecrypt;
	}
}
