package com.fxkj.ssc.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.fxkj.ssc.utils.base.StringHelper;

public class TimeTransferHelper {

	//根据时区转换时间
	public static String timeTransfer(String time, String NowTimeZone, String TargetTimeZone) {
	    if(StringHelper.isEmpty(time)){
	        return "";
	    }
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    simpleDateFormat.setTimeZone(TimeZone.getTimeZone(NowTimeZone));
	    Date date;
	    try {
	        date = simpleDateFormat.parse(time);
	    } catch (ParseException e) {
	        e.printStackTrace();
	        return "0";
	    }
	    simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TargetTimeZone));
	    return simpleDateFormat.format(date);
	}

	//北京时间转悉尼时间
	public static String timeTransferCCTtoAEST(String time) {
	    return timeTransfer(time, "Asia/Shanghai", "Australia/Sydney");
	}

	//悉尼时间转北京时间
	public static String timeTransferAESTtoCCT(String time) {
	    return timeTransfer(time, "Australia/Sydney", "Asia/Shanghai");
	}
	
}
