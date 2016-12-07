package org.alArbiyaScreenManagement.service.impl;

import org.alArbiyaScreenManagement.model.Player;
import org.alArbiyaScreenManagement.repository.PlayerRepository;
import org.alArbiyaScreenManagement.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService{
  
	@Autowired 
	PlayerRepository playerRepository;
	 

	@Override
	public Player addPlayer(Player player,String iPAddrress) {
		// TODO Auto-generated method stub
		player.setPlayerIpAddress(iPAddrress);
		player.setPlayerStatus("NOT CONFIGURED");
		return playerRepository.addPlayer(player);
	}
	
	@Override
	public Player getRoomAssignedPlayer(Player player,String iPAddrress) {
		// TODO Auto-generated method stub
		player.setPlayerIpAddress(iPAddrress); 
		return playerRepository.getRoomAssignedPlayer(player);
	}
	

 
 
}
