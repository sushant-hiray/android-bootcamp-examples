package com.example.intent_example_ii;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView  textViewMessage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 textViewMessage=(TextView)findViewById(R.id.textViewMessage);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 // Method to handle the Click Event on GetMessage Button
    public void getMessage(View V)
    {
            // Create The  Intent and Start The Activity to get The message
            Intent intentGetMessage=new Intent(this,SecondActivity.class);
            startActivityForResult(intentGetMessage, 2);// Activity is started with requestCode 2
    }
    
    // Call Back method  to get the Message form other Activity    override the method
    @Override
       protected void onActivityResult(int requestCode, int resultCode, Intent data)
       {
                 // TODO Auto-generated method stub
                 super.onActivityResult(requestCode, resultCode, data);
                
   
                  // check if the request code is same as what is passed  here it is 2
                 if(requestCode==2)
                 {
                    // fetch the message String
                     String message=data.getStringExtra("MESSAGE");
                     // Set the message string in textView
                     textViewMessage.setText(message);
      
                 }
              
     }

}
