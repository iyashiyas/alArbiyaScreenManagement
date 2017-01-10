package org.alArbiyaScreenManagement.service.impl;

import java.util.List;

import org.alArbiyaScreenManagement.model.Notification;

public interface NotificationRepository {

	List<Notification> getNotification(long roomId);

}
