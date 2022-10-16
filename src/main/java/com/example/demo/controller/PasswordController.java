package com.example.demo.controller;

import com.example.demo.service.PasswordGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/password")
public class PasswordController {
    private PasswordGenerator passwordGenerator;

    public PasswordController(PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }

    @GetMapping
    public ResponseEntity<String> Get() {
        String generatedPassword = passwordGenerator.generate();
        return ResponseEntity.ok(generatedPassword);
    }
}
