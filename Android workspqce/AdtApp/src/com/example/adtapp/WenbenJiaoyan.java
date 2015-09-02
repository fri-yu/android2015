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
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WenbenJiaoyan extends Activity {
	private EditText editText;  
		
private Button btnWBJY;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wenbenjiaoyan);
		Init();
		
	}

	private void Init() {
		editText=(EditText)findViewById(R.id.et1);
		btnWBJY=(Button)findViewById(R.id.btnWBJY);
		btnWBJY.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				editText.setError("123");
			}
		} );
	}
}
