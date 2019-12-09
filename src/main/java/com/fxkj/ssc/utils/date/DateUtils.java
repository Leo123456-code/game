/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import net.sf.json.JSON;

/**
 * 日期处理相关工具类
 *
 * @author jerry
 * @version $Id: DateUtils.java, v 0.1 2017年7月20日 下午3:51:31 jerry Exp $
 */
public class DateUtils {

	/** 定义常量 **/
	public static final String DATE_JFP_STR = "yyyyMM";
	public static final String DATE_FULL_STR = "yyyy-MM-dd HH:mm:ss";
	public static final String TIME_FULL_STR = "HH:mm:ss";
	public static final String DATE_SMALL_STR = "yyyy-MM-dd";
	public static final String MONTH_SMALL_STR = "yyyy-MM";
	public static final String DATE_KEY_STR = "yyyyMMddHHmmss";
	public static final String Date_MON_DAY = "yy-MM-dd";

	/**
	 * 使用预设格式提取字符串日期
	 *
	 * @param strDate
	 *            日期字符串
	 * @return
	 */
	public static Date parse(String strDate) {
		return parse(strDate, DATE_FULL_STR);
	}

	public static String parseDateToDateFullStr(Date strDate) {
		SimpleDateFormat df = new SimpleDateFormat(DATE_SMALL_STR);
		try {
			return df.format(strDate);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**拼接日期时间 */
	public static Date generateDateTime(String dayTime,Date nowDate) throws Exception {
		
		SimpleDateFormat sf = new SimpleDateFormat(DateUtils.TIME_FULL_STR);
		String format = sf.format(new Date());
		String newTime = dayTime + " " + format;
		sf = new SimpleDateFormat(DateUtils.DATE_FULL_STR);
		Date parse = sf.parse(newTime);
		
		return parse;
	}
	
	
	/**获取下周日的日期 james*/
	public static String getNextSunday(Date date) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		if (week > 1) {
			cal.add(Calendar.DAY_OF_MONTH, -(week - 1) + 7);
		} else {
			cal.add(Calendar.DAY_OF_MONTH, 1 - week + 7);
		}
		return DateUtils.formateDate(cal.getTime());
	}
 
	/**判断当前是否是周日 james*/
	private static boolean confirmSunday(Date date) {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}
	
	
	
	
	
	/**获取往后最近的周日的日期 james*/
	public static String getLastSunday() throws Exception {
		Date date = new Date();
		if(confirmSunday(date)) {
			return DateUtils.formateDate(date);
		}
		return getNextSunday(date);
	}
	
	/**获取今天是否是1号 james*/
	public static boolean comfirmMonthFirstDay() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.DAY_OF_MONTH) == 1;
	}
	
	/**判断系统当前是否当月的特定第几天 james*/
	public static boolean comfirmMonthSpecificDay(Date currentDate,Integer day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		return cal.get(Calendar.DAY_OF_MONTH) == day;
	}
	
	/**获取当前月1号和上个月1号 james */
	public static Map<String,String> getCurrentMonthAndLastMonthFirstDay(String currentDate) throws ParseException {
		String formateDate = DateUtils.formateDate(currentDate);
		return getCurrentMonthAndLastMonthFirstDay(formateDate);
	}
	
	/**获取当前月1号和上个月1号  james*/
	public static Map<String,String> getCurrentMonthAndLastMonthFirstDay(Date currentDate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		int year = cal.get(Calendar.YEAR);
		int currentMonth = cal.get(Calendar.MONTH )+1;
		
		//当前月的1号
		String currentMonthFirstDay = getSpecificDayDateByYearAndMonthAndDay(year,currentMonth,1);
		
		
		//判断上一个月是否跨年
		if(currentMonth == 1) {
			year = year - 1;
			currentMonth = 12;
		}else {
			currentMonth = currentMonth -1;
		}
		//上一个月的1号
		String lastMonthFirstDay = getSpecificDayDateByYearAndMonthAndDay(year,currentMonth,1);
		
		
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("currentMonthFirstDay",currentMonthFirstDay);
		resultMap.put("lastMonthFirstDay", lastMonthFirstDay);
		return resultMap;
	}
	
	/**拼接特定的日期 james*/
	public static String getSpecificDayDateByYearAndMonthAndDay(int year,int month,int day) {
		
		StringBuilder specificDayDateBuilder = new StringBuilder(year);
		String specificMonth = "";
		if(month >=10 ) {
			specificMonth = ""+month;
		}else {
			specificMonth = "0"+month;
		}
		String specificDay = "";
		if(day >=10) {
			specificDay = ""+day;
		}else {
			specificDay = "0"+day;
		}
		specificDayDateBuilder = specificDayDateBuilder.append(year).append("-").append(specificMonth).append("-").append(specificDay);
		return specificDayDateBuilder.toString();
		
	}
	
	/**获取下一个月1号的日期 james*/
	public static String getNextFirstDay() {
		
		Calendar cal = Calendar.getInstance();
		int nextMonth =cal.get(Calendar.MONTH)+1+1;
		int year = cal.get(Calendar.YEAR);
		int targetYear = 0;
		int targetMonth =nextMonth;
		String targetDate = "";
		if(nextMonth >=13) {
			targetYear = year+1;
			targetDate = targetYear +"-01-01";
			
		}else {
			targetYear = year;
			StringBuilder builder = new StringBuilder();
			if(targetMonth>=10) {
				builder =builder.append(year).append("-").append(targetMonth).append("-").append("01");
			}else {
				builder =builder.append(year).append("-").append("0").append(targetMonth).append("-").append("01");
			}
			targetDate = builder.toString();
		}
		return targetDate;
	}
	
	
	/**获取往后最近的1号的日期 james*/
	public static String getLastFirstDay() {
		if(comfirmMonthFirstDay()) {
			return DateUtils.formateDate(new Date());
		}
		return getNextFirstDay();
	}
	
	
	/**
	 * 使用用户格式提取字符串日期
	 *
	 * @param strDate
	 *            日期字符串
	 * @param pattern
	 *            日期格式
	 * @return
	 */
	public static Date parse(String strDate, String pattern) {
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		try {
			return df.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 两个时间比较
	 *
	 * @param date
	 * @return
	 */
	public static int compareDateWithNow(Date date1, Date date2) {
		int rnum = date1.compareTo(date2);
		return rnum;
	}

	/**
	 * 两个时间与当前时间比较
	 *
	 * @param beginTime
	 * @param endTime
	 * @return ture 在时间范围内
	 */
	public static boolean compareDateByNow(Date beginTime, Date endTime) {
		int rnum = beginTime.compareTo(new Date());
		if (rnum <= 0) {
			rnum = endTime.compareTo(new Date());
		} else {
			return false;
		}

		if (rnum > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 两个时间与当前时间比较
	 *
	 * @param begin
	 *            时间格式 '2018-10-10 00:00:00'
	 * @param end
	 *            时间格式 '2018-10-10 23:59:00'
	 * @return
	 */
	public static boolean compareDateByNow(String begin, String end) {

		Date beginTime = parse(begin, DATE_FULL_STR);
		Date endTime = parse(end, DATE_FULL_STR);

		return compareDateByNow(beginTime, endTime);
	}

	/**
	 * 两个时间比较(时间戳比较)
	 *
	 * @param date
	 * @return
	 */
	public static int compareDateWithNow(long date1) {
		long date2 = dateToUnixTimestamp();
		if (date1 > date2) {
			return 1;
		} else if (date1 < date2) {
			return -1;
		} else {
			return 0;
		}
	}

	/**
	 * 获取系统当前时间
	 *
	 * @return
	 */
	public static String getNowTime() {
		SimpleDateFormat df = new SimpleDateFormat(DATE_FULL_STR);
		return df.format(new Date());
	}

	/**
	 * 获取系统当前时间
	 *
	 * @return
	 */
	public static String getNowTime(String type) {
		SimpleDateFormat df = new SimpleDateFormat(type);
		return df.format(new Date());
	}

	/**
	 * 获取系统当前计费期
	 *
	 * @return
	 */
	public static String getJFPTime() {
		SimpleDateFormat df = new SimpleDateFormat(DATE_JFP_STR);
		return df.format(new Date());
	}

	/**
	 * 将指定的日期转换成Unix时间戳
	 *
	 * @param String
	 *            date 需要转换的日期 yyyy-MM-dd HH:mm:ss
	 * @return long 时间戳
	 */
	public static long dateToUnixTimestamp(String date) {
		long timestamp = 0;
		try {
			timestamp = new SimpleDateFormat(DATE_FULL_STR).parse(date).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return timestamp;
	}

	/**
	 * 将指定的日期转换成Unix时间戳
	 *
	 * @param String
	 *            date 需要转换的日期 yyyy-MM-dd
	 * @return long 时间戳
	 */
	public static long dateToUnixTimestamp(String date, String dateFormat) {
		long timestamp = 0;
		try {
			timestamp = new SimpleDateFormat(dateFormat).parse(date).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return timestamp;
	}

	/**
	 * 将当前日期转换成Unix时间戳
	 *
	 * @return long 时间戳
	 */
	public static long dateToUnixTimestamp() {
		long timestamp = new Date().getTime();
		return timestamp;
	}

	/**
	 * 将Unix时间戳转换成日期
	 *
	 * @param long
	 *            timestamp 时间戳
	 * @return String 日期字符串
	 */
	public static String unixTimestampToDate(long timestamp) {
		SimpleDateFormat sd = new SimpleDateFormat(DATE_FULL_STR);
		sd.setTimeZone(TimeZone.getTimeZone("GMT+8"));
		return sd.format(new Date(timestamp));
	}

	/**
	 *
	 * 计算时间差，单位：小时
	 *
	 * @param begin
	 * @param end
	 * @return
	 */
	public static int hoursBetweenForCompare(Date begin, Date end) {
		int hour = 0;

		Long second = end.getTime() - begin.getTime();

		hour = (int) (second / 1000 / 60 / 60);

		return hour;
	}

	/**
	 * date2比date1多的天数
	 *
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int differentDays(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		int day1 = cal1.get(Calendar.DAY_OF_YEAR);
		int day2 = cal2.get(Calendar.DAY_OF_YEAR);

		int year1 = cal1.get(Calendar.YEAR);
		int year2 = cal2.get(Calendar.YEAR);
		if (year1 != year2) // 同一年
		{
			int timeDistance = 0;
			for (int i = year1; i < year2; i++) {
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) // 闰年
				{
					timeDistance += 366;
				} else // 不是闰年
				{
					timeDistance += 365;
				}
			}

			return timeDistance + (day2 - day1);
		} else // 不同年
		{
			return day2 - day1;
		}
	}

	/**
	 * date2比date1多的天数
	 *
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int differentDays(String date1, String date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(parse(date1, DATE_SMALL_STR));

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(parse(date2, DATE_SMALL_STR));
		int day1 = cal1.get(Calendar.DAY_OF_YEAR);
		int day2 = cal2.get(Calendar.DAY_OF_YEAR);

		int year1 = cal1.get(Calendar.YEAR);
		int year2 = cal2.get(Calendar.YEAR);
		if (year1 != year2) // 同一年
		{
			int timeDistance = 0;
			for (int i = year1; i < year2; i++) {
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) // 闰年
				{
					timeDistance += 366;
				} else // 不是闰年
				{
					timeDistance += 365;
				}
			}

			return timeDistance + (day2 - day1);
		} else // 不同年
		{
			return day2 - day1;
		}
	}

	/**
	 *
	 * 计算时间，加法
	 *
	 * @param begin
	 * @param end
	 * @return
	 */
	public static Date addTime(Date begin, int second) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(begin); // 设置时间
		cal.add(Calendar.SECOND, second);
		Date time = cal.getTime();

		return time;
	}

	/**
	 *
	 * 计算时间，加法(天)
	 *
	 * @param begin
	 * @param day
	 * @return
	 */
	public static Date addTimeByDay(Date begin, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(begin); // 设置时间
		cal.add(Calendar.DATE, day);
		Date time = cal.getTime();

		return time;
	}

	/**
	 *
	 * 计算时间，加法(月)
	 *
	 * @param begin
	 * @param month
	 * @return
	 */
	public static Date addTimeByMonth(Date begin, int month) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(begin); // 设置时间
		cal.add(Calendar.MONTH, month);
		Date time = cal.getTime();

		return time;
	}

	/**
	 * 时间年月日格式化成当天
	 *
	 * @param begin
	 * @param end
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static Date formateTimeBySecond(Date begin) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date()); // 设置时间
		cal.set(Calendar.HOUR_OF_DAY, begin.getHours());
		cal.set(Calendar.MINUTE, begin.getMinutes());
		cal.set(Calendar.SECOND, begin.getSeconds());
		Date time = cal.getTime();

		return time;
	}

	public static Date formateTimeBySecond(String hour) {
		String date = formateDate(new Date()) + " " + hour;
		return parse(date);
	}

	/**
	 * 时间年月日格式化成当天
	 *
	 * @param begin
	 * @param end
	 * @return
	 */
	public static Date formateTimeBySecond() {
		Calendar ca = Calendar.getInstance();
		ca.set(ca.get(Calendar.YEAR), (ca.get(Calendar.MONTH)), ca.get(Calendar.DAY_OF_MONTH));
		return ca.getTime();
	}

	/**
	 *
	 * 计算时间差，单位：秒
	 *
	 * @param begin
	 * @param end
	 * @return
	 */
	public static Long secondBetweenForCompare(Date begin, Date end) {

		Long second = end.getTime() - begin.getTime();

		second = second / 1000;

		return second;
	}

	/**
	 *
	 * 计算时间差，单位：分
	 *
	 * @param begin
	 * @param end
	 * @return
	 */
	public static int minuteBetweenForCompare(Date begin, Date end) {
		int minute = 0;
		Long second = end.getTime() - begin.getTime();

		minute = (int) (second / 1000 / 60);

		return minute;
	}

	/**
	 * 计算时间差，单位：小时
	 *
	 * @param begin
	 * @param end
	 * @return
	 */
	public static int hoursBetweenForCompare(String begin, String end) {
		return hoursBetweenForCompare(parse(begin, DATE_FULL_STR), parse(end, DATE_FULL_STR));
	}

	/**
	 * 开始时间
	 *
	 * @param startTime
	 * @return
	 */
	public static String startTime(Date startTime) {

		SimpleDateFormat df = new SimpleDateFormat(DATE_SMALL_STR);

		return df.format(startTime) + " 00:00:00";

	}

	public static Date startTimeForString(String startTime) throws Exception {

		SimpleDateFormat df = new SimpleDateFormat(DATE_SMALL_STR);

		return df.parse(startTime);

	}

	/**
	 * 结束时间
	 *
	 * @param endTime
	 * @return
	 */
	public static String endTime(Date endTime) {

		SimpleDateFormat df = new SimpleDateFormat(DATE_SMALL_STR);

		return df.format(endTime) + " 23:59:59";

	}

	/**
	 * 格式化时间 yyyy-MM-dd HH:mm:ss
	 *
	 * @param formateTime
	 * @return
	 */
	public static String formateTime(Date formateTime) {

		SimpleDateFormat df = new SimpleDateFormat(DATE_FULL_STR);

		return df.format(formateTime);

	}

	/**
	 * 格式化时间 yyyy-MM-dd
	 *
	 * @param formateTime
	 * @return
	 */
	public static String formateDate(Date formateTime) {

		SimpleDateFormat df = new SimpleDateFormat(DATE_SMALL_STR);

		return df.format(formateTime);

	}
	
	
	/**
	 * 格式化时间 yyyy-MM-dd
	 *
	 * @param formateTime
	 * @return
	 * @throws ParseException 
	 */
	public static String formateDate(String formateTime) throws ParseException {

		
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FULL_STR);
		Date parse = sdf.parse(formateTime);
		SimpleDateFormat df = new SimpleDateFormat(DATE_SMALL_STR);

		return df.format(parse);

	}

	
	/**
	 * 格式化时间 yyyy-MM
	 *
	 * @param formateTime
	 * @return
	 */
	public static String formateMonth(Date formateTime) {

		SimpleDateFormat df = new SimpleDateFormat(MONTH_SMALL_STR);

		return df.format(formateTime);

	}

	/**
	 * 格式化时间 yyyy-MM-dd HH:mm:ss
	 *
	 * @param formateTime
	 * @return
	 */
	public static String formateFullTime(Date formateTime) {

		SimpleDateFormat df = new SimpleDateFormat(TIME_FULL_STR);

		return df.format(formateTime);

	}

	public static Date formateFullTimeToDate(String formateTime) throws ParseException {

		SimpleDateFormat df = new SimpleDateFormat(TIME_FULL_STR);

		return df.parse(formateTime);

	}
	/**
	 * 格式化时间 yyyyMMddHHmmss
	 *
	 * @param formateTime
	 * @return
	 */
	public static String formateopenIssue(Date formateTime) {

		SimpleDateFormat df = new SimpleDateFormat(DATE_KEY_STR);

		return df.format(formateTime);

	}

	/**
	 * Author:Jack Time:2018年3月9日下午4:33:45
	 *
	 * @return Return:String Description:获取昨天的日期
	 */
	public static String getYesterdayDay() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		String yesterday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		return yesterday;
	}
	
	public static String getConfirmDate(Date schedule,Integer days) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -days);
		String yesterday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		return yesterday;
	}

	/**
	 * @Description: 获取下一天的日期
	 * @author:James
	 *
	 * @return
	 * @exception @date
	 *                2019/4/4 22:27
	 */
	public static String getNextDay() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, +1);
		String nextDay = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		return nextDay;
	}

	/**
	 * @Description:获取指定的日期的下一天
	 * @author:James
	 *
	 * @return
	 * @exception @date
	 *                2019/4/4 22:32
	 */
	public static Date getScheduleNextDay(Date schedule) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dayTime = sf.parse(sf.format(schedule));
		Calendar cal = Calendar.getInstance();
		cal.setTime(dayTime);
		cal.add(Calendar.DATE, +1);
		Date nextDay = cal.getTime();
		return nextDay;
	}

	/**
	 * @Description: 获取当前时间的日期时间
	 * @author:James
	 *
	 * @return
	 * @exception @date
	 *                2019/4/5 0:41
	 */
	public static Date getCurrentTime(Date CurrentTime) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dayTime = sf.parse(sf.format(CurrentTime));
		return dayTime;
	}


	public static String getCurrentDayString(Date CurrentTime)throws ParseException  {
		Calendar cal = Calendar.getInstance();
		cal.setTime(CurrentTime);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		SimpleDateFormat sf = new SimpleDateFormat(DATE_FULL_STR);
		return sf.format(cal.getTime());
	}
	
	
	
	public static String getCurrentDate(Date CurrentTime)throws ParseException{
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		return sf.format(CurrentTime);
	}

	/**
	 * @Description: 根据传入当前时间CurrentTime，和是否测试环境isTestEnvironment来返回程序中系统当前时间（如果是测试环境，则将当前时间延后一天）
	 * @author:James
	 * @Param : CurrentTime,isTestEnvironment
	 * @return dayTime
	 * @exception ParseException
	 * @date 2019/4/8 22:49
	 */
	public static Date getSystemCurrentTime(Date currentTime, Boolean isTestEnvironment) throws ParseException {
		Date dayTime = currentTime;
		if (isTestEnvironment) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(dayTime);
			cal.add(Calendar.DATE, +1);
			dayTime = cal.getTime();
		}
		return dayTime;
	}

	/**
	 * @Description: 根据是否测试环境返回昨天的日期，如果不是测试环境，则显示系统的前一天的日期，如果是则返回今天的日期
	 * @author:James
	 * @Param :isTestEnvironment
	 * @return ： String dayTime @exception： ParseException
	 * @date ： 2019/4/8 23:43
	 */
	public static String getDayTime(Boolean isTestEnvironment) throws ParseException {
		String dayTime = getYesterdayDay();
		if (!isTestEnvironment) {
			return dayTime;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(dayTime));
		cal.add(Calendar.DATE, +1);
		dayTime = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		return dayTime;
	}

	

    /**获取前两天的时间 */
    public static Date getTheDayBeforeYesterDay(Date schedule) throws ParseException{
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date dayTime = sf.parse(sf.format(schedule));
        Calendar cal = Calendar.getInstance();
        cal.setTime(dayTime);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }
    public static String getCurrentDayYesterDay(Date schedule) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dayTime = sf.parse(sf.format(schedule));
		Calendar cal = Calendar.getInstance();
		cal.setTime(dayTime);
		cal.add(Calendar.DATE, -1);
		String yesterDay = sf.format(cal.getTime());
		return yesterDay;
	}

	/**
	 * 获取指定日期的前几天
	 * 
	 * @param schedule
	 * @param num
	 * @return
	 * @throws ParseException
	 */
	public static Date getSpecifiedDateSomeDaysAgo(Date schedule, Integer num) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dayTime = sf.parse(sf.format(schedule));
		Calendar cal = Calendar.getInstance();
		cal.setTime(dayTime);
		cal.add(Calendar.DATE, -num);
		return cal.getTime();
	}
	
	
	
	
	public static String getSpecifiedDateWeekAgo(String schedule) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dayTime = sf.parse(schedule);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dayTime);
		cal.add(Calendar.WEEK_OF_MONTH, -1);
		return sf.format(cal.getTime());
	}
	
	public static String getSpecifiedDateMonthAgo(String schedule) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dayTime = sf.parse(schedule);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dayTime);
		cal.add(Calendar.MONTH ,-1);
		return sf.format(cal.getTime());
	}

	/**
	 * @Description: 获取指定的日期的前一天
	 * @author:James
	 *
	 * @return
	 * @exception @date
	 *                2019/4/4 23:04
	 */
	public static Date getScheduleYesterDay(Date schedule) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dayTime = sf.parse(sf.format(schedule));
		Calendar cal = Calendar.getInstance();
		cal.setTime(dayTime);
		cal.add(Calendar.DATE, -1);
		Date yesterDay = cal.getTime();
		return yesterDay;
	}
	
	public static String getScheduleYesterDay(String schedule) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date dayTime = sf.parse(schedule);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dayTime);
		cal.add(Calendar.DATE, -1);
		
		return sf.format(cal.getTime());
	}
	
	public static String dateToString(Date formateTime, String fomat) {

		SimpleDateFormat df = new SimpleDateFormat(fomat);

		return df.format(formateTime);

	}

	/**
	 * 比较日期大小
	 *
	 * @param start
	 *            yyyy-MM-dd
	 * @param end
	 *            yyyy-MM-dd
	 * @return
	 */
	public static long compareDate(String start, String end) {
		return dateToUnixTimestamp(start, DATE_SMALL_STR) - dateToUnixTimestamp(end, DATE_SMALL_STR);

	}

	/**
	 * 比较月份大小
	 *
	 * @param start
	 *            yyyy-MM
	 * @param end
	 *            yyyy-MM
	 * @return
	 */
	public static long compareMonth(String start, String end) {

		return dateToUnixTimestamp(start, MONTH_SMALL_STR) - dateToUnixTimestamp(end, MONTH_SMALL_STR);
	}

	/**
	 * 判断时间是否在时间段内
	 *
	 * @param nowTime
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	public static boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
		Calendar date = Calendar.getInstance();
		date.setTime(nowTime);

		Calendar begin = Calendar.getInstance();
		begin.setTime(beginTime);

		Calendar end = Calendar.getInstance();
		end.setTime(endTime);

		if (date.after(begin) && date.before(end)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws ParseException {
		System.out.print(formateDate("2019-11-13 00:00:00"));
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(new Date());
//		cal.set(Calendar.HOUR_OF_DAY, 0);
//		cal.set(Calendar.MINUTE, 0);
//		cal.set(Calendar.SECOND, 0);
//		cal.set(Calendar.MILLISECOND, 0);
//		SimpleDateFormat sf = new SimpleDateFormat(DATE_FULL_STR);
//		
//		System.out.println(sf.format(cal.getTime()));
	
		
		System.out.println(getSpecifiedDateWeekAgo(DateUtils.formateDate(new Date())));
		
		System.out.println(getSpecifiedDateMonthAgo(DateUtils.formateDate(new Date())));
		
		Date currentDate = DateUtils.parse("2020-01-01", DateUtils.DATE_SMALL_STR);
		Map<String, String> paramsMap = getCurrentMonthAndLastMonthFirstDay(currentDate);

		
		System.out.println(com.alibaba.fastjson.JSON.toJSONString(paramsMap));
	}
    /**
     * @return
     * @Param yy-MM-dd'T'HH:mm    Date_MON_DAY
     */
    public static String formatDateByT(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd'T'HH:mm");
        String dateStr = sdf.format(date);
        return dateStr;
    }

	public static String formatDateToYMD(Date date) {

		SimpleDateFormat sdf = new SimpleDateFormat(Date_MON_DAY);
		String dateStr = sdf.format(date);
		return dateStr;
	}

}
