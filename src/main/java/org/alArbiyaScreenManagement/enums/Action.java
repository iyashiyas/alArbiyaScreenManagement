package org.alArbiyaScreenManagement.enums;

public enum Action {

	CHECKOUT("checkout"), 
	PARKING("parking"),
	HOUSEKEEPING("houseKeeping"), 
	LAUNDRY("laundry"), 
	COFFEE("coffee"), 
	RESTAURANT("restaurant"), 
	CARRENTAL("carRental"), 
	RECEPTION("reception"), 
	ENTERTAINMENT("entertainment");
	
	private String actionName;
	
	Action(String actionName) {
		this.setActionName(actionName);
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionName() {
		return actionName;
	}
	
}
