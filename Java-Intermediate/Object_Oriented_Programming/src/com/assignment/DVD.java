package com.assignment;

public class DVD extends LibraryItem{

    private String duration;

    public DVD(String itemId, String title, String author, String duration) {
        super(itemId, title, author);
        this.duration = duration;
        this.setItem("DVD");
    }
}
