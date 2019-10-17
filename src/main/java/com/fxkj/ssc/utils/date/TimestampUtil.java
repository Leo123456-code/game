package com.fxkj.ssc.utils.date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampUtil {
	
	public static Timestamp getCurrentTime(){
		return Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
