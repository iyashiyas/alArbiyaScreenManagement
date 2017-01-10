package org.alArbiyaScreenManagement.service.impl;

import java.util.List;

import org.alArbiyaScreenManagement.model.Notification;
import org.alArbiyaScreenManagement.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService{

	@Autowired
	NotificationRepository notificationRepository;
	
	@Override
	public List<Notification> getNotification(long roomId) {
		return notificationRepository.getNotification(roomId);
	}

}
