package com.example.http;

import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class JsonUtil {

	public static String json;

	public static String findAll(String strUrl) throws Exception {
	  // 创建请求HttpClient客户端
	  System.out.println("连接上服务器");
	  HttpClient httpClient = new DefaultHttpClient();
	  // 创建请求的url
	  // 创建请求的对象
	  HttpGet get = new HttpGet(new URI(strUrl));
	  // 发送get请求
	  HttpResponse httpResponse = httpClient.execute(get);
	  // 如果服务成功返回响应
	  if (httpResponse.getStatusLine().getStatusCode() == 200) {
	   HttpEntity entity = httpResponse.getEntity();
	   if (entity != null) {
	    // 获取服务器响应的json字符串
	   json = EntityUtils.toString(entity, "UTF-8");
	    System.out.println(json);     //输出返回的字符串信息
	   }
	  } else {
	   System.out.println("连接超时");
	  }
	  return json;
	 }
public static void main(String[] args)
{
	try {
		findAll("http://ecchannel.api.fang.com/seller/GetSellerCustomerList.do?Sellerid=42476002&Customer_intent=%E5%BC%BA");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
