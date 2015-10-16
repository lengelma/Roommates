package com.example.roommates.activities;

import com.example.data_structures.UtilityObject;
import com.example.roommates.R;

import android.app.Activity;
import android.os.Bundle;

public class BillSummaryDetailedActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.bill_summary_detailed);
	    
	    UtilityObject utilObj = (UtilityObject) getIntent().getExtras().get("utility");
	    // TODO Auto-generated method stub
	}

}
