package com.example.jiaoshenme;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class RegisterActivity extends Activity{
		
	private EditText username,password,nickname;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		username=(EditText) findViewById(R.id.username);
		password=(EditText) findViewById(R.id.password);
		nickname=(EditText) findViewById(R.id.nickname);
		
	}
	
	
	
}
