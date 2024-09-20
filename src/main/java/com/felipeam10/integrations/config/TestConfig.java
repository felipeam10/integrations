package com.felipeam10.integrations.config;

import com.felipeam10.integrations.services.EmailService;
import com.felipeam10.integrations.services.MockEmailService;
import com.felipeam10.integrations.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
