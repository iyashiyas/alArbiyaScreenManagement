package org.alArbiyaScreenManagement.repository;

import org.alArbiyaScreenManagement.model.Player;

public interface PlayerRepository {
  
	Player addPlayer(Player player);

	Player getRoomAssignedPlayer(Player player);
 
}
