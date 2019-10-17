package com.fxkj.ssc.utils.base;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by frank on 2018/12/27.
 */
public class HtmlParse {

    /**
     * 读取html 标签属性参数
     * eg:<body onLoad="document.actform.submit()"> 读取 onLoad 值为 document.actform.submit()
     * @param htmlStr
     * @return
     */
    @SuppressWarnings("rawtypes")
	public static Map<String,Object> readAttributeMap(String htmlStr) throws Exception {
        Map<String,Object> resultMap=new HashMap<>();

        //解析XML形式的文本,得到document对象
        Document document= DocumentHelper.parseText(htmlStr);
        //获取文档的根节点
        Element eleRoot = document.getRootElement();
        //取得某节点的单个子节点
        Element fromElement=eleRoot.element("form");

        //读取 地址 请求方式
        resultMap.put("action",fromElement.attributeValue("action"));
//        resultMap.put("method",fromElement.attributeValue("method"));
        //取得某节点下指定名称的所有节点并进行遍历
        List nodes = fromElement.elements("input");
        for (Iterator it = nodes.iterator(); it.hasNext();) {
            Element elm = (Element) it.next();
            resultMap.put(elm.attributeValue("name"),elm.attributeValue("value"));
        }

        return resultMap;
    }

    /**
     * 读取html 节点参数
     * eg:<input name="key" type="hidden">123</input> 读取input标签下 123
     * @param htmlStr
     * @return
     */
    @SuppressWarnings("unused")
	public static Map<String,Object> readNodeMap(String htmlStr) throws Exception {
        Map<String,Object> resultMap=new HashMap<>();

        //解析XML形式的文本,得到document对象
        Document document= DocumentHelper.parseText(htmlStr);
        //获取文档的根节点
        Element eleRoot = document.getRootElement();
        //取得某节点的单个子节点
        Element fromElement=eleRoot.element("form");

        //取得节点下的值
        String text2=fromElement.getText();
        //这个是取得根节点下的name字节点的文字
        String text1=eleRoot.elementText("name");

        return resultMap;
    }


    /**
     * 闭合指定标签 例如闭合input
     * eg:<input> 闭合为 <input />
     * @param str
     * @param node
     * @return
     */
    public static String closeHTML(String str,String node) {
        for (int j = 0; j < str.length(); ) {
            int tagStart = str.indexOf("<" + node ,j);
            if (tagStart >= 0) {
                int tagEnd = str.indexOf(">", tagStart);
                j = tagEnd;
                String preCloseTag = str.substring(tagEnd - 1, tagEnd);
                if (!"/".equals(preCloseTag)) {
                    String preStr = str.substring(0, tagEnd);
                    String afterStr = str.substring(tagEnd);
                    str = preStr + "/" + afterStr;
                }
            } else {
                break;
            }
        }
        return str;
    }
}
