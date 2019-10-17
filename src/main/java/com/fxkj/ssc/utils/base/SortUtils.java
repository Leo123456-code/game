package com.fxkj.ssc.utils.base;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by frank on 2018/5/15.
 */
@SuppressWarnings("rawtypes")
public class SortUtils {
    // 排序 key=value&key=value,空值不参与排序
  
	@SuppressWarnings("unchecked")
	public static String sort(Map paramMap) throws Exception {
        StringBuffer sb = new StringBuffer();
        Map<String, Object> sortParams = new TreeMap<String, Object>(paramMap);
        Set es = sortParams.entrySet();  //所有参与传参的参数按照accsii排序（升序）
        Iterator it = es.iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            String k = (String)entry.getKey();
            Object v = entry.getValue();
            //空值不传递，不参与签名组串
            if(null != v && !"".equals(v)) {
                sb.append(k + "=" + v + "&");
            }
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    /**
     * param:  account:frank1
         agentCode:3Section
         dataTime:2018-10-22 16:35:12
         nickName:frank1
         pwd:qpof2Iwm4BInU1idcH377pgFSs1gQztv
       result: frank13Section2018-10-22 16:35:12frank1qpof2Iwm4BInU1idcH377pgFSs1gQztv
     * @param paramMap
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public static String sortForValue(Map paramMap) throws Exception {
        Map<String, Object> sortParams = new TreeMap<String, Object>(paramMap);
        StringBuffer ascValue=new StringBuffer();
        for (String key :sortParams.keySet()) {
            if(null != paramMap.get(key)){
                ascValue.append(paramMap.get(key).toString());
            }
        }
        return ascValue.toString();
    }

    //排序 key=value&key=&key=value,空值也参与排序
    @SuppressWarnings("unchecked")
	public static String sortA(Map paramMap) throws Exception {
        StringBuffer sb = new StringBuffer();
        Map<String, Object> sortParams = new TreeMap<String, Object>(paramMap);
        Set es = sortParams.entrySet();  //所有参与传参的参数按照accsii排序（升序）
        Iterator it = es.iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            String k = (String)entry.getKey();
            Object v = entry.getValue();
            //空值不传递，不参与签名组串
            if(null != v && !"".equals(v)) {
                sb.append(k + "=" + v + "&");
            }else{
                sb.append(k + "=" + "&");
            }
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    //排序 key=value&key=&key=value,空值也参与排序
    @SuppressWarnings("unchecked")
	public static String sortBiBaoA(Map paramMap) throws Exception {
        StringBuffer sb = new StringBuffer();
        Map<String, Object> sortParams = new TreeMap<String, Object>(paramMap);
        Set es = sortParams.entrySet();  //所有参与传参的参数按照accsii排序（升序）
        Iterator it = es.iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            String k = (String)entry.getKey();
            Object v = entry.getValue();
            //FinishTime=   OTC 回调新增了一个参数，这个参数不参与签名
            if("FinishTime".equals(k)){
                continue;
            }
            //空值不传递，不参与签名组串
            if(null != v && !"".equals(v)) {
                sb.append(k + "=" + v + "&");
            }else{
                sb.append(k + "=" + "&");
            }
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

}
