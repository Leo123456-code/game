package com.fxkj.ssc.utils.page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 分页计算
 *
 * @date 2018年3月22日
 */
public class PageUtils {

	private static Logger logger = LoggerFactory.getLogger(PageUtils.class);
	
	public static int offset(Integer pageNumber, Integer pageSize) {
		if (pageNumber <= 0) { // 如果总记录数为0或负数，则直接返回
			return 0;
		}
		int offset = (pageNumber - 1) * pageSize; // 第N条记录
		logger.info("offset=[" + offset + "].");
		return offset;
	}
	
}
