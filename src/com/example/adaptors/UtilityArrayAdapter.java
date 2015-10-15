package com.example.adaptors;

import java.util.ArrayList;
import java.util.List;

import com.example.data_structures.UtilityObject;
import com.example.roommates.BillSummaryActivity;

import android.content.Context;
import android.widget.ArrayAdapter;

public class UtilityArrayAdapter extends ArrayAdapter<UtilityObject> {

	public UtilityArrayAdapter(Context context, int resource, int textViewResourceId, List<UtilityObject> objects) {
		super(context, resource, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
	}

	public UtilityArrayAdapter(Context context, List<UtilityObject> list) {
		this(context, -1, -1, list);
	}



}
