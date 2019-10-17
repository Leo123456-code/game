package com.fxkj.ssc.constant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SystemReportConstant {

	public static ExecutorService fixedThreadPool = null;
	
	static {
		fixedThreadPool = Executors.newFixedThreadPool(2000);
	}
	
	/**
	 * 作者:Jack
	 * 日期:2019年1月28日下午2:54:38
	 * @param size
	 * @return
	 * 返回值:ExecutorService
	 * 返回值说明:获取一个新的线程池
	 */
	public static ExecutorService getFixedNewThreadPool(int poolSize){
		
		return  Executors.newFixedThreadPool(poolSize);
		
	}
	
}
