package com.example.myfactory;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MonitorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_monitor);
		
		AlertDialog.Builder builder = new Builder(MonitorActivity.this);
    	builder.setTitle("Warning");
    	builder.setMessage("RA1077 is working in abnormal state,please inspect it!");
    	builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
    	public void onClick(DialogInterface dialog, int which) {
    		dialog.dismiss();
    	}
    	});
    	builder.create().show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.monitor, menu);
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
	
	//click the button find it, then call the details activity 
    public void gotoDetail1(View view) {
        Intent intent = new Intent();
        intent.setClass(MonitorActivity.this, DetailsActivity.class);
        startActivity(intent);
    }
    
    public void gotoDetail2(View view) {
        Intent intent = new Intent();
        intent.setClass(MonitorActivity.this, Detail2Activity.class);
        startActivity(intent);
    }
    
    public void gotoDetail3(View view) {
        Intent intent = new Intent();
        intent.setClass(MonitorActivity.this, Detail3Activity.class);
        startActivity(intent);
    }
    
  //click the button show it, then call the navigation activity 
    public void gotoNavigation(View view) {
        Intent intent = new Intent();
        intent.setClass(MonitorActivity.this, NavigationActivity.class);
        startActivity(intent);
    }
}
