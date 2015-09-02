package com.example.adtapp;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioButton extends Activity {
	private Button buttonDefult;
	private TextView textView;
	private RadioGroup radiog;
	String textString;
	int flag = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radiobutton);
		Init();

	}

	private void Init() {
		buttonDefult = (Button) findViewById(R.id.btn);
		textView = (TextView) findViewById(R.id.textview);
		textString = textView.getText().toString();
		radiog = (RadioGroup) findViewById(R.id.radiog);
		buttonDefult.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				int a = radiog.getCheckedRadioButtonId();
				if (a != -1) {
					// TODO Auto-generated method stub
					android.widget.RadioButton rButton = (android.widget.RadioButton) findViewById(a);
					textView.setText(textString + "\n" + rButton.getText());
				}
			}
		});
	}

}
