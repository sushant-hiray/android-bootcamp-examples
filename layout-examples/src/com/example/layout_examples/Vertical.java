package com.example.layout_examples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Vertical extends Activity{
	Button button1;
	Button button2;
	Button button3; //covers the entire remaining width of the screen. check weight=1 in layout
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vertical);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void goHorizontal(View V)
    {
            // Create The  Intent and Start The Activity
            Intent intentGetMessage=new Intent(this,MainActivity.class);
            startActivity(intentGetMessage);// Activity is started
    }
	public void goListView(View V)
    {
            // Create The  Intent and Start The Activity
            Intent intentGetMessage=new Intent(this,ListViewActivity.class);
            startActivity(intentGetMessage);// Activity is started
    }



}
