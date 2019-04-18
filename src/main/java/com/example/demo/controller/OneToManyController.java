package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Book;
import com.example.demo.dto.BookCategory;
import com.example.demo.dto.User;
import com.example.demo.model.StatusObject;
import com.example.demo.repository.BookCategoryRepository;

@RestController
public class OneToManyController {
	
	@Autowired
	BookCategoryRepository bookCategoryRepository;
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/addBook", method = RequestMethod.POST, consumes = "application/json",
			produces = "application/json")
	@ResponseBody
	public BookCategory addUSer(@RequestBody BookCategory bookCategory) {
		BookCategory category = bookCategoryRepository.save(bookCategory);
		return category;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@PostMapping("/editBook")
	public BookCategory EditUSer(@RequestParam int userId) {
		BookCategory category = bookCategoryRepository.findById(userId);
		category.setName("Paragon");
		category.setBooks(category.getBooks());
		BookCategory category1 = bookCategoryRepository.save(category);
		return category1;
	}

	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/getBooksList")
	@ResponseBody
	public List<BookCategory> getAllUsers(){
		List<BookCategory>booksList = bookCategoryRepository.findAll();
		return booksList;
	}
}
