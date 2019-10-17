package com.fxkj.ssc.utils.base;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *   
 * 
 * @Title: JsoupHelper.java
 * @Package com.jarvis.base.util
 * @Description:
 * @author Jack 
 * @date 2017年9月27日 上午10:41:30
 * @version V1.0   Jsoup 从网页刷抓取html数据或者解析xml文件的工具类。爬虫工具
 */
public class JsoupHelper {

	/**
	 * Author:Jack Time:2017年9月27日上午10:49:57
	 * 
	 * @param httpUrl
	 * @return Return:Document
	 *         Description:发送不带参数的get请求，并且抓取网络数据，将抓取回来的数据转换成Document对象。
	 */
	public static Document getDocumentByGet(String httpUrl) {
		String responseContent = HttpClientHelper.sendHttpGet(httpUrl);
		if (responseContent != null && responseContent.trim().length() > 0) {
			Document document = Jsoup.parse(responseContent);
			if (document != null) {
				return document;
			}
		}
		return null;
	}

	/**
	 * Author:Jack Time:2017年9月27日上午10:49:57
	 * 
	 * @param httpUrl
	 * @param maps
	 *            如果不需要传入数据，传入null即可
	 * @return Return:Document
	 *         Description:发送get请求，并且抓取网络数据，将抓取回来的数据转换成Document对象。
	 */
	public static Document getDocumentByGet(String httpUrl, Map<String, String> maps) {
		String responseContent = HttpClientHelper.sendHttpGet(httpUrl, maps);
		if (responseContent != null && responseContent.trim().length() > 0) {
			Document document = Jsoup.parse(responseContent);
			if (document != null) {
				return document;
			}
		}
		return null;
	}

	/**
	 * Author:Jack Time:2017年9月27日上午10:54:04
	 * 
	 * @param httpUrl
	 * @return Return:Document Description:
	 *         发送不带参数的Post请求，并且抓取网络数据，将抓取回来的数据转换成Document对象。
	 */
	public static Document getDocumentByPost(String httpUrl) {
		String responseContent = HttpClientHelper.sendHttpPost(httpUrl);
		if (responseContent != null && responseContent.trim().length() > 0) {
			Document document = Jsoup.parse(responseContent);
			if (document != null) {
				return document;
			}
		}
		return null;
	}

	/**
	 * Author:Jack Time:2017年9月27日上午10:54:04
	 * 
	 * @param httpUrl
	 * @param maps
	 *            如果不需要传入数据，传入null即可
	 * @return Return:Document
	 *         Description:发送带参数的Post请求，并且抓取网络数据，将抓取回来的数据转换成Document对象。
	 */
	public static Document getDocumentByPost(String httpUrl, Map<String, String> maps) {
		String responseContent = HttpClientHelper.sendHttpPost(httpUrl, maps);
		if (responseContent != null && responseContent.trim().length() > 0) {
			Document document = Jsoup.parse(responseContent);
			if (document != null) {
				return document;
			}
		}
		return null;
	}

	/**
	 * Author:Jack Time:2017年9月27日上午10:59:11
	 * 
	 * @param httpUrl
	 * @param maps
	 *            如果不需要传入数据，传入null即可
	 * @return Return:Document Description:发送带参数并且参数是Json格式数据的Post请求，并且抓取网络数据，
	 *         将抓取回来的数据转换成Document对象。
	 */
	public static Document getDocumentByPostJson(String httpUrl, Map<String, String> maps) {
		String responseContent = HttpClientHelper.sendHttpPostJson(httpUrl,
				maps == null ? null : FastJsonUtil.toJSONString(maps));
		if (responseContent != null && responseContent.trim().length() > 0) {
			Document document = Jsoup.parse(responseContent);
			if (document != null) {
				return document;
			}
		}
		return null;
	}

	/**
	 * Author:Jack Time:2017年9月27日上午11:48:06
	 * 
	 * @param filePath
	 *            文件的路径
	 * @param charsetName
	 *            字符集
	 * @return Return:Document Description:从本地路径中读取xml文件，并且转换成Document对象
	 */
	public static Document getDocumentFromXmlFile(String filePath, String charset) {
		File xmlFile = new File(filePath);
		try {
			Document doc = Jsoup.parse(xmlFile, charset);
			return doc;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Author:Jack Time:2017年9月27日上午11:50:31
	 * 
	 * @param xmlFile
	 *            文件对象
	 * @param charset
	 *            字符集
	 * @return Return:Document Description:从本地文件中读取xml文件，并且转换成Document对象
	 */
	public static Document getDocumentFromXmlFile(File xmlFile, String charset) {
		try {
			Document doc = Jsoup.parse(xmlFile, charset);
			return doc;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
