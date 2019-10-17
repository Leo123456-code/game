
package com.fxkj.ssc.utils.date;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author Arvin
 * @since 2017年6月20日
 */
public class DateHandler {
    
	static Logger              logger          = LoggerFactory.getLogger(DateHandler.class);

    public static final String YYYYMMDD_HHMMSS = "yyyyMMddHHmmss";

    public static String getCreateTime() {
        return getCurrentTime("yyyy-MM-dd HH:mm:ss");
    }
    
    /**
     * 获取当前 时间
     * 
     * @return
     */
    public static String getCurrentTime(String fmt) {
        Calendar calendar = Calendar.getInstance();
        return getTime(calendar.getTime(), fmt);
    }

    /**
     * 获取当前 时间
     * 
     * @return
     */
    public static String getTime(Date date) {
        return getTime(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取当前 时间
     * 
     * @return
     */
    public static String getTime(Date date, String fmt) {
        if (StringUtils.isBlank(fmt)) {
            fmt = YYYYMMDD_HHMMSS;
        }
        SimpleDateFormat myFormat = new SimpleDateFormat(fmt);
        String mystrdate = myFormat.format(date);
        return mystrdate;
    }

    /**
     * 获取当前 时间
     * 
     * @return
     */
    public static String getTimeStr(Date date, String fmt) {
        if (StringUtils.isBlank(fmt)) {
            fmt = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat myFormat = new SimpleDateFormat(fmt);
        String mystrdate = myFormat.format(date);
        return mystrdate;
    }

    /**
     * 计算当前时间
     * 
     */
    public static Date getCurrentDate() {
        return getCurrentDate("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 计算当前时间
     * 
     */
    public static Date getCurrentDateForYMD() {
        return getCurrentDate("yyyy-MM-dd");
    }

    /**
     * 计算当前时间
     * 
     */

    public static Date getCurrentDate(String fmt) {
        if (StringUtils.isBlank(fmt)) {
            fmt = YYYYMMDD_HHMMSS;
        }

        // 当前时间
        Calendar calendar = Calendar.getInstance();
        Date currentTime = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat(fmt);
        String strDate = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(strDate, pos);
    }

    /**
     * 格式化日期
     * 
     * @param date
     * @param fmt
     *            ,fmt为空，默认是 yyyy-MM-dd
     * @return
     */
    public static Date formatDate(String dateStr) {
        return formatDate(dateStr, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 格式化日期
     * 
     * @param date
     * @param fmt
     *            ,fmt为空，默认是 yyyy-MM-dd
     * @return
     */
    public static Date formatDate(String dateStr, String fmt) {
        if (StringUtils.isBlank(dateStr)) {
            return null;
        }
        if (fmt == null) {
            fmt = "yyyy-MM-dd";
        }
        SimpleDateFormat myFormat = new SimpleDateFormat(fmt);
        try {
            return myFormat.parse(dateStr);
        } catch (ParseException e) {
            logger.error("时间转换异常！", e);
        }
        return null;
    }

    /**
     * 格式化 时间
     * 
     * @param time
     * @param strDateTime
     * @return
     */
    public static Long formatDateTime(String dateStr) {
        return formatDateTime(dateStr, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 格式化 时间
     * 
     * @param time
     * @param strDateTime
     * @return
     */
    public static Long formatDateTime(String dateStr, String fmt) {
        if (StringUtils.isBlank(fmt)) {
            fmt = YYYYMMDD_HHMMSS;
        }

        if (StringUtils.isNotBlank(dateStr)) {
            Date date = formatDate(dateStr, fmt);
            if (date != null) {
                return date.getTime();
            }
        }

        return 0L;
    }

    /**
     * 格式化毫秒数 时间
     * 
     * @param time
     * @param fmt
     *            ,fmt为空的时候，默认是yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String formatTime(Long time, String fmt) {
        return getTime(new Date(time), fmt);
    }

    /**
     * 时间转换
     * 
     * @return
     */
    public static String getTime(String dateStr) {
        return getTime(dateStr, "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd");
    }

    /**
     * 时间转换
     * 
     * @return
     */
    public static String getTime(String dateStr, String from, String to) {
        Date date = formatDate(dateStr, from);
        return getTime(date, to);
    }

    /**
     * 获取今天开始时间 yyyy-MM-dd 00:00:00
     * 
     * @return
     */
    public static String getDateBeginStr() {
        Calendar calendar = Calendar.getInstance();
        return getDateBeginStr(calendar.getTime());
    }

    /**
     * 获取指定日期开始时间 yyyy-MM-dd 00:00:00
     * 
     * @return
     */
    public static String getDateBeginStr(Date date) {
        return getTime(date, "yyyy-MM-dd 00:00:00");
    }

    /**
     * 获取指定日期结束时间yyyy-MM-dd 23:59:59
     * 
     * @return
     */
    public static String getDateEndStr(Date date) {
        return getTime(date, "yyyy-MM-dd 23:59:59");
    }

    /**
     * 获取今天开始时间 yyyy-MM-dd 00:00:00
     * 
     * @return
     */
    public static Date getDateBegin() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取今天结束时间 yyyy-MM-dd 00:00:00
     * 
     * @return
     */
    public static Date getCurDateEnd() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取今天最后一秒时间 yyyy-MM-dd 23:59:59
     * 
     * @return
     */
    public static String getDateEnd() {
        Calendar calendar = Calendar.getInstance();
        return getTime(calendar.getTime(), "yyyy-MM-dd 23:59:59");
    }

    /**
     * 获取 今天的月份 返回格式 yyyyMM
     * 
     * @return
     */
    public static String getMonth() {
        Calendar calendar = Calendar.getInstance();
        return getTime(calendar.getTime(), "yyyyMM");
    }

    /**
     * 和当前时间比较，简洁显示 1小时之前，显示到分钟；24小时之前显示到小时；1个月前显示到天
     * 
     * @param time
     * @return
     */
    static String simpleRangeTime(Long time) {
        Long cTime = new Date().getTime() - time;
        if (cTime < 60000l)
            return "刚刚";
        if (cTime < 3600000l)
            return (int) (cTime / (1000 * 60)) + "分钟前";
        if (cTime < 86400000l)
            return (int) (cTime / (1000 * 60 * 60)) + "小时前";
        if (cTime < 2592000000l)
            return (int) (cTime / (1000 * 60 * 60 * 24)) + "天前";
        else
            return "很久以前";
    }

    /**
     * 判断是否是48小时之前
     * 
     * @param time
     * @return
     */
    static Boolean beforeTime48h(Long time) {
        Long cTime = new Date().getTime() - time;
        return cTime < 172800000l;
    }

    /**
     * 计算月份间隔
     * 
     * @param date1
     * @param date2
     * @return
     * @throws ParseException
     */
    public static int getMonthSpace(String date1, String date2)
                                                                throws ParseException {
        int result = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(sdf.parse(date1));
        c2.setTime(sdf.parse(date2));
        result = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
        return result == 0 ? 1 : Math.abs(result);
    }

    /**
     * 计算日期间隔
     * 
     * @param date1
     * @param date2
     * @return
     * @throws ParseException
     */
    public static int getDateSpace(String date1, String date2)
                                                               throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return daysBetween(sdf.parse(date1), sdf.parse(date2));
    }

    /**
     * 计算日期间隔 by cj --20160718
     * 
     * @param date1
     * @param date2
     * @return
     * @throws ParseException
     */
    public static int getDateSpaceForHHMMSS(String date1, String date2)
                                                                        throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return daysBetweenForCompare(sdf.parse(date1), sdf.parse(date2));
    }

    /**
     * 计算日期间隔
     * 
     * @param early
     * @param late
     * @return 返回正数 绝对值
     */
    public static int daysBetween(Date early, Date late) {
        int days = 0;
        Calendar calst = Calendar.getInstance();
        Calendar caled = Calendar.getInstance();

        calst.setTime(early);
        caled.setTime(late);

        calst.set(Calendar.HOUR_OF_DAY, 0);
        calst.set(Calendar.MINUTE, 0);
        calst.set(Calendar.SECOND, 0);
        caled.set(Calendar.HOUR_OF_DAY, 0);
        caled.set(Calendar.MINUTE, 0);
        caled.set(Calendar.SECOND, 0);

        days = ((int) (caled.getTime().getTime() / 1000) - (int) (calst
            .getTime().getTime() / 1000)) / 3600 / 24;
        return days == 0 ? 0 : Math.abs(days);
    }

    /**
     * 计算日期间隔
     * 
     * @param early
     * @param late
     * @return 返回相应值， 正负 大-小
     */
    public static int daysBetweenForCompare(Date early, Date late) {
        int days = 0;
        Calendar calst = Calendar.getInstance();
        Calendar caled = Calendar.getInstance();

        calst.setTime(early);
        caled.setTime(late);

        calst.set(Calendar.HOUR_OF_DAY, 0);
        calst.set(Calendar.MINUTE, 0);
        calst.set(Calendar.SECOND, 0);
        caled.set(Calendar.HOUR_OF_DAY, 0);
        caled.set(Calendar.MINUTE, 0);
        caled.set(Calendar.SECOND, 0);

        days = ((int) (caled.getTime().getTime() / 1000) - (int) (calst
            .getTime().getTime() / 1000)) / 3600 / 24;
        return days == 0 ? 0 : days;
    }

    /**
     * 获取下几小时
     * 
     * @param date
     * @return
     */
    public static Date getNextHours(Date date, int temp) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.set(Calendar.HOUR_OF_DAY, rightNow.get(Calendar.HOUR_OF_DAY)
                                           + temp);

        return rightNow.getTime();
    }

    /**
     * 获取下几天
     * 
     * @param date
     * @return
     */
    public static Date getNextDay(Date date, int temp) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.set(Calendar.DATE, rightNow.get(Calendar.DATE) + temp);

        return rightNow.getTime();
    }

    /**
     * 获取上几天
     * 
     * @param date
     * @return
     */
    public static Date getUpDay(Date date, int temp) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.set(Calendar.DATE, rightNow.get(Calendar.DATE) - temp);

        return rightNow.getTime();
    }

    /**
     * 获取指定日期的下几天的时间
     * 
     * @param date
     * @param temp
     * @return
     */
    public static String getNextDay(String date, int temp, String formatter) {
        DateTimeFormatter format = DateTimeFormat
            .forPattern("yyyy-MM-dd HH:mm:ss");
        // 时间解析
        return DateTime.parse(date, format).plusDays(temp).toString(formatter);
    }

    /**
     * 获取下几月
     * 
     * @param date
     * @return
     */
    public static Date getNextMonth(Date date, int temp) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH) + temp);

        return rightNow.getTime();
    }

    /**
     * 获取下几月
     * 
     * @param date
     * @return
     */
    public static String getNextMonth(String date, int temp) {
        DateTimeFormatter format = DateTimeFormat
            .forPattern("yyyy-MM-dd HH:mm:ss");
        // 时间解析
        return DateTime.parse(date, format).plusMonths(temp)
            .toString("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取上几月
     * 
     * @param date
     * @return
     */
    public static String getUpMonth(String date, int temp, String formatter) {
        DateTimeFormatter format = DateTimeFormat
            .forPattern("yyyy-MM-dd HH:mm:ss");
        // 时间解析
        return DateTime.parse(date, format).minusMonths(temp)
            .toString(formatter);
    }

    /**
     * 获取下几周
     * 
     * @param date
     * @param temp
     * @return
     */
    public static Date getNextWeek(Date date, int temp) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.set(Calendar.WEEK_OF_YEAR, rightNow.get(Calendar.WEEK_OF_YEAR)
                                            + temp);

        return rightNow.getTime();
    }

    public static String getNextWeek(String date, int temp) {
        DateTimeFormatter format = DateTimeFormat
            .forPattern("yyyy-MM-dd HH:mm:ss");
        // 时间解析
        return DateTime.parse(date, format).plusWeeks(temp)
            .toString("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取下几年
     * 
     * @param date
     * @return
     */
    public static Date getNextYear(Date date, int temp) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.set(Calendar.YEAR, rightNow.get(Calendar.YEAR) + temp);

        return rightNow.getTime();
    }

    public static String getNextYear(String date, int temp) {
        DateTimeFormatter format = DateTimeFormat
            .forPattern("yyyy-MM-dd HH:mm:ss");
        // 时间解析
        return DateTime.parse(date, format).plusYears(temp)
            .toString("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取上几天
     * 
     * @param date
     * @return
     */
    public static Date getProDay(Date date, int temp) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.set(Calendar.DATE, rightNow.get(Calendar.DATE) - temp);

        return rightNow.getTime();
    }

    /**
     * 获取上几天
     * 
     * @param date
     * @return
     */
    public static String getProDay(String date, int temp, String formatter) {
        DateTimeFormatter format = DateTimeFormat
            .forPattern("yyyy-MM-dd HH:mm:ss");
        // 时间解析
        return DateTime.parse(date, format).minusDays(temp).toString(formatter);
    }

    /**
     * 获取上几天
     * 
     * @param date
     * @return
     */
    public static String getProDay2(String date, int temp, String formatter) {
        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd");
        // 时间解析
        return DateTime.parse(date, format).minusDays(temp).toString(formatter);
    }

    /**
     * 判断当天是否是星期一
     * 
     * @param curDate
     * @return
     */
    public static boolean isMon(Date curDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(curDate);
        int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
        if (day_of_week == 2) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * 获取当前月份的最后一天的最后时间
     */
    public static String getLastTimeOfMonth() {
        DateTime dt = new DateTime();
        return dt.dayOfMonth().withMaximumValue()
            .toString("yyyy-MM-dd 23:59:59");
    }

    /**
     * 获取当天剩余的秒数
     */
    public static int getRemainSeconds() {
        DateTime dt = new DateTime();
        int currentSeconds = dt.getSecondOfDay();
        int lastSecondsOfDay = dt.dayOfMonth().withMaximumValue().secondOfDay()
            .withMaximumValue().getSecondOfDay();
        return lastSecondsOfDay - currentSeconds;
    }

    /**
     * 获取上几月
     * 
     * @param date
     * @return
     */
    public static Date getUpMonth(Date date, int temp) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH) - temp);

        return rightNow.getTime();
    }

    /**
     * 获取下几天
     * 
     * @param date
     * @return
     */
    public static String getNextDay2(String date, int temp) {
        DateTimeFormatter format = DateTimeFormat
            .forPattern("yyyy-MM-dd HH:mm:ss");
        // 时间解析
        return DateTime.parse(date, format).plusDays(temp)
            .toString("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取下几天
     * 
     * @param date
     * @return
     */
    public static String getNextDay3(String date, int temp) {
        DateTimeFormatter format = DateTimeFormat
            .forPattern("yyyy-MM-dd HH:mm:ss");
        // 时间解析
        return DateTime.parse(date, format).plusDays(temp)
            .toString("yyyy-MM-dd 23:59:59");
    }

    /**
     * 获取指定时区的时间
     * 
     * @param timeZone
     * @return
     */
    public static String getTimeZone(String timeZone) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar ChinaCalendar = Calendar.getInstance();
        sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
        return sdf.format(ChinaCalendar.getTime());
    }
}
