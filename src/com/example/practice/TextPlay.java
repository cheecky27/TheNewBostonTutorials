package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity{
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.txt);
		
		Button chkCmd = (Button)findViewById(R.id.bResult);
		ToggleButton passTog = (ToggleButton) findViewById(R.id.tbPassword);
		EditText input = (EditText) findViewById(R.id.etCommand);
		TextView display = (TextView) findViewById(R.id.tvResults);
		
	}
}
