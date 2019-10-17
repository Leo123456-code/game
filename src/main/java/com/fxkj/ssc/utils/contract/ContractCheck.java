package com.fxkj.ssc.utils.contract;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

import com.fxkj.ssc.utils.date.DateHandler;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ContractCheck {

    public static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // 计算用户分红时间
    public static Map<String, Object> getDate(Integer bonusStrategy) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String, Object> timeMap = new HashMap<String, Object>();
        if (bonusStrategy == 0) {
            // 半月不累计
            Calendar c = Calendar.getInstance();
            String bonusBeginTime = "";
            String bonusEndTime = "";
            if (c.get(Calendar.DAY_OF_MONTH) > 16) {
                c.add(Calendar.MONTH, 0);
                c.set(Calendar.HOUR_OF_DAY, 0);
                // 将分钟至0
                c.set(Calendar.MINUTE, 0);
                // 将秒至0
                c.set(Calendar.SECOND, 0);
                // 将毫秒至0
                c.set(Calendar.MILLISECOND, 0);
                c.set(Calendar.DAY_OF_MONTH, 15);// 设置为1号,当前日期既为本月第一天
                bonusBeginTime = format.format(c.getTime());
                c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
                bonusEndTime = format.format(c.getTime());
            } else {
                c.add(Calendar.MONTH, 0);
                c.set(Calendar.HOUR_OF_DAY, 0);
                // 将分钟至0
                c.set(Calendar.MINUTE, 0);
                // 将秒至0
                c.set(Calendar.SECOND, 0);
                // 将毫秒至0
                c.set(Calendar.MILLISECOND, 0);
                c.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
                bonusBeginTime = format.format(c.getTime());
                Calendar ca = Calendar.getInstance();
                ca.add(Calendar.MONTH, 0);
                ca.set(Calendar.HOUR_OF_DAY, 0);
                // 将分钟至0
                ca.set(Calendar.MINUTE, 0);
                // 将秒至0
                ca.set(Calendar.SECOND, 0);
                // 将毫秒至0
                ca.set(Calendar.MILLISECOND, 0);
                ca.set(Calendar.DAY_OF_MONTH, 15);// 设置为1号,当前日期既为本月第一天
                bonusEndTime = format.format(ca.getTime());
            }
            timeMap.put("beginBounsTime", bonusBeginTime);
            timeMap.put("endBounsTime", bonusEndTime);
            return timeMap;

        } else {
            // 一月累计
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MONTH, 0);
            c.set(Calendar.HOUR_OF_DAY, 0);
            // 将分钟至0
            c.set(Calendar.MINUTE, 0);
            // 将秒至0
            c.set(Calendar.SECOND, 0);
            // 将毫秒至0
            c.set(Calendar.MILLISECOND, 0);
            c.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
            String bonusBeginTime = format.format(c.getTime());
            c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
            String bonusEndTime = format.format(c.getTime());
            timeMap.put("beginBounsTime", bonusBeginTime);
            timeMap.put("endBounsTime", bonusEndTime);
            return timeMap;
        }
    }

    /**
     * 契约内容进行校验
     * @param dataArray
     * @return
     * @desc 新增契约内容正整数校验
     */
    public static Boolean checkArray(JSONArray dataArray,Integer type) {
        if(type == 1){
            Boolean flag = false;
            if (dataArray.size() == 1) {
                if ((String) dataArray.getJSONObject(0).get("activeMoney").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("activeMoney").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("meetDays").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isInteger(dataArray.getJSONObject(0).get("meetDays").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("dayConsumption").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("dayConsumption").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("activeCharge").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("activeCharge").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("activeDay").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isInteger(dataArray.getJSONObject(0).get("activeDay").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("activePeople").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isInteger(dataArray.getJSONObject(0).get("activePeople").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("profitLoss").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("profitLoss").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("totalConsumption").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("totalConsumption").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("salaryProportion").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("salaryProportion").toString())) {
                    flag = false;
                    return false;
                }
                return true;
            }
            for (int i = 0; i < dataArray.size(); i++) {
                for (int j = i + 1; j < dataArray.size(); j++) {
                    JSONObject jsonContent = dataArray.getJSONObject(i);
                    JSONObject jsonContents = dataArray.getJSONObject(j);
                    //满足天数
                    if (Integer.valueOf((String) jsonContents.get("activeDay").toString()) > Integer
                            .valueOf((String) jsonContent.get("activeDay").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isInteger(dataArray.getJSONObject(0).get("activeDay").toString())) {
                        flag = false;
                        break;
                    }
                    //活跃充值量
                    if (Integer.valueOf((String) jsonContents.get("activeCharge").toString()) > Integer
                            .valueOf((String) jsonContent.get("activeCharge").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isInteger(dataArray.getJSONObject(0).get("activeCharge").toString())) {
                        flag = false;
                        break;
                    }
                    //满足天数
                    if (Integer.valueOf((String) jsonContents.get("meetDays").toString()) > Integer
                            .valueOf((String) jsonContent.get("meetDays").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isInteger(dataArray.getJSONObject(0).get("meetDays").toString())) {
                        flag = false;
                        break;
                    }
                    // 活跃金额
                    if (Integer.valueOf((String) jsonContents.get("activeMoney").toString()) > Integer
                            .valueOf((String) jsonContent.get("activeMoney").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("activeMoney").toString())) {
                        flag = false;
                        break;
                    }
                    // 日销量
                    if (Integer.valueOf((String) jsonContents.get("dayConsumption").toString()) > Integer
                            .valueOf((String) jsonContent.get("dayConsumption").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("dayConsumption").toString())) {
                        flag = false;
                        break;
                    }
                    // 活跃人数
                    if (Integer.valueOf((String) jsonContents.get("activePeople").toString()) > Integer
                            .valueOf((String) jsonContent.get("activePeople").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isInteger(dataArray.getJSONObject(0).get("activePeople").toString())) {
                        flag = false;
                        break;
                    }
                    // 盈亏
                    if (Integer.valueOf((String) jsonContents.get("profitLoss").toString()) > Integer
                            .valueOf((String) jsonContent.get("profitLoss").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("profitLoss").toString())) {
                        flag = false;
                        break;
                    }
                    //总消费量
                    if (Integer.valueOf((String) jsonContents.get("totalConsumption").toString()) > Integer
                            .valueOf((String) jsonContent.get("totalConsumption").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("totalConsumption").toString())) {
                        flag = false;
                        break;
                    }
                    // 分红比例
                    if (Double.valueOf((String) jsonContents.get("salaryProportion").toString()) > Double
                            .valueOf((String) jsonContent.get("salaryProportion").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("salaryProportion").toString())) {
                        flag = false;
                        break;
                    }
                }
            }
            return flag;
        }else if(type == 5){
            Boolean flag = false;
            if (dataArray.size() == 1) {
                if ((String) dataArray.getJSONObject(0).get("activeMoney").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("activeMoney").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("activeCharge").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("activeCharge").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("activePeople").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isInteger(dataArray.getJSONObject(0).get("activePeople").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("totalCharge").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("totalCharge").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("totalConsumption").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("totalConsumption").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("profitLoss").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("profitLoss").toString())) {
                    flag = false;
                    return false;
                }
                if ((String) dataArray.getJSONObject(0).get("salaryProportion").toString() == null) {
                    flag = false;
                    return false;
                }
                if (!isDouble(dataArray.getJSONObject(0).get("salaryProportion").toString())) {
                    flag = false;
                    return false;
                }
                return true;
            }
            for (int i = 0; i < dataArray.size(); i++) {
                for (int j = i + 1; j < dataArray.size(); j++) {
                    JSONObject jsonContent = dataArray.getJSONObject(i);
                    JSONObject jsonContents = dataArray.getJSONObject(j);
                    //满足天数
                    if (Integer.valueOf((String) jsonContents.get("activeCharge").toString()) > Integer
                            .valueOf((String) jsonContent.get("activeCharge").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("activeCharge").toString())) {
                        flag = false;
                        return false;
                    }
                    // 活跃金额
                    if (Integer.valueOf((String) jsonContents.get("activeMoney").toString()) > Integer
                            .valueOf((String) jsonContent.get("activeMoney").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("activeMoney").toString())) {
                        flag = false;
                        return false;
                    }
                    // 活跃人数
                    if (Integer.valueOf((String) jsonContents.get("activePeople").toString()) > Integer
                            .valueOf((String) jsonContent.get("activePeople").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isInteger(dataArray.getJSONObject(0).get("activePeople").toString())) {
                        flag = false;
                        return false;
                    }
                    // 总充值量
                    if (Integer.valueOf((String) jsonContents.get("totalCharge").toString()) > Integer
                            .valueOf((String) jsonContent.get("totalCharge").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("totalCharge").toString())) {
                        flag = false;
                        return false;
                    }
                    // 盈亏
                    if (Integer.valueOf((String) jsonContents.get("profitLoss").toString()) > Integer
                            .valueOf((String) jsonContent.get("profitLoss").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("profitLoss").toString())) {
                        flag = false;
                        return false;
                    }
                    //总消费量
                    if (Integer.valueOf((String) jsonContents.get("totalConsumption").toString()) > Integer
                            .valueOf((String) jsonContent.get("totalConsumption").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("totalConsumption").toString())) {
                        flag = false;
                        return false;
                    }
                    // 分红比例
                    if (Double.valueOf((String) jsonContents.get("salaryProportion").toString()) > Double
                            .valueOf((String) jsonContent.get("salaryProportion").toString())) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                    if (!isDouble(dataArray.getJSONObject(0).get("salaryProportion").toString())) {
                        flag = false;
                        return false;
                    }
                }
            }
            return flag;
        }else{
            return false;
        }

    }

    // 契约内容进行校验
    public static Boolean checkArrayDailyWages(JSONArray dataArray) {
        Boolean flag = false;
        if (dataArray.size() == 1) {
            flag = true;
            return flag;
        }
        for (int i = 0; i < dataArray.size(); i++) {
            for (int j = i + 1; j < dataArray.size(); j++) {
                JSONObject jsonContent = dataArray.getJSONObject(i);
                JSONObject jsonContents = dataArray.getJSONObject(j);
                // 活跃金额
                if (Double.valueOf((String) jsonContents.get("activeMoney").toString()) > Double
                    .valueOf((String) jsonContent.get("activeMoney").toString())) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                // 盈亏
                if (Double.valueOf((String) jsonContents.get("profitLoss").toString()) > Double
                        .valueOf((String) jsonContent.get("profitLoss").toString())) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                // 满足天数
                if (Integer.valueOf((String) jsonContents.get("meetDays").toString()) > Integer
                        .valueOf((String) jsonContent.get("meetDays").toString())) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                // 日销量
                if (Double.valueOf((String) jsonContents.get("dayConsumption").toString()) > Double
                    .valueOf((String) jsonContent.get("dayConsumption").toString())) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                // 消费量
                if (Double.valueOf((String) jsonContents.get("totalConsumption").toString()) > Double
                        .valueOf((String) jsonContent.get("totalConsumption").toString())) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                // 活跃人数
                if (Integer.valueOf((String) jsonContents.get("activePeople").toString()) > Integer
                    .valueOf((String) jsonContent.get("activePeople").toString())) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                // 分红比例
                if (Integer.valueOf((String) jsonContents.get("salaryProportion").toString()) > Integer
                    .valueOf((String) jsonContent.get("salaryProportion").toString())) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    //判断整数（int）
    public static boolean isInteger(String str) {
        if (null == str || "".equals(str)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    //判断浮点数（double和float）
    public static boolean isDouble(String str) {
        if (null == str || "".equals(str)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
        return pattern.matcher(str).matches();
    }


    /**
     * 根据List获取到对应的JSONArray
     * @param list
     * @return
     */
    public static JSONArray getJSONArrayByList(List<?> list){
        JSONArray jsonArray = new JSONArray();
        if (list==null ||list.isEmpty()) {
            return jsonArray;
        }

        for (Object object : list) {
            jsonArray.add(object);
        }
        return jsonArray;
    }
    @SuppressWarnings("unused")
	public static Map<String,Object> createTime(String lastBonusTime,String bonusTime,Boolean isAccumulated,Integer BonusType) throws Exception{

        String []  time  = bonusTime.split(",");
        if(isAccumulated){//累计
            return accumulative(lastBonusTime,bonusTime);
        }else{//不累计
            if(BonusType == 1){//不累计分红类型为1
                return accumulative(lastBonusTime,bonusTime);
            }else{
                return unAccumulativeByOnthers(lastBonusTime,bonusTime);
            }
        }
    }
    //分红累计
    @SuppressWarnings("deprecation")
	public static Map<String,Object> accumulative(String lastBonusTime,String   bonusTime)throws Exception{
        Map<String, Object> map = new HashMap<>();
        String []  time  = bonusTime.split(",");
        if(lastBonusTime == null || lastBonusTime == "" || lastBonusTime.equals("null") || lastBonusTime.equals("")){//说明是第一次分红
            if(time[0].trim() == null || time[0].trim().equals("")){
                map.put("startBonusTime", DateHandler.getDateEndStr(DateHandler.getUpDay(new Date(), 1)));
            }else{
                String date = createTimeByDay(Integer.valueOf(time[0].trim()));
                map.put("startBonusTime", DateHandler.getDateEndStr(DateHandler.getUpDay(formatter.parse(date), 1)));
            }
            map.put("endBonusTime","");

        }else {
            int day  = formatter.parse(lastBonusTime).getDay() - 1;
            int index = bonusTime.indexOf(String.valueOf(day));//获取上次分红时间在配置时间的位置从1开始
            if(index - 1 == time.length){//说明是最后一个时间
                String date = createTimeByDay(Integer.valueOf(time[0].trim()));//本次分红的结束时
                map.put("start_bonus_time",formatter.parse(lastBonusTime));
                map.put("end_bonus_time",DateHandler.getDateEndStr(DateHandler.getUpDay(formatter.parse(date), 1)));
            }else{//如果不是最后一个时间，那么返回的位置就是本次分红的时间
                String date = createTimeByDay(Integer.valueOf(time[index].trim()));;
                map.put("start_bonus_time",formatter.parse(lastBonusTime));
                map.put("end_bonus_time",DateHandler.getDateEndStr(DateHandler.getUpDay(formatter.parse(date), 1)));
            }
        }
        return map;
    }

    //契约日工资，日分红，分红日量不累计时间计算
    @SuppressWarnings({ "unused", "deprecation" })
	public static Map<String,Object> unAccumulativeByOnthers(String lastBonusTime,String   bonusTime)throws Exception{
        Map<String, Object> map = new HashMap<>();
        String []  time  = bonusTime.split(",");
        if(lastBonusTime == null || lastBonusTime == "" || lastBonusTime.equals("")){//说明是第一次分红
            if(time[0].trim() == null || time[0].trim() == ""){
                String date = createTimeByDay(Integer.valueOf(time[0].trim()));
                map.put("start_bonus_time",DateHandler.getDateBeginStr(DateHandler.getUpDay(new Date(), 1)));
                map.put("end_bonus_time",DateHandler.getDateEndStr(DateHandler.getUpDay(new Date(), 1)));
            }else{
                String date = createTimeByDay(Integer.valueOf(time[0].trim()));
                map.put("start_bonus_time",DateHandler.getDateBeginStr(DateHandler.getUpDay(formatter.parse(date), 1)));
                map.put("end_bonus_time",DateHandler.getDateEndStr(DateHandler.getUpDay(formatter.parse(date), 1)));
            }

        }else {//不累计且不是第一次，那么就获取上次分红时间，到前一天的23:59：59
            int day  = formatter.parse(lastBonusTime).getDay() - 1;
            int index = bonusTime.indexOf(String.valueOf(day));//获取上次分红时间在配置时间的位置从1开始
            String date = "";
            if(index - 1 == time.length){//如果返回的位置是分红设置时间的最后一位，那么从0开始计算分红时间
                date = createTimeByDay(Integer.valueOf(time[0].trim()));
            }else{
                date = createTimeByDay(Integer.valueOf(time[index].trim()));
            }
            map.put("start_bonus_time",DateHandler.getDateBeginStr(DateHandler.getUpDay(formatter.parse(date), 1)));
            map.put("end_bonus_time",DateHandler.getDateEndStr(DateHandler.getUpDay(formatter.parse(date), 1)));
        }
        return map;
    }

    public static String createTimeByDay(Integer day){
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        String date = year+"-"+month+"-"+day+" 00:00:00";
        return date;
    }
}
