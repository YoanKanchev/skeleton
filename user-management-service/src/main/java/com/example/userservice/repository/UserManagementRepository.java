package com.example.userservice.repository;

import com.example.userservice.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserManagementRepository extends JpaRepository<MyUser, Long> {
}
