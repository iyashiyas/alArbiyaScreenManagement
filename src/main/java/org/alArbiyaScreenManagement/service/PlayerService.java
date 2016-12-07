package org.alArbiyaScreenManagement.service;

import org.alArbiyaScreenManagement.model.Player;

public interface PlayerService {
  
	public Player addPlayer(Player player,String iPAddrress);
   
	public Player getRoomAssignedPlayer (Player player,String IPAddress);
}
