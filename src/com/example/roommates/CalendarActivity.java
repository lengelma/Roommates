package com.example.roommates;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CalendarActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.calendar_screen);
	    // TODO Auto-generated method stub
	}

	@Override
	public void onBackPressed() {
		Intent parentIntent = new Intent(CalendarActivity.this, DashboardActivity.class);
		startActivity(parentIntent);
		super.onBackPressed();
	}
}
