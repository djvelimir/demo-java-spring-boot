package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/password")
public class PasswordController {

    @GetMapping
    public ResponseEntity<String> Get() {
        String generatedPassword = "8bg?vq$R>Y&aLQ9y";
        return ResponseEntity.ok(generatedPassword);
    }
}
