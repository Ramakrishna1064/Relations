package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
   User findById(int id);
}