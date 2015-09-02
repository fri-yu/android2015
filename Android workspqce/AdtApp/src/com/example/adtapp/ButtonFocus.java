package com.example.adtapp;

import android.R.integer;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class ButtonFocus extends Activity implements OnClickListener,
		OnTouchListener, OnFocusChangeListener, OnKeyListener {
	private Button buttonDefult;
	private Button buttonImg;
	int flag = 1;
	private int imgWidth;
	private int imgHeight;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttonfocus);
		Init();

	}

	private void Init() {
		System.out.println("init run");
		buttonDefult = (Button) findViewById(R.id.btn1);
		buttonImg = (Button) findViewById(R.id.btn2);
		
		imgWidth=buttonImg.getWidth();
		imgHeight=buttonImg.getHeight();
		
		buttonDefult.setOnClickListener(this);

		buttonImg.setOnClickListener(this);
		buttonImg.setOnTouchListener(this);
		buttonImg.setOnFocusChangeListener(this);
		// buttonImg.setOnKeyListener(this);
	}

	@Override
	public boolean onKey(DialogInterface arg0, int arg1, KeyEvent arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onFocusChange(View arg0, boolean arg1) {
		System.out.println("focus change");
		// TODO Auto-generated method stub
		buttonImg.setWidth(imgWidth+(arg1?1:-1)*50);
		buttonImg.setHeight(imgHeight+(arg1?1:-1)*40);

	}

	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn1: {
			if (flag == 1
					&& buttonDefult.getWidth() == getWindowManager()
							.getDefaultDisplay().getWidth()) {
				flag = -1;
				buttonImg.setFocusable(true);
				buttonImg.setFocusableInTouchMode(true);
				buttonImg.requestFocus();
				buttonImg.requestFocusFromTouch();
			} else if (flag == -1 && buttonDefult.getWidth() < 150) {
				flag = 1;
			}
			buttonDefult.setWidth(buttonDefult.getWidth()
					+ (int) (flag * buttonDefult.getWidth() * 0.1));
			buttonDefult.setHeight(buttonDefult.getHeight()
					+ (int) (flag * buttonDefult.getHeight() * 0.1));
		}
			break;
		case R.id.btn2:
			
			
			break;
		}

	}
}
