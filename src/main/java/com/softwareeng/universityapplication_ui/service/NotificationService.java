package com.softwareeng.universityapplication_ui.service;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NotificationService extends BaseService<Notification, Long> {
    ResponseEntity<Notification[]> getNotificationsOfCurrentUser();

    ResponseEntity<Void> seeAllNotifications(List<Notification> notifications);;
}
