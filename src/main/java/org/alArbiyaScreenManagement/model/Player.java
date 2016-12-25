package org.alArbiyaScreenManagement.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PLAYER")
public class Player {
	
	@Id @GeneratedValue
	@Column(name="PLAYER_ID")
	private long id;
	   
	@Column(name="PLAYER_IP_ADDRESS")
	private String playerIpAddress;
	
	@Column(name="PLAYER_STATUS")
	private String playerStatus;
	  
	@OneToOne
	@JoinColumn(name="ROOM_ID", nullable=true)
	private Room room;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlayerIpAddress() {
		return playerIpAddress;
	}

	public void setPlayerIpAddress(String playerIpAddress) {
		this.playerIpAddress = playerIpAddress;
	}

	public String getPlayerStatus() {
		return playerStatus;
	}

	public void setPlayerStatus(String playerStatus) {
		this.playerStatus = playerStatus;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
}
