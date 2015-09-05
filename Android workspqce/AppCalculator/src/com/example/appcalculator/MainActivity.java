package com.example.appcalculator;

import java.util.ArrayList;
import java.util.List;

import com.example.appcalculator.CalculatorArg.Option;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	private TextView tv;
	List<CalculatorArg> argList = new ArrayList<CalculatorArg>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.textView);
		Init();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void Init() {
		findViewById(R.id.btn0).setOnClickListener(this);
		findViewById(R.id.btn1).setOnClickListener(this);
		findViewById(R.id.btn2).setOnClickListener(this);
		findViewById(R.id.btn3).setOnClickListener(this);
		findViewById(R.id.btn4).setOnClickListener(this);
		findViewById(R.id.btn5).setOnClickListener(this);
		findViewById(R.id.btn6).setOnClickListener(this);
		findViewById(R.id.btn7).setOnClickListener(this);
		findViewById(R.id.btn8).setOnClickListener(this);
		findViewById(R.id.btn9).setOnClickListener(this);
		findViewById(R.id.btnAdd).setOnClickListener(this);
		findViewById(R.id.btnSub).setOnClickListener(this);
		findViewById(R.id.btnX).setOnClickListener(this);
		findViewById(R.id.btnDiv).setOnClickListener(this);
		findViewById(R.id.btnResult).setOnClickListener(this);
		findViewById(R.id.btnClear).setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn0:
			// System.out.println(tv.getText());
			tv.setText(0 + "");
			break;
		case R.id.btn1:
			tv.setText(1 + "");
			AddArgAndGetResult();
			break;
		case R.id.btn2:
			tv.setText(2 + "");
			break;
		case R.id.btn3:
			tv.setText(3 + "");
			break;
		case R.id.btn4:
			tv.setText(4 + "");
			break;
		case R.id.btn5:
			tv.setText(5 + "");
			break;
		case R.id.btn6:
			tv.setText(6 + "");
			break;
		case R.id.btn7:
			tv.setText(7 + "");
			break;
		case R.id.btn8:
			tv.setText(8 + "");
			break;
		case R.id.btn9:
			tv.setText(9 + "");
			break;
		case R.id.btnAdd:
			argList.add(new CalculatorArg((float) Double.parseDouble(tv
					.getText().toString()), null));
			argList.add(new CalculatorArg(0, Option.ADD));
			AddArgAndGetResult();
			break;
		case R.id.btnSub:
			argList.add(new CalculatorArg((float) Double.parseDouble(tv
					.getText().toString()), null));
			argList.add(new CalculatorArg(0, Option.SUB));
			AddArgAndGetResult();
			break;
		case R.id.btnX:
			argList.add(new CalculatorArg((float) Double.parseDouble(tv
					.getText().toString()), null));
			argList.add(new CalculatorArg(0, Option.X));
			AddArgAndGetResult();
			break;
		case R.id.btnDiv:
			argList.add(new CalculatorArg((float) Double.parseDouble(tv
					.getText().toString()), null));
			argList.add(new CalculatorArg(0, Option.DIV));
			AddArgAndGetResult();
			break;
		case R.id.btnResult:
			argList.add(new CalculatorArg((float) Double.parseDouble(tv
					.getText().toString()), null));
			argList.add(new CalculatorArg((float) Double.parseDouble(tv
					.getText().toString()), null));
			AddArgAndGetResult();
			break;
		}

	}

	private void AddArgAndGetResult() {
		Option string = CalculatorArg.Option.ADD;

	}
}
