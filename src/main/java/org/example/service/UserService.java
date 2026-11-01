
package org.example.service;

import org.example.repository.UserRepository;
import org.example.notification.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;
    private final NotificationService notificationService;

    public UserService(
            UserRepository repository,
            NotificationService notificationService) {

        this.repository = repository;
        this.notificationService = notificationService;

        System.out.println("UserService: constructor");
    }

    public void execute() {
        String user = repository.findUser();

        System.out.println("Found user: " + user);

        notificationService.send("Welcome, " + user);
    }
}
