package com.assignment;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean purchased = false;
    private String item;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void checkout() {
        if (this.purchased) {
            System.out.printf("You can't checkout %s %s!! it's already purchased \n", this.title, this.item);
            return;
        }
        System.out.printf("Thank you for purchasing %s %s. Enjoy reading your book!! \n", this.title, this.item);
        this.purchased = true;
    }

    public void returnItem() {
        if (!this.purchased) {
            System.out.printf("You can't return %s %s!! it's not purchased from this library\n", this.title, this.item);
            return;
        }
        System.out.printf("Thank you for returning %s %s. \n", this.title, this.item);
        this.purchased = false;
    }
}
