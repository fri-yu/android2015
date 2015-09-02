package com.example.adtapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class RadioButton extends Activity {
	private Button buttonDefult;
	int flag = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radiobutton);
		Init();

	}

	private void Init() {

	}

}
