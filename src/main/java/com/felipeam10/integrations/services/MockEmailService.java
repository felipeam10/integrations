package com.felipeam10.integrations.services;

import com.felipeam10.integrations.dto.EmailDTO;
import org.slf4j.Logger;

public class MockEmailService implements EmailService {

    private static Logger LOG = org.slf4j.LoggerFactory.getLogger(MockEmailService.class);
    public void sendEmail(EmailDTO emailDTO) {

            LOG.info("Sending email to: " + emailDTO.getTo());
            LOG.info("Email sent successfully: ");


    }
}
