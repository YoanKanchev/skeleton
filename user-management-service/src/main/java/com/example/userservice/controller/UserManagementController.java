package com.example.userservice.controller;

import com.example.userservice.model.MyUser;
import com.example.userservice.service.UserManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserManagementController {
    @Autowired
    private UserManagementServiceImpl userService;

    @GetMapping("/{id}")
    public ResponseEntity<MyUser> getUserById(@PathVariable Long id) {
        MyUser myUser = userService.getUserById(id);
        return ResponseEntity.ok(myUser);
    }

    // other CRUD operations
}
