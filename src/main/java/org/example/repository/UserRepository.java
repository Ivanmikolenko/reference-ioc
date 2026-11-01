
package org.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public UserRepository() {
        System.out.println("UserRepository: constructor");
    }

    public String findUser() {
        return "Alex";
    }
}
