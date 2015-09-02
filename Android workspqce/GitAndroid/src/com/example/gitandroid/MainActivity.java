package com.example.gitandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button textviewATY;
	private TextView textViewMain;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textviewATY = (Button) this.findViewById(R.id.textviewATY);
		textviewATY.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// public void onClick(View v) {
				// TODO Auto-generated method stub
				// switch (v.getId()) {
				// case R.id.textviewATY:
				// System.out.println("textviewATY clicked");
				// break;
				// default:
				// System.out.println("123 clicked");
				// break;
				// }
				int a = v.getId();
				textViewMain.setText(a);

			}
		});
		textViewMain = (TextView) this.findViewById(R.id.textViewMain);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);

		return true;
	}

}
