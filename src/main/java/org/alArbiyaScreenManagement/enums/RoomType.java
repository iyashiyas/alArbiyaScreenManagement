package org.alArbiyaScreenManagement.enums;

public enum RoomType {

	SINGLE("Single"), DOUBLE("Double"), SUITE("Suite") , DORMITORY("Dormitory");
	
	private String type;
	
	private RoomType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}

	public static RoomType getRoomType(String roomType) {
		for(RoomType type :RoomType.values()) {
			if(type.getType().equals(roomType)) {
				return type;
			}
		}
		return null;
	}
	
}
