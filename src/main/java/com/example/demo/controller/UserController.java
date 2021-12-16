package com.example.demo.controller;

import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity getUsers() {
        try {
            return ResponseEntity.ok(userService.getUser(10));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e);
        }
    }
}
