package com.example.demo.dto;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Set;

@Entity
public class Publisher {
	private int id;
    private String name;
    @JsonIgnoreProperties("publishers")
    private Set<Book1> books;

    public Publisher(){

    }

    public Publisher(String name){
        this.name = name;
    }

    public Publisher(String name, Set<Book1> books){
        this.name = name;
        this.books = books;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToMany(mappedBy = "publishers")
    public Set<Book1> getBooks() {
        return books;
    }

    public void setBooks(Set<Book1> books) {
        this.books = books;
    }
}