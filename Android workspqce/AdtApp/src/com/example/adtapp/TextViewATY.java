package com.example.adtapp;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewATY extends Activity {
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_layout);
		textView = (TextView) findViewById(R.id.tv);
		String htmlString = "<font color='blue'>it's just a try </font>";
		htmlString+="<br/><a href='http://www.baidu.com'>百度一下 你就知道</a>";
		CharSequence charSequence = Html.fromHtml(htmlString);
		textView.setText(charSequence);
	}
}
