/**
 * 
 */
package com.fxkj.ssc.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Karl
 * @Description: TODO
 * @Date 2019年11月20日 下午4:34:51
 */
public enum LanguageEnum {

    ZH_LANGUAGE("zh", "getZhLanguage", "setZhLanguage","中文"),
    
    EN_LANGUAGE("en", "getEnLanguage", "setEnLanguage","English"),

    TH_LANGUAGE("th", "getThLanguage", "setThLanguage","ภาษาไทย"),
    
    MY_LANGUAGE("my", "getMyLanguage", "setMyLanguage","ဗမာ")

    
    ;
	
	
    private String code;

    private String getMethod;

    private String setMethod;

    private String languateDesc;
    
    /**
     * @return 获取 code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param 设置  code 
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return 获取 getMethod
     */
    public String getGetMethod() {
        return getMethod;
    }

    /**
     * @param 设置  getMethod 
     */
    public void setGetMethod(String getMethod) {
        this.getMethod = getMethod;
    }

    /**
     * @return 获取 setMethod
     */
    public String getSetMethod() {
        return setMethod;
    }

    /**
     * @param 设置  setMethod 
     */
    public void setSetMethod(String setMethod) {
        this.setMethod = setMethod;
    }
    
    
    public String getLanguateDesc() {
		return languateDesc;
	}

	public void setLanguateDesc(String languateDesc) {
		this.languateDesc = languateDesc;
	}

	LanguageEnum(String code, String getMethod, String setMethod,String languateDesc) {
        this.code = code;
        this.getMethod = getMethod;
        this.setMethod = setMethod;
        this.languateDesc = languateDesc;
    }

    public static LanguageEnum getLanguage(String code) {

        for (LanguageEnum uaenum : LanguageEnum.values()) {
            if (StringUtils.equals(uaenum.getCode(), code)) {
                return uaenum;
            }
        }
        return null;

    }

}
