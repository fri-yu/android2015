package com.example.adtapp;

import android.R.array;
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
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class AppLayoutWeight extends Activity {
	private AutoCompleteTextView auto;
	private MultiAutoCompleteTextView multiauto;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.appweight);
		Init();
		
	}

	private void Init() {
		final Button btn1 = (Button) findViewById(R.id.button1);
		Button btn2 = (Button) findViewById(R.id.button2);
		Button btn3 = (Button) findViewById(R.id.button3);
		Button btn4 = (Button) findViewById(R.id.button4);
		final TextView txv=(TextView)findViewById(R.id.txv);
		
		ViewTreeObserver vto = btn1.getViewTreeObserver();   
		vto.addOnGlobalLayoutListener(new OnGlobalLayoutListener() { 
		    @Override   
		    public void onGlobalLayout() { 
		    	btn1.getViewTreeObserver().removeGlobalOnLayoutListener(this); 
		    	btn1.getHeight();
		        btn1.getWidth();
		        int a=btn1.getWidth();
				
				txv.setText(a+"");
		    }   
		}); 

//		btn1.setText(btn1.getWidth());
//		btn2.setText(btn2.getWidth());
//		btn3.setText(btn3.getWidth());
//		btn4.setText(btn4.getWidth());
	}
}
