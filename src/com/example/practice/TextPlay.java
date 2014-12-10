package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity{
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt);

		Button chkCmd = (Button)findViewById(R.id.bResult);
		final ToggleButton passTog = (ToggleButton) findViewById(R.id.tbPassword);
		final EditText input = (EditText) findViewById(R.id.etCommand);
		TextView display = (TextView) findViewById(R.id.tvResults);

		passTog.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				if(passTog.isChecked()){
					input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}else{
					input.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});
	}
}