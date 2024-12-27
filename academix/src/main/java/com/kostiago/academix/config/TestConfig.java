package com.kostiago.academix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kostiago.academix.services.EmailService;
import com.kostiago.academix.services.MockEmailService;

@Configuration
@Profile("test")

public class TestConfig {
    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
