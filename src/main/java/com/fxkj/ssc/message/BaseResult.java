package com.fxkj.ssc.message;

/**   
* @Title: ResultVo.java 
* @Package com.fxkj.ssc.message 
* @Description:控制器json数据结果集封装。
* @author Jack  
* @date 2017年8月18日 上午10:18:27 
* @version V1.0   
*/
public class BaseResult {

    //错误码
    private Integer code    = 0;
    //消息
    private String  message = "成功";
    //数据对象
    private Object  data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /** 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "BaseResult [code=" + code + ", message=" + message + ", data=" + data + "]";
    }

}
