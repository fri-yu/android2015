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
	  // ��������HttpClient�ͻ���
	  System.out.println("�����Ϸ�����");
	  HttpClient httpClient = new DefaultHttpClient();
	  // ���������url
	  // ��������Ķ���
	  HttpGet get = new HttpGet(new URI(strUrl));
	  // ����get����
	  HttpResponse httpResponse = httpClient.execute(get);
	  // �������ɹ�������Ӧ
	  if (httpResponse.getStatusLine().getStatusCode() == 200) {
	   HttpEntity entity = httpResponse.getEntity();
	   if (entity != null) {
	    // ��ȡ��������Ӧ��json�ַ���
	   json = EntityUtils.toString(entity, "UTF-8");
	    System.out.println(json);     //������ص��ַ�����Ϣ
	   }
	  } else {
	   System.out.println("���ӳ�ʱ");
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
