package com.fxkj.ssc.utils.test;

import javax.mail.search.SentDateTerm;

import com.fxkj.ssc.utils.base.HttpClientHelper;
import com.fxkj.ssc.utils.base.HttpUtils;

public class HttpTest {
	
	public static void main(String[] args) {
		
//		while(true) {
//			String sendGet = HttpUtils.sendGet("https://t78910.com/app/member/include/validatecode/captcha.php?v=0.3658085575831137", null);
			String sendGet = HttpClientHelper.sendHttpGet("https://t78910.com/app/member/include/validatecode/captcha.php?v=0.3658085575831137");
			System.out.println(sendGet);
			
//		}
		
//		for(int i = 0;i<100;i++) {
//			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			String sendHttpPost = HttpClientHelper.sendHttpPost("http://khgateway.feixuncloud.com/codeComputer/betOrder");
//			
//			System.out.println(sendHttpPost);
//			
//			
//		}
		
	}

}
