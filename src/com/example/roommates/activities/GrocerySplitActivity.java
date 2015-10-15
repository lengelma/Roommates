package com.example.roommates.activities;

import com.example.roommates.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class GrocerySplitActivity extends Activity {

	/** Called when the activity is first created. */	
	private boolean mStretch;
	TableRow tr;
	String[] mTextofButton = { "$3", "Milk", "$4", "Bread" };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grocery_split_screen);
        TableLayout mTlayout = (TableLayout) findViewById(R.id.menu);

        int i = 0;
        while (i < mTextofButton.length) {
            if (i % 2 == 0) {
                tr = new TableRow(this);
                mTlayout.addView(tr);
            }
            TextView test = new TextView(this);
            test.setText(mTextofButton[i]);
            test.setId(i);
            test.setOnTouchListener(new OnTouchListener() {

   				@Override
				public boolean onTouch(View v, MotionEvent event) {
					System.out.println("v.getid is:- " + v.getId());
					return false;
				}
            });
            //TableLayout.LayoutParams params = new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            tr.addView(test);
            i++;
        }
    }

	public void onBackPressed() {
		Intent parentIntent = new Intent(GrocerySplitActivity.this, DashboardActivity.class);
		startActivity(parentIntent);
		super.onBackPressed();
	}
}
