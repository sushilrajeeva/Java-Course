package com.assignment;

public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("This program tests is-A relationship");
        System.out.println("************** Creating Book **************");
        Book book = new Book("Book:01", "Rich Dad Poor Dad", "Robert Kiyosaki", "ISBN0001234");
        book.checkout();
        book.checkout();
        book.returnItem();
        book.returnItem();
        System.out.println("*******************************************");
        System.out.println("************** Creating Book **************");
        Magazine magazine = new Magazine("Magazine:01", "Playboy", "Playboy", "IssueNumber:001");
        magazine.checkout();
        magazine.checkout();
        magazine.returnItem();
        magazine.returnItem();
        System.out.println("*******************************************");
        System.out.println("************** Creating Book **************");
        DVD dvd = new DVD("DVD:01", "DON", "T-Series", "3 Hours");
        dvd.checkout();
        dvd.checkout();
        dvd.returnItem();
        dvd.returnItem();
        System.out.println("*******************************************");
    }
}
