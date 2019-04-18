package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
}
