package org.alArbiyaScreenManagement.enums;

public enum Hotel {

	BRANCH("branch"), 
	BUILDING("building"),
	FLOOR("floor"), 
	ROOM("room"), 
	ROOMTYPE("roomType");
	 
	
	private String profileName;
	
	 
	Hotel(String profileName) {
		this.setProfileName(profileName);
	}
	private void setProfileName(String profileName) {
	 	this.profileName=profileName;
	}
 

	public String getProfileName() {
		return profileName;
	}
	
}
