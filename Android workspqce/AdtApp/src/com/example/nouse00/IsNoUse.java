package com.example.nouse00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.example.http.HttpUtils;

public class IsNoUse {
	class VisitWebRunnable implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			String resultString = HttpUtils
					.GetContent("http://ecchannel.api.fang.com/seller/GetSellerCustomerList.do?Sellerid=42476002&Customer_intent=%E5%BC%BA");
			System.out.println("resultString:" + resultString);
		}

	}

	public static final String GET_URL = " http://ecchannel.api.fang.com/Seller/GetSellerCustomerList.do?SellerID=45526276 ";

	public static void readContentFromGet() throws IOException {

		// ƴ��get�����URL�ִ���ʹ��URLEncoder.encode������Ͳ��ɼ��ַ����б���

		String getURL = GET_URL;

		URL getUrl = new URL(getURL);

		// ����ƴ�յ�URL�������ӣ�URL.openConnection()���������
		// URL�����ͣ����ز�ͬ��URLConnection����Ķ������������ǵ�URL��һ��http�������ʵ���Ϸ��ص���HttpURLConnection

		HttpURLConnection connection = (HttpURLConnection) getUrl
				.openConnection();

		// ����������������ӣ���δ��������

		connection.connect();

		// �������ݵ���������ʹ��Reader��ȡ���ص�����

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));

		System.out.println(" ============================= ");

		System.out.println(" Contents of get request ");

		System.out.println(" ============================= ");

		String lines;

		while ((lines = reader.readLine()) != null) {

			System.out.println(lines);

		}

		reader.close();

		// �Ͽ�����

		connection.disconnect();

		System.out.println(" ============================= ");

		System.out.println(" Contents of get request ends ");

		System.out.println(" ============================= ");

	}
	/*	
	 // internetButton.setOnClickListener(new OnClickListener() {
	
	//
	// @Override
	// public void onClick(View v) {
	// int id=v.getId();
	// System.out.println(id);
	// // System.out.println("onclick Run");
	// // Thread visitBaiduThread = new Thread(new VisitWebRunnable());
	// // visitBaiduThread.start();
	// // String resultString = HttpUtils
	// //
	// .GetContent("http://ecchannel.api.fang.com/seller/GetSellerCustomerList.do?Sellerid=42476002&Customer_intent=%E5%BC%BA");
	// // System.out.println("resultString:" + resultString);
	// // Log.v(TAG, resultString);
	// // System.out.println(" btn click ");
	// // // TODO Auto-generated method stub
	// //
	// // System.out.println(" method run ");
	// /*
	// * try { JsonUtil.findAll(
	// *
	// "http://ecchannel.api.fang.com/seller/GetSellerCustomerList.do?Sellerid=42476002&Customer_intent=%E5%BC%BA"
	// * ); } catch (Exception e) { // TODO Auto-generated catch block
	// * e.printStackTrace();
	// *
	// * System.out.println(" method error ");
	// * System.out.println(e.getMessage()); // TODO Auto-generated
	// * catch block
	// *
	// * }
	// 
	// }
	// });
*/
}
