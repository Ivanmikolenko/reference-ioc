
package org.example;

import org.example.config.AppConfig;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Creating Spring Context ===");

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("\n=== Getting UserService ===");

        UserService service = context.getBean(UserService.class);

        System.out.println("\n=== Executing Service ===");

        service.execute();

        System.out.println("\n=== Checking Singleton ===");

        UserService anotherService = context.getBean(UserService.class);

        System.out.println("Same instance: " + (service == anotherService));

        context.close();
    }
}
