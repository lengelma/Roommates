package com.example.data_structures;

import java.util.Date;

import com.example.roommates.utils.Utility;

public class UtilityObject {

	private boolean paid;
	private Date dueDate;
	private String utilityName;
	private float billAmount;
	
	public UtilityObject() {
		
	}
	
	public void setToPaid() {
		paid = true;
	}
	
	public boolean isPastDue(Date current) {
		return dueDate.compareTo(current) >= 0;
	}
	
	public boolean isPaid() {
		return paid;
	}
	
	public String utilityName() {
		return utilityName;
	}
	
	public float billAmount() {
		return billAmount;
	}
	
	public void decrementFromBill(float amount) {
		if(billAmount < amount) {
			// TODO
		}
		
		billAmount -= amount;
		
		if(Utility.equalToZero(billAmount)) {
			setToPaid();
		}
	}
}
