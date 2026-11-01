
package org.example.notification;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        System.out.println("NotificationService: constructor");
    }

    public void send(String message) {
        System.out.println("Notification: " + message);
    }
}
