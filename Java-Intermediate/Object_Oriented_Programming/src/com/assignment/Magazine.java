package com.assignment;

public class Magazine extends LibraryItem{

    private String issueNumber;

    public Magazine(String itemId, String title, String author, String issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.setItem("Magazine");
    }
}
