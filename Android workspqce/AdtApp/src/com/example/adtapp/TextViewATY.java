package com.example.adtapp;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TextViewATY extends Activity {
	private TextView textView;
	private TextView textView2;
	private TextView textViewemail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_layout);
		InitTextViewByHtmlString();
		InitTextViewByString();
		InitTextViewEmail();
	}

	private void InitTextViewByHtmlString() {
		textView = (TextView) findViewById(R.id.tv);

		String htmlString = "<font color='blue'>it's just a try </font>";
		htmlString += "<br/><a href='http://www.baidu.com'>�ٶ�һ�� ���֪��</a>";
		CharSequence charSequence = Html.fromHtml(htmlString);
		textView.setText(charSequence);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
	}

	private void InitTextViewByString() {
		textView2 = (TextView) findViewById(R.id.tvweb);
		String string = "�ٶ�һ�����֪�� http://www.baidu.com\n"
				+ "���䲻���� 157726738@qq.com";
		textView2.setText(string);
		textView2.setMovementMethod(LinkMovementMethod.getInstance());

	}

	private void InitTextViewEmail() {
		textViewemail = (TextView) findViewById(R.id.tvemail);
		String string = "���Ӳ��������� http://www.baidu.com\n"
				+ "��������� 157726738@qq.com";
		textViewemail.setText(string);
		textViewemail.setMovementMethod(LinkMovementMethod.getInstance());

	}
}
