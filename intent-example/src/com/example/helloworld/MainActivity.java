package com.example.helloworld;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button button;
	EditText FName;
	EditText LName;
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FName = (EditText) findViewById(R.id.editText1);
        LName = (EditText) findViewById(R.id.EditText01);
		addListenerOnButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void addListenerOnButton() {
		
		final Context context=this;
		button = (Button) findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
				Intent intent = new Intent(context,Activity2.class);
                intent.putExtra("firstname",FName.getText().toString());
                intent.putExtra("lastname",LName.getText().toString());
				startActivity(intent);

			}

		});

	}


}
