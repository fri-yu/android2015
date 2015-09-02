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
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class AutoComplete extends Activity {
	private AutoCompleteTextView auto;
	private MultiAutoCompleteTextView multiauto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.autocomplete);
		Init();

	}

	private void Init() {
		auto = (AutoCompleteTextView) findViewById(R.id.auto);
		String[] arrStrings = new String[] { "111111", "222222", "3333333333",
				"4444444444", "555555555555", "6666666" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				AutoComplete.this, android.R.layout.simple_dropdown_item_1line,
				arrStrings);
		auto.setAdapter(adapter);
		multiauto=(MultiAutoCompleteTextView)findViewById(R.id.multiauto);
		multiauto.setAdapter(adapter);
		multiauto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
	}
}
