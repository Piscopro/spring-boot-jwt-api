package com.example.api.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }

    @PostMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String createUserContent() {
        return "Created User Content.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }

    @PostMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String createAdminContent() {
        return "Created Admin Content.";
    }

    @PutMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String updateAdminContent() {
        return "Updated Admin Content.";
    }

    @DeleteMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteAdminContent() {
        return "Deleted Admin Content.";
    }
}