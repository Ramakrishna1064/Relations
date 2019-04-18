package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Book1;

public interface BookRepository1 extends JpaRepository<Book1, Integer>{
	
}
