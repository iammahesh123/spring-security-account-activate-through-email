package org.example.springsecurityaccountactivateemail.event;

import org.example.springsecurityaccountactivateemail.dtos.UserRegistrationDto;
import org.example.springsecurityaccountactivateemail.model.User;
import org.example.springsecurityaccountactivateemail.repository.UserRepository;
import org.example.springsecurityaccountactivateemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

public class OnRegistrationCompleteEvent extends ApplicationEvent {
    private final User user;

    public OnRegistrationCompleteEvent(User user) {
        super(user);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
