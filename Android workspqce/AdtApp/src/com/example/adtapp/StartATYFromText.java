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

		String string = "启动主ATY";
		SpannableString spannableString = new SpannableString(string);
		spannableString.setSpan(new ClickableSpan() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StartATYFromText.this,
						MainActivity.class);
				startActivity(intent);
			}
		}, spannableString.length() - 5, spannableString.length(),// 这里注释一下，
																	// spannableString
																	// 与string
																	// 的length()貌似是一样的，汉字跟字母所占的长度貌似也是一样的
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		textView.setText(spannableString);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
	}

	private void InitTextViewByString() {
		textView2 = (TextView) findViewById(R.id.tv2);
		String string = "启动CC猫";
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
