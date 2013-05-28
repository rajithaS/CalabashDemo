package com.example.calabashdemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText txtUsername = (EditText) findViewById(R.id.txtUsername);
		final EditText txtPassword = (EditText) findViewById(R.id.txtPassword);
		Button btnLogin = (Button) findViewById(R.id.btnLogin);
		
		btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				String username = txtUsername.getText().toString();
				String password = txtPassword.getText().toString();
				
				if(username.equals("sauron") && password.equals("ring")){
					new AlertDialog.Builder(MainActivity.this)
					.setTitle("Black Gate of Mordor")
				    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							dialog.dismiss();
													}
					})
				    .setMessage("You have entered Mordor!")
				    .show();
				}else{
					new AlertDialog.Builder(MainActivity.this)
					.setTitle("Black Gate of Mordor")
				    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							dialog.dismiss();
													}
					})
				    .setMessage("One does not simply walk into Mordor!")
				    .show();
				}
				
			}
		});
	}
}
