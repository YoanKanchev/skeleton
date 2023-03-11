package com.example.userservice.service;

import com.example.userservice.model.MyUser;

public interface UserManagementService {
    MyUser getUserById(Long id);
}
