package com.example.practice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class startingPoint extends ActionBarActivity {


	int counter;
	Button btnAdd, btnSub;
	TextView txtVDisplay;
	String ourText="Your total is: ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		counter = 0;
		btnAdd = (Button) findViewById(R.id.btnAdd);
		btnSub = (Button) findViewById(R.id.btnSub);
		txtVDisplay = (TextView) findViewById(R.id.txtVDisplay); 

		btnAdd.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				counter++;
				txtVDisplay.setText(ourText + counter);
			}
		});

		btnSub.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				if(counter > 0){
					counter--;
					txtVDisplay.setText(ourText + counter);
				}
			}
		});

	}
}
