package com.example.adtapp;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TextViewShowPic extends Activity {
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_layout2);
		InitTextViewByHtmlString();

	}

	private void InitTextViewByHtmlString() {
		textView = (TextView) findViewById(R.id.tv);

		String htmlString = "CCè <img src='pic01'>";
//		int a=getResourceID("pic01");
//		textView.setText(a);
		CharSequence charSequence = Html.fromHtml(htmlString,new ImageGetter() {
			
			@Override
			public Drawable getDrawable(String arg0) {
				// TODO Auto-generated method stub
				Drawable drawable=getResources().getDrawable(getResourceID(arg0));
				drawable.setBounds(0	, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
				return drawable;
			}
		},null);
		textView.setText(charSequence);
		textView.setMovementMethod(LinkMovementMethod.getInstance());
	}

	private int getResourceID(String arg) {
		try {

			int id = Integer.parseInt(R.drawable.class.getField(arg).get(null)
					.toString());
			return id;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
}
