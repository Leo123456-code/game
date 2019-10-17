package com.fxkj.ssc.utils.http;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.fxkj.ssc.baseVo.RequestParam;
import com.fxkj.ssc.utils.base.StringHelper;

import sun.misc.BASE64Encoder;

/**
 * HttpClient帮助类
 * Created by dell on 2015/1/13.
 */
@SuppressWarnings({ "deprecation" })
public class HttpClientUtil {

    private static Logger                                   logger      = LoggerFactory.getLogger(HttpClientUtil.class);

    /** 全局连接池对象 */
    private static final PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();

    /**
     * 静态代码块配置连接池信息
     */
    static {

        // 设置最大连接数
        connManager.setMaxTotal(2000);
        // 设置每个连接的路由数
        connManager.setDefaultMaxPerRoute(200);

    }

    /**
     * 封装HTTP POST方法
     * @param
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws java.io.IOException
     */
    public static String post(String url, Map<String, String> paramMap) {
        try {
            @SuppressWarnings("resource")
            HttpClient httpClient = new DefaultHttpClient();

            HttpParams params = httpClient.getParams();
            if (params == null) {
                params = new BasicHttpParams();
            }
            //设置链接超时和读取超时
            HttpConnectionParams.setConnectionTimeout(params, 10 * 1000);
            HttpConnectionParams.setSoTimeout(params, 10 * 1000);

            HttpPost httpPost = new HttpPost(url);

            List<NameValuePair> formparams = setHttpParams(paramMap);
            UrlEncodedFormEntity param = new UrlEncodedFormEntity(formparams, "UTF-8");
            httpPost.setEntity(param);
            HttpResponse response = httpClient.execute(httpPost);
            String httpEntityContent = getHttpEntityContent(response);
            httpPost.abort();
            return httpEntityContent;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("http post请求异常:", e);
            return "";
        }
    }

    /**
     * 封装HTTP POST方法
     * @param
     * @param （如JSON串）
     * @return
     * @throws ClientProtocolException
     * @throws java.io.IOException
     */
    @SuppressWarnings("resource")
    public static String post(String url, String data) throws ClientProtocolException, IOException {
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", "text/json; charset=utf-8");
        httpPost.setEntity(new StringEntity(URLEncoder.encode(data, "UTF-8")));
        HttpResponse response = httpClient.execute(httpPost);
        String httpEntityContent = getHttpEntityContent(response);
        httpPost.abort();
        return httpEntityContent;
    }

