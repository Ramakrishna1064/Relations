package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Book1;
import com.example.demo.dto.Publisher;
import com.example.demo.repository.BookRepository1;
import com.example.demo.repository.PublisherRepository;

@RestController
public class ManyToManyController {
	
	@Autowired
	private BookRepository1 bookRepository;

	@Autowired
	private PublisherRepository publisherRepository;
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/getBooksList1")
	@ResponseBody
	public List<Book1> getBooksList(){
		List<Book1>booksList = bookRepository.findAll();
		return booksList;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/getPublishersList1")
	@ResponseBody
	public List<Publisher> getPublishersList(){
		List<Publisher>publisherList = publisherRepository.findAll();
		return publisherList;
	}

}
