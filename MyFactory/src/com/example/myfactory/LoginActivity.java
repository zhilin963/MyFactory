package com.example.myfactory;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	
	private EditText userName, passWord;
	private String userNameValue,passWordValue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	//click the button Sign in, then call the Login activity 
    public void gotoCheck(View view) {
    	userName = (EditText) findViewById(R.id.username);  
        passWord = (EditText) findViewById(R.id.password);
        userNameValue = userName.getText().toString();  
        passWordValue = passWord.getText().toString(); 
        Intent intent = new Intent();
        
        if(userNameValue.equals("song") && passWordValue.equals("123")){
            Toast.makeText(this, "Welcome Back Mr.Song!", Toast.LENGTH_SHORT).show();
            
            intent.setClass(LoginActivity.this, FactoryActivity.class);
            startActivity(intent);
        }
        //if username or password is not valid,the alert dialog will be called 
        else{
        	AlertDialog.Builder builder = new Builder(LoginActivity.this);
        	builder.setTitle("Error");
        	builder.setMessage("Invalid username or password,please try again!");
        	builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog, int which) {
        		dialog.dismiss();
        		//LoginActivity.this.finish();
        	}
        	});
        	builder.create().show();
        }
    }
}
