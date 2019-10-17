package com.fxkj.ssc.utils.encryption;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class Md5Utils {

    /**
     * Used building output as Hex
     */
    private static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
                                           'f' };

    /**
     * 把数组所有元素，按字母排序，然后按照“参数=参数值”的模式用“&”字符拼接成字符串
     * 
     * @param params
     *            需要签名的参数
     * @return 签名的字符串
     */
    public static StringBuilder CreateLinkString(Map<String, String> params) {
        List<String> keys = new ArrayList<String>(params.keySet());

        Collections.sort(keys);
        StringBuilder prestr = new StringBuilder();
        String key = "";
        String value = "";
        for (int i = 0; i < keys.size(); i++) {
            key = (String) keys.get(i);
            value = (String) params.get(key);
            //去掉不需要参与签名的参数
            if ("".equals(value) || value == null || key.equalsIgnoreCase("sign")
                || key.equalsIgnoreCase("sign_type")) {
                continue;
            }
            prestr.append(key).append("=").append(value).append("&");
        }
        return prestr.deleteCharAt(prestr.length() - 1);
    }

    /**
     * 生成MD5签名
     * 
     * @param sArray
     *            需要签名的参数
     * @param key
     *            密钥
     * @return 签名结果
     */
    public static String BuildMysign(Map<String, String> sArray, String key) {
        if (sArray != null && sArray.size() > 0) {
            StringBuilder prestr = CreateLinkString(sArray);
            //System.out.println("********************代签名字符串为：" + prestr.toString() + key);
            return md5(prestr.toString() + key, "UTF-8");
        }
        return null;
    }

    /**
     * 生成MD5签名
     * @param text 需要签名参数
     * @param charset 字符集
     * @return 签名结果
     */
    public static String md5(String text, String charset) {
        MessageDigest msgDigest = null;

        try {
            msgDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("System doesn't support MD5 algorithm.");
        }

        try {
            msgDigest.update(text.getBytes(charset));

        } catch (UnsupportedEncodingException e) {

            throw new IllegalStateException("System doesn't support your  EncodingException.");

        }

        byte[] bytes = msgDigest.digest();

        String md5Str = new String(encodeHex(bytes));

        return md5Str;
    }

    public static char[] encodeHex(byte[] data) {

        int l = data.length;

        char[] out = new char[l << 1];

        // two characters form the hex value.
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
            out[j++] = DIGITS[0x0F & data[i]];
        }

        return out;
    }

    /**
     * 把数组所有元素，按字母排序，然后按照“参数=参数值”的模式用“&”字符拼接成字符串
     * 
     * @param params
     *            需要签名的参数
     * @return 签名的字符串
     */
    public static StringBuilder CreateLinkStringForFY(Map<String, String> params) {
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);
        StringBuilder prestr = new StringBuilder();
        String key = "";
        String value = "";
        for (int i = 0; i < keys.size(); i++) {
            key = (String) keys.get(i);
            value = (String) params.get(key);

            prestr.append(key).append("=").append(value).append("|");
        }
        return prestr.deleteCharAt(prestr.length() - 1);
    }

    /**
     * 生成MD5签名
     * 
     * @param sArray
     *            需要签名的参数
     * @param key
     *            密钥
     * @return 签名结果
     */
    public static String BuildMysignForFY(Map<String, String> sArray, String key) {
        if (sArray != null && sArray.size() > 0) {
            StringBuilder prestr = CreateLinkStringForFY(sArray);
            //System.out.println("********************代签名字符串为：" + prestr.toString() + key);

            return md5(prestr.toString() + key, "UTF-8");
        }
        return null;
    }

    /**
     * MD5签名后转Base64
     * 
     * @param str
     * @return
     * @throws Exception
     */
    public static String Encode(String str) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String newstr = Base64.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }

    /**
     * MD5生成32位
     * 
     * @param str
     * @return
     * @throws Exception
     */
    public static String Encode32(String str) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] md5Bytes = md5.digest(str.getBytes("utf-8"));
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        String newstr = hexValue.toString();
        return newstr;
    }

    /**
     * MD5生成16位
     * 
     * @param str
     * @return
     * @throws Exception
     */
    public static String Encode16(String str) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] md5Bytes = md5.digest(str.getBytes("utf-8"));
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        String newstr = hexValue.toString().substring(8, 24);
        return newstr;
    }

    /**
     * 生成16位 MD5签名
     * @param text 需要签名参数
     * @param key 秘钥
     * @param charset 字符集
     * @return 签名结果
     * @throws Exception 
     */
    public static String Encode16(String text, String key) throws Exception {
        return Encode(text + key);
    }

}
