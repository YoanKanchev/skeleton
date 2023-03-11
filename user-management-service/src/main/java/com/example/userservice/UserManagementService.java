package com.example.userservice;

import com.example.userservice.model.User;

public interface UserManagementService {
    User getUserById(Long id);
}
