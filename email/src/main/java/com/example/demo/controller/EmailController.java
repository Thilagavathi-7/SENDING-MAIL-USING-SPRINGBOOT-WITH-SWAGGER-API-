package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmailModel;
import com.example.demo.service.EmailService;

@RestController
@RequestMapping("/email")


public class EmailController {
	   @Autowired
	    private EmailService emailService;

	    @PostMapping("/send")
	    public ResponseEntity<String> sendEmail(@RequestBody EmailModel emailModel) {
	        emailService.sendEmail(emailModel);

	        return ResponseEntity.ok("Email Sent Successfully");
	    }

}
