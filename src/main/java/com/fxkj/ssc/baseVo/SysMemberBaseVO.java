package com.fxkj.ssc.baseVo;

import java.io.Serializable;

import com.fxkj.ssc.enums.account.CurrencyCodeEnum;

/**
 * 账户管理基础对象
 * 
 * @author jerry
 * @version $Id: SysMemberBaseVO.java, v 0.1 2017年9月5日 下午1:47:08 jerry Exp $
 */
public class SysMemberBaseVO implements Serializable {

    /**  */
    private static final long serialVersionUID = 4976389028514460994L;

    private Integer           pageSize         = 10;
    private Integer           pageNum          = 1;

    private String            currencyCode     = CurrencyCodeEnum.CNY.name();

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

}
