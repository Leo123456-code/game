package com.fxkj.ssc.baseVo;

import java.io.Serializable;
import java.util.Map;

public class RequestParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7637384134174892380L;
	private String sessionId;
	private String deptID;
	private int time;
	private Object obj;
	private String cmd;
	private Map<String,Object> data;
	
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getDeptID() {
		return deptID;
	}

	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "RequestParam [sessionId=" + sessionId + ", deptID=" + deptID
				+ ", cmd=" + cmd + ", obj=" + obj + ", data=" + data + "]";
	}	
}
