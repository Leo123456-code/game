package com.fxkj.ssc.exception;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

/**   
* @Title: ParamCheckException.java 
* @Package com.fxkj.ssc.exception 
* @Description:参数检查的异常。
* @author Jack  
* @date 2017年8月17日 上午10:52:23 
* @version V1.0   
*/ 
public class ParamCheckException  extends Exception{
	
	/**
	 *Author:Jack
	 *Time:2017年8月17日下午4:37:59
	 *@param paramMap
	 *@param keys
	 *@param keyDescs
	 *@return
	 *Return:ParamCheckException
	 *Description:检查Map中的参数都不为空！
	 * @throws ParamCheckException 
	 */
	@Autowired
	public static void checkKeysNotNull(Map<String,String> paramMap,String[] keys,String[] keyDescs) throws ParamCheckException{
		if(paramMap == null){
			throw new ParamCheckException(-99, "请求参数集合不能为空");
		}
		
		if(keys!=null && keyDescs == null){
			throw new ParamCheckException(-98, "请求参数keyDescs不能为空");
		}
		
		if(keys==null && keyDescs != null){
			throw new ParamCheckException(-97, "请求参数key不能为空");
		}
		
		if(keys!=null && keyDescs != null){
			if(keys.length!=keyDescs.length){
				throw new ParamCheckException(-96, "请求参数keys长度和keyDescs长度不一致");
			}
		}
		for(int i = 0;i<keys.length;i++){
			int errorCode = 0-(i+1);
			String key = keys[i];
			Object object = paramMap.get(key);
			if(object!=null){
				String trim = object.toString().trim();
				if(trim.length()<=0){
					throw new ParamCheckException(errorCode, keyDescs[i]+"不能为空");
				}
			}else{
				throw new ParamCheckException(errorCode, keyDescs[i]+"不能为空");
			}
		}
		
	}

	/**
	 *Author:Jack
	 *Time:2017年8月17日下午4:37:59
	 *@param paramMap
	 *@param keys
	 *@param keyDescs
	 *@return
	 *Return:ParamCheckException
	 *Description:检查Map中的参数都不为空！
	 * @throws ParamCheckException 
	 */
	@Autowired
	public static void checkAllNotNull(Map<String,Object> paramMap,String[] keys,String[] keyDescs) throws ParamCheckException{
		if(paramMap == null){
			throw new ParamCheckException(-99, "请求参数集合不能为空");
		}
		
		if(keys!=null && keyDescs == null){
			throw new ParamCheckException(-98, "请求参数keyDescs不能为空");
		}
		
		if(keys==null && keyDescs != null){
			throw new ParamCheckException(-97, "请求参数key不能为空");
		}
		
		if(keys!=null && keyDescs != null){
			if(keys.length!=keyDescs.length){
				throw new ParamCheckException(-96, "请求参数keys长度和keyDescs长度不一致");
			}
		}
		
		for(int i = 0;i<keys.length;i++){
			int errorCode = 0-(i+1);
			String key = keys[i];
			Object object = paramMap.get(key);
			if(object!=null){
				String trim = object.toString().trim();
				if(trim.length()<=0){
					throw new ParamCheckException(errorCode, keyDescs[i]+"不能为空");
				}
			}else{
				throw new ParamCheckException(errorCode, keyDescs[i]+"不能为空");
			}
		}
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer code;
    private String  desc;
	
	public ParamCheckException() {
		
	}
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}

	public ParamCheckException(Integer code, String desc) {
		super();
		this.code = code;
		this.desc = desc;
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String getMessage() {
		return toString();
	}

	@Override
	public String toString() {
		return "ParamCheckException [code=" + code + ", desc=" + desc + "]";
	}
	
}
