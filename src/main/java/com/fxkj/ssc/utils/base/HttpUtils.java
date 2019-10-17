package com.fxkj.ssc.utils.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

/**
 * 用于模拟HTTP请求中GET/POST方式
 * 
 * @author Jack
 *
 */
@SuppressWarnings("deprecation")
public class HttpUtils {


	/**
	 * 发送GET请求
	 *
	 * @param url
	 *            目的地址
	 * @param parameters
	 *            请求参数，Map类型。
	 * @return 远程响应结果
	 */
	public static String sendGet(String url, Map<String, String> parameters) {
		String result = "";
		BufferedReader in = null;// 读取响应输入流
		StringBuffer sb = new StringBuffer();// 存储参数
		String params = "";// 编码之后的参数
		String full_url = "";
		try {
			if (parameters == null || parameters.size() == 0) {
				full_url = url;
			} else {
				params = getRequestParams(parameters, sb, params);
				full_url = url + "?" + params;
			}
			// System.out.println(full_url);
			// 创建URL对象
			java.net.HttpURLConnection httpConn = getConnection(full_url);
			// 建立实际的连接
			httpConn.connect();
			// 响应头部获取
			// Map<String, List<String>> headers = httpConn.getHeaderFields();
			// 遍历所有的响应头字段
			// for (String key : headers.keySet()) {
			// System.out.println(key + "\t：\t" + headers.get(key));
			// }
			// 定义BufferedReader输入流来读取URL的响应,并设置编码方式
			in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
			String line;
			// 读取返回的内容
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 作者:Jack 日期:2017年9月26日下午11:05:15
	 *
	 * @param full_url
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 *             返回值:java.net.HttpURLConnection 返回值说明:创建连接
	 */
	private static java.net.HttpURLConnection getConnection(String full_url) throws MalformedURLException, IOException {
		java.net.URL connURL = new java.net.URL(full_url);
		// 打开URL连接
		java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) connURL.openConnection();
		//设置通用属性
		httpConn.setRequestProperty("Accept", "*/*");
		httpConn.setRequestProperty("Connection", "Keep-Alive");
		httpConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");
		return httpConn;
	}

	/**
	 * 发送POST请求
	 *
	 * @param url
	 *            目的地址
	 * @param parameters
	 *            请求参数，Map类型。
	 * @return 远程响应结果
	 */
	public static String sendPost(String url, Map<String, String> parameters) {
		String result = "";// 返回的结果
		BufferedReader in = null;// 读取响应输入流
		PrintWriter out = null;
		StringBuffer sb = new StringBuffer();// 处理请求参数
		String params = "";// 编码之后的参数
		try {
			if (parameters == null || parameters.size() == 0) {
			} else {
				// 编码请求参数
				params = getRequestParams(parameters, sb, params);
			}
			java.net.HttpURLConnection httpConn = getPostConnection(url);
			// 获取HttpURLConnection对象对应的输出流
			out = new PrintWriter(httpConn.getOutputStream());
			// 发送请求参数
			if (params != "") {
				out.write(params);
			}
			// System.out.println(params);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应，设置编码方式
			in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
			String line;
			// 读取返回的内容
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 作者:Jack 日期:2017年9月26日下午11:01:42
	 *
	 * @param url
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 *             返回值:java.net.HttpURLConnection 返回值说明:创建Post连接
	 */
	private static java.net.HttpURLConnection getPostConnection(String url) throws MalformedURLException, IOException {
		java.net.HttpURLConnection httpConn = getConnection(url);
		// 设置POST方式
		httpConn.setDoInput(true);
		httpConn.setDoOutput(true);
		return httpConn;
	}

	/**
	 * 作者:Jack 日期:2017年9月26日下午10:57:20
	 *
	 * @param parameters
	 * @param sb
	 * @param params
	 * @return
	 * @throws UnsupportedEncodingException
	 *             返回值:String 返回值说明:打包请求参数
	 */
	private static String getRequestParams(Map<String, String> parameters, StringBuffer sb, String params)
			throws UnsupportedEncodingException {
		if (parameters.size() == 1) {
			for (String name : parameters.keySet()) {
				sb.append(name).append("=").append(java.net.URLEncoder.encode(parameters.get(name), "UTF-8"));
			}
			params = sb.toString();
		} else if (parameters.size() > 1) {
			for (String name : parameters.keySet()) {
				sb.append(name).append("=").append(java.net.URLEncoder.encode(parameters.get(name), "UTF-8"))
						.append("&");
			}
			String temp_params = sb.toString();
			params = temp_params.substring(0, temp_params.length() - 1);
		}
		return params;
	}

	/**
	 * Author:Jack Time:2017年9月5日下午2:20:26
	 *
	 * @param url
	 * @param parameters
	 * @return Return:String Description:发送Post请求，并且发送的是Json格式的数据。
	 */
	public static String sendPostJson(String url, Map<String, String> parameters) {
		String result = "";// 返回的结果
		BufferedReader in = null;// 读取响应输入流
		PrintWriter out = null;
		String params = "";// 编码之后的参数
		try {
			if (parameters != null && parameters.size() > 0) {
				params = FastJsonUtil.toJSONString(parameters);
			}
			java.net.HttpURLConnection httpConn = getPostConnection(url);
			// 获取HttpURLConnection对象对应的输出流
			out = new PrintWriter(httpConn.getOutputStream());
			// 发送请求参数
			if (params != "") {
				out.write(params);
			}
			// System.out.println(params);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应，设置编码方式
			in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
			String line;
			// 读取返回的内容
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}


	/**
	 * get
	 *
	 * @param host
	 * @param path
	 * @param method
	 * @param headers
	 * @param querys
	 * @return
	 * @throws Exception
	 */
	public static HttpResponse doGet(String host, String path, String method,
									 Map<String, String> headers,
									 Map<String, String> querys)
			throws Exception {
		HttpClient httpClient = wrapClient(host);

		HttpGet request = new HttpGet(buildUrl(host, path, querys));
		for (Map.Entry<String, String> e : headers.entrySet()) {
			request.addHeader(e.getKey(), e.getValue());
		}
		request.setConfig( RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build());

		return httpClient.execute(request);
	}

	/**
	 * post form
	 *
	 * @param host
	 * @param path
	 * @param method
	 * @param headers
	 * @param querys
	 * @param bodys
	 * @return
	 * @throws Exception
	 */
	public static HttpResponse doPost(String host, String path, String method,
									  Map<String, String> headers,
									  Map<String, String> querys,
									  Map<String, String> bodys)
			throws Exception {
		HttpClient httpClient = wrapClient(host);

		HttpPost request = new HttpPost(buildUrl(host, path, querys));
		for (Map.Entry<String, String> e : headers.entrySet()) {
			request.addHeader(e.getKey(), e.getValue());
		}

		if (bodys != null) {
			List<NameValuePair> nameValuePairList = new ArrayList<NameValuePair>();

			for (String key : bodys.keySet()) {
				nameValuePairList.add(new BasicNameValuePair(key, bodys.get(key)));
			}
			UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(nameValuePairList, "utf-8");
			formEntity.setContentType("application/x-www-form-urlencoded; charset=UTF-8");
			request.setEntity(formEntity);
		}

		return httpClient.execute(request);
	}

	/**
	 * Post String
	 *
	 * @param host
	 * @param path
	 * @param method
	 * @param headers
	 * @param querys
	 * @param body
	 * @return
	 * @throws Exception
	 */
	public static HttpResponse doPost(String host, String path, String method,
									  Map<String, String> headers,
									  Map<String, String> querys,
									  String body)
			throws Exception {
		HttpClient httpClient = wrapClient(host);

		HttpPost request = new HttpPost(buildUrl(host, path, querys));
		for (Map.Entry<String, String> e : headers.entrySet()) {
			request.addHeader(e.getKey(), e.getValue());
		}

		if (StringUtils.isNotBlank(body)) {
			request.setEntity(new StringEntity(body, "utf-8"));
		}

		return httpClient.execute(request);
	}

	/**
	 * Post stream
	 *
	 * @param host
	 * @param path
	 * @param method
	 * @param headers
	 * @param querys
	 * @param body
	 * @return
	 * @throws Exception
	 */
	public static HttpResponse doPost(String host, String path, String method,
									  Map<String, String> headers,
									  Map<String, String> querys,
									  byte[] body)
			throws Exception {
		HttpClient httpClient = wrapClient(host);

		HttpPost request = new HttpPost(buildUrl(host, path, querys));
		for (Map.Entry<String, String> e : headers.entrySet()) {
			request.addHeader(e.getKey(), e.getValue());
		}

		if (body != null) {
			request.setEntity(new ByteArrayEntity(body));
		}

		return httpClient.execute(request);
	}

	/**
	 * Put String
	 * @param host
	 * @param path
	 * @param method
	 * @param headers
	 * @param querys
	 * @param body
	 * @return
	 * @throws Exception
	 */
	public static HttpResponse doPut(String host, String path, String method,
									 Map<String, String> headers,
									 Map<String, String> querys,
									 String body)
			throws Exception {
		HttpClient httpClient = wrapClient(host);

		HttpPut request = new HttpPut(buildUrl(host, path, querys));
		for (Map.Entry<String, String> e : headers.entrySet()) {
			request.addHeader(e.getKey(), e.getValue());
		}

		if (StringUtils.isNotBlank(body)) {
			request.setEntity(new StringEntity(body, "utf-8"));
		}

		return httpClient.execute(request);
	}

	/**
	 * Put stream
	 * @param host
	 * @param path
	 * @param method
	 * @param headers
	 * @param querys
	 * @param body
	 * @return
	 * @throws Exception
	 */
	public static HttpResponse doPut(String host, String path, String method,
									 Map<String, String> headers,
									 Map<String, String> querys,
									 byte[] body)
			throws Exception {
		HttpClient httpClient = wrapClient(host);

		HttpPut request = new HttpPut(buildUrl(host, path, querys));
		for (Map.Entry<String, String> e : headers.entrySet()) {
			request.addHeader(e.getKey(), e.getValue());
		}

		if (body != null) {
			request.setEntity(new ByteArrayEntity(body));
		}

		return httpClient.execute(request);
	}

	/**
	 * Delete
	 *
	 * @param host
	 * @param path
	 * @param method
	 * @param headers
	 * @param querys
	 * @return
	 * @throws Exception
	 */
	public static HttpResponse doDelete(String host, String path, String method,
										Map<String, String> headers,
										Map<String, String> querys)
			throws Exception {
		HttpClient httpClient = wrapClient(host);

		HttpDelete request = new HttpDelete(buildUrl(host, path, querys));
		for (Map.Entry<String, String> e : headers.entrySet()) {
			request.addHeader(e.getKey(), e.getValue());
		}

		return httpClient.execute(request);
	}

	private static String buildUrl(String host, String path, Map<String, String> querys) throws UnsupportedEncodingException {
		StringBuilder sbUrl = new StringBuilder();
		sbUrl.append(host);
		if (!StringUtils.isBlank(path)) {
			sbUrl.append(path);
		}
		if (null != querys) {
			StringBuilder sbQuery = new StringBuilder();
			for (Map.Entry<String, String> query : querys.entrySet()) {
				if (0 < sbQuery.length()) {
					sbQuery.append("&");
				}
				if (StringUtils.isBlank(query.getKey()) && !StringUtils.isBlank(query.getValue())) {
					sbQuery.append(query.getValue());
				}
				if (!StringUtils.isBlank(query.getKey())) {
					sbQuery.append(query.getKey());
					if (!StringUtils.isBlank(query.getValue())) {
						sbQuery.append("=");
						sbQuery.append(URLEncoder.encode(query.getValue(), "utf-8"));
					}
				}
			}
			if (0 < sbQuery.length()) {
				sbUrl.append("?").append(sbQuery);
			}
		}

		return sbUrl.toString();
	}

	private static HttpClient wrapClient(String host) {
		HttpClient httpClient = new DefaultHttpClient();
		if (host.startsWith("https://")) {
			sslClient(httpClient);
		}

		return httpClient;
	}

	private static void sslClient(HttpClient httpClient) {
		try {
			SSLContext ctx = SSLContext.getInstance("TLS");
			X509TrustManager tm = new X509TrustManager() {
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
				public void checkClientTrusted(X509Certificate[] xcs, String str) {

				}
				public void checkServerTrusted(X509Certificate[] xcs, String str) {

				}
			};
			ctx.init(null, new TrustManager[] { tm }, null);
			SSLSocketFactory ssf = new SSLSocketFactory(ctx);
			ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			ClientConnectionManager ccm = httpClient.getConnectionManager();
			SchemeRegistry registry = ccm.getSchemeRegistry();
			registry.register(new Scheme("https", 443, ssf));
		} catch (KeyManagementException ex) {
			throw new RuntimeException(ex);
		} catch (NoSuchAlgorithmException ex) {
			throw new RuntimeException(ex);
		}
	}
}