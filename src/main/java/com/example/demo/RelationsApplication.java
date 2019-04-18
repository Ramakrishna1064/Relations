package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.dto.Book1;
import com.example.demo.dto.Publisher;
import com.example.demo.repository.BookRepository1;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.PublisherRepository;
import com.example.demo.util.Conversions;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RelationsApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	private BookRepository1 bookRepository;

	@Autowired
	private PublisherRepository publisherRepository;

	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(RelationsApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... strings) throws Exception {
		
		/*
		 * Book1 book1 = new Book1(); book1.setName("BookA");
		 * 
		 * Publisher publisher1 = new Publisher(); publisher1.setName("Ram");
		 * 
		 * Publisher publisher2 = new Publisher(); publisher2.setName("Pooja");
		 * 
		 * Set<Publisher>publisherList = new HashSet<>(); publisherList.add(publisher1);
		 * publisherList.add(publisher2);
		 * 
		 * book1.setPublishers(publisherList);
		 * 
		 * List<Book1>bookList = new ArrayList<Book1>(); bookList.add(book1);
		 * 
		 * List<Book1>bookList1 = bookRepository.saveAll(bookList);
		 */
		
	}
}
