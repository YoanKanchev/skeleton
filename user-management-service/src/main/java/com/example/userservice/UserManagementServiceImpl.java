package com.example.userservice;

import com.example.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public record UserManagementServiceImpl(UserManagementRepository userManagementRepository) implements UserManagementService {

    @Override
    public User getUserById(Long id) {
        return userManagementRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
