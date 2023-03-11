package com.example.userservice.service;

import com.example.userservice.model.MyUser;
import com.example.userservice.repository.UserManagementRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public record UserManagementServiceImpl(UserManagementRepository userManagementRepository) implements UserManagementService {

    @Override
    public MyUser getUserById(Long id) {
        return userManagementRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
