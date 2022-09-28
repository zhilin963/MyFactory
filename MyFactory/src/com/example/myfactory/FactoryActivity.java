package com.example.myfactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FactoryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_factory);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.factory, menu);
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
	
	//click the button About Me, then call the Login activity 
    public void gotoAboutme(View view) {
        Intent intent = new Intent();
        intent.setClass(FactoryActivity.this, AboutmeActivity.class);
        startActivity(intent);
    }
    
	//click the button Monitor, then call the Monitor activity 
    public void gotoMonitoring(View view) {
        Intent intent = new Intent();
        intent.setClass(FactoryActivity.this, MonitorActivity.class);
        startActivity(intent);
    }
    
	//click the button Rpair, then call the Repair activity 
    public void gotoRepairing(View view) {
        Intent intent = new Intent();
        intent.setClass(FactoryActivity.this, RepairActivity.class);
        startActivity(intent);
    }
    
	//click the button Show, then call the Show activity 
    public void gotoShow(View view) {
        Intent intent = new Intent();
        intent.setClass(FactoryActivity.this, ShowActivity.class);
        startActivity(intent);
    }
}
