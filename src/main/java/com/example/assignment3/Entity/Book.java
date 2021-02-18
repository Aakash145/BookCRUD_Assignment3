package com.example.assignment3.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {


    @Id
    private Integer id;
    private String title;
    private String author;


    public int getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + id +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                '}';
    }
}
