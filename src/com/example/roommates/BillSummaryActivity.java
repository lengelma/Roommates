package com.example.roommates;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class BillSummaryActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.bill_summary_screen);
	
	    // TODO Auto-generated method stub
	}
	
	@Override
	public void onBackPressed() {
		Intent parentIntent = new Intent(BillSummaryActivity.this, DashboardActivity.class);
		startActivity(parentIntent);
		super.onBackPressed();
	}
}
