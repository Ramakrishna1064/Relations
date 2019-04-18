package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="book")
public class Book {
   
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
		private String name;

	    @ManyToOne
	    @JoinColumn(name = "book_category_id", nullable = false)
	    @JsonBackReference
	    private BookCategory bookCategory;

	    public Book(String name) {
	        this.name = name;
	    }
	    
	    public Book() {
	    }
	    
	    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BookCategory getBookCategory() {
			return bookCategory;
		}

		public void setBookCategory(BookCategory bookCategory) {
			this.bookCategory = bookCategory;
		}

}
