package com.example.adtapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.example.http.HttpUtils;
import com.example.http.JsonUtil;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	private static final String TAG = "MyActivity";
	private Button internetButton;
	private Button btn_start_new_aty;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("onCreate Run");
		internetButton = (Button) findViewById(R.id.btnInternet);
		btn_start_new_aty = (Button) findViewById(R.id.btn_start_new_aty);
		textView = (TextView) findViewById(R.id.textView1);
		internetButton.setOnClickListener(this);
		btn_start_new_aty.setOnClickListener(this);
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
		// */
		// }
		// });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

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

		// 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码

		String getURL = GET_URL;

		URL getUrl = new URL(getURL);

		// 根据拼凑的URL，打开连接，URL.openConnection()函数会根据
		// URL的类型，返回不同的URLConnection子类的对象，在这里我们的URL是一个http，因此它实际上返回的是HttpURLConnection

		HttpURLConnection connection = (HttpURLConnection) getUrl
				.openConnection();

		// 建立与服务器的连接，并未发送数据

		connection.connect();

		// 发送数据到服务器并使用Reader读取返回的数据

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

		// 断开连接

		connection.disconnect();

		System.out.println(" ============================= ");

		System.out.println(" Contents of get request ends ");

		System.out.println(" ============================= ");

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int eventId = v.getId();
		switch (eventId) {
		case R.id.btnInternet:
			textView.setText("Internet BTN clicked");
		case R.id.btn_start_new_aty:
			Intent intent_new_aty = new Intent(MainActivity.this,
					TextViewATY.class);
			startActivity(intent_new_aty);
		}

	}

}
