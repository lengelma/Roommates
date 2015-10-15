package com.example.activity_services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.example.data_structures.UtilityObject;

public class BillSummaryService {
	private String userID;
	
	public BillSummaryService() {
		
	}
	
	public BillSummaryService(String userID) {
		this.userID = userID;
	}
	
	// TODO responsible for querying the database for upcoming bills, per userID
	public ArrayList<UtilityObject> getUpcomingUtilityBills() throws SQLException {

		return null;
	}
	
	protected String userID() {
		return userID;
	}
}
