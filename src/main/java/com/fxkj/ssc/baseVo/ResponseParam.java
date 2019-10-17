package com.fxkj.ssc.baseVo;

import java.io.Serializable;
import java.util.Map;


public class ResponseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8546578213396245959L;
	private String sessionId;
	private String deptID;
	private String cmd;
	private String responseCode;
	private String responseMes;
	private Object obj;
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


	public String getResponseCode() {
		return responseCode;
	}


	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}


	public String getResponseMes() {
		return responseMes;
	}


	public void setResponseMes(String responseMes) {
		this.responseMes = responseMes;
	}


	@Override
	public String toString() {
		return "ResponseParam [sessionId=" + sessionId + ", deptID=" + deptID
				+ ", cmd=" + cmd + ", responseCode=" + responseCode
				+ ", responseMes=" + responseMes + ", obj=" + obj + ", data="
				+ data + "]";
	}
	
}
