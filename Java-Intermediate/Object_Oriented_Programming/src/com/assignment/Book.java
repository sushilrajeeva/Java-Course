package com.assignment;

public class Book extends LibraryItem{
    private String ISBN;
    public Book(String itemId, String title, String author, String ISBN) {
        super(itemId, title, author);
        this.ISBN = ISBN;
        this.setItem("Book");
    }


}
