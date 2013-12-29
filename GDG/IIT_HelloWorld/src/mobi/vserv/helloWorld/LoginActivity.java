package mobi.vserv.helloWorld;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener {

	private Button button1, button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_loginactivity);

		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);

		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {

		switch (view.getId()) {
		case R.id.button1:
			Toast message = Toast.makeText(LoginActivity.this,
					"Clicked on button1", Toast.LENGTH_LONG);
			message.setGravity(Gravity.CENTER, 0, 0);
			message.show();
			break;
		case R.id.button2:
			Toast message1 = Toast.makeText(LoginActivity.this,
					"Clicked on button2", Toast.LENGTH_LONG);
			message1.setGravity(Gravity.CENTER, 0, 0);
			message1.show();
			break;
		}

		//
		// AlertDialog.Builder builder = new AlertDialog.Builder(
		// LoginActivity.this);
		//
		// builder.setTitle("Info");
		// builder.setMessage("Are you sure want to Exit?");
		// builder.setPositiveButton("Yes", new
		// DialogInterface.OnClickListener() {
		//
		// @Override
		// public void onClick(DialogInterface dialog, int which) {
		// Toast message = Toast.makeText(LoginActivity.this,
		// "Clicked On Yes", Toast.LENGTH_LONG);
		// message.setGravity(Gravity.CENTER, 0, 0);
		// message.show();
		// }
		// });
		// builder.setNegativeButton("No", new DialogInterface.OnClickListener()
		// {
		//
		// @Override
		// public void onClick(DialogInterface dialog, int which) {
		// Toast message = Toast.makeText(LoginActivity.this,
		// "Clicked On No", Toast.LENGTH_LONG);
		// message.setGravity(Gravity.CENTER, 0, 0);
		// message.show();
		//
		// }
		// });
		// builder.show();

	}

}
