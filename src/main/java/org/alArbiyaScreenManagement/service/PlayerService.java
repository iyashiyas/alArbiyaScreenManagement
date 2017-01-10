package org.alArbiyaScreenManagement.service;

import java.util.List;

import org.alArbiyaScreenManagement.model.Player;

public interface PlayerService {
  
	public Player addPlayer(Player player,String iPAddrress);
   
	public Player getRoomAssignedPlayer (Player player,String IPAddress);

	public List<Player> getPlayerRooms(String iPAddrress);

	public Long getRoomIdForIp(String iPAddrress);
  
}
