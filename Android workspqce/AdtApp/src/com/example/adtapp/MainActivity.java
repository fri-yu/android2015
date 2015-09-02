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
	private Button btn_start_pic_aty;
	private Button btn_start_aty_fromtext;
	private Button btn_start_aty_PMD;
	private Button btn_start_aty_WBJY;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// System.out.println("onCreate Run");
		internetButton = (Button) findViewById(R.id.btnInternet);
		btn_start_new_aty = (Button) findViewById(R.id.btn_start_new_aty);
		btn_start_pic_aty = (Button) findViewById(R.id.btn_start_pic_aty);
		btn_start_aty_fromtext = (Button) findViewById(R.id.btn_start_aty_fromtext);
		btn_start_aty_PMD = (Button) findViewById(R.id.btn_start_aty_PMD);
		btn_start_aty_WBJY = (Button) findViewById(R.id.btn_start_aty_WBJY);
		
		internetButton.setOnClickListener(this);
		btn_start_new_aty.setOnClickListener(this);
		btn_start_pic_aty.setOnClickListener(this);
		btn_start_aty_fromtext.setOnClickListener(this);
		btn_start_aty_PMD.setOnClickListener(this);
		btn_start_aty_WBJY.setOnClickListener(this);
		
		
		textView = (TextView) findViewById(R.id.textView1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
		case R.id.btn_start_pic_aty:
			Intent intent_pic_aty = new Intent(MainActivity.this,
					TextViewShowPic.class);
			startActivity(intent_pic_aty);
		case R.id.btn_start_aty_fromtext:
			Intent btn_start_aty_fromtext = new Intent(MainActivity.this,
					StartATYFromText.class);
			startActivity(btn_start_aty_fromtext);
		case R.id.btn_start_aty_PMD:
			Intent btn_start_aty_PMD = new Intent(MainActivity.this,
					PaoMaDeng.class);
			startActivity(btn_start_aty_PMD);
		case R.id.btn_start_aty_WBJY:
			Intent btn_start_aty_WBJY = new Intent(MainActivity.this,
					WenbenJiaoyan.class);
			startActivity(btn_start_aty_WBJY);
		}

	}

}
