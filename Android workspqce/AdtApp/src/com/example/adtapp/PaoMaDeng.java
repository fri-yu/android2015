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

	}
}
