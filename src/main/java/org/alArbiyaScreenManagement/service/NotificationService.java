package org.alArbiyaScreenManagement.service;

import java.util.List;

import org.alArbiyaScreenManagement.model.Notification;

public interface NotificationService {
	
	public List<Notification> getNotification(long roomId);

	public void updateNotifications(Long roomId);

}
