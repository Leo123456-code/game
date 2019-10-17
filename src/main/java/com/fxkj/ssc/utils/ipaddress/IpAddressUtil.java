/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.utils.ipaddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fxkj.ssc.baseVo.AliCloudApi;
import com.fxkj.ssc.utils.base.HttpUtils;

/**
 * ip地址工具类
 * @author jerry
 * @version $Id: IpAddressUtil.java, v 0.1 2017年7月11日 下午4:03:34 jerry Exp $
 */
public class IpAddressUtil {

    /** 日志*/
    private static Logger logger = LoggerFactory.getLogger(IpAddressUtil.class);

    /**
     * 获取外网（服务端）ip
     * 
     * @return
     * @throws IOException
     */
    public static String getOuterIp() throws IOException {
        InputStream inputStream = null;
        try {
            URL url = new URL("http://1212.ip138.com/ic.asp");
            URLConnection urlconnnection = url.openConnection();
            inputStream = urlconnnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "GB2312");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer webContent = new StringBuffer();
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                webContent.append(str);
            }
            int ipStart = webContent.indexOf("[") + 1;
            int ipEnd = webContent.indexOf("]");
            return webContent.substring(ipStart, ipEnd);
        } catch (Exception e) {
            throw e;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /**
     * 获取内网ip
     * 
     * @return
     * @throws IOException
     */
    public static String getInnerIp() throws IOException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        return inetAddress.getHostAddress();
    }

    /**
     * 获取IP地址所在地信息
     * 
     * @param ip
     * @return
     * @throws IOException
     */
    public static Map<String, Object> getAdd(String ip) throws IOException {
        InputStream inputStream = null;

        Map<String, Object> resultmap = new HashMap<String, Object>();
        try {
            URL url = new URL("http://ip.taobao.com/service/getIpInfo.php?ip=" + ip);
            URLConnection urlconnnection = url.openConnection();
            inputStream = urlconnnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer webContent = new StringBuffer();
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                webContent.append(str);
            }

            JSONObject jsonObject = JSONObject.parseObject(webContent.toString()).getJSONObject("data");
            resultmap = (Map<String, Object>) jsonObject;

            return resultmap;
        } catch (Exception e) {
            throw e;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public static Map<String, Object> alicloudapi(String ip, String appcode) {

        Map<String, Object> resultmap = new HashMap<String, Object>();

        if (isInnerIP(ip)) {
            return resultmap;
        }

        String host = "https://ipro.market.alicloudapi.com";
        String path = "/ip";
        String method = "GET";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("ip", ip);

        try {
            //调用付费的阿里云查询
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);

            String resultBody = EntityUtils.toString(response.getEntity());
            logger.info("调用付费的阿里云查询:" + resultBody);

            AliCloudApi aliCloudApi = JSON.parseObject(resultBody, AliCloudApi.class);
            if (aliCloudApi != null && aliCloudApi.getError_code() == 1000) {
                resultmap.put("country", aliCloudApi.getResult().getCountry());
                resultmap.put("region", aliCloudApi.getResult().getRegion());
                resultmap.put("city", aliCloudApi.getResult().getCity());

                return resultmap;
            } else {
                //调用免费的淘宝查询
                resultmap = getAdd(ip);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally{

        }
        return resultmap;
    }

    /**
     * 获取Ip地址,常用api
     * @param request
     * @return
     */
    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");

        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个ip值，第一个ip才是真实ip
            if (ip.indexOf(",") != -1) {
                ip = ip.split(",")[0];
            }
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /** 
     * 获取当前客户端网络ip 
     * @param request 
     * @return 
     * @throws IOException 
     */
//    public static String getIpAddr(HttpServletRequest request) throws IOException {
//
//        String ipAddress = request.getHeader("x-forwarded-for");
//
//        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
//            ipAddress = request.getHeader("Proxy-Client-IP");
//        }
//        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
//            ipAddress = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
//            ipAddress = request.getRemoteAddr();
//            if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
//                //根据网卡取本机配置的IP  
//                InetAddress inet = null;
//                try {
//                    inet = InetAddress.getLocalHost();
//                } catch (UnknownHostException e) {
//                    e.printStackTrace();
//                }
//                ipAddress = inet.getHostAddress();
//            }
//        }
//        //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割  
//        if (ipAddress != null && ipAddress.length() > 15) { //"***.***.***.***".length() = 15  
//            if (ipAddress.indexOf(",") > 0) {
//                ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
//            }
//        }
//
//        //判断是否是内网ip
//        if (isInnerIP(ipAddress)) {
//            ipAddress = getOuterIp();
//        }
//
//        return ipAddress;
//    }

    public static boolean isInnerIP(String ipAddress) {/*判断是否是内网IP*/
        boolean isInnerIp = false;//默认给定IP不是内网IP      
        long ipNum = getIpNum(ipAddress);
        /** 
         * 私有IP：A类  10.0.0.0    -10.255.255.255 
         *       B类  172.16.0.0  -172.31.255.255    
         *       C类  192.168.0.0 -192.168.255.255   
         *       D类   127.0.0.0   -127.255.255.255(环回地址)  
         **/
        long aBegin = getIpNum("10.0.0.0");
        long aEnd = getIpNum("10.255.255.255");
        long bBegin = getIpNum("172.16.0.0");
        long bEnd = getIpNum("172.31.255.255");
        long cBegin = getIpNum("192.168.0.0");
        long cEnd = getIpNum("192.168.255.255");
        long dBegin = getIpNum("127.0.0.0");
        long dEnd = getIpNum("127.255.255.255");
        isInnerIp = isInner(ipNum, aBegin, aEnd) || isInner(ipNum, bBegin, bEnd) || isInner(ipNum, cBegin, cEnd) || isInner(ipNum, dBegin, dEnd);
        return isInnerIp;
    }

    private static long getIpNum(String ipAddress) {/*获取IP数*/
        String[] ip = ipAddress.split("\\.");
        long a = Integer.parseInt(ip[0]);
        long b = Integer.parseInt(ip[1]);
        long c = Integer.parseInt(ip[2]);
        long d = Integer.parseInt(ip[3]);
        long ipNum = a * 256 * 256 * 256 + b * 256 * 256 + c * 256 + d;
        return ipNum;
    }

    private static boolean isInner(long userIp, long begin, long end) {
        return (userIp >= begin) && (userIp <= end);
    }

}
