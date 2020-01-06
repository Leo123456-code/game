/**
 * 
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.utils.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 
 * @author ant
 * @version $Id: CreaditUuid.java, v 0.1 2017年7月18日 下午6:24:36 ant Exp $
 */
public class CreaditUuid {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    static SimpleDateFormat ymdhm = new SimpleDateFormat("yyyyMMddHHmm");
    static SimpleDateFormat ymd = new SimpleDateFormat("yyyyMMdd");
    static SimpleDateFormat yyMMddHHmm=new SimpleDateFormat("yyMMddHHmm");

    /**
     * 32位随机码
     * 
     * @return
     */
    public static String getUuid() {
        String id = UUID.randomUUID().toString();
        id = id.replace("-", "");//替换掉中间的那个斜杠  
        return id;
    }

    /**
     * 精确时间到秒+6为随机数=20位
     * 
     * @return
     */
    public static String getNumberUuid() {
        StringBuffer str = new StringBuffer();
        str.append(simpleDateFormat.format(new Date())).append((int) ((Math.random() * 9 + 1) * 100000));
        return str.toString();
    }

    /**
     * 精确时间到秒+2为随机数=16位
     * 
     * @return
     */
    public static String getNumberUuid16() {
        StringBuffer str = new StringBuffer();
        str.append(simpleDateFormat.format(new Date())).append((int) ((Math.random() * 9 + 1) * 10));
        return str.toString();
    }

    /**
     * 精确时间到分10+5为随机数=15位
     *
     * @return
     */
    public static String getNumberUuid15() {
        StringBuffer str = new StringBuffer();
        str.append(yyMMddHHmm.format(new Date())).append((int) ((Math.random() * 9 + 1) * 10000));
        return str.toString();
    }

    /**
     * 精确时间到分8+6为随机数=14位
     *
     * @return
     */
    public static String getNumberUuid14() {
        StringBuffer str = new StringBuffer();
        str.append(ymd.format(new Date())).append((int) ((Math.random() * 9 + 1) * 100000));
        return str.toString();
    }

    /**
     * 精确时间到分10+5为随机数=15位 180911144438DE5
     *
     * @return
     */
    public static String getNumberUuid15A() {
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        StringBuffer str=new StringBuffer();
        str.append(yyMMddHHmm.format(new Date())).append(uuid.substring(0,5));
        return str.toString();
    }

    /**
     * 精确时间到分10+8为随机数=18位 1809111449115F5C3F
     *
     * @return
     */
    public static String getNumberUuid18A() {
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        StringBuffer str=new StringBuffer();
        str.append(yyMMddHHmm.format(new Date())).append(uuid.substring(0,8));
        return str.toString();
    }

    /**
     * 精确时间到分10+10为随机数=20位 1809111449115F5C3FZZ
     *
     * @return
     */
    public static String getNumberUuid20A() {
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        StringBuffer str=new StringBuffer();
        str.append(yyMMddHHmm.format(new Date())).append(uuid.substring(0,10));
        return str.toString();
    }
}
