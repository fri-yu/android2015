package com.example.appcalculator;

import java.util.ArrayList;
import java.util.List;

import com.example.appcalculator.CalculatorArg.Option;
import com.example.appcalculator.R.string;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	private TextView tv;
	private String currentNumber;
	List<CalculatorArg> argList = new ArrayList<CalculatorArg>();
	float[] args = new float[] { 0, 0, 0 };
	private boolean flagClickedOP = false;
	private boolean flagNewTypein = false;

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
		currentNumber = tv.getText().toString();
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn0:
			// System.out.println(tv.getText());
			if (!flagClickedOP) {
				tv.setText(currentNumber + 0 + "");
			} else {
				tv.setText(0 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btn1:
			if (!flagClickedOP) {
				tv.setText(currentNumber + 1 + "");
			} else {
				tv.setText(1 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btn2:
			if (!flagClickedOP) {
				tv.setText(currentNumber + 2 + "");
			} else {
				tv.setText(2 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btn3:
			if (!flagClickedOP) {
				tv.setText(currentNumber + 3 + "");
			} else {
				tv.setText(3 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btn4:
			if (!flagClickedOP) {
				tv.setText(currentNumber + 4 + "");
			} else {
				tv.setText(4 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btn5:
			if (!flagClickedOP) {
				tv.setText(currentNumber + 5 + "");
			} else {
				tv.setText(5 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btn6:
			if (!flagClickedOP) {
				tv.setText(currentNumber + 6 + "");
			} else {
				tv.setText(6 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btn7:
			if (!flagClickedOP) {
				tv.setText(currentNumber + 7 + "");
			} else {
				tv.setText(7 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btn8:
			if (!flagClickedOP) {
				tv.setText(currentNumber + 8 + "");
			} else {
				tv.setText(8 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btn9:
			if (!flagClickedOP) {
				tv.setText(currentNumber + 9 + "");
			} else {
				tv.setText(9 + "");
				flagClickedOP = false;
			}
			break;
		case R.id.btnAdd:
			if (currentNumber != "")
				args[1] = (float) Double.parseDouble(currentNumber);
			args[2] = OptionArg.ADD;
			flagClickedOP = true;
			flagNewTypein = true;
			AddArgAndGetResult(OptionArg.ADD);
			break;
		case R.id.btnSub:
			if (currentNumber != "")
				args[1] = (float) Double.parseDouble(currentNumber);
			args[2] = OptionArg.SUB;
			flagClickedOP = true;
			flagNewTypein = true;
			AddArgAndGetResult(OptionArg.SUB);
			break;
		case R.id.btnX:
			if (currentNumber != "")
				args[1] = (float) Double.parseDouble(currentNumber);
			args[2] = OptionArg.X;
			flagClickedOP = true;
			flagNewTypein = true;
			AddArgAndGetResult(OptionArg.X);
			break;
		case R.id.btnDiv:
			if (currentNumber != "")
				args[1] = (float) Double.parseDouble(currentNumber);
			args[2] = OptionArg.DIV;
			flagClickedOP = true;
			flagNewTypein = true;
			AddArgAndGetResult(OptionArg.DIV);
			break;
		case R.id.btnResult:
			args[1] = (float) Double.parseDouble(currentNumber);
			if (!flagNewTypein) {
				args[2] = OptionArg.RESULT;
				flagNewTypein = false;
			}
			AddArgAndGetResult(OptionArg.RESULT);
			break;
		case R.id.btnClear:
			args[1] = args[0] = 0;
			tv.setText("");
			break;
		}

	}

	private void AddArgAndGetResult(int optionArg) {
		// Option string = CalculatorArg.Option.ADD;
		switch (optionArg) {
		case OptionArg.ADD:
			args[0] += args[1];
			tv.setText(args[0] + "");
			break;
		case OptionArg.SUB:
			args[0] -= args[1];
			tv.setText(args[0] + "");
			break;
		case OptionArg.X:
			args[0] *= args[1];
			tv.setText(args[0] + "");
			break;
		case OptionArg.DIV:
			args[0] /= args[1];
			tv.setText(args[0] + "");
			break;
		case OptionArg.RESULT:
			if (args[2] != OptionArg.RESULT) {
				AddArgAndGetResult((int) args[2]);
			}
			break;
		}

	}
}
