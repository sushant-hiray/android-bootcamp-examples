package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class Activity2 extends Activity{

	TextView tx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main2);
		tx = (TextView) findViewById(R.id.textView1);
		Intent intent = getIntent();
	    String fName = intent.getStringExtra("firstname");
	    String lName = intent.getStringExtra("lastname");
	    
	    tx.setText("Your name is: " + fName + " " + lName);
		
	}
}
