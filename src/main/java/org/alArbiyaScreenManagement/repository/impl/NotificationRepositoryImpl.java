package org.alArbiyaScreenManagement.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.alArbiyaScreenManagement.model.Language;
import org.alArbiyaScreenManagement.model.Notification;
import org.alArbiyaScreenManagement.service.impl.NotificationRepository;
import org.springframework.stereotype.Repository;

@Repository
public class NotificationRepositoryImpl implements NotificationRepository{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Notification> getNotification(long roomId) {
		Query query = entityManager.createQuery("SELECT notification from Notification notification where readStatus='UNREAD' and roomId=:roomId", Notification.class);
		query.setParameter("roomId", roomId);
		return query.getResultList();
	}

}
