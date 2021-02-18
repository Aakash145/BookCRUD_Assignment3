package com.example.assignment3.service;

import com.example.assignment3.Entity.Book;
import com.example.assignment3.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getBooks(){
        return bookDAO.getBooks();
    }
    public Book createBook(Book book){
        return bookDAO.createBook(book);
    }
}