    //封装post
    @SuppressWarnings("resource")
    public static String post(String url) throws ClientProtocolException, IOException {
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);
        JSONObject params = new JSONObject();
        params.put("record", "{'queryState':'0','payDate':'date'}");
        StringEntity s = new StringEntity(params.toString());
        s.setContentEncoding("UTF-8");
        s.setContentType("application/json");
        httpPost.setEntity(s);
        HttpResponse response = httpClient.execute(httpPost);
        if (response.getStatusLine().getStatusCode() == 200) {
            String result = EntityUtils.toString(response.getEntity());
            return result;
        } else {
            String result = EntityUtils.toString(response.getEntity());
            return result;

        }
        /*JSONObject params = new JSONObject();
        params.put("record", "{'queryState':'0','payDate':'date'}");
        DefaultHttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        try {
        	StringEntity s = new StringEntity(params.toString());
        	s.setContentEncoding("UTF-8");
        	s.setContentType("application/json");
        	post.setEntity(s);
        	HttpResponse res = client.execute(post);
        	if (res.getStatusLine().getStatusCode() == 200 ) {
        		String result = EntityUtils.toString(res.getEntity());
        		return result;
        	}else{
        		return null;
        	}
        } catch (Exception e) {
        	throw new RuntimeException(e);
        }*/

    }

    /**
     * 封装HTTP GET方法
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws java.io.IOException
     */
    public static String get(String url) throws ClientProtocolException, IOException {
        @SuppressWarnings("resource")
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet();
        httpGet.setURI(URI.create(url));
        HttpResponse response = httpClient.execute(httpGet);
        String httpEntityContent = getHttpEntityContent(response);
        httpGet.abort();
        return httpEntityContent;
    }

    /**
     * 封装HTTP GET方法
     * @param
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws java.io.IOException
     */
    public static String get(String url, Map<String, String> paramMap) throws ClientProtocolException, IOException {
        @SuppressWarnings("resource")
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet();
        List<NameValuePair> formparams = setHttpParams(paramMap);
        String param = URLEncodedUtils.format(formparams, "UTF-8");
        httpGet.setURI(URI.create(url + "?" + param));
        HttpResponse response = httpClient.execute(httpGet);
        String httpEntityContent = getHttpEntityContent(response);
        httpGet.abort();
        return httpEntityContent;
    }

    /**
     * 巨匠支付，更改编码格式 
     * @param url
     * @param paramMap
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String get2(String url, Map<String, String> paramMap) throws ClientProtocolException, IOException {
        @SuppressWarnings("resource")
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet();
        List<NameValuePair> formparams = setHttpParams(paramMap);
        String param = URLEncodedUtils.format(formparams, "GB2312");
        System.err.println("param:" + param);
        httpGet.setURI(URI.create(url + "?" + param));
        HttpResponse response = httpClient.execute(httpGet);
        String httpEntityContent = getHttpEntityContent2(response);
        httpGet.abort();
        return httpEntityContent;
    }

    /**
     * 巨匠支付，将流转成base64
     * @param url
     * @param paramMap
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String getToBase64(String url, Map<String, String> paramMap) throws ClientProtocolException, IOException {
        @SuppressWarnings("resource")
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet();
        List<NameValuePair> formparams = setHttpParams(paramMap);
        String param = URLEncodedUtils.format(formparams, "GB2312");
        httpGet.setURI(URI.create(url + "?" + param));
        HttpResponse response = httpClient.execute(httpGet);

        HttpEntity entity = response.getEntity();
        if (entity != null) {
            InputStream is = entity.getContent();

            //接收数组
            byte[] data = null;
            ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
            byte[] buff = new byte[100];
            int rc = 0;
            while ((rc = is.read(buff, 0, 100)) > 0) {
                swapStream.write(buff, 0, rc);
            }
            data = swapStream.toByteArray();

            return new BASE64Encoder().encode(data);
            //          File file = new File("D:/java/test.png");
            //          
            //          BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(file));
            //          int len=-1;
            //          byte[] b=new byte[1024];
            //          while((len=is.read(b))!=-1){
            //              out.write(b,0,len);
            //          }
            //          out.close();
            //          is.close();
        }
        return "";
    }

    /**
     * 封装HTTP PUT方法
     * @param
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws java.io.IOException
     */
    public static String put(String url, Map<String, String> paramMap) throws ClientProtocolException, IOException {
        @SuppressWarnings("resource")
        HttpClient httpClient = new DefaultHttpClient();
        HttpPut httpPut = new HttpPut(url);
        List<NameValuePair> formparams = setHttpParams(paramMap);
        UrlEncodedFormEntity param = new UrlEncodedFormEntity(formparams, "UTF-8");
        httpPut.setEntity(param);
        HttpResponse response = httpClient.execute(httpPut);
        String httpEntityContent = getHttpEntityContent(response);
        httpPut.abort();
        return httpEntityContent;
    }

    /**
     * 封装HTTP DELETE方法
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws java.io.IOException
     */
    public static String delete(String url) throws ClientProtocolException, IOException {
        @SuppressWarnings("resource")
        HttpClient httpClient = new DefaultHttpClient();
        HttpDelete httpDelete = new HttpDelete();
        httpDelete.setURI(URI.create(url));
        HttpResponse response = httpClient.execute(httpDelete);
        String httpEntityContent = getHttpEntityContent(response);
        httpDelete.abort();
        return httpEntityContent;
    }

    /**
     * 封装HTTP DELETE方法
     * @param
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws java.io.IOException
     */
    public static String delete(String url, Map<String, String> paramMap) throws ClientProtocolException, IOException {
        @SuppressWarnings("resource")
        HttpClient httpClient = new DefaultHttpClient();
        HttpDelete httpDelete = new HttpDelete();
        List<NameValuePair> formparams = setHttpParams(paramMap);
        String param = URLEncodedUtils.format(formparams, "UTF-8");
        httpDelete.setURI(URI.create(url + "?" + param));
        HttpResponse response = httpClient.execute(httpDelete);
        String httpEntityContent = getHttpEntityContent(response);
        httpDelete.abort();
        return httpEntityContent;
    }

    /**
     * 设置请求参数
     * @param
     * @return
     */
    private static List<NameValuePair> setHttpParams(Map<String, String> paramMap) {
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        Set<Map.Entry<String, String>> set = paramMap.entrySet();
        for (Map.Entry<String, String> entry : set) {
            formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        return formparams;
    }

    /**
     * 获得响应HTTP实体内容
     * @param response
     * @return
     * @throws java.io.IOException
     * @throws java.io.UnsupportedEncodingException
     */
    private static String getHttpEntityContent(HttpResponse response) throws IOException, UnsupportedEncodingException {
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            InputStream is = entity.getContent();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
            String line = br.readLine();
            StringBuilder sb = new StringBuilder();
            while (line != null) {
                sb.append(line + "\n");
                line = br.readLine();
            }
            return sb.toString();
        }
        return "";
    }

    /**
     * 巨匠支付专用
     */
    private static String getHttpEntityContent2(HttpResponse response) throws IOException, UnsupportedEncodingException {
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            InputStream is = entity.getContent();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "GB2312"));
            String line = br.readLine();
            StringBuilder sb = new StringBuilder();
            while (line != null) {
                sb.append(line + "\n");
                line = br.readLine();
            }
            return sb.toString();
        }
        return "";
    }

    /**
     *  HttpURLConn
     *
     * @param requestParam
     * @return
     */
    public static String sendPostByHttpURLConn(RequestParam requestParam) {
        String result = "";
        OutputStreamWriter out = null;
        //        PrintWriter out = null;
        BufferedReader in = null;
        try {
            URL url = new URL(requestParam.getData().get("url").toString());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Accept", "*/*");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            connection.setRequestProperty("Accept-Charset", "UTF-8");
            connection.setRequestProperty("contentType", "UTF-8");

            connection.connect();
            out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8"); // utf-8编码
            //            out = new PrintWriter(connection.getOutputStream());
            out.append(requestParam.getData().get("params").toString());
            out.flush();
            out.close();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            logger.error("http请求异常,sessionId:{},deptId:{},cmd:{},异常原因:{}", requestParam.getSessionId(), requestParam.getDeptID(), requestParam.getCmd(), e);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (Exception ex) {
                logger.error("http请求异常,sessionId:{},deptId:{},cmd:{},异常原因:{}", requestParam.getSessionId(), requestParam.getDeptID(), requestParam.getCmd(), ex);
            }
        }
        return result;
    }

    /**
     * URLConn
     *
     * @param requestParam
     * @return
     */
    public static String sendPostByURLConn(RequestParam requestParam) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(requestParam.getData().get("url").toString());
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-Type", "application/json");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(requestParam.getData().get("params").toString());
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            logger.error("http请求异常,sessionId:{},deptId:{},cmd:{},异常原因:{}", requestParam.getSessionId(), requestParam.getDeptID(), requestParam.getCmd(), e);
        } //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (Exception ex) {
                logger.error("http请求异常,sessionId:{},deptId:{},cmd:{},异常原因:{}", requestParam.getSessionId(), requestParam.getDeptID(), requestParam.getCmd(), ex);
            }
        }
        return result;
    }

    /**
     * httpClient BasicHttpEntity
     *
     * @param requestParam
     * @return
     */
    public static String sendPostByHttpClient(RequestParam requestParam) {
        String result = "";
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost(requestParam.getData().get("url").toString());
            BasicHttpEntity entity = new BasicHttpEntity();
            InputStream in = new ByteArrayInputStream(requestParam.getData().get("params").toString().getBytes("UTF-8"));
            entity.setContent(in);
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
            HttpResponse res = client.execute(httpPost);
            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                result = EntityUtils.toString(res.getEntity());// 返回json格式：
            }
        } catch (Exception e) {
            logger.error("http请求异常,sessionId:{},deptId:{},cmd:{},异常原因:{}", requestParam.getSessionId(), requestParam.getDeptID(), requestParam.getCmd(), e);
        }
        return result;
    }

    /**
     *
     * HttpClient StringEntity
     * @param requestParam
     * @return
     * @throws Exception
     */
    public static String sendPostByHttpClient2(RequestParam requestParam) throws Exception {
        String result = "";
        HttpResponse response = null;
        HttpPost httpPost = null;
        HttpClient client = null;
        try {
            client = HttpClients.createDefault();
            RequestConfig requestConfig;
            if (0 > requestParam.getTime()) {
                requestConfig = RequestConfig.custom().setSocketTimeout(requestParam.getTime()).setConnectTimeout(requestParam.getTime()).build();
            } else {
                requestConfig = RequestConfig.custom().setSocketTimeout(10000).setConnectTimeout(10000).build();
            }
            httpPost = new HttpPost(requestParam.getData().get("url").toString());
            httpPost.setHeader("Accept", "application/json;charset=UTF-8");
            httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");
            httpPost.setConfig(requestConfig);
            StringEntity entity = new StringEntity(requestParam.getData().get("params").toString());
            entity.setContentType("application/json;charset=UTF-8");
            httpPost.setEntity(entity);
            response = client.execute(httpPost);
            result = getHttpEntityContent(response);
        } catch (Exception e) {
            logger.error("http请求异常,sessionId:{},deptId:{},cmd:{},异常原因:{}", requestParam.getSessionId(), requestParam.getDeptID(), requestParam.getCmd(), e);
        } finally {
            if (response != null) {
                EntityUtils.consume(response.getEntity());
            }
            httpPost.releaseConnection();
            if (client != null && client instanceof CloseableHttpClient) {
                ((CloseableHttpClient) client).close();
            }
        }
        return result;
    }

    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = null;
            if (StringHelper.isBlank(param)) {
                urlNameString = url;
            } else {
                urlNameString = url + "?" + param;
            }
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            //            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            //            for (String key : map.keySet()) {
            //                System.out.println(key + "--->" + map.get(key));
            //            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            logger.error("发送GET请求出现异常！异常原因：", e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    public static String postHtmlFrom(String Url, Map<String, String> Parms) {
        if (Parms.isEmpty()) {
            return "参数不能为空！";
        }
        String FormString = "<body onLoad=\"document.actform.submit()\">正在处理请稍候.....................<form target=\"_blank\" id=\"actform\" name=\"actform\" method=\"post\" action=\"" + Url + "\">";
        for (String key : Parms.keySet()) {
            FormString += "<input name=\"" + key + "\" type=\"hidden\" value='" + Parms.get(key) + "'>\r\n";
        }

        FormString += "</form></body>";
        return FormString;
    }

    public static String getHtmlFrom(String Url, Map<String, String> Parms) {
        if (Parms.isEmpty()) {
            return "参数不能为空！";
        }
        String FormString = "<body onLoad=\"document.actform.submit()\">正在处理请稍候.....................<form  id=\"actform\" name=\"actform\" method=\"get\" action=\"" + Url + "\">";
        for (String key : Parms.keySet()) {
            FormString += "<input name=\"" + key + "\" type=\"hidden\" value='" + Parms.get(key) + "'>\r\n";
        }

        FormString += "</form></body>";
        return FormString;
    }

    @SuppressWarnings("unchecked")
	public static String parsingHttpParams(HttpServletRequest request) {
        String result = "";
        try {
            JSONObject getParams = JSONObject.parseObject(request.getQueryString());
            logger.info("外部通知数据：" + request.getQueryString());
            Map<String, String[]> params = request.getParameterMap();
            net.sf.json.JSONObject postParams = new net.sf.json.JSONObject();
            for (String key : params.keySet()) {
                postParams.put(key, request.getParameter(key));
            }
            logger.info("postParams 请求地址：" + request.getRequestURI() + "，请求参数：" + postParams.toString());

            String postParams2 = postInStream(request);
            logger.info("postParams2 请求地址：" + request.getRequestURI() + "，请求参数：" + postParams2);
            if (null != getParams && getParams.size() > 0) {
                result = getParams.toJSONString();
                return result;
            } else if (null != postParams && postParams.size() > 0) {
                result = postParams.toString();
                return result;
            } else if (null != postParams2 && postParams2.length() > 0) {
                result = JSONObject.parseObject(postParams2).toJSONString();
                return result;
            } else {
                return result;
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("parsingHttpParams 解析http参数异常，" + e.toString());
        }
        return result;
    }

    public static String postInStream(HttpServletRequest request) {
        String result = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));
            StringBuffer sb = new StringBuffer("");
            String temp;
            while ((temp = br.readLine()) != null) {
                sb.append(temp);
            }
            br.close();
            result = sb.toString();
        } catch (Exception e) {
            logger.error("postInStream 获取流信息失败，" + e);
        }

        return result;
    }

    @SuppressWarnings("static-access")
	public static void main(String[] args) {
        String url = "http://124.156.187.225:8030/capital/withdraw/pay";
        HttpClientUtil httpClientUtil = new HttpClientUtil();
        String json = "{\"merchantCode\":\"HJHA\", \"sign\":\"f6b7656d339b3fa433ed15e3adca0a45\", \"params\":\"XUuWlZSHF8uWKPusL7iaQ/xIb+UrNfEqy/AlI4vWd470NtH/Hp+UhFwZzx9mCHxTVNiu361Pc6FVyWTz7RZHmR5AXX+YYq5oIQj6ykZM5dw0F1+dt5xu6O3MO1EkBNs/B8PtG0KkRqG3+Q+bcllCfMGUQJMTyAVdqgYt4e5ikirEQ5Of2n1uEyBnmfxzOQVfGjt4Efvp1UV5WQ+MKTd1+qgLafWRV9Pl7jMkFxwUAYm3oVSZAYlwL6UJGoohikG8gjuMVBHhPkqNnG1rWCnPljeRWXpV+ZNZZTeeYMoamLY0HPrv+QyVcOwiXdYoRyjDPsA90qgnvsB6JIfgSaBz9zdg9po1YkOu/tX6kh5YZnIcBa74eC3e0jXBvzUBSU4KzCvaz/5x3YNYh+0lP3NcjEb9i8AXZM8JqK6nO34ndr9bO85Jkj9CgpeyTKfb8ewf8ST9KGYlnM6y/vVB8/CVhSsvsNEjoKuPWpyOJ4uh59RP+qce0AviEaodqVw59MiNS2lHlbUfABQXzGxv1rAd9jpWF0J4+GwNJsSyz9UdDxEHE6F9C7olAGfIrpZI7EOwKGH3LWNbcnDaQ/LHEcB2CK84rucBkcTfdns/4daCVCeUk+OHe06jAq7z2NG4Qn+Ax80OyVNlkHp+sOIEJJR4ZONgIkcboKqtwYwCkBGTL/c=\", \"channelCode\":\"SDKHJHAWY\"}";
        String httpPostWithJson = httpClientUtil.HttpPostWithJson(url, json);
        System.err.println(httpPostWithJson);
    }

    public static String HttpPostWithJson(String url, String json) {
        String returnValue = "这是默认返回值，接口调用失败";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try {
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();

            //第二步：创建httpPost对象
            HttpPost httpPost = new HttpPost(url);

            //第三步：给httpPost设置JSON格式的参数
            StringEntity requestEntity = new StringEntity(json, "utf-8");
            requestEntity.setContentEncoding("UTF-8");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setEntity(requestEntity);

            //第四步：发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpPost, responseHandler); //调接口获取返回值时，必须用此方法
            //	       CloseableHttpResponse httpResonse = httpClient.execute(httpPost);
            //	       int statusCode = httpResonse.getStatusLine().getStatusCode();
            //	       if(statusCode!=200)
            //	       {
            //	        	System.out.println("请求发送失败，失败的返回参数为："+httpResonse.getStatusLine());
            //	        	returnValue = httpResonse.getStatusLine().toString();	  
            //	       }
            //	       

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }
}
