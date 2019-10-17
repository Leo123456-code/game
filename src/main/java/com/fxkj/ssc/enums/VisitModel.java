/**
 * ssc
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author arvin
 * @version $Id: VisitModel.java, v 0.1 2017年8月21日 下午8:45:28 arvin Exp $
 */
public enum VisitModel {

    FRONT("FRONT"),

    BACKGROUND("BACKGROUND");

    private String desc;

    private VisitModel(String desc) {
        this.desc = desc;
    }

    public VisitModel getEnumByDesc(String desc) {
        VisitModel model = null;
        for (VisitModel visitModel : VisitModel.values()) {
            if (StringUtils.equals(visitModel.desc, desc)) {
                return visitModel;
            }
        }
        return model;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     * 
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     * 
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
