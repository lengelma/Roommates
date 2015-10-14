package com.example.roommates;

import java.util.zip.Inflater;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {


	Button Login;
	Button Signup;
	EditText Email;
	EditText Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (Button)findViewById(R.id.login);
        Signup = (Button)findViewById(R.id.signup);
        Email = (EditText)findViewById(R.id.email);
        Pass = (EditText)findViewById(R.id.pass);
        
        Login.setHint("Email");
        Pass.setHint("Password");
        Login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(login(Email.getText().toString(),Pass.getText().toString())){
					Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
					startActivity(new Intent(MainActivity.this, DashboardActivity.class));	
				}
				else{
					Toast.makeText(getApplicationContext(), "LOGIN NOT SUCCESSFUL", Toast.LENGTH_SHORT).show();
				}
			}
		});
        
        Signup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, SignupActivity.class));	
			}
		});
    }

    public boolean login(String email, String password){
    	
    	if(email.contains("@") && password.length()>4){
    		//TODO
    		return true;
    	}
    	return false;
    }
}