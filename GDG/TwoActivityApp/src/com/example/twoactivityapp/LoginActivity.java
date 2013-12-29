package com.example.twoactivityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class LoginActivity extends Activity implements OnClickListener,
		OnRatingBarChangeListener, OnSeekBarChangeListener {

	private Button btnLogin;
	private EditText txtUsername, txtPassword;
	private RatingBar ratingSkills;
	private SeekBar seekBar;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Login Activity");
		setContentView(R.layout.layout_login);

		seekBar = (SeekBar) findViewById(R.id.seekBar);
		seekBar.setOnSeekBarChangeListener(this);

		intent = new Intent(LoginActivity.this, WelcomeActivity.class);

		ratingSkills = (RatingBar) findViewById(R.id.ratingSkills);
		ratingSkills.setOnRatingBarChangeListener(this);

		txtUsername = (EditText) findViewById(R.id.txtUsername);
		txtPassword = (EditText) findViewById(R.id.txtPassword);

		btnLogin = (Button) findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		intent.putExtra("name", txtUsername.getText().toString());
		intent.putExtra("password", txtPassword.getText().toString());
		startActivity(intent);
	}

	@Override
	public void onRatingChanged(RatingBar ratingBar, float progress,
			boolean fromUser) {
		intent.putExtra("rating", String.valueOf(progress));
	}

	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		intent.putExtra("progress", String.valueOf(seekBar.getProgress()));

	}
}
