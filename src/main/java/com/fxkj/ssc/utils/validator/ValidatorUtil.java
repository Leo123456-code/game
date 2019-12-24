/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.utils.validator;

import java.util.regex.Pattern;

/**
 * 校验器：利用正则表达式校验邮箱、手机号等
 * @author jerry
 * @version $Id: ValidatorUtil.java, v 0.1 2017年7月17日 上午10:42:22 jerry Exp $
 */
public class ValidatorUtil {

    /**
     * 正则表达式：验证用户名 验证用户名 5到10位
     */
    public static final String REGEX_USERNAME_FIVE = "^[a-zA-Z][a-zA-Z\\d]{4,9}$";

    /**
     * 正则表达式：验证用户名 6到10位
     */
	// public static final String REGEX_USERNAME_SIX = "^[a-zA-Z][a-zA-Z\\d]{5,9}$";
	public static final String REGEX_USERNAME_SIX = "^[a-zA-Z0-9]{6,15}$";

    /**
     * 正则表达式：验证密码
     */
    public static final String REGEX_PASSWORD      = "^[a-zA-Z0-9]{6,16}$";

    /**
     * 正则表达式：验证手机号
     */
//    public static final String REGEX_MOBILE        = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	public static final String REGEX_MOBILE = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[189])\\d{8}$";

    /** 
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL         = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 正则表达式：验证汉字
     */
    public static final String REGEX_CHINESE       = "^[\u4e00-\u9fa5]+$";


    /**
     * 正则表达式：验证字母
     */
    public static final String REGEX_ENGLISH       = "^[a-zA-Z]+$";

    /**
     * 正则表达式：验证数字
     */
    public static final String REGEX_NUMBER      = "^[0-9]+$";

    /**
     * 正则表达式：验证身份证
     */
    public static final String REGEX_ID_CARD       = "(^\\d{18}$)|(^\\d{15}$)";

    /**
     * 正则表达式：验证URL
     */
    public static final String REGEX_URL           = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";

    /**
     * 正则表达式：验证IP地址
     */
    public static final String REGEX_IP_ADDR       = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";

    /**
     * 正则表达式：验证手机所在国家code码
     */
    public static final String REGEX_PHONE_CODE       = "^[+][0-9]+$";

    /**
     * 校验用户名
     *
     * @param username
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsernameFiveToTen(String username) {
        return Pattern.matches(REGEX_USERNAME_FIVE, username);
    }

    /**
     * 校验用户名
     *
     * @param username
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsernameSixToTen(String username) {
        return Pattern.matches(REGEX_USERNAME_SIX, username);
    }

    /**
     * 校验密码
     *
     * @param password
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isPassword(String password) {
        int length = password.length();

        if (length > 5 && length < 17) {
            return true;
        }
        return false;
        // return Pattern.matches(REGEX_PASSWORD, password);
    }

    /**
     * 校验手机号
     *
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }

    /**
     * 校验邮箱
     *
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }

    /**
     * 校验汉字
     *
     * @param chinese
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese) {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }

    /**
     * 校验英文字母
     *
     * @param english
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEnglish(String english) {
        return Pattern.matches(REGEX_ENGLISH, english);
    }

    /**
     * 校验数字
     *
     * @param number
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isNumber(String number) {
        return Pattern.matches(REGEX_NUMBER, number);
    }

    /**
     * 校验身份证
     *
     * @param idCard
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIDCard(String idCard) {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }

    /**
     * 校验URL
     *
     * @param url
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }

    /**
     * 校验IP地址
     *
     * @param ipAddr
     * @return
     */
    public static boolean isIPAddr(String ipAddr) {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }
    /**
     * 校验手机号国家code  +86
     *
     * @param code
     * @return
     */
    public static boolean isPhoneCode(String code) {
        return Pattern.matches(REGEX_PHONE_CODE, code);
    }

}
