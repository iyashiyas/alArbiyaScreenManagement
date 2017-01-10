package org.alArbiyaScreenManagement.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.alArbiyaScreenManagement.model.Notification;
import org.alArbiyaScreenManagement.service.NotificationService;
import org.alArbiyaScreenManagement.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="notifications")
public class NotificationController {

	@Autowired(required = true)
	private HttpServletRequest request;
	
	@Autowired
	PlayerService playerService;
	
	@Autowired
	NotificationService notificationService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Notification> getNotification() {
		String iPAddrress = getIpAddr(request);
		Long roomId = playerService.getRoomIdForIp(iPAddrress);
		List<Notification> notifications = notificationService.getNotification(roomId);
		return notifications;
	}
	
	public String getIpAddr(HttpServletRequest request) {      
		   String ip = request.getHeader("x-forwarded-for");      
		   if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
		       ip = request.getHeader("Proxy-Client-IP");      
		   }      
		   if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
		       ip = request.getHeader("WL-Proxy-Client-IP");      
		   }      
		   if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
		       ip = request.getRemoteAddr();      
		   }      
		   return ip;      
		}   
	
}
