package com.example.roommates;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DashboardActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_screen);
        
        // setting up the listener for grocery split button
        Button groceryButton = (Button) findViewById(R.id.dashboard_grocery_button);
        groceryButton.setOnClickListener(new DashboardButtonListener());
        
        // setting up the listener for the bill summary button
        Button billSummaryButton = (Button) findViewById(R.id.dashboard_summary_button);
        billSummaryButton.setOnClickListener(new DashboardButtonListener());
        
        // setting up the listener for the calendar button
        Button calendarButton = (Button) findViewById(R.id.dashboard_calendar_button);
        calendarButton.setOnClickListener(new DashboardButtonListener());
        
        // may need to add a photo click listener
	}

	private class DashboardButtonListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			Intent intent;
			switch(v.getId())
			{
			case R.id.dashboard_calendar_button :
				intent = new Intent(DashboardActivity.this, CalendarActivity.class);
				break;
				
			case R.id.dashboard_summary_button :
				intent = new Intent(DashboardActivity.this, BillSummaryActivity.class);
				break;
				
			case R.id.dashboard_grocery_button :
				intent = new Intent(DashboardActivity.this, GrocerySplitActivity.class);
				break;
				
			default :
				return;
			}
			
			startActivity(intent);
		}
		
	}
}
