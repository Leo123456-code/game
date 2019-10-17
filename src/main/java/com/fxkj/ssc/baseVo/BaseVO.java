/**
 * ssc
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.baseVo;

/**
 * 所有服务之间调用的VO必须继承该类
 * @author arvin
 * @version $Id: BaseVO.java, v 0.1 2017年9月20日 上午11:49:19 arvin Exp $
 */
public class BaseVO {

    private String platformCode;

    public BaseVO() {

    }

    public BaseVO(String platformCode) {

        this.platformCode = platformCode;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

}
