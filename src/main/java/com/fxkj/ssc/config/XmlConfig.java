package com.fxkj.ssc.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.fxkj.ssc.utils.base.StringHelper;


public class XmlConfig
{
	
	 private static final Logger logger = LoggerFactory.getLogger(PropHelper.class);
	
	private static Map<String,String> items = new HashMap<String,String>();
	
	private static String CONFIG_FILE_NAME = "configuration.xml";
	
	static
	{
//		loadConfig();
	}
	
	/**
	 * 读入配置文件
	 */
	@SuppressWarnings("rawtypes")
	public static void loadConfig()
	{
		if(items == null || items.size() == 0){
			logger.info("开始加载"+CONFIG_FILE_NAME+"配置文件！");
			InputStream inputStream = PropHelper.guessPropFile(XmlConfig.class, CONFIG_FILE_NAME);
			if (inputStream != null)
			{
				InputStream is = inputStream;
				try
				{
					SAXReader reader = new SAXReader();
					
					Document document = reader.read(is);
					Element systemElement = document.getRootElement();
					List catList = systemElement.elements("category");
					for (Iterator catIter = catList.iterator(); catIter.hasNext();)
					{
						Element catElement = (Element) catIter.next();
						String catName = catElement.attributeValue("name");
						if (StringHelper.isEmpty(catName))
						{
							continue;
						}
						List itemList = catElement.elements("item");
						for (Iterator itemIter = itemList.iterator(); itemIter.hasNext();)
						{
							Element itemElement = (Element) itemIter.next();
							String itemName = itemElement.attributeValue("name");
							String value = itemElement.attributeValue("value");
							if (!StringHelper.isEmpty(itemName))
							{
								items.put(catName + "." + itemName, value);
							}
						}
					}
					
				}
				catch (Exception ex)
				{
					logger.error("读入配置文件出错", ex);
				}
				finally
				{
					if (is != null)
					{
						try
						{
							is.close();
							is = null;
						}
						catch (IOException ex)
						{
							logger.error("关闭输入流出错", ex);
						}
					}
				}
			}
			logger.info("加载"+CONFIG_FILE_NAME+"配置文件完成！");
			String mapItems = JSON.toJSONString(items);
			logger.info("配置文件Json数据：{}",mapItems);
		}else{
			logger.error("配置"+CONFIG_FILE_NAME+"文件已经装载完成，无需重新加载！");
		}
	}
	
	/**
	 * 获得字串配置值
	 *
	 * @param name
	 * @return
	 */
	public static String getString(String name)
	{
		String value = (String) items.get(name);
		return (value == null) ? "" : value;
	}
	
	/**
	 * 获得字串配置值，若为空，则返回缺省值
	 *
	 * @param name
	 * @param defaultValue
	 * @return
	 */
	public static String getString(String name, String defaultValue)
	{
		String value = (String) items.get(name);
		if (value != null && value.length() > 0)
			return value;
		else
			return defaultValue;
	}
	
	/**
	 * 获得整型配置值
	 *
	 * @param name
	 * @return
	 */
	public static int getInt(String name)
	{
		String value = getString(name);
		try
		{
			return Integer.parseInt(value);
		}
		catch (NumberFormatException ex)
		{
			logger.error("配置文件key["+name+"]配置错误，return 0", ex);
			return 0;
		}
	}
	
	/**
	 * 获得整型配置值
	 *
	 * @param name
	 * @return
	 */
	public static int getInt(String name, int defaultValue)
	{
		String value = getString(name);
		if("".equals(value)) {
			return defaultValue;
		}
		try
		{
			return Integer.parseInt(value);
		}
		catch (NumberFormatException ex)
		{
			logger.error("配置文件key["+name+"]配置错误，return "+defaultValue, ex);
		}
		return defaultValue;
	}
	
	/**
	 * 获得布尔型配置值
	 *
	 * @param name
	 * @return
	 */
	public static boolean getBoolean(String name)
	{
		String value = getString(name);
		return Boolean.valueOf(value).booleanValue();
	}
	
	/**
	 * 获得双精度浮点数配置值
	 * 
	 * @param name
	 * @return
	 */
	public static double getDouble(String name, double defaultValue)
	{
		String value = getString(name);
		try
		{
			return Double.parseDouble(value);
		}
		catch (NumberFormatException ex)
		{
			logger.error("配置文件key["+name+"]配置错误，return "+defaultValue, ex);
		}
		return defaultValue;
	}
	
	@SuppressWarnings("rawtypes")
	public static Map getItems()
	{
		return items;
	}
}
