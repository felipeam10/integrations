package com.felipeam10.integrations.controllers;

import com.felipeam10.integrations.dto.EmailDTO;
import com.felipeam10.integrations.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;
    @PostMapping
    public ResponseEntity<Void> send(@RequestBody  EmailDTO emailDTO) {
        emailService.sendEmail(emailDTO);
        return ResponseEntity.noContent().build();
    }
}
