package com.example.assignment3.dao;

import com.example.assignment3.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, Integer> {
}
