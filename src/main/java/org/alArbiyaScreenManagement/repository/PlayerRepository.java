package org.alArbiyaScreenManagement.repository;

import java.util.List;

import org.alArbiyaScreenManagement.model.Player;

public interface PlayerRepository {
  
	Player addPlayer(Player player);

	Player getRoomAssignedPlayer(Player player);

	List<Player> getPlayerRooms(String iPAddrress);
	
	
 
}
