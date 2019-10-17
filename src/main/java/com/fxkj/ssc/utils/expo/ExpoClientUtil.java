package com.fxkj.ssc.utils.expo;

import com.alibaba.fastjson.JSON;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Map;

/**
 * @description: expo中消息推送的实现
 * @author: jerry
 * @version: $Id: ExpoClientUtil, v 0.1  2019年02月18日 15:22
 */
public class ExpoClientUtil {

    private static Logger        logger        = LoggerFactory.getLogger(ExpoClientUtil.class);

    private static RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(10000).setConnectTimeout(10000).build();//设置请求和传输超时时间



    /**
     * 发起post请求，请求参数以Map集合形式传入，封装到List <NameValuePair> 发起post请求
     * @param httpUrl
     * @param params
     * @return
     * @throws Exception
     */
    public static String httpsPost(String httpUrl, Map<String, String> params) throws Exception {
        String result = null;
        //https请求，免证书校验
        CloseableHttpClient httpclient = createSSLClientDefault();
        BufferedReader in = null;
        HttpPost httpPost = new HttpPost(httpUrl);
        httpPost.setConfig(requestConfig);


        StringEntity entity = new StringEntity(JSON.toJSONString(params));
        entity.setContentType("application/json;charset=UTF-8");

        httpPost.setEntity(entity);
        //官方文档要求
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Accept-Encoding", "gzip, deflate");

        try {
            logger.info("post请求报文地址：" + httpUrl + "?" + JSON.toJSONString(params));
            CloseableHttpResponse response = httpclient.execute(httpPost);
            InputStream content = response.getEntity().getContent();
            in = new BufferedReader(new InputStreamReader(content, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            String line = "";
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            result = sb.toString();
            logger.info("响应报文：" + result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            httpclient.close();
        }
        return null;
    }


    public static CloseableHttpClient createSSLClientDefault() {

        try {
            //SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
            // 在JSSE中，证书信任管理器类就是实现了接口X509TrustManager的类。我们可以自己实现该接口，让它信任我们指定的证书。
            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
            //信任所有
            X509TrustManager x509mgr = new X509TrustManager() {

                //　　该方法检查客户端的证书，若不信任该证书则抛出异常
                public void checkClientTrusted(X509Certificate[] xcs, String string) {
                }

                // 　　该方法检查服务端的证书，若不信任该证书则抛出异常
                public void checkServerTrusted(X509Certificate[] xcs, String string) {
                }

                // 　返回受信任的X509证书数组。
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[] { x509mgr }, null);
            ////创建HttpsURLConnection对象，并设置其SSLSocketFactory对象
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

            //  HttpsURLConnection对象就可以正常连接HTTPS了，无论其证书是否经权威机构的验证，只要实现了接口X509TrustManager的类MyX509TrustManager信任该证书。
            return HttpClients.custom().setSSLSocketFactory(sslsf).build();

        } catch (KeyManagementException e) {

            e.printStackTrace();

        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();

        }

        // 创建默认的httpClient实例.
        return HttpClients.createDefault();

    }

}
