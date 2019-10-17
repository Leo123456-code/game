/**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.fxkj.ssc.utils.mail;

import java.io.File;

/**
 * 发送附件用
 * @author jerry
 * @version $Id: AttachBean.java, v 0.1 2017年7月27日 上午11:03:59 jerry Exp $
 */
public class AttachBean {

    private String cid;
    private File   file;
    private String fileName;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public AttachBean() {

    }

    public AttachBean(File file, String fileName) {
        super();
        this.file = file;
        this.fileName = fileName;
    }

}
