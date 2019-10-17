package com.fxkj.ssc.utils.io;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 实体Bean复制属性
 * @author mike -version 1.0
 * @date 2017年7月20日
 * @description 实体Bean对象之间拷贝
 */
public class BeanCopyUtil {
	
	private static Logger logger = LoggerFactory.getLogger(BeanCopyUtil.class);
	
	private BeanCopyUtil() {}

	public static void copy(Object source, Object dest) throws Exception {
		BeanInfo sourceBean = Introspector.getBeanInfo(source.getClass(),
				java.lang.Object.class); // 获取属性
		PropertyDescriptor[] sourceProperty = sourceBean
				.getPropertyDescriptors();

		BeanInfo destBean = Introspector.getBeanInfo(dest.getClass(),
				java.lang.Object.class); // 获取属性
		PropertyDescriptor[] destProperty = destBean.getPropertyDescriptors();
		
		// 匹配属性并赋值
		try {
			for (int i = 0; i < sourceProperty.length; i++) {
				for (int j = 0; j < destProperty.length; j++) {
					if (sourceProperty[i].getName().equals(
							destProperty[j].getName())) {
						// 调用source的getter方法和dest的setter方法
						destProperty[j].getWriteMethod().invoke(
								dest,
								sourceProperty[i].getReadMethod()
										.invoke(source));
						break;
					}
				}
			}
		} catch (Exception e) {
			logger.error("错误：属性复制失败", e);
			throw e;
		}
	}

}
