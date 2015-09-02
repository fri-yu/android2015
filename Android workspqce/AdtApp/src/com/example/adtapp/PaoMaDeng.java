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

public class PaoMaDeng extends Activity {
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.paomadeng);
		InitTextViewByHtmlString();
	}

	private void InitTextViewByHtmlString() {
		textView = (TextView) findViewById(R.id.tv);

		String string = "跑马灯~再来一遍~马灯~再来一遍";//字的长度得够长才能跑马
		textView.setText(string);
		textView.setMovementMethod(LinkMovementMethod.getInstance());//加上这句，文字可以拖动
	}
}
