package com.example.twoactivityapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends Activity {

	private TextView lblUsername, lblPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Welcome Activity");
		setContentView(R.layout.layout_welcome);

		lblUsername = (TextView) findViewById(R.id.lblUsername);
		lblPassword = (TextView) findViewById(R.id.lblPassword);

		Intent intent = getIntent();

		if (getIntent().hasExtra("name")) {
			String strUsername = intent.getStringExtra("name");
			lblUsername.setText(strUsername);
			lblUsername.setTextColor(Color.parseColor("#00FF00"));
		}

		if (getIntent().hasExtra("password")) {
			String strPassword = intent.getStringExtra("password");
			lblPassword.setText(strPassword);
			lblPassword.setTextColor(Color.parseColor("#00FFFF"));
		}

		if (getIntent().hasExtra("rating")) {
			String rating = intent.getStringExtra("rating");
			Toast.makeText(WelcomeActivity.this, "Ratings are " + rating,
					Toast.LENGTH_SHORT).show();
		}

		if (getIntent().hasExtra("progress")) {
			String progress = intent.getStringExtra("progress");
			Toast.makeText(WelcomeActivity.this, "Progress is " + progress,
					Toast.LENGTH_SHORT).show();
		}

	}

}
