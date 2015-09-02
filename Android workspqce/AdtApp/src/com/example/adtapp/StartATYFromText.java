package com.example.adtapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class StartATYFromText extends Activity {
	private TextView textView;
	private TextView textView2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startfromtext);
		InitTextViewByHtmlString();
		InitTextViewByString();

	}

	private void InitTextViewByHtmlString() {
		textView = (TextView) findViewById(R.id.tv);

		String string = "������ATY";
		SpannableString spannableString = new SpannableString(string);
		spannableString.setSpan(new ClickableSpan() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StartATYFromText.this,
						MainActivity.class);
				startActivity(intent);
			}
		}, spannableString.length() - 5, spannableString.length(),// ����ע��һ�£�
																	// spannableString
																	// ��string
																	// ��length()ò����һ���ģ����ָ���ĸ��ռ�ĳ���ò��Ҳ��һ����
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		textView.setText(spannableString);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
	}

	private void InitTextViewByString() {
		textView2 = (TextView) findViewById(R.id.tv2);
		String string = "����CCè";
		SpannableString spannableString = new SpannableString(string);
		spannableString.setSpan(new ClickableSpan() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StartATYFromText.this,
						TextViewShowPic.class);
				startActivity(intent);
			}
		}, string.length() - 3, string.length(),
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		textView2.setText(spannableString);
		textView2.setMovementMethod(LinkMovementMethod.getInstance());
	}
}
