package org.alArbiyaScreenManagement.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
 

import org.alArbiyaScreenManagement.model.Player;
import org.alArbiyaScreenManagement.repository.PlayerRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PlayerRepositoryImpl implements PlayerRepository{
	@PersistenceContext
	EntityManager entityManager;
	 

/*	@Override
	public Player getPlayerDetails(String iPAddrress) {
		// TODO Auto-generated method stub
		TypedQuery<Player> query = this.entityManager.createQuery("SELECT player from Player player WHERE player.playerIpAddress=:iPAddrress", Player.class);
		 List<Player> playerDetails = query.setParameter("iPAddrress", ).getResultList();
		 return playerDetails.isEmpty() ? null : playerDetails.get(0);
	} */
	@Override
	public Player addPlayer(Player player) {  
		TypedQuery<Player> query = this.entityManager.createQuery("SELECT player from Player player WHERE player.playerIpAddress=:iPAddrress", Player.class);
		 List<Player> playerDetails = query.setParameter("iPAddrress", player.getPlayerIpAddress()).getResultList();
		 
		 if(playerDetails.isEmpty() || playerDetails==null)
		 {
			 entityManager.persist(player);
		 } 
		return player;
	}
	@Override
	public Player getRoomAssignedPlayer(Player player) {
		TypedQuery<Player> query = this.entityManager.createQuery("SELECT player from Player player WHERE player.playerIpAddress=:iPAddrress and playerStatus='ASSIGNED'", Player.class);
		List<Player> playerdetails = query.setParameter("iPAddrress", player.getPlayerIpAddress()).getResultList();
		return playerdetails.isEmpty() ? null : playerdetails.get(0);
	}
      

@SuppressWarnings("unchecked")
@Override
public List<Player> getPlayerRooms(String ipAddress) {
	// TODO Auto-generated method stub
	Query query = entityManager.createQuery("select ply from Player ply WHERE ply.playerIpAddress=:ipAddress", Player.class);
    query.setParameter("ipAddress", ipAddress);
    return query.getResultList();
}
@Override
public Long getRoomIdForIp(String iPAddrress) {
	Query query = entityManager.createQuery("select room.id from Player ply WHERE ply.playerIpAddress=:ipAddress", Long.class);
    query.setParameter("ipAddress", iPAddrress);
    return (Long) query.getResultList().get(0);
}
}