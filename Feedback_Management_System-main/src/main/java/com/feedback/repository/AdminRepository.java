package com.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.feedback.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByUsernameAndPassword(String username, String password);
}