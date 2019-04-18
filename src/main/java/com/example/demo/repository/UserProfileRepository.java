package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import com.example.demo.dto.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
	UserProfile findById(int id);
}
