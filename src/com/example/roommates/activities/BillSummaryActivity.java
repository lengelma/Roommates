package com.example.roommates.activities;

import java.util.ArrayList;

import com.example.activity_services.BillSummaryService;
import com.example.adaptors.UtilityArrayAdapter;
import com.example.data_structures.UtilityObject;
import com.example.roommates.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class BillSummaryActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.bill_summary_screen);
	
        // creating the list view members
        BillSummaryService billService = new BillSummaryService();
        ArrayList<UtilityObject> utilityList = null;
       
        try {
        	utilityList = billService.getUpcomingUtilityBills();
        } catch(Exception e) {
        	// idk what all to catch right now
        	utilityList = new ArrayList<UtilityObject>();
        }
        
        ListView lv = (ListView) findViewById(R.id.bill_summary_util_list);
        UtilityArrayAdapter uaa = new UtilityArrayAdapter(this, utilityList);
        lv.setAdapter(uaa);
        
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				Intent viewUtility = new Intent();
				
				startActivity(viewUtility);
			}
        	
        });
        
	    // TODO Auto-generated method stub
	}
	
	public void onBackPressed() {
		Intent parentIntent = new Intent(BillSummaryActivity.this, DashboardActivity.class);
		startActivity(parentIntent);
		super.onBackPressed();
	}
}
