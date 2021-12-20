package com.example.demo.controller;

import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping(params = { "page" })
    public ResponseEntity getUsers(@RequestParam int page) {
        try {
            return ResponseEntity.ok(userService.getUser(10,page));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e);
        }
    }
}
