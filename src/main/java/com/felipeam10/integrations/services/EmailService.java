package com.felipeam10.integrations.services;

import com.felipeam10.integrations.dto.EmailDTO;

public interface EmailService {
    void sendEmail(EmailDTO emailDTO);
}
